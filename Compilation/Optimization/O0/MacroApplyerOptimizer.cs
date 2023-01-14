using MindC.Common.Utility;
using MindC.Compilation.AST;
using MindC.Compilation.Semantic;
using MindC.Compilation.Semantic.Functions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Compilation.Optimization.O0
{
    public class MacroApplyerOptimizer : DefaultASTVisitor, IOptimizer
    {
        private SemanticModel SemanticModel = null!;

        public MacroApplyerOptimizer(Node root) : base(root)
        {
        }

        public void OptimizeTree(Node ast, SemanticModel semanticModel)
        {
            SemanticModel = semanticModel;

            Visit(ast);
        }

        public override void VisitFunctionCallStatement(Node currentNode, FunctionDeclaration function, List<Node> arguments)
        {
            if (function.IsMacro)
            {
                var func = (Node.FunctionDeclaration)SemanticModel.GetFunctionCode(function.Name);
                var parentNode = _path.Peek();

                var code = func.body.Clone();

                var parent = (Node.StatementSequence)parentNode;
                var i = parent.elements.FindIndex(node => node == currentNode);
                parent.elements.RemoveAt(i);
                parent.elements.Insert(i, code);
            }
        }
    }
}
