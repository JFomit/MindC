// Generated from c:\Users\Timofey\source\repos\MindC\Toolchain\Compiler\MindC.g4 by ANTLR 4.9.3
package net.homez.mindc.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MindCParser}.
 */
public interface MindCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MindCParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(MindCParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(MindCParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#input_element}.
	 * @param ctx the parse tree
	 */
	void enterInput_element(MindCParser.Input_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#input_element}.
	 * @param ctx the parse tree
	 */
	void exitInput_element(MindCParser.Input_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(MindCParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(MindCParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#global_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variable_declaration(MindCParser.Global_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#global_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variable_declaration(MindCParser.Global_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MindCParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MindCParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MindCParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MindCParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#single_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSingle_parameter(MindCParser.Single_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#single_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSingle_parameter(MindCParser.Single_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#function_call_operator}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_operator(MindCParser.Function_call_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#function_call_operator}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_operator(MindCParser.Function_call_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MindCParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MindCParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#single_argument}.
	 * @param ctx the parse tree
	 */
	void enterSingle_argument(MindCParser.Single_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#single_argument}.
	 * @param ctx the parse tree
	 */
	void exitSingle_argument(MindCParser.Single_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(MindCParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(MindCParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#struct_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_block(MindCParser.Struct_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#struct_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_block(MindCParser.Struct_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(MindCParser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(MindCParser.Struct_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(MindCParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(MindCParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#strcut_member_access}.
	 * @param ctx the parse tree
	 */
	void enterStrcut_member_access(MindCParser.Strcut_member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#strcut_member_access}.
	 * @param ctx the parse tree
	 */
	void exitStrcut_member_access(MindCParser.Strcut_member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#struct_field_access}.
	 * @param ctx the parse tree
	 */
	void enterStruct_field_access(MindCParser.Struct_field_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#struct_field_access}.
	 * @param ctx the parse tree
	 */
	void exitStruct_field_access(MindCParser.Struct_field_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(MindCParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(MindCParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(MindCParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(MindCParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterContextual_keyword(MindCParser.Contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitContextual_keyword(MindCParser.Contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MindCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MindCParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MindCParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MindCParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(MindCParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(MindCParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(MindCParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(MindCParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(MindCParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(MindCParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MindCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MindCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#built_in_type}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_type(MindCParser.Built_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#built_in_type}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_type(MindCParser.Built_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#user_defined_type}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_type(MindCParser.User_defined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#user_defined_type}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_type(MindCParser.User_defined_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bit_or_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_operator(MindCParser.Bit_or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bit_or_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_operator(MindCParser.Bit_or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable_reference}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(MindCParser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable_reference}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(MindCParser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MindCParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MindCParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MindCParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MindCParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code member_access_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterMember_access_operator(MindCParser.Member_access_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code member_access_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitMember_access_operator(MindCParser.Member_access_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additioning_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditioning_operator(MindCParser.Additioning_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additioning_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditioning_operator(MindCParser.Additioning_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shifting_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterShifting_operator(MindCParser.Shifting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shifting_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitShifting_operator(MindCParser.Shifting_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(MindCParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(MindCParser.Equality_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_value}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(MindCParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_value}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(MindCParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bit_and_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_operator(MindCParser.Bit_and_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bit_and_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_operator(MindCParser.Bit_and_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_and_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_operator(MindCParser.Logical_and_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_and_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_operator(MindCParser.Logical_and_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(MindCParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(MindCParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_or_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_operator(MindCParser.Logical_or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_or_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_operator(MindCParser.Logical_or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationing_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationing_operator(MindCParser.Multiplicationing_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationing_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationing_operator(MindCParser.Multiplicationing_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bit_xor_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_operator(MindCParser.Bit_xor_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bit_xor_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_operator(MindCParser.Bit_xor_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_cast_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_cast_operator(MindCParser.Explicit_cast_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_cast_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_cast_operator(MindCParser.Explicit_cast_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(MindCParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(MindCParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MindCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MindCParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MindCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MindCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(MindCParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(MindCParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(MindCParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(MindCParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#var_statement}.
	 * @param ctx the parse tree
	 */
	void enterVar_statement(MindCParser.Var_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#var_statement}.
	 * @param ctx the parse tree
	 */
	void exitVar_statement(MindCParser.Var_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MindCParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MindCParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#return_value_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value_statement(MindCParser.Return_value_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#return_value_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value_statement(MindCParser.Return_value_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MindCParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MindCParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#while_statemenet}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statemenet(MindCParser.While_statemenetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#while_statemenet}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statemenet(MindCParser.While_statemenetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_statement}.
	 * @param ctx the parse tree
	 */
	void enterMlog_statement(MindCParser.Mlog_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_statement}.
	 * @param ctx the parse tree
	 */
	void exitMlog_statement(MindCParser.Mlog_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_instruction_list}.
	 * @param ctx the parse tree
	 */
	void enterMlog_instruction_list(MindCParser.Mlog_instruction_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_instruction_list}.
	 * @param ctx the parse tree
	 */
	void exitMlog_instruction_list(MindCParser.Mlog_instruction_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_instruction}.
	 * @param ctx the parse tree
	 */
	void enterMlog_instruction(MindCParser.Mlog_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_instruction}.
	 * @param ctx the parse tree
	 */
	void exitMlog_instruction(MindCParser.Mlog_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_keyword}.
	 * @param ctx the parse tree
	 */
	void enterMlog_keyword(MindCParser.Mlog_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_keyword}.
	 * @param ctx the parse tree
	 */
	void exitMlog_keyword(MindCParser.Mlog_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_operand}.
	 * @param ctx the parse tree
	 */
	void enterMlog_operand(MindCParser.Mlog_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_operand}.
	 * @param ctx the parse tree
	 */
	void exitMlog_operand(MindCParser.Mlog_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_variable_capture_ref}.
	 * @param ctx the parse tree
	 */
	void enterMlog_variable_capture_ref(MindCParser.Mlog_variable_capture_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_variable_capture_ref}.
	 * @param ctx the parse tree
	 */
	void exitMlog_variable_capture_ref(MindCParser.Mlog_variable_capture_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link MindCParser#mlog_raw_operand}.
	 * @param ctx the parse tree
	 */
	void enterMlog_raw_operand(MindCParser.Mlog_raw_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MindCParser#mlog_raw_operand}.
	 * @param ctx the parse tree
	 */
	void exitMlog_raw_operand(MindCParser.Mlog_raw_operandContext ctx);
}