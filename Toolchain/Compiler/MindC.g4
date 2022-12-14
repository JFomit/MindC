grammar MindC;

//
// Lexer rules
//

PLUS  : '+' ;
MINUS : '-' ;

TRUE : 'true' ;
FALSE : 'false' ;

fragment DECIMAL_DIGIT : [0-9] ;
DECIMAL_NUMBER : DECIMAL_DIGIT+ ;

fragment IDENTIFIER_START_CHARACTER : [a-zA-Z_] ;
fragment IDENTIFIER_PART_CHARACTER : [a-zA-Z_0-9] ;
SIMPLE_IDENTIFIER : IDENTIFIER_START_CHARACTER IDENTIFIER_PART_CHARACTER* ;

WS: [ \n\t\r]+ -> skip ;

//
// Parser rules
//
input
    : input_element*
    ;
input_element
    : item
    ;
New_Line
    : New_Line_Character
    | '\u000D\u000A' // carriage return, line feed
    ;
fragment Input_Character
    // anything but New_Line_Character
    : ~('\u000D' | '\u000A'   | '\u0085' | '\u2028' | '\u2029')
    ;
fragment New_Line_Character
    : '\u000D'  // carriage return
    | '\u000A'  // line feed
    | '\u0085'  // next line
    | '\u2028'  // line separator
    | '\u2029'  // paragraph separator
    ;
Comment
    : Single_line_comment -> skip
    ;
Single_line_comment
    : '//' Input_Character*
    ;

item
    : function_declaration
    | global_variable_declaration
    | struct_declaration
    ;
global_variable_declaration
    : 'global' variableType=type variableName=identifier ';'
    ;
// functions
function_declaration
    : retrunType=type functionName=identifier '(' functionParameteres=parameter_list? ')' functionBody=statement_block
    ;
parameter_list
    : single_parameter (',' single_parameter)*
    ;
single_parameter
    : parameterType=type parameterName=identifier
    ;
function_call_operator
	: functionName=identifier '(' arguments=argument_list? ')'
	;
argument_list
	: single_argument (',' single_argument)*
	;
single_argument
	: primary_expression
	;
// structs
struct_declaration
    : 'struct' structName=identifier structBody=struct_declaration_block
    ;
struct_declaration_block
    : '{' struct_member_declaration* '}'
    ;
struct_member_declaration
    : field_declaration
//    | method_declaration
    ;
field_declaration
    : /*accessModifier=access_modifier?*/ fieldType=type fieldName=identifier ';'
    ;
//method_declaration
//    : accessModifier=access_modifier? staticModifier=static_modifier? retrunType=type methodName=identifier '(' methodArguments=argument_list? ')' methodBody=statement_block
//    ;
strcut_member_access
    : struct_field_access
//    | struct_method_call
    ;
struct_field_access
    : field=identifier
    ;
//struct_method_call
//    : methoName=identifier '(' parameters=parameter_list? ')'
//    ;
// general
token
    : identifier
    | keyword
    | literal
    ;
keyword
    : FALSE
    | 'global'
    | 'if'
    | 'mlog'
    | 'private'
    | 'public'
    | 'return'
	| 'static'
    | 'struct'
    | TRUE
    | 'while'
    ;
contextual_keyword
    : mlog_keyword
    ;
identifier
    : SIMPLE_IDENTIFIER
    | contextual_keyword
    ;
literal
    : number_literal
    | boolean_literal
    ;

number_literal
    : (PLUS | MINUS)? DECIMAL_NUMBER
    | (PLUS | MINUS)? DECIMAL_NUMBER '.' DECIMAL_NUMBER
    | (PLUS | MINUS)? '.' DECIMAL_NUMBER
    ;
boolean_literal
    : TRUE
    | FALSE
    ;
string_literal
    : '"' Input_Character* '"'
    ;
// type system
type
    : built_in_type
    | user_defined_type
    ;
built_in_type
    : 'bool'
    | 'number'
    | 'void'
    | 'string'
    ;
user_defined_type
    : identifier
    ;
//access_modifier
//    : 'public'
//    | 'private'
//   ;
//static_modifier
//	: 'static'
//	;
// expressions
primary_expression
	: literal                                                                             #literal_value
	| identifier                                                                          #variable_reference
    | '(' primary_expression ')'                                                          #parentheses
    // Operators
	| function_call_operator                                                              #function_call
    | instance=primary_expression '.' strcut_member_access                                #member_access_operator
    | '(' cast_target_type=type ')' instance=primary_expression                           #explicit_cast_operator
    | left=primary_expression operator=('*' | '/' | '%') right=primary_expression         #multiplicationing_operator
    | left=primary_expression operator=('+' | '-') right=primary_expression               #additioning_operator
    | left=primary_expression operator=('<<' | '>>') right=primary_expression             #shifting_operator
    | left=primary_expression operator=('<' | '>' | '<=' | '>=') right=primary_expression #comparison_operator
    | left=primary_expression operator=('==' | '!=') right=primary_expression             #equality_operator
    | left=primary_expression '&&' right=primary_expression                               #logical_and_operator
    | left=primary_expression '||' right=primary_expression                               #logical_or_operator
	;
// statements
statement_block
    : '{' statement_list '}'
    ;
statement_list
    : statement*
    ;
statement
    : var_statement
    | assign_statement
    | function_call_statement
    | return_statement
    | return_value_statement
    | if_statement
    | while_statemenet
    | statement_block
    | mlog_statement
    ;
assign_statement
	: variableName=identifier '=' value=primary_expression ';'
	;
function_call_statement
    : function_call_operator ';'
    ;
var_statement
	: variableType=type variableName=identifier ';'
	;
return_statement
    : 'return' ';'
    ;
return_value_statement
    : 'return' value=primary_expression ';'
    ;
if_statement
    : 'if' '(' condition=primary_expression ')' code=statement_block
    ;
while_statemenet
    : 'while' '(' condition=primary_expression ')' code=statement_block
    ;
mlog_statement
    : 'mlog' '{' mlog_instruction_list '}'
    ;
mlog_instruction_list
    : mlog_instruction*
    ;
mlog_instruction
    : instruction=mlog_keyword operands=mlog_operand* ';'
    ;
mlog_keyword
    : 'set'
    | 'op'
    | 'add'
    | 'sub'
    | 'mul'
    | 'div'
    | 'print'
    | 'printflush'
    ;
mlog_operand
    : mlog_variable_capture_ref
    | literal
    | mlog_raw_operand
    ;
mlog_variable_capture_ref
    : '$' identifier
    ;
mlog_raw_operand
    : identifier
    ;