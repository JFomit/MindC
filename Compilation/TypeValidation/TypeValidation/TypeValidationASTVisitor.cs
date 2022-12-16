using MindC.Compilation.AST;
using MindC.Compilation.Semantic.Functions;
using MindC.Compilation.Semantic.Primitives;
using MindC.Compilation.Semantic.Variables;
using static MindC.Compilation.AST.Visiting;

namespace MindC.Compilation.Semantic.TypeValidation
{
    public class TypeValidationASTVisitor : BaseASTVisitor<DataType>
    {
        private SemanticModel Model { get; init; }
        private FunctionDeclaration CurrentFunction { get; set; } = null!;

        public TypeValidationASTVisitor(Node root, SemanticModel semanticModel) : base(root)
        {
            Model = semanticModel;
        }

        public void Validate()
        {
            Visit(ASTRoot);
        }

        private bool TryGetConverionResult(DataType left, DataType right, out DataType? result)
        {
            if (Model.IsImplicitlyConvertable(left, right, out result))
            {
                return true;
            }
            else
            {
                result = null;
                return false;
            }
        }
        // TODO: use operator and cast table here; also try to check for implicit casts (only left or only right)
        private DataType EvaluateBinaryOperationType(Node left, Operation operation, Node right)
        {
            var leftType = Visit(left);
            var rightType = Visit(right);

            // Trying from left on this types
            if (leftType.TryGetOperationResult(operation, rightType, out var leftResult))
            {
                return leftResult!;
            }
            // Trying from right on this types
            if (rightType.TryGetOperationResult(operation, leftType, out var rightResult))
            {
                return rightResult!;
            }
            
            throw new InvalidOperationException($"Operator `{operation}` is not defined between {leftType.GetStringRepresentation()} and {rightType.GetStringRepresentation()}.");
        }

        public override DataType VisitAddition(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.Add, b);
        }

        public override DataType VisitAssignStatement(Node currentNode, VariableDeclaration variable, Node expression)
        {
            var expressionType = Visit(expression);
            if (!expressionType.IsImplicitlyCastableTo(variable.DataType))
            {
                throw new InvalidCastException($"Tried to assign a value of wrong type - expected {variable.DataType.GetStringRepresentation()}, but got {expressionType.GetStringRepresentation()}.");
            }
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitCast(Node currentNode, DataType targetType, Node instance)
        {
            var currentType = Visit(instance);
            if (currentType.IsExplicitlyCastableTo(targetType))
            {
                return targetType;
            }
            else
            {
                throw new InvalidCastException($"Can't explicitly cast {currentType.GetStringRepresentation()} to {targetType.GetStringRepresentation()}.");
            }
        }

        public override DataType VisitDivision(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.Div, b);
        }

        public override DataType VisitEmpty(Node currentNode)
        {
            throw new NotSupportedException("Empty nodes shouldn't be in the tree.");
        }

        public override DataType VisitFunctionCall(Node currentNode, FunctionDeclaration function, List<Node> arguments)
        {
            for (int i = 0; i < arguments.Count; i++)
            {
                var argI = arguments[i];
                var paramI = function.Parameteres[i];

                if (!Visit(argI).IsImplicitlyCastableTo(paramI.Type))
                {
                    throw new InvalidCastException($"Ivalid type argument passed - can't cast {Visit(argI).GetStringRepresentation()} to {paramI.Type.GetStringRepresentation()}, the type of parameter number {i}.");
                }
            }

            return function.ReturnType;
        }

        public override DataType VisitFunctionCallStatement(Node currentNode, FunctionDeclaration function, List<Node> arguments)
        {
            // interpreting as a FuncitonCall operator to reuse function validation logic
            VisitFunctionCall(null!, function, arguments);
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitFunctionDeclaration(Node currentNode, FunctionDeclaration function, Node body)
        {
            CurrentFunction = function;
            Visit(body);
            CurrentFunction = null!;
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitGlobalVariableDeclaration(Node currentNode, VariableDeclaration variable)
        {
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitGreaterComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.GreaterThan, b);
        }

        public override DataType VisitIfStatement(Node currentNode, Node condition, Node body)
        {
            if (!Visit(condition).IsImplicitlyCastableTo(PrimitiveDataTypes.Boolean))
            {
                throw new InvalidCastException($"In an IfStatement condition must be convertable to {PrimitiveDataTypes.Boolean.GetStringRepresentation()}, but got {Visit(condition).GetStringRepresentation()}, which isn't.");
            }
            Visit(body);
            return PrimitiveDataTypes.Void;
        }
        public override DataType VisitLessComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.LessThan, b);
        }

        public override DataType VisitLiteral(Node currentNode, LiteralValue literal)
        {
            return literal.DataType;
        }

        public override DataType VisitMlogInstruction(Node instruction, List<string> parts)
        {
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitMultiplication(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.Mul, b);
        }

        public override DataType VisitRoot(Node currentNode, List<Node> elements)
        {
            foreach (var element in elements)
            {
                Visit(element);
            }

            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitStatementSequnce(Node currentNode, List<Node> statements)
        {
            foreach (var element in statements)
            {
                Visit(element);
            }

            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitSubstraction(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.Sub, b);
        }

        public override DataType VisitVariableReference(Node currentNode, VariableDeclaration variable)
        {
            return variable.DataType;
        }

        public override DataType VisitVarStatement(Node currentNode, VariableDeclaration variable)
        {
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitWhileStatement(Node currentNode, Node condition, Node body)
        {
            if (!Visit(condition).IsImplicitlyCastableTo(PrimitiveDataTypes.Boolean))
            {
                throw new InvalidCastException($"In an WhileStatement condition must be convertable to {PrimitiveDataTypes.Boolean.GetStringRepresentation()}, but got {Visit(condition).GetStringRepresentation()}, which isn't.");
            }
            Visit(body);
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitReturnStatement(Node currentNode)
        {
            if (CurrentFunction.ReturnType != PrimitiveDataTypes.Void)
            {
                throw new InvalidOperationException("Expected a return value.");
            }
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitReturnValueStatement(Node currentNode, Node value)
        {
            if (CurrentFunction.ReturnType == PrimitiveDataTypes.Void)
            {
                throw new InvalidOperationException("This function doesn't return any value.");
            }
            var retValue = Visit(value);
            if (!retValue.IsImplicitlyCastableTo(CurrentFunction.ReturnType))
            {
                throw new InvalidCastException("Mismacth in return types.");
            }
            return PrimitiveDataTypes.Void;
        }

        public override DataType VisitLeftShift(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.LeftShift, b);
        }

        public override DataType VisitRightShift(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.RightShift, b);
        }

        public override DataType VisitLessOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.LessThanOrEqual, b);
        }

        public override DataType VisitGreaterOrEqualsComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.GreaterThanOrEqual, b);
        }

        public override DataType VisitEqualsComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.Equal, b);
        }

        public override DataType VisitNotEqualsComparison(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.NotEqual, b);
        }

        public override DataType VisitLogicalAnd(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.LogicalAnd, b);
        }

        public override DataType VisitLogicalOr(Node currentNode, Node a, Node b)
        {
            return EvaluateBinaryOperationType(a, Operation.LogicalOr, b);
        }
    }
}