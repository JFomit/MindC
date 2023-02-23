using NetEscapades.EnumGenerators;

namespace MindC.Compilation.Semantic
{
    [EnumExtensions]
    public enum MlogKeyword
    {
        invalid = 0,

        set,
        op,
        print,
        printflush,
        ubind,
        ucontrol,
        jump,
        lookup,
        sensor,
        control
    }
}
