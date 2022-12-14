// Generated from c:\Users\Timofey\source\repos\MindC\Toolchain\Compiler\MindC.g4 by ANTLR 4.9.3
package net.homez.mindc.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MindCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MindCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MindCParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MindCParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#input_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_element(MindCParser.Input_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(MindCParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#global_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variable_declaration(MindCParser.Global_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(MindCParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MindCParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#single_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_parameter(MindCParser.Single_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#function_call_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_operator(MindCParser.Function_call_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(MindCParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#single_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_argument(MindCParser.Single_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(MindCParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#struct_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration_block(MindCParser.Struct_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#struct_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declaration(MindCParser.Struct_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(MindCParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#strcut_member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrcut_member_access(MindCParser.Strcut_member_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#struct_field_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_field_access(MindCParser.Struct_field_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(MindCParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(MindCParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextual_keyword(MindCParser.Contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MindCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MindCParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(MindCParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(MindCParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(MindCParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MindCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#built_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_type(MindCParser.Built_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#user_defined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_defined_type(MindCParser.User_defined_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_reference}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_reference(MindCParser.Variable_referenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(MindCParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MindCParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code member_access_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access_operator(MindCParser.Member_access_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additioning_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditioning_operator(MindCParser.Additioning_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shifting_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShifting_operator(MindCParser.Shifting_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(MindCParser.Equality_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_value}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(MindCParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_and_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_operator(MindCParser.Logical_and_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(MindCParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_or_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_operator(MindCParser.Logical_or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationing_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationing_operator(MindCParser.Multiplicationing_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_cast_operator}
	 * labeled alternative in {@link MindCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_cast_operator(MindCParser.Explicit_cast_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(MindCParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(MindCParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MindCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(MindCParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(MindCParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#var_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_statement(MindCParser.Var_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(MindCParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#return_value_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_value_statement(MindCParser.Return_value_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MindCParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#while_statemenet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statemenet(MindCParser.While_statemenetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_statement(MindCParser.Mlog_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_instruction_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_instruction_list(MindCParser.Mlog_instruction_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_instruction(MindCParser.Mlog_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_keyword(MindCParser.Mlog_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_operand(MindCParser.Mlog_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_variable_capture_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_variable_capture_ref(MindCParser.Mlog_variable_capture_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link MindCParser#mlog_raw_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlog_raw_operand(MindCParser.Mlog_raw_operandContext ctx);
}