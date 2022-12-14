using MindC.Common.Files;
using System.Text;

namespace MindC.Toolchain.Linker
{
    internal class Linker
    {
        private readonly IEnumerable<ObjectFileHandler> _objectFiles;

        public string StackAddress { get; init; }

        public Linker(IEnumerable<ObjectFileHandler> files, string stackAddress)
        {
            _objectFiles = files;
            StackAddress = stackAddress;
        }

        public string GetLinkingResult()
        {
            StringBuilder result = new();

            PutLoaderCode(result);
            foreach (var obj in _objectFiles)
            {
                PutObjectFileCode(obj, result);
            }

            return result.ToString();
        }

        private void PutLoaderCode(StringBuilder result)
        {
            result.AppendLine("# Built with MindC toolchain");
            result.AppendLine("init:");
            result.AppendLine("set .stack_pointer 0");
            result.AppendLine($"set .stack_addr {StackAddress}");
            result.AppendLine("jump main always");
        }
        private static void PutObjectFileCode(ObjectFileHandler obj, StringBuilder result)
        {
            var file = obj.ObjectFile;

            foreach (var code in file.CodeSection.FunctionsCode)
            {
                result.AppendJoin<string>('\n', code.Code);
                result.AppendLine();
            }
        }
    }
}
