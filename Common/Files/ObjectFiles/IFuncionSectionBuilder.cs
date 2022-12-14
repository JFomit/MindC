namespace MindC.Common.Files.ObjectFiles
{
    public interface IFuncionSectionBuilder
    {
        ICodeSectionBuilder BuildFunctionSection();
        IFuncionSectionBuilder AddFunctionDeclaration(DeclaredFunction function);
    }
}