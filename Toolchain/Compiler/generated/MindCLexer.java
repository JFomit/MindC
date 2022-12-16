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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, PLUS=48, MINUS=49, TRUE=50, FALSE=51, DECIMAL_NUMBER=52, 
		SIMPLE_IDENTIFIER=53, WS=54, New_Line=55, Comment=56, Single_line_comment=57;
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
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "PLUS", "MINUS", 
			"TRUE", "FALSE", "DECIMAL_DIGIT", "DECIMAL_NUMBER", "IDENTIFIER_START_CHARACTER", 
			"IDENTIFIER_PART_CHARACTER", "SIMPLE_IDENTIFIER", "WS", "New_Line", "Input_Character", 
			"New_Line_Character", "Comment", "Single_line_comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "';'", "'('", "')'", "','", "'struct'", "'{'", "'}'", 
			"'if'", "'mlog'", "'private'", "'public'", "'return'", "'static'", "'while'", 
			"'.'", "'\"'", "'bool'", "'number'", "'void'", "'string'", "'*'", "'/'", 
			"'%'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'='", "'set'", "'op'", "'add'", 
			"'sub'", "'mul'", "'div'", "'print'", "'printflush'", "'$'", "'+'", "'-'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PLUS", "MINUS", "TRUE", "FALSE", "DECIMAL_NUMBER", "SIMPLE_IDENTIFIER", 
			"WS", "New_Line", "Comment", "Single_line_comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\66\6\66\u0147\n\66\r\66\16\66\u0148\3\67\3\67\38\38\39\39\79\u0151"+
		"\n9\f9\169\u0154\139\3:\6:\u0157\n:\r:\16:\u0158\3:\3:\3;\3;\3;\5;\u0160"+
		"\n;\3<\3<\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\7?\u016e\n?\f?\16?\u0171\13?\2"+
		"\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\66"+
		"m\2o\2q\67s8u9w\2y\2{:};\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\6\2\f\f\17\17\u0087\u0087\u202a\u202b\2\u0171\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0086\3\2\2\2\7\u0088\3\2\2\2\t"+
		"\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0095\3\2\2\2\21\u0097"+
		"\3\2\2\2\23\u0099\3\2\2\2\25\u009c\3\2\2\2\27\u00a1\3\2\2\2\31\u00a9\3"+
		"\2\2\2\33\u00b0\3\2\2\2\35\u00b7\3\2\2\2\37\u00be\3\2\2\2!\u00c4\3\2\2"+
		"\2#\u00c6\3\2\2\2%\u00c8\3\2\2\2\'\u00cd\3\2\2\2)\u00d4\3\2\2\2+\u00d9"+
		"\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2"+
		"\2\65\u00e9\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f3"+
		"\3\2\2\2?\u00f6\3\2\2\2A\u00f9\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G"+
		"\u0100\3\2\2\2I\u0102\3\2\2\2K\u0105\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0111\3\2\2\2U\u0115\3\2\2\2W\u0119\3\2\2\2Y\u011d"+
		"\3\2\2\2[\u0121\3\2\2\2]\u0127\3\2\2\2_\u0132\3\2\2\2a\u0134\3\2\2\2c"+
		"\u0136\3\2\2\2e\u0138\3\2\2\2g\u013d\3\2\2\2i\u0143\3\2\2\2k\u0146\3\2"+
		"\2\2m\u014a\3\2\2\2o\u014c\3\2\2\2q\u014e\3\2\2\2s\u0156\3\2\2\2u\u015f"+
		"\3\2\2\2w\u0161\3\2\2\2y\u0163\3\2\2\2{\u0165\3\2\2\2}\u0169\3\2\2\2\177"+
		"\u0080\7i\2\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7d\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\4\3\2\2\2\u0086\u0087\7="+
		"\2\2\u0087\6\3\2\2\2\u0088\u0089\7*\2\2\u0089\b\3\2\2\2\u008a\u008b\7"+
		"+\2\2\u008b\n\3\2\2\2\u008c\u008d\7.\2\2\u008d\f\3\2\2\2\u008e\u008f\7"+
		"u\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093"+
		"\7e\2\2\u0093\u0094\7v\2\2\u0094\16\3\2\2\2\u0095\u0096\7}\2\2\u0096\20"+
		"\3\2\2\2\u0097\u0098\7\177\2\2\u0098\22\3\2\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7h\2\2\u009b\24\3\2\2\2\u009c\u009d\7o\2\2\u009d\u009e\7n\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7i\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7"+
		"r\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7e\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7e\2\2"+
		"\u00bd\36\3\2\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7"+
		"k\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3 \3\2\2\2\u00c4\u00c5"+
		"\7\60\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7$\3\2\2\2\u00c8\u00c9"+
		"\7d\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"&\3\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7o\2\2\u00d0"+
		"\u00d1\7d\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3(\3\2\2\2\u00d4"+
		"\u00d5\7x\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7f\2\2"+
		"\u00d8*\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7t\2"+
		"\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7i\2\2\u00df,\3\2"+
		"\2\2\u00e0\u00e1\7,\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\60\3"+
		"\2\2\2\u00e4\u00e5\7\'\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8"+
		"\7>\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7@\2\2\u00eb\66"+
		"\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef:\3"+
		"\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7?\2\2\u00f2<\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4\u00f5\7?\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7?\2\2\u00fbB\3"+
		"\2\2\2\u00fc\u00fd\7(\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7`\2\2\u00ffF\3\2"+
		"\2\2\u0100\u0101\7~\2\2\u0101H\3\2\2\2\u0102\u0103\7(\2\2\u0103\u0104"+
		"\7(\2\2\u0104J\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107\7~\2\2\u0107L\3"+
		"\2\2\2\u0108\u0109\7?\2\2\u0109N\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7g\2\2\u010c\u010d\7v\2\2\u010dP\3\2\2\2\u010e\u010f\7q\2\2\u010f\u0110"+
		"\7r\2\2\u0110R\3\2\2\2\u0111\u0112\7c\2\2\u0112\u0113\7f\2\2\u0113\u0114"+
		"\7f\2\2\u0114T\3\2\2\2\u0115\u0116\7u\2\2\u0116\u0117\7w\2\2\u0117\u0118"+
		"\7d\2\2\u0118V\3\2\2\2\u0119\u011a\7o\2\2\u011a\u011b\7w\2\2\u011b\u011c"+
		"\7n\2\2\u011cX\3\2\2\2\u011d\u011e\7f\2\2\u011e\u011f\7k\2\2\u011f\u0120"+
		"\7x\2\2\u0120Z\3\2\2\2\u0121\u0122\7r\2\2\u0122\u0123\7t\2\2\u0123\u0124"+
		"\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7v\2\2\u0126\\\3\2\2\2\u0127\u0128"+
		"\7r\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7h\2\2\u012d\u012e\7n\2\2\u012e\u012f\7w\2\2"+
		"\u012f\u0130\7u\2\2\u0130\u0131\7j\2\2\u0131^\3\2\2\2\u0132\u0133\7&\2"+
		"\2\u0133`\3\2\2\2\u0134\u0135\7-\2\2\u0135b\3\2\2\2\u0136\u0137\7/\2\2"+
		"\u0137d\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7w\2"+
		"\2\u013b\u013c\7g\2\2\u013cf\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7"+
		"c\2\2\u013f\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2\u0142h"+
		"\3\2\2\2\u0143\u0144\t\2\2\2\u0144j\3\2\2\2\u0145\u0147\5i\65\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149l\3\2\2\2\u014a\u014b\t\3\2\2\u014bn\3\2\2\2\u014c\u014d\t\4"+
		"\2\2\u014dp\3\2\2\2\u014e\u0152\5m\67\2\u014f\u0151\5o8\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"r\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\t\5\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\b:\2\2\u015bt\3\2\2\2\u015c\u0160\5y=\2\u015d\u015e"+
		"\7\17\2\2\u015e\u0160\7\f\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160v\3\2\2\2\u0161\u0162\n\6\2\2\u0162x\3\2\2\2\u0163\u0164\t\6\2\2"+
		"\u0164z\3\2\2\2\u0165\u0166\5}?\2\u0166\u0167\3\2\2\2\u0167\u0168\b>\2"+
		"\2\u0168|\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7\61\2\2\u016b\u016f"+
		"\3\2\2\2\u016c\u016e\5w<\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170~\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\b\2\u0148\u0152\u0158\u015f\u016f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}