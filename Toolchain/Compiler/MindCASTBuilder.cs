using Antlr4.Runtime.Misc;
using MindC.Common.Pipelining;
using MindC.Compilation.AST;
using MindC.Compilation.Semantic;
using MindC.Compilation.Semantic.Functions;
using MindC.Compilation.Semantic.Primitives;
using MindC.Compilation.Semantic.Variables;
using MindC.Compiler;
using System.Globalization;
using static MindC.Compiler.MindCParser;

namespace MindC.Toolchain.Compiler
{
    internal class MindCASTBuilder : MindCBaseVisitor<Node>, IStage
    {
        private StageStatus StageStatus { get; set; }

        private SemanticModel SemanticModel { get => _semanticModel; }
        private readonly SemanticModel _semanticModel;

        private string CurrentFunctionName { get; set; } = "";

        public MindCASTBuilder()
        {
            _semanticModel = new SemanticModel();

            StageStatus = StageStatus.Ready;
        }

        internal SemanticModel GetSemanticModel()
        {
            return SemanticModel;
        }

        public override Node VisitInput([NotNull] InputContext context)
        {
            var elements = new List<Node>();

            for (int i = 0; i < context.ChildCount; i++)
            {
                elements.Add(Visit(context.GetChild(i)));
            }

            return Node.NewRoot(elements);
        }

        #region declarations
        public override Node VisitFunction_declaration([NotNull] Function_declarationContext context)
        {
            var name = context.functionName.GetText();
            var type = context.retrunType.GetText();

            FunctionDeclaration function;
            CurrentFunctionName = name;

            if (context.functionParameteres is null)
            {
                function = new FunctionDeclaration(name, SemanticModel.GetTypeInstance(type));
            }
            else
            {
                var @params = new List<FunctionParameter>();
                for (int i = 0; i < context.functionParameteres.ChildCount; i++)
                {
                    var argTree = context.functionParameteres.GetChild(i);
                    if (argTree is Single_parameterContext parameterContext)
                    {
                        @params.Add(VisitFunctionParameter(parameterContext));
                    }
                }
                function = new FunctionDeclaration(name, SemanticModel.GetTypeInstance(type), @params.ToArray());
            }
            SemanticModel.RegisterFunction(function);

            var code = VisitStatement_block(context.functionBody);
            var functionNode = Node.NewFunctionDeclaration(function, code);

            return functionNode;
        }
        public FunctionParameter VisitFunctionParameter(Single_parameterContext context)
        {
            var name = context.parameterName.GetText();
            var typeName = context.parameterType.GetText();
            var type = SemanticModel.GetTypeInstance(typeName);

            SemanticModel.RegisterLocalVariable(CurrentFunctionName, new VariableDeclaration(name, type));

            return new FunctionParameter(type, name);
        }

        public override Node VisitGlobal_variable_declaration([NotNull] Global_variable_declarationContext context)
        {
            var name = context.variableName.GetText();
            var type = SemanticModel.GetTypeInstance(context.variableType.GetText());

            var variable = new VariableDeclaration(name, type);
            SemanticModel.RegisterGlobalVariable(variable);

            return Node.NewGlobalVariableDeclaration(variable);
        }
        #endregion

        #region mindc_statements
        public override Node VisitStatement_block([NotNull] Statement_blockContext context)
        {
            return VisitStatement_list((Statement_listContext)context.GetChild(1)); // by grammar
        }
        public override Node VisitStatement_list([NotNull] Statement_listContext context)
        {
            var statements = new List<Node>();

            for (int i = 0; i < context.ChildCount; i++)
            {
                statements.Add(Visit(context.GetChild(i)));
            }

            return Node.NewStatementSequence(statements);
        }

        public override Node VisitVar_statement([NotNull] Var_statementContext context)
        {
            var name = context.variableName.GetText();
            var type = context.variableType.GetText();

            var variable = new VariableDeclaration(name, SemanticModel.GetTypeInstance(type));
            SemanticModel.RegisterLocalVariable(CurrentFunctionName, variable);

            return Node.NewVarStatement(variable);
        }
        public override Node VisitAssign_statement([NotNull] Assign_statementContext context)
        {
            var name = context.variableName.GetText();
            var variableReference = SemanticModel.GetVariableDeclaration(CurrentFunctionName, name);

            var expression = Visit(context.value);

            return Node.NewAssignStatement(variableReference, expression);
        }
        public override Node VisitFunction_call_statement([NotNull] Function_call_statementContext context)
        {
            var functionCall = (Node.FunctionCall)VisitFunction_call_operator(context.function_call_operator());
            return Node.NewFunctionCallStatement(functionCall.name, functionCall.arguments);
        }
        public override Node VisitIf_statement([NotNull] If_statementContext context)
        {
            var conditionTree = Visit(context.condition);
            var codeTree = VisitStatement_block(context.code);

            return Node.NewIfStatement(conditionTree, codeTree);
        }
        public override Node VisitWhile_statemenet([NotNull] While_statemenetContext context)
        {
            var conditionTree = Visit(context.condition);
            var codeTree = VisitStatement_block(context.code);

            return Node.NewWhileStatement(conditionTree, codeTree);
        }
        public override Node VisitReturn_statement([NotNull] Return_statementContext context)
        {
            return Node.ReturnStatement;
        }
        public override Node VisitReturn_value_statement([NotNull] Return_value_statementContext context)
        {
            var value = Visit(context.value);
            return Node.NewReturnValueStatement(value);
        }
        #endregion

        #region expressions
        public override Node VisitLiteral_value([NotNull] Literal_valueContext context)
        {
            return VisitLiteral(context.literal());
        }
        public override Node VisitVariable_reference([NotNull] Variable_referenceContext context)
        {
            return Node.NewVariableReference(SemanticModel.GetVariableDeclaration(CurrentFunctionName, context.GetText()));
        }
        public override Node VisitFunction_call([NotNull] Function_callContext context)
        {
            return VisitFunction_call_operator(context.function_call_operator());
        }
        public override Node VisitFunction_call_operator([NotNull] Function_call_operatorContext context)
        {
            var name = context.functionName.GetText();
            var func = SemanticModel.GetFunctionDeclaration(name);

            var arguments = new List<Node>();
            if (context.arguments is not null)
            {
                for (int i = 0; i < context.arguments.ChildCount; i++)
                {
                    var paramTree = context.arguments.GetChild(i);
                    if (paramTree is Single_argumentContext arg)
                    {
                        arguments.Add(VisitFunctionArgument(arg));
                    }
                }
            }

            return Node.NewFunctionCall(func, arguments);
        }
        private Node VisitFunctionArgument(Single_argumentContext context)
        {
            return VisitSingle_argument(context);
        }

        public override Node VisitAdditioning_operator([NotNull] Additioning_operatorContext context)
        {
            if (context.@operator.Text == "+")
            {
                return Node.NewAdd(Visit(context.left), Visit(context.right));
            }
            else
            {
                return Node.NewSub(Visit(context.left), Visit(context.right));
            }
        }
        public override Node VisitMultiplicationing_operator([NotNull] Multiplicationing_operatorContext context)
        {
            if (context.@operator.Text == "*")
            {
                return Node.NewMul(Visit(context.left), Visit(context.right));
            }
            else
            {
                return Node.NewDiv(Visit(context.left), Visit(context.right));
            }
        }
        public override Node VisitNumber_literal([NotNull] Number_literalContext context)
        {
            double.TryParse(context.GetText(), NumberStyles.Any, CultureInfo.InvariantCulture, out var value);
            return Node.NewLiteral(new LiteralValue(PrimitiveDataTypes.Number, value));
        }
        public override Node VisitBoolean_literal([NotNull] Boolean_literalContext context)
        {
            return Node.NewLiteral(new LiteralValue(PrimitiveDataTypes.Boolean, bool.Parse(context.GetText())));
        }
        public override Node VisitString_literal([NotNull] String_literalContext context)
        {
            return Node.NewLiteral(new LiteralValue(PrimitiveDataTypes.String, context.GetText().Trim('"')));
        }
        public override Node VisitParentheses([NotNull] ParenthesesContext context)
        {
            return Visit(context.GetChild(1)); // by grammar
        }

        public override Node VisitComparison_operator([NotNull] Comparison_operatorContext context)
        {
            var op = context.@operator.Text;
            var node = op switch
            {
                "<" => Node.NewLessThan(Visit(context.left), Visit(context.right)),
                ">" => Node.NewGreaterThan(Visit(context.left), Visit(context.right)),
                "<=" => Node.NewLessThanOrEqual(Visit(context.left), Visit(context.right)),
                ">=" => Node.NewGreaterThanOrEqual(Visit(context.left), Visit(context.right)),
                _ => throw new InvalidOperationException("This should not be possible - all operators are handled by ANTLR!")
            };
            return node;
        }
        public override Node VisitShifting_operator([NotNull] Shifting_operatorContext context)
        {
            var op = context.@operator.Text;
            var node = op switch
            {
                "<<" => Node.NewLeftShift(Visit(context.left), Visit(context.right)),
                ">>" => Node.NewRightShift(Visit(context.left), Visit(context.right)),
                _ => throw new InvalidOperationException("This should not be possible - all operators are handled by ANTLR!")
            };
            return node;
        }
        public override Node VisitEquality_operator([NotNull] Equality_operatorContext context)
        {
            var op = context.@operator.Text;
            var node = op switch
            {
                "==" => Node.NewEqual(Visit(context.left), Visit(context.right)),
                "!=" => Node.NewNotEqual(Visit(context.left), Visit(context.right)),
                _ => throw new InvalidOperationException("This should not be possible - all operators are handled by ANTLR!")
            };
            return node;
        }
        public override Node VisitLogical_and_operator([NotNull] Logical_and_operatorContext context)
        {
            return Node.NewLogicalAnd(Visit(context.left), Visit(context.right));
        }
        public override Node VisitLogical_or_operator([NotNull] Logical_or_operatorContext context)
        {
            return Node.NewLogicalOr(Visit(context.left), Visit(context.right));
        }

        public override Node VisitExplicit_cast_operator([NotNull] Explicit_cast_operatorContext context)
        {
            var type = SemanticModel.GetTypeInstance(context.cast_target_type.GetText());
            return Node.NewCast(type, Visit(context.instance));
        }
        #endregion

        #region mlog
        public override Node VisitMlog_statement([NotNull] Mlog_statementContext context)
        {
            return VisitMlog_instruction_list((Mlog_instruction_listContext)context.GetChild(2));
        }
        public override Node VisitMlog_instruction_list([NotNull] Mlog_instruction_listContext context)
        {
            var instructions = new List<Node>();

            for (int i = 0; i < context.ChildCount; i++)
            {
                instructions.Add(Visit(context.GetChild(i)));
            }

            return Node.NewStatementSequence(instructions);
        }
        public override Node VisitMlog_instruction([NotNull] Mlog_instructionContext context)
        {
            var parts = new List<string>();
            if (MlogKeywordExtensions.TryParse(context.instruction.GetText(), out var keyword)) // its a keyword
            {
                parts.Add(keyword.ToStringFast());
            }
            else
            {
                throw new InvalidOperationException("First must be a keyword!");
            }

            for (int i = 1; i < context.ChildCount; i++)
            {
                var child = context.GetChild(i);

                if (child.GetText().StartsWith('$')) // variable capture
                {
                    parts.Add(SemanticModel.GetVariableDeclaration(CurrentFunctionName, child.GetText()[1..]).Name);
                }
                else if (child.GetText() == ";")
                {
                    continue;
                }
                else
                {
                    parts.Add(child.GetText());
                }
            }

            return Node.NewMlogInstruction(parts);
        }
        public override Node VisitMlog_raw_operand([NotNull] Mlog_raw_operandContext context)
        {
            return base.VisitMlog_raw_operand(context);
        }
        #endregion

        public StageStatus GetStageStatus()
        {
            return StageStatus;
        }
    }
}
