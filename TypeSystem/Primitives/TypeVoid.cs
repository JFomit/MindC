namespace MindC.Compilation.Semantic.Primitives
{
    public class TypeVoid : DataType
    {
        public override string GetDefaultValue() => "null";
        public override string GetStringRepresentation() => "void";

        public override bool TryGetOperationResult(Operation operation, DataType right, out DataType? result)
        {
            result = null;

            return false;
        }

        public override bool IsImplicitlyCastableTo(DataType other)
        {
            return TryGetOperationResult(Operation.ImplicitCast, other, out var _);
        }
        public override bool IsExplicitlyCastableTo(DataType other)
        {
            return TryGetOperationResult(Operation.ExplicitCast, other, out var _);
        }
    }
}
