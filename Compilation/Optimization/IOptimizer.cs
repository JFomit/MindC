using MindC.Compilation.AST;
using MindC.Compilation.Semantic;

namespace MindC.Compilation.Optimization
{
    public interface IOptimizer
    {
        public void OptimizeTree(Node ast, SemanticModel semanticModel);
    }
}