using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Compilation.Semantic.Primitives
{
    internal class TypeAny : DataType
    {
        public override string GetDefaultValue() => "null";

        public override string GetStringRepresentation() => "any";

        public override bool IsExplicitlyCastableTo(DataType other)
        {
            return other is not TypeVoid;
        }

        public override bool IsImplicitlyCastableTo(DataType other)
        {
            return other is not TypeVoid;
        }

        public override bool TryGetOperationResult(Operation operation, DataType right, out DataType? result)
        {
            result = (operation, right) switch
            {
                (Operation.Invalid, _) => null, // invalid is UB

                (_, TypeVoid) => null, // can't do ops on void

                _ => PrimitiveDataTypes.Any // everything else is allowed, resut - any
            };

            return result is not null;
        }
    }
}
