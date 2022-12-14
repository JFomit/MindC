using CommandLine;
using MindC.Common.Files;
using MindC.Toolchain.Linker;

namespace MindC.Toolchain
{
    public class LinkerOptions
    {
        [Option('i', "inputs", Required = true, HelpText = "Input files to be linked.")]
        public IEnumerable<string> InputFiles { get; set; } = null!;
        [Option('o', "output", Required = false, HelpText = "Name of resulting file.")]
        public string? OutputFile { get; set; }

        [Option('s', "stack_address", Required = true, HelpText = "The in-game address of the block, that will be used as a stack.")]
        public string StackAddress { get; set; } = null!;
    }

    public class Program
    {
        public static void Main(string[] args)
        {
            CommandLine.Parser.Default.ParseArguments<LinkerOptions>(args)
                .WithParsed(RunLinker)
                .WithNotParsed(HandleErrors);
        }

        private static void RunLinker(LinkerOptions options)
        {
            var files = options.InputFiles;
            var objectFiles = new List<ObjectFileHandler>();

            foreach (var file in files)
            {
                using (StreamReader stream = new(file))
                {
                    var obj = new ObjectFileHandler(stream.ReadToEnd());
                    objectFiles.Add(obj);
                }
            }

            var linker = new Linker.Linker(objectFiles, options.StackAddress);
            var code = linker.GetLinkingResult();

            var macroCodeProcessor = new MacroCodeProcessor(code);
            var result = macroCodeProcessor.Process();
#if DEBUG
            Console.WriteLine(result);
            Console.ReadLine();
#else
            File.WriteAllText(options.OutputFile ?? Path.GetFileNameWithoutExtension(options.InputFiles.First()) + ".mlog", result);
#endif
        }
        private static void HandleErrors(IEnumerable<Error> errors)
        {
            foreach (var item in errors)
            {
                Console.Write(item);
                Console.Write(' ');
                Console.WriteLine(item.Tag);
            }
        }
    }
}