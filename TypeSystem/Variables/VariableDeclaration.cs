namespace MindC.Compilation.Semantic.Variables
{
    public class VariableDeclaration
    {
        public string Name { get; init; }
        public DataType DataType { get; init; }

        public VariableDeclaration(string name, DataType dataType)
        {
            Name = name;
            DataType = dataType;
        }
    }
}
