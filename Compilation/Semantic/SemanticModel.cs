using MindC.Compilation.AST;
using MindC.Compilation.Semantic.Functions;
using MindC.Compilation.Semantic.Primitives;
using MindC.Compilation.Semantic.Variables;

namespace MindC.Compilation.Semantic
{
    public class SemanticModel
    {
        private readonly Dictionary<string, FunctionDeclaration> _functions;
        private readonly Dictionary<string, FunctionDeclaration> _importedFunctions;
        private readonly Dictionary<string, Node> _functionASTs;
        public IEnumerable<FunctionDeclaration> DeclaredFunctions { get => _functions.Values; }

        private readonly Dictionary<string, Dictionary<string, VariableDeclaration>> _functionLocalVars;

        private readonly Dictionary<string, DataType> _dataTypes;
        private readonly TypeConverter _typeConverter;

        private readonly Dictionary<string, VariableDeclaration> _globalVariables;

        public SemanticModel()
        {
            _dataTypes = new();
            _globalVariables = new();

            _functions = new();
            _importedFunctions = new();
            _functionASTs = new();

            _typeConverter = new();

            _functionLocalVars = new();

            PrimitiveDataTypes.SetupBuitInTypes(_dataTypes);
        }

        public DataType GetTypeInstance(string representation)
        {
            return _dataTypes[representation];
        }
        public void RegisterDataType(DataType dataType)
        {
            throw new NotImplementedException();
        }

        public VariableDeclaration GetGlobalVariableDeclaration(string variableName)
        {
            return _globalVariables[variableName];
        }
        public void RegisterGlobalVariable(VariableDeclaration variable)
        {
            _globalVariables.Add(variable.Name, variable);
        }

        public IEnumerable<VariableDeclaration> GetFunctionLocalVariables(string function)
        {
            return _functionLocalVars[function].Values;
        }
        public VariableDeclaration GetLocalVariable(string function, string variableName)
        {
            return _functionLocalVars[function][variableName];
        }
        public void RegisterLocalVariable(string function, VariableDeclaration variable)
        {
            if (!_functionLocalVars.ContainsKey(function))
            {
                _functionLocalVars.Add(function, new());
            }
            _functionLocalVars[function].Add(variable.Name, variable);
        }

        public VariableDeclaration GetVariableDeclaration(string function, string variable)
        {
            if (_globalVariables.ContainsKey(variable))
            {
                return _globalVariables[variable];
            }
            else
            {
                return _functionLocalVars[function][variable];
            }
        }

        public FunctionDeclaration GetFunctionDeclaration(string functionName)
        {
            if (_functions.ContainsKey(functionName))
            {
                return _functions[functionName];
            }
            else
            {
                return _importedFunctions[functionName];
            }
        }
        public void RegisterFunction(FunctionDeclaration function, Node code)
        {
            if (!_functionLocalVars.ContainsKey(function.Name))
            {
                _functionLocalVars.Add(function.Name, new());
            }
            if (!_functionASTs.ContainsKey(function.Name))
            {
                _functionASTs.Add(function.Name, code);
            }
            _functions.Add(function.Name, function);
        }
        public Node GetFunctionCode(string functionName)
        {
            return _functionASTs[functionName];
        }
        public void ForwardRegisterFunction(FunctionDeclaration function)
        {
            _ = _importedFunctions.TryAdd(function.Name, function); // TODO: validatation, warnings, etc
        }

        public DataType GetImplicitConversionType(DataType left, DataType right)
        {
            return _typeConverter.GetImplicitConversionType(left, right);
        }
        public DataType GetExplicitConversionType(DataType from, DataType to)
        {
            return _typeConverter.GetExplicitConversionType(from, to);
        }

        public bool IsImplicitlyConvertable(DataType from, DataType to, out DataType? resultingType)
        {
            return _typeConverter.IsImplicitlyConvertable(from, to, out resultingType);
        }
        public bool IsExplicitlyConvertable(DataType left, DataType right, out DataType? resultingType)
        {
            return _typeConverter.IsExplicitlyConvertable(left, right, out resultingType);
        }
    }
}
