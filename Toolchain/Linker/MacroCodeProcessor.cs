using MindC.Common.Files;
using System.Text;

namespace MindC.Toolchain.Linker
{
    internal class MacroCodeProcessor
    {
        private readonly string _code;
        private StringBuilder Result { get; init; }

        public MacroCodeProcessor(string code)
        {
            _code = code;
            Result = new();
        }

        public string Process()
        {
            string[] array = _code.Split(Environment.NewLine.ToCharArray());
            for (int i = 0; i < array.Length; i++)
            {
                string line = array[i].Trim();
                if (line.StartsWith('[')) // macrocode
                {
                    ProcessMacroCode(line);
                }
                else
                {
                    Result.AppendLine(line);
                }
            }

            return Result.ToString();
        }

        private void ProcessMacroCode(string line)
        {
            var attributeData = line.Trim('[', ']').Split();

            var replacement = attributeData switch
            {
                ["entrypoint"] => "",
                ["call", var func] => $"set .val 0\nop add .val @counter 3\n{PushValueCode(".val")}\njump {new FunctionSignature(func).Name} always",
                ["load", var value] => PushValueCode(value),
                ["store", var value] => PullValueCode(value),
                ["return"] => "set @counter .return",
                ["reset"] => "end",
                _ => line
            };

            Result.AppendLine(replacement);
        }

        private static string PushValueCode(string value)
        {
            return $"op add .stack_pointer .stack_pointer 1\nwrite {value} .stack_addr .stack_pointer";
        }
        private static string PullValueCode(string value)
        {
            return $"read {value} .stack_addr .stack_pointer\nop sub .stack_pointer .stack_pointer 1\n";
        }
    }
}
