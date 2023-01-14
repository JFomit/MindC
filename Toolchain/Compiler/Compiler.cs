using Antlr4.Runtime;
using MindC.Compilation.AST;
using MindC.Compilation.CodeGeneration;
using MindC.Compilation.Optimization;
using MindC.Compilation.Optimization.O0;
using MindC.Compilation.Semantic.TypeValidation;
using MindC.Compiler;
using MindC.Toolchain.Compiler.Preprocessing;
using System.Text;

namespace MindC.Toolchain.Compiler
{
    internal static class Compiler
    {
        public static string CompileSource(TextReader input, string inputName)
        {
            AntlrInputStream inputStream = new(input);

            MindCLexer lexer = new(inputStream);
            Preprocessor preprocessor = new(lexer);
            CommonTokenStream commonTokenStream = new(preprocessor);

            //var str = new StringBuilder();
            //IToken next;
            //do
            //{
            //    next = preprocessor.NextToken();
            //    str.AppendLine(next.Text);

            //} while (next.Type != MindCLexer.Eof);
            //Console.WriteLine(str.ToString());

            MindCParser parser = new(commonTokenStream);

            MindCParser.InputContext inputContext = parser.input();
            MindCASTBuilder ASTBuilder = new();

            Node AST = ASTBuilder.VisitInput(inputContext);

            TypeValidationASTVisitor validator = new(AST, ASTBuilder.GetSemanticModel());
            validator.Validate();

            List<IOptimizer> optimizers = new()
            {
                //new MacroApplyerOptimizer(AST)
            };

            foreach (var optimizer in optimizers)
            {
                optimizer.OptimizeTree(AST, ASTBuilder.GetSemanticModel());
            }

            ObjectGenerator generator = new(AST, ASTBuilder.GetSemanticModel(), optimizers, inputName);
            return generator.GetObjectCode();
        }
    }
}
