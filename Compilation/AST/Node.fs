namespace MindC.Compilation.AST

open MindC.Compilation.Semantic.Functions
open MindC.Compilation.Semantic.Variables
open MindC.Compilation.Semantic
open System.Collections.Generic
open System.Linq

type public Node =
    // structural
    | Root of elements: List<Node>
    | Empty
    // declarations
    | FunctionDeclaration of name: FunctionDeclaration * body: Node
    | GlobalVariableDeclaration of variable: VariableDeclaration
    // statements
    | StatementSequence of elements: List<Node>
    | VarStatement of variable: VariableDeclaration
    | AssignStatement of vaiable: VariableDeclaration * value: Node
    | FunctionCallStatement of name: FunctionDeclaration * arguments: List<Node>
    | IfStatement of condition: Node * Code: Node
    | WhileStatement of condition: Node * Code: Node
    | ReturnStatement
    | ReturnValueStatement of value: Node
    // expressions
    | Literal of value: LiteralValue
    | VariableReference of variable: VariableDeclaration
    | FunctionCall of name: FunctionDeclaration * arguments: List<Node>

    | Cast of targetType: DataType * instance: Node

    | Mul of a: Node * b: Node
    | Div of a: Node * b: Node
    | Mod of a: Node * b: Node
    | Add of a: Node * b: Node
    | Sub of a: Node * b: Node

    | LeftShift of a: Node * right: Node
    | RightShift of a: Node * right: Node

    | BitwiseAnd of a: Node * b: Node
    | BitwiseXor of a: Node * b: Node
    | BitwiseOr of a: Node * b: Node

    | LessThan of a: Node * b: Node
    | GreaterThan of a: Node * b: Node
    | LessThanOrEquals of a: Node * b: Node
    | GreaterThanOrEquals of a: Node * b: Node
    | Equals of a: Node * b: Node
    | NotEquals of a: Node * b: Node

    | LogicalAnd of a: Node * b: Node
    | LogicalOr of a: Node * b: Node
    // mlog
    | MlogInstruction of parts: List<string>

    member public this.Clone () : Node =
        match this with
            | Root lst -> Node.Root(lst.Select(fun item -> item.Clone()).ToList())
            | Empty -> Node.Empty
            // declarations
            | FunctionDeclaration (name, body) -> Node.FunctionDeclaration(name, body.Clone())
            | GlobalVariableDeclaration var -> Node.GlobalVariableDeclaration(var)
            // statements
            | StatementSequence lst -> Node.StatementSequence(lst.Select(fun item -> item.Clone()).ToList())
            | VarStatement var -> Node.VarStatement(var)
            | AssignStatement (var, expr) -> Node.AssignStatement(var, expr.Clone())
            | FunctionCallStatement (name, args) -> Node.FunctionCallStatement(name, args.Select(fun item -> item.Clone()).ToList())
            | IfStatement (cond, code) -> Node.IfStatement(cond.Clone(), code.Clone())
            | WhileStatement (cond, code) -> Node.WhileStatement(cond.Clone(), code.Clone())
            | ReturnStatement -> Node.ReturnStatement
            | ReturnValueStatement (value) -> Node.ReturnValueStatement(value.Clone())
            // expressions
            | Literal value -> Node.Literal(value)
            | VariableReference var -> Node.VariableReference(var)
            | FunctionCall (name, args) -> Node.FunctionCall(name, args.Select(fun item -> item.Clone()).ToList())

            | Cast (target, instance) -> Node.Cast(target, instance.Clone())

            | Mul (a, b) -> Node.Mul(a.Clone(), b.Clone())
            | Div (a, b) -> Node.Div(a.Clone(), b.Clone())
            | Mod (a, b) -> Node.Mod(a.Clone(), b.Clone())
            | Add (a, b) -> Node.Add(a.Clone(), b.Clone())
            | Sub (a, b) -> Node.Sub(a.Clone(), b.Clone())

            | LeftShift (a, b) -> Node.LeftShift(a.Clone(), b.Clone())
            | RightShift (a, b) -> Node.RightShift(a.Clone(), b.Clone())

            | BitwiseAnd (a, b) -> Node.BitwiseAnd(a.Clone(), b.Clone())
            | BitwiseXor (a, b) -> Node.BitwiseXor(a.Clone(), b.Clone())
            | BitwiseOr (a, b) -> Node.BitwiseOr(a.Clone(), b.Clone())

            | LessThan (a, b) -> Node.LessThan(a.Clone(), b.Clone())
            | GreaterThan (a, b) -> Node.GreaterThan(a.Clone(), b.Clone())
            | LessThanOrEquals (a, b) -> Node.LessThanOrEquals(a.Clone(), b.Clone())
            | GreaterThanOrEquals (a, b) -> Node.GreaterThanOrEquals(a.Clone(), b.Clone())
            | Equals (a, b) -> Node.Equals(a.Clone(), b.Clone())
            | NotEquals (a, b) -> Node.NotEquals(a.Clone(), b.Clone())

            | LogicalAnd (a, b) -> Node.LogicalAnd(a.Clone(), b.Clone())
            | LogicalOr (a, b) -> Node.LogicalOr(a.Clone(), b.Clone())
            // mlog
            | MlogInstruction (parts) -> Node.MlogInstruction(parts.Select(fun item -> item.Clone() :?> string).ToList())