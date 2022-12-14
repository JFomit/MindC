namespace MindC.Compilation.Semantic
{
    public enum Operation
    {
        Invalid = 0,
        Add = 1,
        Sub = 2,
        Mul = 3,
        Div = 4,

        LessThan = 5,
        GreaterThan = 6,

        ImplicitCast = 7,
        ExplicitCast = 8,
    }
}
