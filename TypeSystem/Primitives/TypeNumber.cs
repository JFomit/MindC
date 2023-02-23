namespace MindC.Compilation.Semantic.Primitives
{
    public class TypeNumber : DataType
    {
        public override string GetDefaultValue() => "0";
        public override string GetStringRepresentation() => "number";

        public override bool TryGetOperationResult(Operation operation, DataType right, out DataType? result)
        {
            result = (operation, right) switch
            {
                (Operation.Invalid, _) => null,

                (Operation.Add, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Sub, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Mul, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Div, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Mod, TypeNumber) => PrimitiveDataTypes.Number,

                (Operation.LessThan, TypeNumber) => PrimitiveDataTypes.Boolean,
                (Operation.GreaterThan, TypeNumber) => PrimitiveDataTypes.Boolean,
                (Operation.LessThanOrEqual, TypeNumber) => PrimitiveDataTypes.Boolean,
                (Operation.GreaterThanOrEqual, TypeNumber) => PrimitiveDataTypes.Boolean,
                (Operation.Equals, TypeNumber) => PrimitiveDataTypes.Boolean,
                (Operation.NotEquals, TypeNumber) => PrimitiveDataTypes.Boolean,

                (Operation.LeftShift, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.RightShift, TypeNumber) => PrimitiveDataTypes.Number,

                (Operation.And, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Xor, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.Or, TypeNumber) => PrimitiveDataTypes.Number,

                (Operation.ImplicitCast, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.ImplicitCast, TypeString) => PrimitiveDataTypes.String,
                (Operation.ImplicitCast, TypeAny) => PrimitiveDataTypes.Any,

                (Operation.ExplicitCast, TypeNumber) => PrimitiveDataTypes.Number,
                (Operation.ExplicitCast, TypeString) => PrimitiveDataTypes.String,
                (Operation.ExplicitCast, TypeBoolean) => PrimitiveDataTypes.Boolean,
                (Operation.ExplicitCast, TypeAny) => PrimitiveDataTypes.Any,

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
