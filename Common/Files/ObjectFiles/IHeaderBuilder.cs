namespace MindC.Common.Files.ObjectFiles
{
    public interface IHeaderBuilder
    {
        IFuncionSectionBuilder BuildHeader(FormatVersion formatVersion, int compilerVersion);
    }
}
