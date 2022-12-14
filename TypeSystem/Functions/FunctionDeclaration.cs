using System.Text;

namespace MindC.Compilation.Semantic.Functions
{
    public class FunctionDeclaration
    {
        public string Name { get; init; }
        public DataType ReturnType { get; init; }

        public FunctionParameter[] Parameteres { get; init; }

        public FunctionDeclaration(string name, DataType returnType) : this(name, returnType, Array.Empty<FunctionParameter>())
        { }
        public FunctionDeclaration(string name, DataType returnType, FunctionParameter[] parameteres)
        {
            Name = name;
            ReturnType = returnType;
            Parameteres = parameteres;
        }

        /// <summary>
        /// Returns a <see langword="string"/>, which represents a function signature of the current <see cref="FunctionDeclaration"/>.
        /// Function signatures are represented with the following format:
        /// <br><c>ReturnType</c> <c>Name</c> (<see langword="type0"/>,<see langword="type1"/>,...)</br>
        /// <para>For expample function <code>number Sum(number a, number b) { return a + b; }</code> has a signature  <c>number Sum(number,number)</c></para>
        /// </summary>
        /// <returns>A <see langword="string"/>, which represents function signature</returns>
        public override string ToString()
        {
            var stringBuilder = new StringBuilder();

            stringBuilder.Append(ReturnType.GetStringRepresentation()); // returnType
            stringBuilder.Append('.');

            stringBuilder.Append(Name); // name

            if (Parameteres.Length == 0) // args
            {
                stringBuilder.Append('(');
                stringBuilder.Append(')');
            }
            else
            {
                stringBuilder.Append('(');
                foreach (var arg in Parameteres)
                {
                    stringBuilder.Append(arg.Type.GetStringRepresentation());
                    stringBuilder.Append(',');
                }
                stringBuilder.Remove(stringBuilder.Length - 1, 1);
                stringBuilder.Append(')');
            }
            
            return stringBuilder.ToString();
        }
    }
}
