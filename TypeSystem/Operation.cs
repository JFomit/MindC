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
        LessThanOrEqual = 7,
        GreaterThanOrEqual = 8,
        LeftShift = 9,
        RightShift = 10,
        Equal = 11,
        NotEqual = 12,
        LogicalAnd = 13,
        LogicalOr = 14,

        ImplicitCast = 15,
        ExplicitCast = 16,
    }
}
