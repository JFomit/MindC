namespace MindC.Compilation.Semantic
{
    public struct LiteralValue
    {
        public DataType DataType { get; init; }
        public object Value { get; init; }

        public LiteralValue(DataType dataType, object value)
        {
            DataType = dataType;
            Value = value;
        }
    }
}
