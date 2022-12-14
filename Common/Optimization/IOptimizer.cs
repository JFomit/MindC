namespace MindC.Common.Optimization
{
    public interface IOptimizer<TCodeModel>
    {
        void Optimize(TCodeModel codeModel);
    }
}