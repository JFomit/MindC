using Microsoft.FSharp.Core;
using MindC.Common.Files.ObjectFiles;
using MindC.Common.Pipelining;
using MindC.Compilation.AST;
using MindC.Compilation.Optimization;
using MindC.Compilation.Semantic;
using MindC.Compilation.Semantic.Functions;
using MindC.Compilation.Semantic.Primitives;
using MindC.Compilation.Semantic.Variables;
using System.Globalization;
using System.Reflection.Metadata;
using static MindC.Compilation.CodeGeneration.SourceCodeWriter;

namespace MindC.Compilation.CodeGeneration
{
    /// <summary>
    /// Generates an object file on demand and with aid from an AST
    /// </summary>
    public class ObjectGenerator : Visiting.BaseASTVisitor, IStage
    {
        private StageStatus StageStatus { get; set; }
        private SemanticModel SemanticModel { get; init; }
        private List<IOptimizer> EnabledOptimizers { get; init; }
        private SourceCodeWriter CodeWriter { get; init; }
        private ObjectFileWriter FileWriter { get; init; }

        private Dictionary<string, string[]> Macros { get; init; }

        private int TempVariableNumber = 0;
        private int BrunchNumber = 0;
        private string CurrentBrunchName { get => '.' + _sourceName + BrunchNumber; }
        private string CurrentTempVariable { get => GetTempVariableName(TempVariableNumber); }

        private FunctionDeclaration CurrentFunction { get; set; } = null!;

        private readonly string _sourceName;

        public ObjectGenerator(Node root, SemanticModel semanticModel, List<IOptimizer> enabledOptimizers, string? name = null) : base(root)
        {
            SemanticModel = semanticModel;
            EnabledOptimizers = enabledOptimizers;

            CodeWriter = new();
            FileWriter = new();

            Macros = new();

            StageStatus = StageStatus.Ready;

            _sourceName = name ?? Path.GetRandomFileName();
        }

        public string GetObjectCode()
        {
            if (StageStatus == StageStatus.Finished)
            {
                throw new InvalidOperationException("Reusing this ObjectGenerator instance is forbidden.");
            }

            StageStatus = StageStatus.Working;

            FileWriter.BuildHeader(FormatVersion.Dev, 0);

            FileWriter.StartFunctionsSection();
            foreach (var function in SemanticModel.DeclaredFunctions)
            {
                FileWriter.PutFunctionDeclaration(function.ToString());
            }
            FileWriter.EndFunctionSection();

            RunOptimizers();

            FileWriter.StartCodeSection();
            Visit(ASTRoot);
            FileWriter.EndCodeSection();

            StageStatus = StageStatus.Finished;

            return FileWriter.GetCode();
        }
        private void RunOptimizers()
        {
            foreach (var optimizer in EnabledOptimizers)
            {
                optimizer.OptimizeTree(ASTRoot, SemanticModel);
            }
        }

        public StageStatus GetStageStatus()
        {
            return StageStatus;
        }

        public override void VisitRoot(Node currentNode, List<Node> elements)
        {
            foreach (var element in elements)
            {
                Visit(element);
            }
        }
        public override void VisitEmpty(Node node)
        {
            throw new InvalidOperationException("Empty nodes should never appear in the tree.");
        }

        public override void VisitFunctionDeclaration(Node currentNode, FunctionDeclaration function, Node body)
        {
            CurrentFunction = function;
            TempVariableNumber = 0;
            CodeWriter.Begin();

            if (function.ToString() == "void.main()")
            {
                CodeWriter.PutMacroCode_Entrypoint(); // entrypoint function
                CodeWriter.PutLabel(function.Name);
                PutFunctionCode(function, body);
                CodeWriter.PutMacroCode_Reset();
            }
            else
            {
                CodeWriter.PutLabel(function.Name); // not main function
                PutFunctionArgumentsCode(function);
                PutFunctionCode(function, body);
                CodeWriter.PutMacroCode_Return();
            }

            var functionCode = CodeWriter.End();
            //if (function.IsMacro)
            //{
            //    Macros.Add(function.Name, functionCode); // if its a macro, storing it for substitutions
            //}

            FileWriter.PutCode(functionCode);
            CurrentFunction = null!;
        }
        private void PutFunctionArgumentsCode(FunctionDeclaration function)
        {
            CodeWriter.PutMacroCode_Store(".return");

            for (int i = function.Parameteres.Length - 1; i >= 0; i--)
            {
                var param = function.Parameteres[i];

                CodeWriter.PutMacroCode_Store(param.Name);
            }
        }
        private void PutFunctionCode(FunctionDeclaration function, Node body)
        {
            Visit(body);
        }
        public override void VisitGlobalVariableDeclaration(Node currentNode, VariableDeclaration variable)
        {
            CodeWriter.PutInstruction_Set(variable.Name, variable.DataType.GetDefaultValue());
        }

        public override void VisitStatementSequnce(Node currentNode, List<Node> statements)
        {
            foreach (var statement in statements)
            {
                Visit(statement);
            }
        }
        public override void VisitVarStatement(Node currentNode, VariableDeclaration variable)
        {
            CodeWriter.PutInstruction_Set(variable.Name, variable.DataType.GetDefaultValue());
        }
        public override void VisitAssignStatement(Node currentNode, VariableDeclaration variable, Node expression)
        {
            TempVariableNumber += 1;
            Visit(expression);

            CodeWriter.PutInstruction_Set(variable.Name, CurrentTempVariable);
            TempVariableNumber -= 1;
        }
        public override void VisitFunctionCallStatement(Node currentNode, FunctionDeclaration function, List<Node> parameteres)
        {
            TempVariableNumber += 1;
            //if (function.IsMacro)
            //{
            //    var macroCode = Macros[function.Name];

            //    PutMacroCallStatement(function, parameteres, macroCode);
            //}
            //else
            //{
            //}
            PutFunctionCallStatement(function, parameteres);
            
            TempVariableNumber -= 1;
        }
        private void PutMacroCallStatement(FunctionDeclaration macro, List<Node> parameteres, string[] code)
        {
            var codeOffset = 2; // skipping label and [store .return]
            for (int i = 0; i < parameteres.Count; i++)
            {
                Node param = parameteres[i];
                Visit(param);
                CodeWriter.PutInstruction_Set(macro.Parameteres[i].Name, CurrentTempVariable);
                codeOffset++;
            }
            var endBrunch = CurrentBrunchName;
            BrunchNumber++;
            for (; codeOffset < code.Length; codeOffset++)
            {
                var currentLine = code[codeOffset];
                if (currentLine.StartsWith("[return]"))
                {
                    CodeWriter.PutInstruction_Jump(endBrunch, ConditionType.always);
                    continue;
                }
                CodeWriter.PutLine(code[codeOffset]);
            }
            CodeWriter.PutLabel(endBrunch);
        }
        private void PutFunctionCallStatement(FunctionDeclaration function, List<Node> parameteres)
        {
            // saving arguments and local variables
            // TODO: make use of function signatures in the semantic model
            //foreach (var thisFuncArgument in CurrentFunction.Parameteres)
            //{
            //    CodeWriter.PutMacroCode_Load(thisFuncArgument.Name);
            //}
            if (CurrentFunction.ToString() != "void.main()")
            {
                foreach (var thisFuncLocalVar in SemanticModel.GetFunctionLocalVariables(CurrentFunction.Name))
                {
                    CodeWriter.PutMacroCode_Load(thisFuncLocalVar.Name);
                }
            }
            foreach (var param in parameteres)
            {
                Visit(param);
                CodeWriter.PutMacroCode_Load(CurrentTempVariable);
            }
            CodeWriter.PutMacroCode_Call(function.ToString());

            if (function.ReturnType != PrimitiveDataTypes.Void)
            {
                CodeWriter.PutMacroCode_Pop();
            }

            // loading arguments and local variables back
            if (CurrentFunction.ToString() != "void.main()")
            {
                foreach (var thisFuncLocalVar in SemanticModel.GetFunctionLocalVariables(CurrentFunction.Name).Reverse())
                {
                    CodeWriter.PutMacroCode_Store(thisFuncLocalVar.Name);
                }
            }
            //foreach (var thisFuncArgument in CurrentFunction.Parameteres.Reverse())
            //{
            //    CodeWriter.PutMacroCode_Store(thisFuncArgument.Name);
            //}
        }
        public override void VisitIfStatement(Node currentNode, Node condition, Node body)
        {
            TempVariableNumber += 1;
            Visit(condition);
            var brunch = CurrentBrunchName;
            BrunchNumber++;
            CodeWriter.PutInstruction_Jump(brunch, ConditionType.notEqual, CurrentTempVariable, "true");
            Visit(body);
            CodeWriter.PutLabel(brunch);
            TempVariableNumber -= 1;
        }
        public override void VisitWhileStatement(Node currentNode, Node condition, Node body)
        {
            var conditionBranch = CurrentBrunchName;
            BrunchNumber++;
            var codeBraunch = CurrentBrunchName;
            BrunchNumber++;
            var exitBrunch = CurrentBrunchName;
            BrunchNumber++;

            CodeWriter.PutLabel(conditionBranch);
            TempVariableNumber += 1;
            Visit(condition);
            CodeWriter.PutInstruction_Jump(exitBrunch, ConditionType.notEqual, CurrentTempVariable, "true");
            CodeWriter.PutLabel(codeBraunch);
            Visit(body);
            CodeWriter.PutInstruction_Jump(conditionBranch, ConditionType.always);
            CodeWriter.PutLabel(exitBrunch);
            TempVariableNumber -= 1;
        }
        public override void VisitReturnStatement(Node currentNode)
        {
            CodeWriter.PutMacroCode_Return();
        }
        public override void VisitReturnValueStatement(Node currentNode, Node value)
        {
            TempVariableNumber += 1;
            var retTemp = CurrentTempVariable;
            Visit(value);

            CodeWriter.PutMacroCode_Load(retTemp);
            CodeWriter.PutMacroCode_Return();
            TempVariableNumber -= 1;
        }

        public override void VisitLiteral(Node currentNode, LiteralValue literal)
        {
            var tmp = CurrentTempVariable;
            var val = string.Format(CultureInfo.InvariantCulture, "{0}", literal.Value);

            CodeWriter.PutInstruction_Set(tmp, val);
        }
        public override void VisitVariableReference(Node currentNode, VariableDeclaration variable)
        {
            var tmp = CurrentTempVariable;

            CodeWriter.PutInstruction_Set(tmp, variable.Name);
        }
        public override void VisitFunctionCall(Node currentNode, FunctionDeclaration function, List<Node> parameteres)
        {
            var tmpRes = CurrentTempVariable;
            TempVariableNumber++;

            //if (function.IsMacro)
            //{
            //    var code = Macros[function.Name];
            //    PutMacroCall(tmpRes, function, parameteres, code);
            //}
            //else
            //{
            //}
            PutFunctionCall(tmpRes, function, parameteres);
            
        }
        private void PutFunctionCall(string tmpRes, FunctionDeclaration function, List<Node> parameteres)
        {
            // TODO: make use of function signatures in the semantic model
            // saving arguments and local variables
            foreach (var thisFuncLocalVar in SemanticModel.GetFunctionLocalVariables(CurrentFunction.Name))
            {
                CodeWriter.PutMacroCode_Load(thisFuncLocalVar.Name);
            }
            CodeWriter.PutMacroCode_Load(".return");

            foreach (var param in parameteres)
            {
                Visit(param);
                CodeWriter.PutMacroCode_Load(CurrentTempVariable);
            }
            CodeWriter.PutMacroCode_Call(function.ToString());
            CodeWriter.PutMacroCode_Store(tmpRes);
            TempVariableNumber--;
            // loading arguments and local variables back
            CodeWriter.PutMacroCode_Store(".return");
            foreach (var thisFuncLocalVar in SemanticModel.GetFunctionLocalVariables(CurrentFunction.Name).Reverse())
            {
                CodeWriter.PutMacroCode_Store(thisFuncLocalVar.Name);
            }
        }
        private void PutMacroCall(string tmpRes, FunctionDeclaration macro, List<Node> parameteres, string[] code)
        {
            // TODO: all local variables are f*ked!
            var codeOffset = 2; // skipping label and [store .return]
            for (int i = 0; i < parameteres.Count; i++)
            {
                Node param = parameteres[i];
                Visit(param);
                CodeWriter.PutInstruction_Set(macro.Parameteres[i].Name, CurrentTempVariable);
                codeOffset++;
            }
            var endBrunch = CurrentBrunchName;
            BrunchNumber++;
            for (; codeOffset < code.Length; codeOffset++)
            {
                var currentLine = code[codeOffset];
                if (currentLine.StartsWith("[load"))
                {
                    var lookAhead = code[codeOffset + 1];
                    if (lookAhead == "[return]")
                    {
                        CodeWriter.PutInstruction_Set(tmpRes, currentLine.Trim('[', ']').Split()[1]);
                        CodeWriter.PutInstruction_Jump(endBrunch, ConditionType.always);
                        continue;
                    }
                }
                CodeWriter.PutLine(code[codeOffset]);
            }
            CodeWriter.PutLabel(endBrunch);
        }
        public override void VisitCast(Node currentNode, DataType targetType, Node instatnce)
        {
            var tmpRes = CurrentTempVariable;
            TempVariableNumber++;
            var tmpInstance = CurrentTempVariable;
            Visit(instatnce);

            CodeWriter.PutInstruction_Set(tmpRes, tmpInstance);

            TempVariableNumber--;
        }
        private void PutBinaryOperation(Node a, Operation operation, Node b)
        {
            var tmpRes = CurrentTempVariable;
            TempVariableNumber++;
            var tmpA = CurrentTempVariable;
            Visit(a);
            TempVariableNumber++;
            var tmpB = CurrentTempVariable;
            Visit(b);

            CodeWriter.PutInstruction_Op(operation, tmpRes, tmpA, tmpB);

            TempVariableNumber -= 2;
        }
        public override void VisitMultiplication(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.mul, b);
        }
        public override void VisitDivision(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.div, b);
        }
        public override void VisitAddition(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.add, b);
        }
        public override void VisitSubstraction(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.sub, b);
        }
        public override void VisitLessComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.lessThan, b);
        }
        public override void VisitGreaterComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.greaterThan, b);
        }

        public override void VisitMlogInstruction(Node instruction, List<string> parts)
        {
            CodeWriter.PutInstruction(
                parts[0],
                parts.Skip(1)
                );
        }

        public override void VisitLeftShift(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.leftShift, b);
        }
        public override void VisitRightShift(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.rightShift, b);
        }

        public override void VisitLessOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.lessThanOrEqual, b);
        }
        public override void VisitGreaterOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.greaterThanOrEqual, b);
        }
        public override void VisitEqualsComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.equals, b);
        }
        public override void VisitNotEqualsComparison(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.notEquals, b);
        }
        public override void VisitLogicalAnd(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.logicalAnd, b);
        }
        public override void VisitLogicalOr(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.logicalOr, b);
        }
        public override void VisitModulous(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.mod, b);
        }
        public override void VisitBitwiseAnd(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.and, b);
        }
        public override void VisitBitwiseXor(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.xor, b);
        }
        public override void VisitBitwiseOr(Node currentNode, Node a, Node b)
        {
            PutBinaryOperation(a, Operation.or, b);
        }
    }
}
