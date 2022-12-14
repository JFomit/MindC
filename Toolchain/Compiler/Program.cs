using CommandLine;

namespace MindC.Toolchain
{
    public class Program
    {
        public class CompileOptions
        {
            [Option('i', "input", Required = true, HelpText = "Input file to be compiled into object file.")]
            public string InputFile { get; set; } = null!;
            [Option('o', "output", Required = false, HelpText = "Name of resulting object file.")]
            public string? OutputObjectFile { get; set; }
        }

        public static void Main(string[] args)
        {
            CommandLine.Parser.Default.ParseArguments<CompileOptions>(args)
                .WithParsed(RunCompiler)
                .WithNotParsed(HandleErrors);
        }

        private static void RunCompiler(CompileOptions options)
        {
            using (StreamReader reader = new(options.InputFile))
            {
                var result = Compiler.Compiler.CompileSource(reader, options.InputFile);
                var resultFileName = options.OutputObjectFile ?? Path.GetFileNameWithoutExtension(options.InputFile) + ".o";

#if DEBUG
                Console.WriteLine(result);
                Console.ReadLine();
#else
                File.WriteAllText(resultFileName, result);
#endif
            }
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