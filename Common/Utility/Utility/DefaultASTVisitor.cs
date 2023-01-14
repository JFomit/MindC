using MindC.Compilation.AST;
using MindC.Compilation.Semantic;
using MindC.Compilation.Semantic.Functions;
using MindC.Compilation.Semantic.Variables;
using static MindC.Compilation.AST.Visiting;

namespace MindC.Common.Utility
{
    public class DefaultASTVisitor : BaseASTVisitor
    {
        protected Stack<Node> _path;

        public DefaultASTVisitor(Node root) : base(root)
        {
            _path = new();
        }

        public override void VisitAddition(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitAssignStatement(Node currentNode, VariableDeclaration variable, Node expression)
        {
            _path.Push(currentNode);
            Visit(expression);
            _path.Pop();
        }

        public override void VisitBitwiseAnd(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
        }

        public override void VisitBitwiseOr(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitBitwiseXor(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitCast(Node currentNode, DataType targetType, Node instatnce)
        {
            _path.Push(currentNode);
            Visit(instatnce);
            _path.Pop();
        }

        public override void VisitDivision(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitEqualsComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitFunctionCall(Node currentNode, FunctionDeclaration function, List<Node> arguments)
        {
            _path.Push(currentNode);
            foreach (var arg in arguments)
            {
                Visit(arg);
            }
            _path.Pop();
        }

        public override void VisitFunctionCallStatement(Node currentNode, FunctionDeclaration function, List<Node> arguments)
        {
            _path.Push(currentNode);
            foreach (var arg in arguments)
            {
                Visit(arg);
            }
            _path.Pop();
        }

        public override void VisitFunctionDeclaration(Node currentNode, FunctionDeclaration function, Node body)
        {
            _path.Push(currentNode);
            Visit(body);
            _path.Pop();
        }

        public override void VisitGlobalVariableDeclaration(Node currentNode, VariableDeclaration variable)
        { }

        public override void VisitGreaterComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitGreaterOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitIfStatement(Node currentNode, Node condition, Node body)
        {
            _path.Push(currentNode);
            Visit(condition);
            Visit(body);
            _path.Pop();
        }

        public override void VisitLeftShift(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitLessComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitLessOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitLiteral(Node currentNode, LiteralValue literal)
        { }

        public override void VisitLogicalAnd(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitLogicalOr(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitMlogInstruction(Node instruction, List<string> parts)
        { }

        public override void VisitModulous(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitMultiplication(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitNotEqualsComparison(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitReturnStatement(Node currentNode)
        { }

        public override void VisitReturnValueStatement(Node currentNode, Node value)
        {
            _path.Push(currentNode);
            Visit(value);
            _path.Pop();
        }

        public override void VisitRightShift(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitRoot(Node currentNode, List<Node> elements)
        {
            _path.Push(currentNode);
            foreach (var element in elements)
            {
                Visit(element);
            }
            _path.Pop();
        }

        public override void VisitStatementSequnce(Node currentNode, List<Node> statements)
        {
            _path.Push(currentNode);
            foreach (var element in statements)
            {
                Visit(element);
            }
            _path.Pop();
        }

        public override void VisitSubstraction(Node currentNode, Node a, Node b)
        {
            _path.Push(currentNode);
            Visit(a);
            Visit(b);
            _path.Pop();
        }

        public override void VisitVariableReference(Node currentNode, VariableDeclaration variable)
        { }

        public override void VisitVarStatement(Node currentNode, VariableDeclaration variable)
        { }

        public override void VisitWhileStatement(Node currentNode, Node condition, Node body)
        {
            _path.Push(currentNode);
            Visit(condition);
            Visit(body);
            _path.Pop();
        }
    }
}