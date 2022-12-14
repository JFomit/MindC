namespace MindC.Common.Files.ObjectFiles
{
    public interface ICodeSectionBuilder
    {
        ICodeSectionBuilder AddFunctionCode(FunctionCode functionCode);
        IObjectFileResultBuilder BuildCodeSection();
    }
}