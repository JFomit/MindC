namespace MindC.Compilation.AST

open MindC.Compilation.Semantic
open MindC.Compilation.Semantic.Variables
open MindC.Compilation.Semantic.Functions
open System.Collections.Generic;
open System.Linq;

module public Visiting =
    type public IASTVisitor = interface
        abstract member VisitTree : node: Node -> obj
        end
    [<AbstractClass>]
    type public BaseASTVisitor<'T>(root: Node) = class
        let _root: Node = root

        member this.ASTRoot
            with get() = _root

        member this.Visit(node) = (this :> IASTVisitor).VisitTree(node) :?> 'T
        interface IASTVisitor with
            member this.VisitTree node =
                match node with
                    // structural
                    | Root children as root -> this.VisitRoot(root, children)
                    | Empty as empty -> this.VisitEmpty(empty)
                    // declarations
                    | FunctionDeclaration (func, body) as functionDeclaration -> this.VisitFunctionDeclaration(functionDeclaration, func, body)
                    | GlobalVariableDeclaration (var) as globalVar -> this.VisitGlobalVariableDeclaration(globalVar, var)
                    // statements
                    | StatementSequence childLst as statementSequence -> this.VisitStatementSequnce(statementSequence, childLst)
                    | VarStatement variable as varStatement -> this.VisitVarStatement(varStatement, variable)
                    | AssignStatement (variable, e) as assignStatement -> this.VisitAssignStatement(assignStatement, variable, e)
                    | FunctionCallStatement (func, args) as functionCall -> this.VisitFunctionCallStatement(functionCall, func, args)
                    | IfStatement (condition, code) as ifStatement -> this.VisitIfStatement(ifStatement, condition, code)
                    | WhileStatement (condition, code) as whileStatement -> this.VisitWhileStatement(whileStatement, condition, code)
                    | ReturnStatement as ret -> this.VisitReturnStatement(ret)
                    | ReturnValueStatement value as ret -> this.VisitReturnValueStatement(ret, value)
                    // expressions
                    | Literal value as literal -> this.VisitLiteral(literal, value)
                    | VariableReference var as varRef -> this.VisitVariableReference(varRef, var)
                    | FunctionCall (func, args) as functionCall -> this.VisitFunctionCall(functionCall, func, args)
                    | Cast (targetType, instance) as cast -> this.VisitCast(cast, targetType, instance)
                    | Mul (a, b) as mul -> this.VisitMultiplication(mul, a, b)
                    | Div (a, b) as div -> this.VisitDivision(div, a, b)
                    | Add (a, b) as add -> this.VisitAddition(add, a, b)
                    | Sub (a, b) as sub -> this.VisitSubstraction(sub, a, b)
                    | LeftShift (a, b) as lshift -> this.VisitLeftShift(lshift, a, b)
                    | RightShift (a, b) as rshift -> this.VisitRightShift(rshift, a, b)
                    | LessThan (a, b) as less -> this.VisitLessComparison(less, a, b)
                    | GreaterThan (a, b) as greater -> this.VisitGreaterComparison(greater, a, b)
                    | LessThanOrEquals (a, b) as lessOrEqual -> this.VisitLessOrEqualsComparison(lessOrEqual, a, b)
                    | GreaterThanOrEquals (a, b) as greaterOrEqual -> this.VisitGreaterOrEqualsComparison(greaterOrEqual, a, b)
                    | Equals (a, b) as equal -> this.VisitEqualsComparison(equal, a, b)
                    | NotEquals (a, b) as notEqual -> this.VisitNotEqualsComparison(notEqual, a, b)
                    | LogicalAnd (a, b) as ``and`` -> this.VisitLogicalAnd(``and``, a, b)
                    | LogicalOr (a, b) as ``or`` -> this.VisitLogicalOr(``or``, a, b)
                    // mlog
                    | MlogInstruction parts as instruction -> this.VisitMlogInstruction(instruction, parts)

        abstract member VisitRoot : currentNode: Node * elements: List<Node> -> 'T
        abstract member VisitEmpty : currentNode: Node -> 'T
        abstract member VisitFunctionDeclaration : currentNode: Node * ``function``: FunctionDeclaration * body: Node -> 'T
        abstract member VisitGlobalVariableDeclaration: currentNode: Node * variable: VariableDeclaration -> 'T
        abstract member VisitStatementSequnce : currentNode: Node * statements: List<Node> -> 'T
        abstract member VisitVarStatement : currentNode: Node * variable: VariableDeclaration -> 'T
        abstract member VisitAssignStatement : currentNode: Node * variable: VariableDeclaration * expression: Node -> 'T
        abstract member VisitFunctionCallStatement : currentNode: Node * ``function``: FunctionDeclaration * arguments: List<Node> -> 'T
        abstract member VisitIfStatement : currentNode: Node * condition: Node * body: Node -> 'T
        abstract member VisitWhileStatement : currentNode: Node * condition: Node * body: Node -> 'T
        abstract member VisitReturnStatement : currentNode: Node -> 'T
        abstract member VisitReturnValueStatement : currentNode: Node * value: Node -> 'T

        abstract member VisitLiteral : currentNode: Node * literal: LiteralValue -> 'T
        abstract member VisitVariableReference : currentNode: Node * variable: VariableDeclaration -> 'T
        abstract member VisitFunctionCall : currentNode: Node * ``function``: FunctionDeclaration * arguments: List<Node> -> 'T
        abstract member VisitCast : currentNode: Node * targetType: DataType * instatnce: Node -> 'T
        abstract member VisitMultiplication : currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitDivision : currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitAddition : currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitSubstraction : currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitLeftShift : currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitRightShift : currentNode: Node * a: Node * b: Node -> 'T

        abstract member VisitLessComparison: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitGreaterComparison: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitLessOrEqualsComparison: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitGreaterOrEqualsComparison: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitEqualsComparison: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitNotEqualsComparison: currentNode: Node * a: Node * b: Node -> 'T

        abstract member VisitLogicalAnd: currentNode: Node * a: Node * b: Node -> 'T
        abstract member VisitLogicalOr: currentNode: Node * a: Node * b: Node -> 'T

        abstract member VisitMlogInstruction : instruction: Node * parts: List<string> -> 'T
        end
    [<AbstractClass>]
    type public BaseASTVisitor(root: Node) = class
        let _root: Node = root

        member this.ASTRoot
            with get() = _root
        
        member this.Visit(node) = (this :> IASTVisitor).VisitTree(node)
        interface IASTVisitor with
            member this.VisitTree node =
                match node with
                    // structural
                    | Root children as root -> this.VisitRoot(root, children)
                    | Empty as empty -> this.VisitEmpty(empty)
                    // declarations
                    | FunctionDeclaration (func, body) as functionDeclaration -> this.VisitFunctionDeclaration(functionDeclaration, func, body)
                    | GlobalVariableDeclaration (var) as globalVar -> this.VisitGlobalVariableDeclaration(globalVar, var)
                    // statements
                    | StatementSequence childLst as statementSequence -> this.VisitStatementSequnce(statementSequence, childLst)
                    | VarStatement variable as varStatement -> this.VisitVarStatement(varStatement, variable)
                    | AssignStatement (variable, e) as assignStatement -> this.VisitAssignStatement(assignStatement, variable, e)
                    | FunctionCallStatement (func, args) as functionCall -> this.VisitFunctionCallStatement(functionCall, func, args)
                    | IfStatement (condition, code) as ifStatement -> this.VisitIfStatement(ifStatement, condition, code)
                    | WhileStatement (condition, code) as whileStatement -> this.VisitWhileStatement(whileStatement, condition, code)
                    | ReturnStatement as ret -> this.VisitReturnStatement(ret)
                    | ReturnValueStatement value as ret -> this.VisitReturnValueStatement(ret, value)
                    // expressions
                    | Literal value as literal -> this.VisitLiteral(literal, value)
                    | VariableReference var as varRef -> this.VisitVariableReference(varRef, var)
                    | FunctionCall (func, args) as functionCall -> this.VisitFunctionCall(functionCall, func, args)
                    | Cast (targetType, instance) as cast -> this.VisitCast(cast, targetType, instance)
                    | Mul (a, b) as mul -> this.VisitMultiplication(mul, a, b)
                    | Div (a, b) as div -> this.VisitDivision(div, a, b)
                    | Add (a, b) as add -> this.VisitAddition(add, a, b)
                    | Sub (a, b) as sub -> this.VisitSubstraction(sub, a, b)
                    | LeftShift (a, b) as lshift -> this.VisitLeftShift(lshift, a, b)
                    | RightShift (a, b) as rshift -> this.VisitRightShift(rshift, a, b)
                    | LessThan (a, b) as less -> this.VisitLessComparison(less, a, b)
                    | GreaterThan (a, b) as greater -> this.VisitGreaterComparison(greater, a, b)
                    | LessThanOrEquals (a, b) as lessOrEqual -> this.VisitLessOrEqualsComparison(lessOrEqual, a, b)
                    | GreaterThanOrEquals (a, b) as greaterOrEqual -> this.VisitGreaterOrEqualsComparison(greaterOrEqual, a, b)
                    | Equals (a, b) as equal -> this.VisitEqualsComparison(equal, a, b)
                    | NotEquals (a, b) as notEqual -> this.VisitNotEqualsComparison(notEqual, a, b)
                    | LogicalAnd (a, b) as ``and`` -> this.VisitLogicalAnd(``and``, a, b)
                    | LogicalOr (a, b) as ``or`` -> this.VisitLogicalOr(``or``, a, b)
                    // mlog
                    | MlogInstruction parts as instruction -> this.VisitMlogInstruction(instruction, parts)

        abstract member VisitRoot : currentNode: Node * elements: List<Node> -> unit
        abstract member VisitEmpty : currentNode: Node -> unit
        default this.VisitEmpty node = ()
        abstract member VisitFunctionDeclaration : currentNode: Node * ``function``: FunctionDeclaration * body: Node -> unit
        abstract member VisitGlobalVariableDeclaration: currentNode: Node * variable: VariableDeclaration -> unit
        abstract member VisitStatementSequnce : currentNode: Node * statements: List<Node> -> unit
        abstract member VisitVarStatement : currentNode: Node * variable: VariableDeclaration -> unit
        abstract member VisitAssignStatement : currentNode: Node * variable: VariableDeclaration * expression: Node -> unit
        abstract member VisitFunctionCallStatement : currentNode: Node * ``function``: FunctionDeclaration * arguments: List<Node> -> unit
        abstract member VisitIfStatement : currentNode: Node * condition: Node * body: Node -> unit
        abstract member VisitWhileStatement : currentNode: Node * condition: Node * body: Node -> unit
        abstract member VisitReturnStatement : currentNode: Node -> unit
        abstract member VisitReturnValueStatement : currentNode: Node * value: Node -> unit

        abstract member VisitLiteral : currentNode: Node * literal: LiteralValue -> unit
        abstract member VisitVariableReference : currentNode: Node * variable: VariableDeclaration -> unit
        abstract member VisitFunctionCall : currentNode: Node * ``function``: FunctionDeclaration * arguments: List<Node> -> unit
        abstract member VisitCast : currentNode: Node * targetType: DataType * instatnce: Node -> unit
        abstract member VisitMultiplication : currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitDivision : currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitAddition : currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitSubstraction : currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitLeftShift : currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitRightShift : currentNode: Node * a: Node * b: Node -> unit

        abstract member VisitLessComparison: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitGreaterComparison: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitLessOrEqualsComparison: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitGreaterOrEqualsComparison: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitEqualsComparison: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitNotEqualsComparison: currentNode: Node * a: Node * b: Node -> unit

        abstract member VisitLogicalAnd: currentNode: Node * a: Node * b: Node -> unit
        abstract member VisitLogicalOr: currentNode: Node * a: Node * b: Node -> unit

        abstract member VisitMlogInstruction : instruction: Node * parts: List<string> -> unit
        end