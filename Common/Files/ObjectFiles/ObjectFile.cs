namespace MindC.Common.Files.ObjectFiles
{
    public class ObjectFile
    {
        public Header Header;

        public FunctionSection FunctionSection;
        public CodeSection CodeSection;

        public string? BEFORE_INIT;

        public ObjectFile Set_BEFORE_INIT(string? data)
        {
            BEFORE_INIT = data;

            return this;
        }
    }
}
