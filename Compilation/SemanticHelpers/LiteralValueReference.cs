using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Compilation.Semantic
{
    public struct LiteralValue
    {
        public DataType DataType { get; init; }
        public object Value { get; init; }

        public LiteralValue(DataType dataType, object value)
        {
            DataType = dataType;
            Value = value;
        }
    }
}
