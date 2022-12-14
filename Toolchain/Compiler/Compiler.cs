using Antlr4.Runtime;
using MindC.Compilation.AST;
using MindC.Compilation.CodeGeneration;
using MindC.Compilation.Optimization;
using MindC.Compilation.Semantic.TypeValidation;
using MindC.Compiler;

namespace MindC.Toolchain.Compiler
{
    internal static class Compiler
    {
        public static string CompileSource(TextReader input, string inputName)
        {
            AntlrInputStream inputStream = new(input);

            MindCLexer lexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(lexer);

            MindCParser parser = new(commonTokenStream);

            MindCParser.InputContext inputContext = parser.input();
            MindCASTBuilder ASTBuilder = new();

            Node AST = ASTBuilder.VisitInput(inputContext);

            TypeValidationASTVisitor validator = new(AST, ASTBuilder.GetSemanticModel());
            validator.Validate();

            List<IOptimizer> optimizers = new()
            {

            };

            ObjectGenerator generator = new(AST, ASTBuilder.GetSemanticModel(), optimizers, inputName);
            return generator.GetObjectCode();
        }
    }
}
