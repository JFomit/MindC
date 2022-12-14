// Generated from c:\Users\Timofey\source\repos\MindC\Toolchain\Compiler\MindC.g4 by ANTLR 4.9.3
package net.homez.mindc.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MindCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, PLUS=45, MINUS=46, 
		TRUE=47, FALSE=48, DECIMAL_NUMBER=49, SIMPLE_IDENTIFIER=50, WS=51, New_Line=52, 
		Comment=53, Single_line_comment=54, Input_Character=55;
	public static final int
		RULE_input = 0, RULE_input_element = 1, RULE_item = 2, RULE_global_variable_declaration = 3, 
		RULE_function_declaration = 4, RULE_parameter_list = 5, RULE_single_parameter = 6, 
		RULE_function_call_operator = 7, RULE_argument_list = 8, RULE_single_argument = 9, 
		RULE_struct_declaration = 10, RULE_struct_declaration_block = 11, RULE_struct_member_declaration = 12, 
		RULE_field_declaration = 13, RULE_strcut_member_access = 14, RULE_struct_field_access = 15, 
		RULE_token = 16, RULE_keyword = 17, RULE_contextual_keyword = 18, RULE_identifier = 19, 
		RULE_literal = 20, RULE_number_literal = 21, RULE_boolean_literal = 22, 
		RULE_string_literal = 23, RULE_type = 24, RULE_built_in_type = 25, RULE_user_defined_type = 26, 
		RULE_primary_expression = 27, RULE_statement_block = 28, RULE_statement_list = 29, 
		RULE_statement = 30, RULE_assign_statement = 31, RULE_function_call_statement = 32, 
		RULE_var_statement = 33, RULE_return_statement = 34, RULE_return_value_statement = 35, 
		RULE_if_statement = 36, RULE_while_statemenet = 37, RULE_mlog_statement = 38, 
		RULE_mlog_instruction_list = 39, RULE_mlog_instruction = 40, RULE_mlog_keyword = 41, 
		RULE_mlog_operand = 42, RULE_mlog_variable_capture_ref = 43, RULE_mlog_raw_operand = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "input_element", "item", "global_variable_declaration", "function_declaration", 
			"parameter_list", "single_parameter", "function_call_operator", "argument_list", 
			"single_argument", "struct_declaration", "struct_declaration_block", 
			"struct_member_declaration", "field_declaration", "strcut_member_access", 
			"struct_field_access", "token", "keyword", "contextual_keyword", "identifier", 
			"literal", "number_literal", "boolean_literal", "string_literal", "type", 
			"built_in_type", "user_defined_type", "primary_expression", "statement_block", 
			"statement_list", "statement", "assign_statement", "function_call_statement", 
			"var_statement", "return_statement", "return_value_statement", "if_statement", 
			"while_statemenet", "mlog_statement", "mlog_instruction_list", "mlog_instruction", 
			"mlog_keyword", "mlog_operand", "mlog_variable_capture_ref", "mlog_raw_operand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "';'", "'('", "')'", "','", "'struct'", "'{'", "'}'", 
			"'if'", "'mlog'", "'private'", "'public'", "'return'", "'static'", "'while'", 
			"'.'", "'\"'", "'bool'", "'number'", "'void'", "'string'", "'*'", "'/'", 
			"'%'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'&&'", "'||'", "'='", "'set'", "'op'", "'add'", "'sub'", "'mul'", "'div'", 
			"'print'", "'printflush'", "'$'", "'+'", "'-'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PLUS", "MINUS", 
			"TRUE", "FALSE", "DECIMAL_NUMBER", "SIMPLE_IDENTIFIER", "WS", "New_Line", 
			"Comment", "Single_line_comment", "Input_Character"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MindC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MindCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public List<Input_elementContext> input_element() {
			return getRuleContexts(Input_elementContext.class);
		}
		public Input_elementContext input_element(int i) {
			return getRuleContext(Input_elementContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(90);
				input_element();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_elementContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public Input_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterInput_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitInput_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitInput_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_elementContext input_element() throws RecognitionException {
		Input_elementContext _localctx = new Input_elementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Global_variable_declarationContext global_variable_declaration() {
			return getRuleContext(Global_variable_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_item);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case SIMPLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				function_declaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				global_variable_declaration();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				struct_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_variable_declarationContext extends ParserRuleContext {
		public TypeContext variableType;
		public IdentifierContext variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterGlobal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitGlobal_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitGlobal_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_variable_declarationContext global_variable_declaration() throws RecognitionException {
		Global_variable_declarationContext _localctx = new Global_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			((Global_variable_declarationContext)_localctx).variableType = type();
			setState(105);
			((Global_variable_declarationContext)_localctx).variableName = identifier();
			setState(106);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public TypeContext retrunType;
		public IdentifierContext functionName;
		public Parameter_listContext functionParameteres;
		public Statement_blockContext functionBody;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((Function_declarationContext)_localctx).retrunType = type();
			setState(109);
			((Function_declarationContext)_localctx).functionName = identifier();
			setState(110);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				setState(111);
				((Function_declarationContext)_localctx).functionParameteres = parameter_list();
				}
			}

			setState(114);
			match(T__3);
			setState(115);
			((Function_declarationContext)_localctx).functionBody = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Single_parameterContext> single_parameter() {
			return getRuleContexts(Single_parameterContext.class);
		}
		public Single_parameterContext single_parameter(int i) {
			return getRuleContext(Single_parameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			single_parameter();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(118);
				match(T__4);
				setState(119);
				single_parameter();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_parameterContext extends ParserRuleContext {
		public TypeContext parameterType;
		public IdentifierContext parameterName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Single_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterSingle_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitSingle_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitSingle_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_parameterContext single_parameter() throws RecognitionException {
		Single_parameterContext _localctx = new Single_parameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((Single_parameterContext)_localctx).parameterType = type();
			setState(126);
			((Single_parameterContext)_localctx).parameterName = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_operatorContext extends ParserRuleContext {
		public IdentifierContext functionName;
		public Argument_listContext arguments;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_call_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterFunction_call_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitFunction_call_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitFunction_call_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_operatorContext function_call_operator() throws RecognitionException {
		Function_call_operatorContext _localctx = new Function_call_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Function_call_operatorContext)_localctx).functionName = identifier();
			setState(129);
			match(T__2);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << PLUS) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_NUMBER) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				setState(130);
				((Function_call_operatorContext)_localctx).arguments = argument_list();
				}
			}

			setState(133);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<Single_argumentContext> single_argument() {
			return getRuleContexts(Single_argumentContext.class);
		}
		public Single_argumentContext single_argument(int i) {
			return getRuleContext(Single_argumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			single_argument();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(136);
				match(T__4);
				setState(137);
				single_argument();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_argumentContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Single_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterSingle_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitSingle_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitSingle_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_argumentContext single_argument() throws RecognitionException {
		Single_argumentContext _localctx = new Single_argumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_single_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			primary_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public IdentifierContext structName;
		public Struct_declaration_blockContext structBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_declaration_blockContext struct_declaration_block() {
			return getRuleContext(Struct_declaration_blockContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__5);
			setState(146);
			((Struct_declarationContext)_localctx).structName = identifier();
			setState(147);
			((Struct_declarationContext)_localctx).structBody = struct_declaration_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaration_blockContext extends ParserRuleContext {
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStruct_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStruct_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStruct_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declaration_blockContext struct_declaration_block() throws RecognitionException {
		Struct_declaration_blockContext _localctx = new Struct_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__6);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(150);
				struct_member_declaration();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStruct_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStruct_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStruct_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_struct_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			field_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationContext extends ParserRuleContext {
		public TypeContext fieldType;
		public IdentifierContext fieldName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitField_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitField_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((Field_declarationContext)_localctx).fieldType = type();
			setState(161);
			((Field_declarationContext)_localctx).fieldName = identifier();
			setState(162);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Strcut_member_accessContext extends ParserRuleContext {
		public Struct_field_accessContext struct_field_access() {
			return getRuleContext(Struct_field_accessContext.class,0);
		}
		public Strcut_member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strcut_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStrcut_member_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStrcut_member_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStrcut_member_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Strcut_member_accessContext strcut_member_access() throws RecognitionException {
		Strcut_member_accessContext _localctx = new Strcut_member_accessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strcut_member_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			struct_field_access();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_field_accessContext extends ParserRuleContext {
		public IdentifierContext field;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_field_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_field_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStruct_field_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStruct_field_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStruct_field_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_field_accessContext struct_field_access() throws RecognitionException {
		Struct_field_accessContext _localctx = new Struct_field_accessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_field_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((Struct_field_accessContext)_localctx).field = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_token);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(MindCParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(MindCParser.TRUE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contextual_keywordContext extends ParserRuleContext {
		public Mlog_keywordContext mlog_keyword() {
			return getRuleContext(Mlog_keywordContext.class,0);
		}
		public Contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterContextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitContextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitContextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contextual_keywordContext contextual_keyword() throws RecognitionException {
		Contextual_keywordContext _localctx = new Contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			mlog_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode SIMPLE_IDENTIFIER() { return getToken(MindCParser.SIMPLE_IDENTIFIER, 0); }
		public Contextual_keywordContext contextual_keyword() {
			return getRuleContext(Contextual_keywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(SIMPLE_IDENTIFIER);
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				contextual_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case PLUS:
			case MINUS:
			case DECIMAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				number_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL_NUMBER() { return getTokens(MindCParser.DECIMAL_NUMBER); }
		public TerminalNode DECIMAL_NUMBER(int i) {
			return getToken(MindCParser.DECIMAL_NUMBER, i);
		}
		public TerminalNode PLUS() { return getToken(MindCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MindCParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitNumber_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number_literal);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(185);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(188);
				match(DECIMAL_NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(192);
				match(DECIMAL_NUMBER);
				setState(193);
				match(T__15);
				setState(194);
				match(DECIMAL_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(195);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(198);
				match(T__15);
				setState(199);
				match(DECIMAL_NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MindCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MindCParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public List<TerminalNode> Input_Character() { return getTokens(MindCParser.Input_Character); }
		public TerminalNode Input_Character(int i) {
			return getToken(MindCParser.Input_Character, i);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__16);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Input_Character) {
				{
				{
				setState(205);
				match(Input_Character);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public User_defined_typeContext user_defined_type() {
			return getRuleContext(User_defined_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				built_in_type();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case SIMPLE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				user_defined_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Built_in_typeContext extends ParserRuleContext {
		public Built_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterBuilt_in_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitBuilt_in_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitBuilt_in_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_typeContext built_in_type() throws RecognitionException {
		Built_in_typeContext _localctx = new Built_in_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_built_in_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_defined_typeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_defined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_defined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterUser_defined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitUser_defined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitUser_defined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_defined_typeContext user_defined_type() throws RecognitionException {
		User_defined_typeContext _localctx = new User_defined_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_user_defined_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Variable_referenceContext extends Primary_expressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_referenceContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterVariable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitVariable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitVariable_reference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends Primary_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public ParenthesesContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_callContext extends Primary_expressionContext {
		public Function_call_operatorContext function_call_operator() {
			return getRuleContext(Function_call_operatorContext.class,0);
		}
		public Function_callContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Member_access_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext instance;
		public Strcut_member_accessContext strcut_member_access() {
			return getRuleContext(Strcut_member_accessContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Member_access_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMember_access_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMember_access_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMember_access_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Additioning_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Token operator;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MindCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MindCParser.MINUS, 0); }
		public Additioning_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterAdditioning_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitAdditioning_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitAdditioning_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Shifting_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Token operator;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Shifting_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterShifting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitShifting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitShifting_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equality_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Token operator;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Equality_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_valueContext extends Primary_expressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_valueContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_and_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Logical_and_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterLogical_and_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitLogical_and_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitLogical_and_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comparison_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Token operator;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Comparison_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_or_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Logical_or_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterLogical_or_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitLogical_or_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitLogical_or_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Multiplicationing_operatorContext extends Primary_expressionContext {
		public Primary_expressionContext left;
		public Token operator;
		public Primary_expressionContext right;
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
		}
		public Multiplicationing_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMultiplicationing_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMultiplicationing_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMultiplicationing_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_cast_operatorContext extends Primary_expressionContext {
		public TypeContext cast_target_type;
		public Primary_expressionContext instance;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Explicit_cast_operatorContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterExplicit_cast_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitExplicit_cast_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitExplicit_cast_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		return primary_expression(0);
	}

	private Primary_expressionContext primary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, _parentState);
		Primary_expressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_primary_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new Literal_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new Variable_referenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__2);
				setState(225);
				primary_expression(0);
				setState(226);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new Function_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				function_call_operator();
				}
				break;
			case 5:
				{
				_localctx = new Explicit_cast_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(T__2);
				setState(230);
				((Explicit_cast_operatorContext)_localctx).cast_target_type = type();
				setState(231);
				match(T__3);
				setState(232);
				((Explicit_cast_operatorContext)_localctx).instance = primary_expression(8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicationing_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Multiplicationing_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(237);
						((Multiplicationing_operatorContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((Multiplicationing_operatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						((Multiplicationing_operatorContext)_localctx).right = primary_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Additioning_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Additioning_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240);
						((Additioning_operatorContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Additioning_operatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						((Additioning_operatorContext)_localctx).right = primary_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Shifting_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Shifting_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(242);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(243);
						((Shifting_operatorContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((Shifting_operatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						((Shifting_operatorContext)_localctx).right = primary_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Comparison_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Comparison_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246);
						((Comparison_operatorContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((Comparison_operatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						((Comparison_operatorContext)_localctx).right = primary_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Equality_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Equality_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(248);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(249);
						((Equality_operatorContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((Equality_operatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						((Equality_operatorContext)_localctx).right = primary_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Logical_and_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Logical_and_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						match(T__32);
						setState(253);
						((Logical_and_operatorContext)_localctx).right = primary_expression(3);
						}
						break;
					case 7:
						{
						_localctx = new Logical_or_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Logical_or_operatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(254);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(255);
						match(T__33);
						setState(256);
						((Logical_or_operatorContext)_localctx).right = primary_expression(2);
						}
						break;
					case 8:
						{
						_localctx = new Member_access_operatorContext(new Primary_expressionContext(_parentctx, _parentState));
						((Member_access_operatorContext)_localctx).instance = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(257);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(258);
						match(T__15);
						setState(259);
						strcut_member_access();
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__6);
			setState(266);
			statement_list();
			setState(267);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(269);
				statement();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Var_statementContext var_statement() {
			return getRuleContext(Var_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Return_value_statementContext return_value_statement() {
			return getRuleContext(Return_value_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statemenetContext while_statemenet() {
			return getRuleContext(While_statemenetContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Mlog_statementContext mlog_statement() {
			return getRuleContext(Mlog_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				var_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				assign_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				function_call_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				return_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				return_value_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				while_statemenet();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(282);
				statement_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(283);
				mlog_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public IdentifierContext variableName;
		public Primary_expressionContext value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((Assign_statementContext)_localctx).variableName = identifier();
			setState(287);
			match(T__34);
			setState(288);
			((Assign_statementContext)_localctx).value = primary_expression(0);
			setState(289);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_statementContext extends ParserRuleContext {
		public Function_call_operatorContext function_call_operator() {
			return getRuleContext(Function_call_operatorContext.class,0);
		}
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterFunction_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitFunction_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			function_call_operator();
			setState(292);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_statementContext extends ParserRuleContext {
		public TypeContext variableType;
		public IdentifierContext variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Var_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterVar_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitVar_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitVar_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_statementContext var_statement() throws RecognitionException {
		Var_statementContext _localctx = new Var_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_var_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((Var_statementContext)_localctx).variableType = type();
			setState(295);
			((Var_statementContext)_localctx).variableName = identifier();
			setState(296);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__12);
			setState(299);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_value_statementContext extends ParserRuleContext {
		public Primary_expressionContext value;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Return_value_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterReturn_value_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitReturn_value_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitReturn_value_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_value_statementContext return_value_statement() throws RecognitionException {
		Return_value_statementContext _localctx = new Return_value_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_value_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__12);
			setState(302);
			((Return_value_statementContext)_localctx).value = primary_expression(0);
			setState(303);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Primary_expressionContext condition;
		public Statement_blockContext code;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__8);
			setState(306);
			match(T__2);
			setState(307);
			((If_statementContext)_localctx).condition = primary_expression(0);
			setState(308);
			match(T__3);
			setState(309);
			((If_statementContext)_localctx).code = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statemenetContext extends ParserRuleContext {
		public Primary_expressionContext condition;
		public Statement_blockContext code;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public While_statemenetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statemenet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterWhile_statemenet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitWhile_statemenet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitWhile_statemenet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statemenetContext while_statemenet() throws RecognitionException {
		While_statemenetContext _localctx = new While_statemenetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_while_statemenet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__14);
			setState(312);
			match(T__2);
			setState(313);
			((While_statemenetContext)_localctx).condition = primary_expression(0);
			setState(314);
			match(T__3);
			setState(315);
			((While_statemenetContext)_localctx).code = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_statementContext extends ParserRuleContext {
		public Mlog_instruction_listContext mlog_instruction_list() {
			return getRuleContext(Mlog_instruction_listContext.class,0);
		}
		public Mlog_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_statementContext mlog_statement() throws RecognitionException {
		Mlog_statementContext _localctx = new Mlog_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mlog_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__9);
			setState(318);
			match(T__6);
			setState(319);
			mlog_instruction_list();
			setState(320);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_instruction_listContext extends ParserRuleContext {
		public List<Mlog_instructionContext> mlog_instruction() {
			return getRuleContexts(Mlog_instructionContext.class);
		}
		public Mlog_instructionContext mlog_instruction(int i) {
			return getRuleContext(Mlog_instructionContext.class,i);
		}
		public Mlog_instruction_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_instruction_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_instruction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_instruction_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_instruction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_instruction_listContext mlog_instruction_list() throws RecognitionException {
		Mlog_instruction_listContext _localctx = new Mlog_instruction_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mlog_instruction_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
				{
				{
				setState(322);
				mlog_instruction();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_instructionContext extends ParserRuleContext {
		public Mlog_keywordContext instruction;
		public Mlog_operandContext operands;
		public Mlog_keywordContext mlog_keyword() {
			return getRuleContext(Mlog_keywordContext.class,0);
		}
		public List<Mlog_operandContext> mlog_operand() {
			return getRuleContexts(Mlog_operandContext.class);
		}
		public Mlog_operandContext mlog_operand(int i) {
			return getRuleContext(Mlog_operandContext.class,i);
		}
		public Mlog_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_instructionContext mlog_instruction() throws RecognitionException {
		Mlog_instructionContext _localctx = new Mlog_instructionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mlog_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((Mlog_instructionContext)_localctx).instruction = mlog_keyword();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << PLUS) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_NUMBER) | (1L << SIMPLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(329);
				((Mlog_instructionContext)_localctx).operands = mlog_operand();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_keywordContext extends ParserRuleContext {
		public Mlog_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_keywordContext mlog_keyword() throws RecognitionException {
		Mlog_keywordContext _localctx = new Mlog_keywordContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mlog_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_operandContext extends ParserRuleContext {
		public Mlog_variable_capture_refContext mlog_variable_capture_ref() {
			return getRuleContext(Mlog_variable_capture_refContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Mlog_raw_operandContext mlog_raw_operand() {
			return getRuleContext(Mlog_raw_operandContext.class,0);
		}
		public Mlog_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_operandContext mlog_operand() throws RecognitionException {
		Mlog_operandContext _localctx = new Mlog_operandContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mlog_operand);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				mlog_variable_capture_ref();
				}
				break;
			case T__15:
			case PLUS:
			case MINUS:
			case TRUE:
			case FALSE:
			case DECIMAL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				literal();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case SIMPLE_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				mlog_raw_operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_variable_capture_refContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Mlog_variable_capture_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_variable_capture_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_variable_capture_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_variable_capture_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_variable_capture_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_variable_capture_refContext mlog_variable_capture_ref() throws RecognitionException {
		Mlog_variable_capture_refContext _localctx = new Mlog_variable_capture_refContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mlog_variable_capture_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__43);
			setState(345);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mlog_raw_operandContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Mlog_raw_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlog_raw_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).enterMlog_raw_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MindCListener ) ((MindCListener)listener).exitMlog_raw_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MindCVisitor ) return ((MindCVisitor<? extends T>)visitor).visitMlog_raw_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mlog_raw_operandContext mlog_raw_operand() throws RecognitionException {
		Mlog_raw_operandContext _localctx = new Mlog_raw_operandContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mlog_raw_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return primary_expression_sempred((Primary_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primary_expression_sempred(Primary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\3\3\3\3\4\3\4\3\4\5\4h"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6s\n\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0086\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d\13\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00ae\n\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\5\25\u00b6\n\25\3\26\3\26\5\26\u00ba\n\26\3"+
		"\27\5\27\u00bd\n\27\3\27\3\27\5\27\u00c1\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00c7\n\27\3\27\3\27\5\27\u00cb\n\27\3\30\3\30\3\31\3\31\7\31\u00d1\n"+
		"\31\f\31\16\31\u00d4\13\31\3\31\3\31\3\32\3\32\5\32\u00da\n\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u00ed\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0107\n\35\f\35\16\35\u010a\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\7\37\u0111\n\37\f\37\16\37\u0114\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u011f\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\7)\u0146"+
		"\n)\f)\16)\u0149\13)\3*\3*\7*\u014d\n*\f*\16*\u0150\13*\3*\3*\3+\3+\3"+
		",\3,\3,\5,\u0159\n,\3-\3-\3-\3.\3.\3.\2\38/\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\13\6\2\3\3\b\b\13"+
		"\21\61\62\3\2/\60\3\2\61\62\3\2\24\27\3\2\30\32\3\2\33\34\3\2\35 \3\2"+
		"!\"\3\2&-\2\u015e\2_\3\2\2\2\4b\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\nn\3\2\2"+
		"\2\fw\3\2\2\2\16\177\3\2\2\2\20\u0082\3\2\2\2\22\u0089\3\2\2\2\24\u0091"+
		"\3\2\2\2\26\u0093\3\2\2\2\30\u0097\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3"+
		"\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2"+
		"&\u00b1\3\2\2\2(\u00b5\3\2\2\2*\u00b9\3\2\2\2,\u00ca\3\2\2\2.\u00cc\3"+
		"\2\2\2\60\u00ce\3\2\2\2\62\u00d9\3\2\2\2\64\u00db\3\2\2\2\66\u00dd\3\2"+
		"\2\28\u00ec\3\2\2\2:\u010b\3\2\2\2<\u0112\3\2\2\2>\u011e\3\2\2\2@\u0120"+
		"\3\2\2\2B\u0125\3\2\2\2D\u0128\3\2\2\2F\u012c\3\2\2\2H\u012f\3\2\2\2J"+
		"\u0133\3\2\2\2L\u0139\3\2\2\2N\u013f\3\2\2\2P\u0147\3\2\2\2R\u014a\3\2"+
		"\2\2T\u0153\3\2\2\2V\u0158\3\2\2\2X\u015a\3\2\2\2Z\u015d\3\2\2\2\\^\5"+
		"\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\3\3\2\2\2a_\3\2\2\2b"+
		"c\5\6\4\2c\5\3\2\2\2dh\5\n\6\2eh\5\b\5\2fh\5\26\f\2gd\3\2\2\2ge\3\2\2"+
		"\2gf\3\2\2\2h\7\3\2\2\2ij\7\3\2\2jk\5\62\32\2kl\5(\25\2lm\7\4\2\2m\t\3"+
		"\2\2\2no\5\62\32\2op\5(\25\2pr\7\5\2\2qs\5\f\7\2rq\3\2\2\2rs\3\2\2\2s"+
		"t\3\2\2\2tu\7\6\2\2uv\5:\36\2v\13\3\2\2\2w|\5\16\b\2xy\7\7\2\2y{\5\16"+
		"\b\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\5\62\32\2\u0080\u0081\5(\25\2\u0081\17\3\2\2\2\u0082\u0083\5(\25"+
		"\2\u0083\u0085\7\5\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\6\2\2\u0088\21\3\2\2"+
		"\2\u0089\u008e\5\24\13\2\u008a\u008b\7\7\2\2\u008b\u008d\5\24\13\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\58\35\2\u0092\25"+
		"\3\2\2\2\u0093\u0094\7\b\2\2\u0094\u0095\5(\25\2\u0095\u0096\5\30\r\2"+
		"\u0096\27\3\2\2\2\u0097\u009b\7\t\2\2\u0098\u009a\5\32\16\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\n\2\2\u009f\31\3\2\2"+
		"\2\u00a0\u00a1\5\34\17\2\u00a1\33\3\2\2\2\u00a2\u00a3\5\62\32\2\u00a3"+
		"\u00a4\5(\25\2\u00a4\u00a5\7\4\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\5 \21"+
		"\2\u00a7\37\3\2\2\2\u00a8\u00a9\5(\25\2\u00a9!\3\2\2\2\u00aa\u00ae\5("+
		"\25\2\u00ab\u00ae\5$\23\2\u00ac\u00ae\5*\26\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\t\2\2\2"+
		"\u00b0%\3\2\2\2\u00b1\u00b2\5T+\2\u00b2\'\3\2\2\2\u00b3\u00b6\7\64\2\2"+
		"\u00b4\u00b6\5&\24\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6)\3"+
		"\2\2\2\u00b7\u00ba\5,\27\2\u00b8\u00ba\5.\30\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba+\3\2\2\2\u00bb\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00cb\7\63\2\2\u00bf\u00c1"+
		"\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\7\63\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00cb\7\63\2\2\u00c5\u00c7"+
		"\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\7\22\2\2\u00c9\u00cb\7\63\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c0\3"+
		"\2\2\2\u00ca\u00c6\3\2\2\2\u00cb-\3\2\2\2\u00cc\u00cd\t\4\2\2\u00cd/\3"+
		"\2\2\2\u00ce\u00d2\7\23\2\2\u00cf\u00d1\79\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\61\3\2\2\2\u00d7\u00da"+
		"\5\64\33\2\u00d8\u00da\5\66\34\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2"+
		"\2\u00da\63\3\2\2\2\u00db\u00dc\t\5\2\2\u00dc\65\3\2\2\2\u00dd\u00de\5"+
		"(\25\2\u00de\67\3\2\2\2\u00df\u00e0\b\35\1\2\u00e0\u00ed\5*\26\2\u00e1"+
		"\u00ed\5(\25\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\58\35\2\u00e4\u00e5\7\6"+
		"\2\2\u00e5\u00ed\3\2\2\2\u00e6\u00ed\5\20\t\2\u00e7\u00e8\7\5\2\2\u00e8"+
		"\u00e9\5\62\32\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\58\35\n\u00eb\u00ed\3"+
		"\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e2\3\2\2\2\u00ec"+
		"\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\u0108\3\2\2\2\u00ee\u00ef\f\t"+
		"\2\2\u00ef\u00f0\t\6\2\2\u00f0\u0107\58\35\n\u00f1\u00f2\f\b\2\2\u00f2"+
		"\u00f3\t\3\2\2\u00f3\u0107\58\35\t\u00f4\u00f5\f\7\2\2\u00f5\u00f6\t\7"+
		"\2\2\u00f6\u0107\58\35\b\u00f7\u00f8\f\6\2\2\u00f8\u00f9\t\b\2\2\u00f9"+
		"\u0107\58\35\7\u00fa\u00fb\f\5\2\2\u00fb\u00fc\t\t\2\2\u00fc\u0107\58"+
		"\35\6\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7#\2\2\u00ff\u0107\58\35\5\u0100"+
		"\u0101\f\3\2\2\u0101\u0102\7$\2\2\u0102\u0107\58\35\4\u0103\u0104\f\13"+
		"\2\2\u0104\u0105\7\22\2\2\u0105\u0107\5\36\20\2\u0106\u00ee\3\2\2\2\u0106"+
		"\u00f1\3\2\2\2\u0106\u00f4\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00fa\3\2"+
		"\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u01099\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010c\7\t\2\2\u010c\u010d\5<\37\2\u010d\u010e"+
		"\7\n\2\2\u010e;\3\2\2\2\u010f\u0111\5> \2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113=\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u011f\5D#\2\u0116\u011f\5@!\2\u0117\u011f\5B\"\2"+
		"\u0118\u011f\5F$\2\u0119\u011f\5H%\2\u011a\u011f\5J&\2\u011b\u011f\5L"+
		"\'\2\u011c\u011f\5:\36\2\u011d\u011f\5N(\2\u011e\u0115\3\2\2\2\u011e\u0116"+
		"\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u0119\3\2\2\2\u011e"+
		"\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f?\3\2\2\2\u0120\u0121\5(\25\2\u0121\u0122\7%\2\2\u0122\u0123"+
		"\58\35\2\u0123\u0124\7\4\2\2\u0124A\3\2\2\2\u0125\u0126\5\20\t\2\u0126"+
		"\u0127\7\4\2\2\u0127C\3\2\2\2\u0128\u0129\5\62\32\2\u0129\u012a\5(\25"+
		"\2\u012a\u012b\7\4\2\2\u012bE\3\2\2\2\u012c\u012d\7\17\2\2\u012d\u012e"+
		"\7\4\2\2\u012eG\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0131\58\35\2\u0131"+
		"\u0132\7\4\2\2\u0132I\3\2\2\2\u0133\u0134\7\13\2\2\u0134\u0135\7\5\2\2"+
		"\u0135\u0136\58\35\2\u0136\u0137\7\6\2\2\u0137\u0138\5:\36\2\u0138K\3"+
		"\2\2\2\u0139\u013a\7\21\2\2\u013a\u013b\7\5\2\2\u013b\u013c\58\35\2\u013c"+
		"\u013d\7\6\2\2\u013d\u013e\5:\36\2\u013eM\3\2\2\2\u013f\u0140\7\f\2\2"+
		"\u0140\u0141\7\t\2\2\u0141\u0142\5P)\2\u0142\u0143\7\n\2\2\u0143O\3\2"+
		"\2\2\u0144\u0146\5R*\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148Q\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014e\5T+\2\u014b\u014d\5V,\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0151\u0152\7\4\2\2\u0152S\3\2\2\2\u0153\u0154\t\n\2\2\u0154"+
		"U\3\2\2\2\u0155\u0159\5X-\2\u0156\u0159\5*\26\2\u0157\u0159\5Z.\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159W\3\2\2\2"+
		"\u015a\u015b\7.\2\2\u015b\u015c\5(\25\2\u015cY\3\2\2\2\u015d\u015e\5("+
		"\25\2\u015e[\3\2\2\2\32_gr|\u0085\u008e\u009b\u00ad\u00b5\u00b9\u00bc"+
		"\u00c0\u00c6\u00ca\u00d2\u00d9\u00ec\u0106\u0108\u0112\u011e\u0147\u014e"+
		"\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}