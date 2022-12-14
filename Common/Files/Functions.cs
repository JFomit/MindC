namespace MindC.Common.Files
{
    public struct DeclaredFunction
    {
        public NamedLabel Code { get; init; }
        public FunctionSignature Signature { get; init; }

        public DeclaredFunction(NamedLabel code, FunctionSignature signature)
        {
            Code = code;
            Signature = signature;
        }
    }

    public struct NamedLabel
    {
        public string Label { get; init; }

        public NamedLabel(string label)
        {
            Label = label;
        }
    }

    public struct FunctionSignature
    {
        public string Name { get; init; }
        public string ReturnType { get; init; }

        public FunctionParameter[] Parameteres { get; init; }

        public FunctionSignature(string signature)
        {
            var parts = signature.Split('.', '(', ')');
            List<FunctionParameter> @params = new();

            foreach (var item in parts[2..])
            {
                @params.Add(new FunctionParameter(new DeclaredType(item)));
            }

            Name = parts[1];
            ReturnType = parts[0];
            Parameteres = @params.ToArray();
        }
    }

    public struct FunctionParameter
    {
        public DeclaredType Type { get; init; }

        public FunctionParameter(DeclaredType type)
        {
            Type = type;
        }
    }

    public struct FunctionCode
    {
        public string[] Code;
    }
}
