namespace MindC.Compilation.AST

open MindC.Compilation.Semantic.Functions
open MindC.Compilation.Semantic.Variables
open MindC.Compilation.Semantic
open System.Collections.Generic

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
    | Add of a: Node * b: Node
    | Sub of a: Node * b: Node
    | LessThan of a: Node * b: Node
    | GreaterThan of a: Node * b: Node
    // mlog
    | MlogInstruction of parts: List<string>

