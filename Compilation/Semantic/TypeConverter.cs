namespace MindC.Compilation.Semantic
{
    internal class TypeConverter
    {
        public bool IsExplicitlyConvertable(DataType from, DataType to, out DataType? resultingType)
        {
            if (from.IsExplicitlyCastableTo(to))
            {
                resultingType = to;
                return true;
            }
            else
            {
                resultingType = null;
                return false;
            }
        }
        public DataType GetExplicitConversionType(DataType from, DataType to)
        {
            if (IsExplicitlyConvertable(from, to, out var result))
            {
                return result!;
            }
            else
            {
                throw new InvalidCastException();
            }
        }

        public bool IsImplicitlyConvertable(DataType left, DataType right, out DataType? resultingType)
        {
            bool isConvertableToRight = left.IsImplicitlyCastableTo(right);
            bool isConvertableToLeft = right.IsImplicitlyCastableTo(left);

            if (left == right)
            {
                resultingType = left;
                return true;
            }
            if (isConvertableToRight && isConvertableToLeft)
            {
                resultingType = null;
                return false;
            }
            if (isConvertableToLeft)
            {
                resultingType = left;
                return true;
            }
            if (isConvertableToRight)
            {
                resultingType = right;
                return true;
            }

            // conversion is impossible
            resultingType = null;
            return false;
        }
        public DataType GetImplicitConversionType(DataType left, DataType right)
        {
            if (IsImplicitlyConvertable(left, right, out var result))
            {
                return result!;
            }
            else
            {
                throw new InvalidCastException();
            }
        }
    }
}
