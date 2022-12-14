namespace MindC.Common.Files
{
    public struct DeclaredType
    {
        public string TypeName { get; init; }

        public DeclaredType(string typeName)
        {
            TypeName = typeName;
        }
    }
}
