using NetEscapades.EnumGenerators;
using System.Text;

namespace MindC.Compilation.CodeGeneration
{
    internal class SourceCodeWriter
    {
        private static readonly string CompilerGeneratedPrefix = ".c_";

        private List<string> _code;
        private Status _status;

        public SourceCodeWriter()
        {
            _code = new();
            _status = Status.Ready;
        }

        public void Begin()
        {
            if (_status != Status.Ready)
            {
                throw new InvalidOperationException("Can't call Begin() more than once before calling End().");
            }
            _code.Clear();
            _status = Status.Writing;
        }
        // helpers
        internal static string GetTempVariableName(int number)
        {
            return CompilerGeneratedPrefix + $"temp{number}";
        }
        internal void PutLine(string line)
        {
            _code.Add(line);
        }
        // support
        internal void PutComment(string comment)
        {
            _code.Add($"# {comment}");
        }
        internal void PutLabel(string label)
        {
            _code.Add($"{label}:");
        }
        // macro codes
        internal void PutMacroCode(string metadata)
        {
            _code.Add($"[{metadata}]");
        }
        internal void PutMacroCode_Entrypoint()
        {
            _code.Add("[entrypoint]");
        }
        internal void PutMacroCode_Return()
        {
            _code.Add("[return]");
        }
        internal void PutMacroCode_Reset()
        {
            _code.Add("[reset]");
        }
        internal void PutMacroCode_Load(string variableToLoad)
        {
            _code.Add($"[load {variableToLoad}]");
        }
        internal void PutMacroCode_Store(string variableToStoreTo)
        {
            _code.Add($"[store {variableToStoreTo}]");
        }
        internal void PutMacroCode_Call(string functionName)
        {
            _code.Add($"[call {functionName}]");
        }
        internal void PutMacroCode_Pop()
        {
            _code.Add($"[pop]");
        }
        // instructions
        internal void PutInstruction(string instruction, IEnumerable<string> args)
        {
            StringBuilder line = new();
            line.Append(instruction);

            foreach (var item in args)
            {
                line.Append(' ');
                line.Append(item);
            }
            _code.Add(line.ToString());
        }
        internal void PutInstruction_Set(string varName, string value)
        {
            _code.Add($"set {varName} {value}");
        }
        internal void PutInstruction_End()
        {
            _code.Add("end");
        }
        internal void PutInstruction_Op(Operation op, string destination, string a, string? b = null)
        {
            if (b is null)
            {
                _code.Add($"op {op.ToStringFast()} {destination} {a}");
            }
            else
            {
                _code.Add($"op {op.ToStringFast()} {destination} {a} {b}");
            }
        }
        internal void PutInstruction_Jump(string label, ConditionType condition, string? a = null, string? b = null)
        {
            StringBuilder result = new();
            result.Append($"jump {label} {condition.ToStringFast()}");
            if (a is not null)
            {
                result.Append($" {a}");
            }
            if (b is not null)
            {
                result.Append($" {b}");
            }

            _code.Add(result.ToString());
        }

        public string[] End()
        {
            if (_status != Status.Writing)
            {
                throw new InvalidOperationException("Can't call End() without calling Begin().");
            }
            _status = Status.Ready;

            return _code.ToArray();
        }

        private enum Status
        {
            Invalid = 0,
            Writing = 1,
            Ready = 2
        }
    }

    [EnumExtensions]
    internal enum Operation
    {
        invalid = 0,
        add = 1,
        sub = 2,
        mul = 3,
        div = 4,
        lessThan = 5,
        greaterThan = 6,
        lessThanOrEqual = 7,
        greaterThanOrEqual = 8,
        leftShift = 9,
        rightShift = 10,
        equal = 11,
        notEqual = 12,
        logicalAnd = 13,
        logicalOr = 14
    }
    [EnumExtensions]
    internal enum ConditionType
    {
        always = 0,
        notEqual = 1,
        equal = 2
    }
}
