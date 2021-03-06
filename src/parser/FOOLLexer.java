// Generated from C:/Users/Gianluca/git/FOOL2017/src/parser\FOOL.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, COLON=2, COMMA=3, EQ=4, ASM=5, PLUS=6, MINUS=7, TIMES=8, DIV=9, 
		TRUE=10, FALSE=11, LPAR=12, RPAR=13, CLPAR=14, CRPAR=15, IF=16, THEN=17, 
		ELSE=18, LET=19, IN=20, VAR=21, FUN=22, INT=23, BOOL=24, CLASS=25, IMPLEMENTS=26, 
		THIS=27, NEW=28, DOT=29, INTEGER=30, ID=31, WS=32, LINECOMENTS=33, BLOCKCOMENTS=34, 
		ERR=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", "DIV", 
		"TRUE", "FALSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", 
		"LET", "IN", "VAR", "FUN", "INT", "BOOL", "CLASS", "IMPLEMENTS", "THIS", 
		"NEW", "DOT", "DIGIT", "INTEGER", "CHAR", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'true'", "'false'", "'('", "')'", "'{'", "'}'", "'if'", "'then'", "'else'", 
		"'let'", "'in'", "'var'", "'fun'", "'int'", "'bool'", "'class'", "'implements'", 
		"'this'", "'new'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "COLON", "COMMA", "EQ", "ASM", "PLUS", "MINUS", "TIMES", 
		"DIV", "TRUE", "FALSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "IF", "THEN", 
		"ELSE", "LET", "IN", "VAR", "FUN", "INT", "BOOL", "CLASS", "IMPLEMENTS", 
		"THIS", "NEW", "DOT", "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
	};
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


	   //there is a much better way to do this, check the ANTLR guide
	   //I will leave it like this for now just becasue it is quick
	   //but it doesn't work well
	   public int lexicalErrors=0;


	public FOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Invalid char: "+ getText()); lexicalErrors++; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00b8\n \r \16 \u00b9"+
		"\3!\3!\3\"\3\"\3\"\7\"\u00c1\n\"\f\"\16\"\u00c4\13\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\7$\u00ce\n$\f$\16$\u00d1\13$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\7%\u00de\n%\f%\16%\u00e1\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\2\2\'\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?"+
		" A\2C!E\"G#I$K%\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,"+
		"\61\61\3\2,,\3\2\61\61\2\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3"+
		"\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25"+
		"`\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2"+
		"!s\3\2\2\2#v\3\2\2\2%{\3\2\2\2\'\u0080\3\2\2\2)\u0084\3\2\2\2+\u0087\3"+
		"\2\2\2-\u008b\3\2\2\2/\u008f\3\2\2\2\61\u0093\3\2\2\2\63\u0098\3\2\2\2"+
		"\65\u009e\3\2\2\2\67\u00a9\3\2\2\29\u00ae\3\2\2\2;\u00b2\3\2\2\2=\u00b4"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00c5\3\2\2\2G"+
		"\u00c9\3\2\2\2I\u00d4\3\2\2\2K\u00e7\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7<"+
		"\2\2P\6\3\2\2\2QR\7.\2\2R\b\3\2\2\2ST\7?\2\2TU\7?\2\2U\n\3\2\2\2VW\7?"+
		"\2\2W\f\3\2\2\2XY\7-\2\2Y\16\3\2\2\2Z[\7/\2\2[\20\3\2\2\2\\]\7,\2\2]\22"+
		"\3\2\2\2^_\7\61\2\2_\24\3\2\2\2`a\7v\2\2ab\7t\2\2bc\7w\2\2cd\7g\2\2d\26"+
		"\3\2\2\2ef\7h\2\2fg\7c\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\30\3\2\2\2kl\7"+
		"*\2\2l\32\3\2\2\2mn\7+\2\2n\34\3\2\2\2op\7}\2\2p\36\3\2\2\2qr\7\177\2"+
		"\2r \3\2\2\2st\7k\2\2tu\7h\2\2u\"\3\2\2\2vw\7v\2\2wx\7j\2\2xy\7g\2\2y"+
		"z\7p\2\2z$\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177&\3\2\2\2"+
		"\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083(\3\2\2"+
		"\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086*\3\2\2\2\u0087\u0088\7"+
		"x\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a,\3\2\2\2\u008b\u008c"+
		"\7h\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e.\3\2\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097"+
		"\62\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7u\2\2\u009d\64\3\2\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7o\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a4\7o\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7u\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7j\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad8\3\2\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7y\2\2\u00b1:\3\2\2\2\u00b2\u00b3"+
		"\7\60\2\2\u00b3<\3\2\2\2\u00b4\u00b5\4\62;\2\u00b5>\3\2\2\2\u00b6\u00b8"+
		"\5=\37\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba@\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bcB\3\2\2\2\u00bd"+
		"\u00c2\5A!\2\u00be\u00c1\5A!\2\u00bf\u00c1\5=\37\2\u00c0\u00be\3\2\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3D\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\b#\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7\61\2\2"+
		"\u00ca\u00cb\7\61\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\n\4\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b$\2\2\u00d3H\3\2\2\2\u00d4"+
		"\u00d5\7\61\2\2\u00d5\u00d6\7,\2\2\u00d6\u00df\3\2\2\2\u00d7\u00de\n\5"+
		"\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00de\n\6\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00de\n\7\2\2\u00dc\u00de\5I%\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2"+
		"\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\7,\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b%"+
		"\2\2\u00e6J\3\2\2\2\u00e7\u00e8\13\2\2\2\u00e8\u00e9\b&\3\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\b&\4\2\u00ebL\3\2\2\2\t\2\u00b9\u00c0\u00c2\u00cf"+
		"\u00dd\u00df\5\b\2\2\3&\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}