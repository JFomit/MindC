namespace MindC.Common.Files.ObjectFiles
{
    public struct Header
    {
        public FormatVersion FormatVersion;
        public int CompilerVersion;
    }

    public enum FormatVersion
    {
        Dev = 0
    }
}
