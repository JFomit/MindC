namespace MindC.Compilation.Semantic.Functions
{
    public struct FunctionParameter
    {
        public DataType Type { get; init; }
        public string Name { get; init; }

        public FunctionParameter(DataType type, string name)
        {
            Type = type;
            Name = name;
        }
    }
}
