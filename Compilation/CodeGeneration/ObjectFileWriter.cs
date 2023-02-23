using MindC.Common.Files;
using MindC.Common.Files.ObjectFiles;
using Newtonsoft.Json;

namespace MindC.Compilation.CodeGeneration
{
    public class ObjectFileWriter
    {
        private IObjectFileBuilder? ObjectFileBuilder { get; set; }
        private IHeaderBuilder? ObjectHeaderBuilder { get; set; }
        private IFuncionSectionBuilder? ObjectFunctionsBuilder { get; set; }
        private ICodeSectionBuilder? ObjectCodeBuilder { get; set; }
        private IObjectFileResultBuilder? ObjectResultBuilder { get; set; }

        private ObjectFile? ObjectFile { get; set; }

        public ObjectFileWriter()
        {
            ObjectFileBuilder = DefaultObjectBuilder.GetBuilder();
            ObjectHeaderBuilder = ObjectFileBuilder.InitBuilder();
        }

        internal void BuildHeader(FormatVersion formatVersion, int compilerVersion)
        {
            ObjectFunctionsBuilder = ObjectHeaderBuilder!.BuildHeader(formatVersion, compilerVersion);
        }

        internal void StartFunctionsSection()
        {

        }
        internal void PutFunctionDeclaration(string signature)
        {
            ObjectFunctionsBuilder!.AddFunctionDeclaration(new() { Signature = new(signature) });
        }
        internal void EndFunctionSection()
        {
            ObjectCodeBuilder = ObjectFunctionsBuilder!.BuildFunctionSection();
        }

        internal void StartCodeSection()
        {
            
        }
        internal void PutCode(string[] code)
        {
            ObjectCodeBuilder!.AddFunctionCode(new() { Code = code });
        }
        internal void EndCodeSection()
        {
            ObjectResultBuilder = ObjectCodeBuilder!.BuildCodeSection();
        }

        internal string GetCode(string?  beforeInit)
        {
            var file = ObjectResultBuilder!.Build().Set_BEFORE_INIT(beforeInit);

            var code = JsonConvert.SerializeObject(file, Formatting.Indented);

            return code.ToString();
        }
    }
}
