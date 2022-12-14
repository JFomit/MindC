namespace MindC.Compilation.Semantic
{
    public abstract class DataType
    {
        public abstract bool TryGetOperationResult(Operation operation, DataType right, out DataType? result);

        public abstract string GetDefaultValue();
        public abstract string GetStringRepresentation();

        public abstract bool IsImplicitlyCastableTo(DataType other);
        public abstract bool IsExplicitlyCastableTo(DataType other);
    }
}
