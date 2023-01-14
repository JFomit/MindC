namespace MindC.Compilation.Semantic
{
    public enum Operation
    {
        Invalid = 0,

        Add,
        Sub,
        Mul,
        Div,
        Mod,

        LeftShift,
        RightShift,

        LessThan,
        GreaterThan,
        LessThanOrEqual,
        GreaterThanOrEqual,
        Equals,
        NotEquals,

        And,
        Xor,
        Or,

        LogicalAnd,
        LogicalOr,

        ImplicitCast,
        ExplicitCast,
    }
}
