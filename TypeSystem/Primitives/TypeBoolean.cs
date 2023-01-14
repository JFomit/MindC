namespace MindC.Compilation.Semantic.Primitives
{
    public class TypeBoolean : DataType
    {
        public override string GetDefaultValue() => "false";
        public override string GetStringRepresentation() => "bool";

        public override bool TryGetOperationResult(Operation operation, DataType right, out DataType? result)
        {
            result = (operation, right) switch
            {
                (Operation.Invalid, _) => null,

                (Operation.LessThan, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.GreaterThan, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.LessThanOrEqual, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.GreaterThanOrEqual, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.Equals, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.NotEquals, TypeBoolean) => PrimitiveDataTypes.Boolean,

                (Operation.LogicalAnd, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.Xor, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.LogicalOr, TypeBoolean) => PrimitiveDataTypes.Boolean,

                (Operation.ImplicitCast, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.ImplicitCast, TypeString) => PrimitiveDataTypes.String,

                (Operation.ExplicitCast, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.ExplicitCast, TypeString) => PrimitiveDataTypes.String,
                (Operation.ExplicitCast, TypeNumber) => PrimitiveDataTypes.Number,

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
