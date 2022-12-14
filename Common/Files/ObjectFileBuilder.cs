using MindC.Common.Files.ObjectFiles;

namespace MindC.Common.Files
{
    internal class ObjectFinalBuilder : IObjectFileResultBuilder
    {
        protected Header Header;
        protected List<DeclaredFunction> DeclaredFunctions = new();
        protected List<FunctionCode> FunctionsCode = new();

        public ObjectFile Build()
        {
            return new ObjectFile()
            {
                Header = Header,
                FunctionSection = new FunctionSection() { DeclaredFunctions = DeclaredFunctions.ToArray() },
                CodeSection = new CodeSection { FunctionsCode = FunctionsCode.ToArray() }
            };
        }
    }

    internal class ObjectCodeSectionBuilder : ObjectFinalBuilder, ICodeSectionBuilder
    {
        public ICodeSectionBuilder AddFunctionCode(FunctionCode functionCode)
        {
            FunctionsCode.Add(functionCode);

            // TODO: Add NamedLabel extraction and setting here

            return this;
        }

        public IObjectFileResultBuilder BuildCodeSection()
        {
            return (ObjectFinalBuilder)this;
        }
    }
    internal class ObjectFunctionSectionBuilder : ObjectCodeSectionBuilder, IFuncionSectionBuilder
    {
        public IFuncionSectionBuilder AddFunctionDeclaration(DeclaredFunction function)
        {
            DeclaredFunctions.Add(function);
            return this;
        }

        public ICodeSectionBuilder BuildFunctionSection()
        {
            return (ObjectCodeSectionBuilder)this;
        }
    }
    internal class ObjectHeaderBuilder : ObjectFunctionSectionBuilder, IHeaderBuilder
    {
        public IFuncionSectionBuilder BuildHeader(FormatVersion format, int compiler)
        {
            Header = new Header()
            {
                FormatVersion = format,
                CompilerVersion = compiler
            };

            return (ObjectFunctionSectionBuilder)this;
        }
    }
    internal class ObjectFileBuilder : ObjectHeaderBuilder, IObjectFileBuilder
    {
        public IHeaderBuilder InitBuilder()
        {
            return (ObjectHeaderBuilder)this;
        }
    }

    public static class DefaultObjectBuilder
    {
        public static IObjectFileBuilder GetBuilder()
        {
            return new ObjectFileBuilder();
        }
    }
}
