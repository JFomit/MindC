namespace MindC.Compilation.Semantic.Primitives
{
    public static class PrimitiveDataTypes
    {
        public static DataType Void => _void;
        public static DataType Number => _number;
        public static DataType Boolean => _boolean;
        public static DataType String => _string;

        private static readonly DataType _void = new TypeVoid();
        private static readonly DataType _number = new TypeNumber();
        private static readonly DataType _boolean = new TypeBoolean();
        private static readonly DataType _string = new TypeString();

        public static void SetupBuitInTypes(Dictionary<string, DataType> types)
        {
            types.Add(Void.GetStringRepresentation(), Void);
            types.Add(Number.GetStringRepresentation(), Number);
            types.Add(Boolean.GetStringRepresentation(), Boolean);
            types.Add(String.GetStringRepresentation(), String);
        }
    }
}
