using NetEscapades.EnumGenerators;

namespace MindC.Compilation.Semantic
{
    [EnumExtensions]
    public enum MlogKeyword
    {
        invalid = 0,

        set = 1,
        op = 2,
        print = 3,
        printflush = 4,
    }
}
