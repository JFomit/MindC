// Generated from c:\Users\Timofey\source\repos\MindC\Toolchain\Compiler\MindC.g4 by ANTLR 4.9.3
package net.homez.mindc.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MindCLexer extends Lexer {
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
		Comment=53, Single_line_comment=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "PLUS", "MINUS", "TRUE", "FALSE", "DECIMAL_DIGIT", 
			"DECIMAL_NUMBER", "IDENTIFIER_START_CHARACTER", "IDENTIFIER_PART_CHARACTER", 
			"SIMPLE_IDENTIFIER", "WS", "New_Line", "Input_Character", "New_Line_Character", 
			"Comment", "Single_line_comment"
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
			"Comment", "Single_line_comment"
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


	public MindCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MindC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\6\63\u013b\n\63\r\63\16\63\u013c\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\7\66\u0145\n\66\f\66\16\66\u0148\13\66\3"+
		"\67\6\67\u014b\n\67\r\67\16\67\u014c\3\67\3\67\38\38\38\58\u0154\n8\3"+
		"9\39\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\7<\u0162\n<\f<\16<\u0165\13<\2\2=\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\63g\2i\2k\64m\65o\66"+
		"q\2s\2u\67w8\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\6\2\f\f\17\17\u0087\u0087\u202a\u202b\2\u0165\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5\u0080"+
		"\3\2\2\2\7\u0082\3\2\2\2\t\u0084\3\2\2\2\13\u0086\3\2\2\2\r\u0088\3\2"+
		"\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0096\3\2\2"+
		"\2\27\u009b\3\2\2\2\31\u00a3\3\2\2\2\33\u00aa\3\2\2\2\35\u00b1\3\2\2\2"+
		"\37\u00b8\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c7"+
		"\3\2\2\2)\u00ce\3\2\2\2+\u00d3\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00de\3\2\2\2\63\u00e0\3\2\2\2\65\u00e3\3\2\2\2\67\u00e6\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00ea\3\2\2\2=\u00ed\3\2\2\2?\u00f0\3\2\2\2A\u00f3\3\2\2\2C"+
		"\u00f6\3\2\2\2E\u00f9\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0102\3\2"+
		"\2\2M\u0105\3\2\2\2O\u0109\3\2\2\2Q\u010d\3\2\2\2S\u0111\3\2\2\2U\u0115"+
		"\3\2\2\2W\u011b\3\2\2\2Y\u0126\3\2\2\2[\u0128\3\2\2\2]\u012a\3\2\2\2_"+
		"\u012c\3\2\2\2a\u0131\3\2\2\2c\u0137\3\2\2\2e\u013a\3\2\2\2g\u013e\3\2"+
		"\2\2i\u0140\3\2\2\2k\u0142\3\2\2\2m\u014a\3\2\2\2o\u0153\3\2\2\2q\u0155"+
		"\3\2\2\2s\u0157\3\2\2\2u\u0159\3\2\2\2w\u015d\3\2\2\2yz\7i\2\2z{\7n\2"+
		"\2{|\7q\2\2|}\7d\2\2}~\7c\2\2~\177\7n\2\2\177\4\3\2\2\2\u0080\u0081\7"+
		"=\2\2\u0081\6\3\2\2\2\u0082\u0083\7*\2\2\u0083\b\3\2\2\2\u0084\u0085\7"+
		"+\2\2\u0085\n\3\2\2\2\u0086\u0087\7.\2\2\u0087\f\3\2\2\2\u0088\u0089\7"+
		"u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d"+
		"\7e\2\2\u008d\u008e\7v\2\2\u008e\16\3\2\2\2\u008f\u0090\7}\2\2\u0090\20"+
		"\3\2\2\2\u0091\u0092\7\177\2\2\u0092\22\3\2\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7h\2\2\u0095\24\3\2\2\2\u0096\u0097\7o\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7i\2\2\u009a\26\3\2\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7x\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7"+
		"r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7e\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7e\2\2"+
		"\u00b7\36\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7"+
		"k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd \3\2\2\2\u00be\u00bf"+
		"\7\60\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7o\2\2\u00ca"+
		"\u00cb\7d\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7f\2\2"+
		"\u00d2*\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2"+
		"\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9,\3\2"+
		"\2\2\u00da\u00db\7,\2\2\u00db.\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\60\3"+
		"\2\2\2\u00de\u00df\7\'\2\2\u00df\62\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\7@\2\2\u00e5\66"+
		"\3\2\2\2\u00e6\u00e7\7>\2\2\u00e78\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9:\3"+
		"\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00ee\u00ef\7?\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7?\2\2\u00f5B\3"+
		"\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\7(\2\2\u00f8D\3\2\2\2\u00f9\u00fa"+
		"\7~\2\2\u00fa\u00fb\7~\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7?\2\2\u00fdH\3"+
		"\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7v\2\2\u0101"+
		"J\3\2\2\2\u0102\u0103\7q\2\2\u0103\u0104\7r\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7f\2\2\u0107\u0108\7f\2\2\u0108N\3\2\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7w\2\2\u010b\u010c\7d\2\2\u010cP\3\2\2\2\u010d\u010e"+
		"\7o\2\2\u010e\u010f\7w\2\2\u010f\u0110\7n\2\2\u0110R\3\2\2\2\u0111\u0112"+
		"\7f\2\2\u0112\u0113\7k\2\2\u0113\u0114\7x\2\2\u0114T\3\2\2\2\u0115\u0116"+
		"\7r\2\2\u0116\u0117\7t\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119"+
		"\u011a\7v\2\2\u011aV\3\2\2\2\u011b\u011c\7r\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120\u0121\7h\2\2"+
		"\u0121\u0122\7n\2\2\u0122\u0123\7w\2\2\u0123\u0124\7u\2\2\u0124\u0125"+
		"\7j\2\2\u0125X\3\2\2\2\u0126\u0127\7&\2\2\u0127Z\3\2\2\2\u0128\u0129\7"+
		"-\2\2\u0129\\\3\2\2\2\u012a\u012b\7/\2\2\u012b^\3\2\2\2\u012c\u012d\7"+
		"v\2\2\u012d\u012e\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7g\2\2\u0130`"+
		"\3\2\2\2\u0131\u0132\7h\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134"+
		"\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136b\3\2\2\2\u0137\u0138\t\2\2\2\u0138"+
		"d\3\2\2\2\u0139\u013b\5c\62\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013df\3\2\2\2\u013e\u013f\t"+
		"\3\2\2\u013fh\3\2\2\2\u0140\u0141\t\4\2\2\u0141j\3\2\2\2\u0142\u0146\5"+
		"g\64\2\u0143\u0145\5i\65\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147l\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b\67\2\2"+
		"\u014fn\3\2\2\2\u0150\u0154\5s:\2\u0151\u0152\7\17\2\2\u0152\u0154\7\f"+
		"\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0154p\3\2\2\2\u0155\u0156"+
		"\n\6\2\2\u0156r\3\2\2\2\u0157\u0158\t\6\2\2\u0158t\3\2\2\2\u0159\u015a"+
		"\5w<\2\u015a\u015b\3\2\2\2\u015b\u015c\b;\2\2\u015cv\3\2\2\2\u015d\u015e"+
		"\7\61\2\2\u015e\u015f\7\61\2\2\u015f\u0163\3\2\2\2\u0160\u0162\5q9\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164x\3\2\2\2\u0165\u0163\3\2\2\2\b\2\u013c\u0146\u014c\u0153\u0163"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}