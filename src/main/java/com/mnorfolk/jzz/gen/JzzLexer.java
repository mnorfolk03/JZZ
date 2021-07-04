// Generated from C:/Users/KidsComputer/Documents/Intellij Projects/LanguageV2/src/main/resources\Jzz.g4 by ANTLR 4.7.2

package com.mnorfolk.jzz.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JzzLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ACCESS=1, COLON=2, ASSIGN=3, END_LINE=4, ARGUMENT_SEP=5, TRUE=6, FALSE=7, 
		ID=8, INT=9, HEX_INT=10, BINARY_INT=11, FLOAT=12, STRING=13, COMMENT=14, 
		BLOCK_COMMENT=15, WHITESPACE=16, OPEN_BRACE=17, CLOSE_BRACE=18, OPEN_PAREN=19, 
		CLOSE_PAREN=20, OPEN_BRACKET=21, CLOSE_BRACKET=22, BAR=23, INCREMENT=24, 
		DECREMENT=25, PLUS=26, MINUS=27, MULTI=28, DIV=29, FLOOR_DIV=30, MOD=31, 
		DIV_MOD=32, POW=33, LT=34, GT=35, LTEQ=36, GTEQ=37, EQ=38, NEQ=39, INT_COMPARE=40, 
		NOT=41, OR=42, AND=43, XOR=44, SHIFT_L=45, SHIFT_R=46, AMPERSAND=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ACCESS", "COLON", "ASSIGN", "END_LINE", "ARGUMENT_SEP", "TRUE", "FALSE", 
			"ID", "INT", "HEX_INT", "BINARY_INT", "FLOAT", "STRING", "COMMENT", "BLOCK_COMMENT", 
			"WHITESPACE", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "BAR", "INCREMENT", "DECREMENT", "PLUS", 
			"MINUS", "MULTI", "DIV", "FLOOR_DIV", "MOD", "DIV_MOD", "POW", "LT", 
			"GT", "LTEQ", "GTEQ", "EQ", "NEQ", "INT_COMPARE", "NOT", "OR", "AND", 
			"XOR", "SHIFT_L", "SHIFT_R", "AMPERSAND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "':'", "'='", "';'", "','", "'TRUE'", "'FALSE'", null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'|'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'//'", 
			"'%'", "'/%'", "'^'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'<=>'", 
			null, "'||'", "'&&'", null, "'<<'", "'>>'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ACCESS", "COLON", "ASSIGN", "END_LINE", "ARGUMENT_SEP", "TRUE", 
			"FALSE", "ID", "INT", "HEX_INT", "BINARY_INT", "FLOAT", "STRING", "COMMENT", 
			"BLOCK_COMMENT", "WHITESPACE", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "BAR", "INCREMENT", "DECREMENT", 
			"PLUS", "MINUS", "MULTI", "DIV", "FLOOR_DIV", "MOD", "DIV_MOD", "POW", 
			"LT", "GT", "LTEQ", "GTEQ", "EQ", "NEQ", "INT_COMPARE", "NOT", "OR", 
			"AND", "XOR", "SHIFT_L", "SHIFT_R", "AMPERSAND"
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


	public JzzLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jzz.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\ty\n\t\f"+
		"\t\16\t|\13\t\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0089\n\13\3\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090\13\13"+
		"\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13"+
		"\f\3\r\5\r\u00a0\n\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\5\r\u00aa\n"+
		"\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16"+
		"\16\16\u00b8\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16"+
		"\u00c2\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c9\n\16\f\16\16\16\u00cc"+
		"\13\16\3\16\5\16\u00cf\n\16\3\17\3\17\7\17\u00d3\n\17\f\17\16\17\u00d6"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00df\n\20\f\20\16\20\u00e2"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\5-\u0134\n-\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\u00e0\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61\3\2\20\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\62;aa\5\2\62;C"+
		"Hch\6\2\62;CHaach\3\2\62\63\4\2\62\63aa\5\2\f\f\17\17$$\5\2\f\f\17\17"+
		"))\3\2bb\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2##\u0080\u0080\2\u0152\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2"+
		"\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17p\3\2\2"+
		"\2\21v\3\2\2\2\23}\3\2\2\2\25\u0088\3\2\2\2\27\u0095\3\2\2\2\31\u00ae"+
		"\3\2\2\2\33\u00ce\3\2\2\2\35\u00d0\3\2\2\2\37\u00d9\3\2\2\2!\u00e9\3\2"+
		"\2\2#\u00ed\3\2\2\2%\u00ef\3\2\2\2\'\u00f1\3\2\2\2)\u00f3\3\2\2\2+\u00f5"+
		"\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61\u00fb\3\2\2\2\63\u00fe\3\2\2"+
		"\2\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0105\3\2\2\2;\u0107\3\2\2\2=\u0109"+
		"\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C\u0111\3\2\2\2E\u0113\3\2\2\2G"+
		"\u0115\3\2\2\2I\u0117\3\2\2\2K\u011a\3\2\2\2M\u011d\3\2\2\2O\u0120\3\2"+
		"\2\2Q\u0123\3\2\2\2S\u0127\3\2\2\2U\u0129\3\2\2\2W\u012c\3\2\2\2Y\u0133"+
		"\3\2\2\2[\u0135\3\2\2\2]\u0138\3\2\2\2_\u013b\3\2\2\2ab\7\60\2\2b\4\3"+
		"\2\2\2cd\7<\2\2d\6\3\2\2\2ef\7?\2\2f\b\3\2\2\2gh\7=\2\2h\n\3\2\2\2ij\7"+
		".\2\2j\f\3\2\2\2kl\7V\2\2lm\7T\2\2mn\7W\2\2no\7G\2\2o\16\3\2\2\2pq\7H"+
		"\2\2qr\7C\2\2rs\7N\2\2st\7U\2\2tu\7G\2\2u\20\3\2\2\2vz\t\2\2\2wy\t\3\2"+
		"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\22\3\2\2\2|z\3\2\2\2}\u0081"+
		"\t\4\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\24\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7\62\2\2\u0085\u0089\7z\2\2\u0086\u0087\7\62\2\2\u0087\u0089\7Z\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\t\6"+
		"\2\2\u008b\u008d\t\7\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\26\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\7\62\2\2\u0092\u0096\7d\2\2\u0093\u0094\7\62\2\2\u0094"+
		"\u0096\7D\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009b\t\b\2\2\u0098\u009a\t\t\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\30\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\23\n\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a4\5"+
		"\23\n\2\u00a3\u00a5\7h\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00af\3\2\2\2\u00a6\u00a7\5\23\n\2\u00a7\u00a9\7\60\2\2\u00a8\u00aa\7"+
		"h\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab"+
		"\u00ac\5\23\n\2\u00ac\u00ad\7h\2\2\u00ad\u00af\3\2\2\2\u00ae\u009f\3\2"+
		"\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\32\3\2\2\2\u00b0\u00b6"+
		"\7$\2\2\u00b1\u00b5\n\n\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b5\7$\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00cf\7$\2\2\u00ba\u00c0\7)\2\2\u00bb\u00bf\n\13\2\2\u00bc\u00bd\7^\2"+
		"\2\u00bd\u00bf\7)\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00cf\7)\2\2\u00c4\u00ca\7b\2\2\u00c5\u00c9\n\f\2"+
		"\2\u00c6\u00c7\7^\2\2\u00c7\u00c9\7b\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7b\2\2\u00ce\u00b0\3\2"+
		"\2\2\u00ce\u00ba\3\2\2\2\u00ce\u00c4\3\2\2\2\u00cf\34\3\2\2\2\u00d0\u00d4"+
		"\7%\2\2\u00d1\u00d3\n\r\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\b\17\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7%\2\2\u00da\u00db"+
		"\7/\2\2\u00db\u00dc\7/\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\13\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4"+
		"\u00e5\7/\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\20"+
		"\2\2\u00e8 \3\2\2\2\u00e9\u00ea\t\16\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\b\21\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7}\2\2\u00ee$\3\2\2\2\u00ef\u00f0"+
		"\7\177\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7+\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7]\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7"+
		"_\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa\60\3\2\2\2\u00fb\u00fc\7"+
		"-\2\2\u00fc\u00fd\7-\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100"+
		"\7/\2\2\u0100\64\3\2\2\2\u0101\u0102\7-\2\2\u0102\66\3\2\2\2\u0103\u0104"+
		"\7/\2\2\u01048\3\2\2\2\u0105\u0106\7,\2\2\u0106:\3\2\2\2\u0107\u0108\7"+
		"\61\2\2\u0108<\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b\7\61\2\2\u010b"+
		">\3\2\2\2\u010c\u010d\7\'\2\2\u010d@\3\2\2\2\u010e\u010f\7\61\2\2\u010f"+
		"\u0110\7\'\2\2\u0110B\3\2\2\2\u0111\u0112\7`\2\2\u0112D\3\2\2\2\u0113"+
		"\u0114\7>\2\2\u0114F\3\2\2\2\u0115\u0116\7@\2\2\u0116H\3\2\2\2\u0117\u0118"+
		"\7>\2\2\u0118\u0119\7?\2\2\u0119J\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c"+
		"\7?\2\2\u011cL\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fN\3"+
		"\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\7?\2\2\u0122P\3\2\2\2\u0123\u0124"+
		"\7>\2\2\u0124\u0125\7?\2\2\u0125\u0126\7@\2\2\u0126R\3\2\2\2\u0127\u0128"+
		"\t\17\2\2\u0128T\3\2\2\2\u0129\u012a\7~\2\2\u012a\u012b\7~\2\2\u012bV"+
		"\3\2\2\2\u012c\u012d\7(\2\2\u012d\u012e\7(\2\2\u012eX\3\2\2\2\u012f\u0130"+
		"\7(\2\2\u0130\u0134\7~\2\2\u0131\u0132\7~\2\2\u0132\u0134\7(\2\2\u0133"+
		"\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0134Z\3\2\2\2\u0135\u0136\7>\2\2\u0136"+
		"\u0137\7>\2\2\u0137\\\3\2\2\2\u0138\u0139\7@\2\2\u0139\u013a\7@\2\2\u013a"+
		"^\3\2\2\2\u013b\u013c\7(\2\2\u013c`\3\2\2\2\27\2z\u0081\u0088\u008e\u0095"+
		"\u009b\u009f\u00a4\u00a9\u00ae\u00b4\u00b6\u00be\u00c0\u00c8\u00ca\u00ce"+
		"\u00d4\u00e0\u0133\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}