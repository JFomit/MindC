namespace MindC.Compilation.Semantic.Primitives
{
    public class TypeString : DataType
    {
        public override string GetDefaultValue() => "";
        public override string GetStringRepresentation() => "string";

        public override bool TryGetOperationResult(Operation operation, DataType right, out DataType? result)
        {
            result = (operation, right) switch
            {
                (Operation.Invalid, _) => null,

                (Operation.Add, TypeString) => PrimitiveDataTypes.String,

                (Operation.ImplicitCast, TypeString) => PrimitiveDataTypes.String,
                (Operation.ImplicitCast, TypeAny) => PrimitiveDataTypes.Any,

                (Operation.ExplicitCast, _) => right, // any is included

                _ => null
            };

            return result is not null;
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
