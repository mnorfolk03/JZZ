// Generated from C:/Users/KidsComputer/Documents/Intellij Projects/LanguageV2/src/main/resources\Jzz.g4 by ANTLR 4.7.2

package com.mnorfolk.jzz.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JzzParser extends Parser {
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
	public static final int
		RULE_parseFile = 0, RULE_lambda = 1, RULE_lambdaParams = 2, RULE_codeLine = 3, 
		RULE_declareVar = 4, RULE_assignVar = 5, RULE_assignCallable = 6, RULE_declareAndAssign = 7, 
		RULE_parenParams = 8, RULE_bracketParams = 9, RULE_subExpr = 10, RULE_expression = 11, 
		RULE_object = 12, RULE_attribute = 13, RULE_safeAttribute = 14, RULE_arguments = 15, 
		RULE_array = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseFile", "lambda", "lambdaParams", "codeLine", "declareVar", "assignVar", 
			"assignCallable", "declareAndAssign", "parenParams", "bracketParams", 
			"subExpr", "expression", "object", "attribute", "safeAttribute", "arguments", 
			"array", "literal"
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

	@Override
	public String getGrammarFileName() { return "Jzz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JzzParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseFileContext extends ParserRuleContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JzzParser.EOF, 0); }
		public ParseFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterParseFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitParseFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitParseFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseFileContext parseFile() throws RecognitionException {
		ParseFileContext _localctx = new ParseFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			lambda();
			setState(37);
			match(EOF);
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

	public static class LambdaContext extends ParserRuleContext {
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
	 
		public LambdaContext() { }
		public void copyFrom(LambdaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiLambdaContext extends LambdaContext {
		public TerminalNode OPEN_BRACE() { return getToken(JzzParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(JzzParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public List<CodeLineContext> codeLine() {
			return getRuleContexts(CodeLineContext.class);
		}
		public CodeLineContext codeLine(int i) {
			return getRuleContext(CodeLineContext.class,i);
		}
		public LambdaParamsContext lambdaParams() {
			return getRuleContext(LambdaParamsContext.class,0);
		}
		public MultiLambdaContext(LambdaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterMultiLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitMultiLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitMultiLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleLambdaContext extends LambdaContext {
		public TerminalNode OPEN_BRACKET() { return getToken(JzzParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(JzzParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public LambdaParamsContext lambdaParams() {
			return getRuleContext(LambdaParamsContext.class,0);
		}
		public SingleLambdaContext(LambdaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterSingleLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitSingleLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitSingleLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lambda);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new MultiLambdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(39);
					match(OPEN_PAREN);
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(40);
						lambdaParams();
						}
					}

					setState(43);
					match(CLOSE_PAREN);
					}
				}

				setState(46);
				match(OPEN_BRACE);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
					{
					{
					setState(47);
					codeLine();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new SingleLambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(54);
					match(OPEN_PAREN);
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(55);
						lambdaParams();
						}
					}

					setState(58);
					match(CLOSE_PAREN);
					}
				}

				setState(61);
				match(OPEN_BRACKET);
				setState(62);
				expression(0);
				setState(63);
				match(CLOSE_BRACKET);
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

	public static class LambdaParamsContext extends ParserRuleContext {
		public List<DeclareAndAssignContext> declareAndAssign() {
			return getRuleContexts(DeclareAndAssignContext.class);
		}
		public DeclareAndAssignContext declareAndAssign(int i) {
			return getRuleContext(DeclareAndAssignContext.class,i);
		}
		public List<DeclareVarContext> declareVar() {
			return getRuleContexts(DeclareVarContext.class);
		}
		public DeclareVarContext declareVar(int i) {
			return getRuleContext(DeclareVarContext.class,i);
		}
		public List<TerminalNode> ARGUMENT_SEP() { return getTokens(JzzParser.ARGUMENT_SEP); }
		public TerminalNode ARGUMENT_SEP(int i) {
			return getToken(JzzParser.ARGUMENT_SEP, i);
		}
		public LambdaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamsContext lambdaParams() throws RecognitionException {
		LambdaParamsContext _localctx = new LambdaParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lambdaParams);
		int _la;
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						declareVar();
						setState(68);
						match(ARGUMENT_SEP);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						declareAndAssign();
						setState(75);
						match(ARGUMENT_SEP);
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(82);
				declareAndAssign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				declareVar();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARGUMENT_SEP) {
					{
					{
					setState(85);
					match(ARGUMENT_SEP);
					setState(86);
					declareVar();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				declareAndAssign();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARGUMENT_SEP) {
					{
					{
					setState(93);
					match(ARGUMENT_SEP);
					setState(94);
					declareAndAssign();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CodeLineContext extends ParserRuleContext {
		public CodeLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeLine; }
	 
		public CodeLineContext() { }
		public void copyFrom(CodeLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLineContext extends CodeLineContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(JzzParser.END_LINE, 0); }
		public ExprLineContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterExprLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitExprLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitExprLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareLineContext extends CodeLineContext {
		public DeclareVarContext declareVar() {
			return getRuleContext(DeclareVarContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(JzzParser.END_LINE, 0); }
		public DeclareLineContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterDeclareLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitDeclareLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitDeclareLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignCallableLineContext extends CodeLineContext {
		public AssignCallableContext assignCallable() {
			return getRuleContext(AssignCallableContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(JzzParser.END_LINE, 0); }
		public AssignCallableLineContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAssignCallableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAssignCallableLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAssignCallableLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareAndAssignLineContext extends CodeLineContext {
		public DeclareAndAssignContext declareAndAssign() {
			return getRuleContext(DeclareAndAssignContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(JzzParser.END_LINE, 0); }
		public DeclareAndAssignLineContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterDeclareAndAssignLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitDeclareAndAssignLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitDeclareAndAssignLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignLineContext extends CodeLineContext {
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(JzzParser.END_LINE, 0); }
		public AssignLineContext(CodeLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAssignLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAssignLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAssignLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeLineContext codeLine() throws RecognitionException {
		CodeLineContext _localctx = new CodeLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codeLine);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DeclareAndAssignLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				declareAndAssign();
				setState(103);
				match(END_LINE);
				}
				break;
			case 2:
				_localctx = new DeclareLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				declareVar();
				setState(106);
				match(END_LINE);
				}
				break;
			case 3:
				_localctx = new AssignLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				assignVar();
				setState(109);
				match(END_LINE);
				}
				break;
			case 4:
				_localctx = new AssignCallableLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				assignCallable();
				setState(112);
				match(END_LINE);
				}
				break;
			case 5:
				_localctx = new ExprLineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				expression(0);
				setState(115);
				match(END_LINE);
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

	public static class DeclareVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JzzParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JzzParser.ID, i);
		}
		public DeclareVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterDeclareVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitDeclareVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitDeclareVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVarContext declareVar() throws RecognitionException {
		DeclareVarContext _localctx = new DeclareVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(ID);
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

	public static class AssignVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JzzParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JzzParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			match(ASSIGN);
			setState(124);
			expression(0);
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

	public static class AssignCallableContext extends ParserRuleContext {
		public AssignCallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignCallable; }
	 
		public AssignCallableContext() { }
		public void copyFrom(AssignCallableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignParenContext extends AssignCallableContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(JzzParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AssignParenContext(AssignCallableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAssignParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAssignParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAssignParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignBracketContext extends AssignCallableContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(JzzParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(JzzParser.CLOSE_BRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(JzzParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AssignBracketContext(AssignCallableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAssignBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAssignBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAssignBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignCallableContext assignCallable() throws RecognitionException {
		AssignCallableContext _localctx = new AssignCallableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignCallable);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				object(0);
				setState(127);
				match(OPEN_PAREN);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
					{
					setState(128);
					arguments();
					}
				}

				setState(131);
				match(CLOSE_PAREN);
				setState(132);
				match(ASSIGN);
				setState(133);
				expression(0);
				}
				break;
			case 2:
				_localctx = new AssignBracketContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				object(0);
				setState(136);
				match(OPEN_BRACKET);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
					{
					setState(137);
					arguments();
					}
				}

				setState(140);
				match(CLOSE_BRACKET);
				setState(141);
				match(ASSIGN);
				setState(142);
				expression(0);
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

	public static class DeclareAndAssignContext extends ParserRuleContext {
		public DeclareVarContext declareVar() {
			return getRuleContext(DeclareVarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JzzParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareAndAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAndAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterDeclareAndAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitDeclareAndAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitDeclareAndAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareAndAssignContext declareAndAssign() throws RecognitionException {
		DeclareAndAssignContext _localctx = new DeclareAndAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareAndAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			declareVar();
			setState(147);
			match(ASSIGN);
			setState(148);
			expression(0);
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

	public static class ParenParamsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ParenParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterParenParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitParenParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitParenParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenParamsContext parenParams() throws RecognitionException {
		ParenParamsContext _localctx = new ParenParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parenParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(OPEN_PAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
				{
				setState(151);
				arguments();
				}
			}

			setState(154);
			match(CLOSE_PAREN);
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

	public static class BracketParamsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(JzzParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(JzzParser.CLOSE_BRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BracketParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterBracketParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitBracketParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitBracketParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketParamsContext bracketParams() throws RecognitionException {
		BracketParamsContext _localctx = new BracketParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bracketParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(OPEN_BRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
				{
				setState(157);
				arguments();
				}
			}

			setState(160);
			match(CLOSE_BRACKET);
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

	public static class SubExprContext extends ParserRuleContext {
		public SubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpr; }
	 
		public SubExprContext() { }
		public void copyFrom(SubExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreNegateContext extends SubExprContext {
		public TerminalNode MINUS() { return getToken(JzzParser.MINUS, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreNegateContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecrementContext extends SubExprContext {
		public TerminalNode DECREMENT() { return getToken(JzzParser.DECREMENT, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreDecrementContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiDivOpContext extends SubExprContext {
		public Token op;
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(JzzParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(JzzParser.DIV, 0); }
		public TerminalNode FLOOR_DIV() { return getToken(JzzParser.FLOOR_DIV, 0); }
		public TerminalNode MOD() { return getToken(JzzParser.MOD, 0); }
		public TerminalNode DIV_MOD() { return getToken(JzzParser.DIV_MOD, 0); }
		public MultiDivOpContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterMultiDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitMultiDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitMultiDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectExprContext extends SubExprContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectExprContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreNotContext extends SubExprContext {
		public TerminalNode NOT() { return getToken(JzzParser.NOT, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreNotContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowOpContext extends SubExprContext {
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(JzzParser.POW, 0); }
		public PowOpContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPowOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPowOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPowOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreAmpersandContext extends SubExprContext {
		public TerminalNode AMPERSAND() { return getToken(JzzParser.AMPERSAND, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreAmpersandContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreAmpersand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreAmpersand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreAmpersand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreStarContext extends SubExprContext {
		public TerminalNode MULTI() { return getToken(JzzParser.MULTI, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreStarContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementContext extends SubExprContext {
		public TerminalNode INCREMENT() { return getToken(JzzParser.INCREMENT, 0); }
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public PreIncrementContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusOpContext extends SubExprContext {
		public Token op;
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JzzParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JzzParser.MINUS, 0); }
		public PlusMinusOpContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterPlusMinusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitPlusMinusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitPlusMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftOpContext extends SubExprContext {
		public Token op;
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TerminalNode SHIFT_L() { return getToken(JzzParser.SHIFT_L, 0); }
		public TerminalNode SHIFT_R() { return getToken(JzzParser.SHIFT_R, 0); }
		public ShiftOpContext(SubExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitShiftOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExprContext subExpr() throws RecognitionException {
		return subExpr(0);
	}

	private SubExprContext subExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubExprContext _localctx = new SubExprContext(_ctx, _parentState);
		SubExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_subExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case ID:
			case INT:
			case HEX_INT:
			case BINARY_INT:
			case FLOAT:
			case STRING:
			case OPEN_BRACE:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case BAR:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(163);
				object(0);
				}
				break;
			case INCREMENT:
				{
				_localctx = new PreIncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(INCREMENT);
				setState(165);
				subExpr(10);
				}
				break;
			case DECREMENT:
				{
				_localctx = new PreDecrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(DECREMENT);
				setState(167);
				subExpr(9);
				}
				break;
			case NOT:
				{
				_localctx = new PreNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(NOT);
				setState(169);
				subExpr(8);
				}
				break;
			case AMPERSAND:
				{
				_localctx = new PreAmpersandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(AMPERSAND);
				setState(171);
				subExpr(7);
				}
				break;
			case MULTI:
				{
				_localctx = new PreStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(MULTI);
				setState(173);
				subExpr(6);
				}
				break;
			case MINUS:
				{
				_localctx = new PreNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(MINUS);
				setState(175);
				subExpr(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PowOpContext(new SubExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_subExpr);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(POW);
						setState(180);
						subExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new MultiDivOpContext(new SubExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_subExpr);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						((MultiDivOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIV) | (1L << FLOOR_DIV) | (1L << MOD) | (1L << DIV_MOD))) != 0)) ) {
							((MultiDivOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						subExpr(4);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusOpContext(new SubExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_subExpr);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						((PlusMinusOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						subExpr(3);
						}
						break;
					case 4:
						{
						_localctx = new ShiftOpContext(new SubExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_subExpr);
						setState(187);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(188);
						((ShiftOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_L || _la==SHIFT_R) ) {
							((ShiftOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						subExpr(2);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiCompExprContext extends ExpressionContext {
		public Token op;
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(JzzParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JzzParser.EQ, i);
		}
		public List<TerminalNode> GT() { return getTokens(JzzParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JzzParser.GT, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(JzzParser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(JzzParser.GTEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(JzzParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JzzParser.LT, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(JzzParser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(JzzParser.LTEQ, i);
		}
		public MultiCompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterMultiCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitMultiCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitMultiCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindExprContext extends ExpressionContext {
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public FindExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterFindExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitFindExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitFindExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExpressionContext {
		public Token op;
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(JzzParser.NEQ, 0); }
		public TerminalNode INT_COMPARE() { return getToken(JzzParser.INT_COMPARE, 0); }
		public CompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(JzzParser.AND, 0); }
		public TerminalNode OR() { return getToken(JzzParser.OR, 0); }
		public TerminalNode XOR() { return getToken(JzzParser.XOR, 0); }
		public LogicalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new FindExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				subExpr(0);
				}
				break;
			case 2:
				{
				_localctx = new MultiCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				subExpr(0);
				setState(200); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(198);
						((MultiCompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ) | (1L << EQ))) != 0)) ) {
							((MultiCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						subExpr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(202); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				_localctx = new CompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				subExpr(0);
				setState(205);
				((CompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEQ || _la==INT_COMPARE) ) {
					((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				subExpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(211);
					((LogicalExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << XOR))) != 0)) ) {
						((LogicalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(212);
					expression(2);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjLambdaContext extends ObjectContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ObjLambdaContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjAttributeContext extends ObjectContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ObjAttributeContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjArrayContext extends ObjectContext {
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public ObjArrayContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjLiteralContext extends ObjectContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjLiteralContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjSafeAttributeContext extends ObjectContext {
		public TerminalNode ID() { return getToken(JzzParser.ID, 0); }
		public SafeAttributeContext safeAttribute() {
			return getRuleContext(SafeAttributeContext.class,0);
		}
		public ObjSafeAttributeContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjSafeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjSafeAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjSafeAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjIdContext extends ObjectContext {
		public TerminalNode ID() { return getToken(JzzParser.ID, 0); }
		public ObjIdContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BarExprContext extends ObjectContext {
		public List<TerminalNode> BAR() { return getTokens(JzzParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(JzzParser.BAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BarExprContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterBarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitBarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitBarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjBracketCallContext extends ObjectContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public BracketParamsContext bracketParams() {
			return getRuleContext(BracketParamsContext.class,0);
		}
		public ObjBracketCallContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjBracketCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjBracketCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjBracketCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ObjectContext {
		public TerminalNode OPEN_PAREN() { return getToken(JzzParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(JzzParser.CLOSE_PAREN, 0); }
		public ParenExprContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjParenCallContext extends ObjectContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ParenParamsContext parenParams() {
			return getRuleContext(ParenParamsContext.class,0);
		}
		public ObjParenCallContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterObjParenCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitObjParenCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitObjParenCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		return object(0);
	}

	private ObjectContext object(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectContext _localctx = new ObjectContext(_ctx, _parentState);
		ObjectContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_object, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ObjSafeAttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				match(ID);
				setState(220);
				safeAttribute();
				}
				break;
			case 2:
				{
				_localctx = new ObjIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ObjLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new ObjLambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				lambda();
				}
				break;
			case 5:
				{
				_localctx = new ObjArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(OPEN_PAREN);
				setState(225);
				array();
				setState(226);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(OPEN_PAREN);
				setState(229);
				expression(0);
				setState(230);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new BarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(BAR);
				setState(233);
				expression(0);
				setState(234);
				match(BAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ObjAttributeContext(new ObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_object);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						attribute();
						}
						break;
					case 2:
						{
						_localctx = new ObjParenCallContext(new ObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_object);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						parenParams();
						}
						break;
					case 3:
						{
						_localctx = new ObjBracketCallContext(new ObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_object);
						setState(242);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(243);
						bracketParams();
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(JzzParser.ACCESS, 0); }
		public TerminalNode ID() { return getToken(JzzParser.ID, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ACCESS);
			setState(250);
			match(ID);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(251);
				attribute();
				}
				break;
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

	public static class SafeAttributeContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(JzzParser.ACCESS, 0); }
		public TerminalNode ID() { return getToken(JzzParser.ID, 0); }
		public SafeAttributeContext safeAttribute() {
			return getRuleContext(SafeAttributeContext.class,0);
		}
		public SafeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterSafeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitSafeAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitSafeAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeAttributeContext safeAttribute() throws RecognitionException {
		SafeAttributeContext _localctx = new SafeAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_safeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ACCESS);
			setState(255);
			match(ID);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(256);
				safeAttribute();
				}
				break;
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiArgsContext extends ArgumentsContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MultiArgsContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterMultiArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitMultiArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitMultiArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleArgContext extends ArgumentsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleArgContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitSingleArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitSingleArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new MultiArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				array();
				}
				break;
			case 2:
				_localctx = new SingleArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				expression(0);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ARGUMENT_SEP() { return getTokens(JzzParser.ARGUMENT_SEP); }
		public TerminalNode ARGUMENT_SEP(int i) {
			return getToken(JzzParser.ARGUMENT_SEP, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(263);
					expression(0);
					setState(264);
					match(ARGUMENT_SEP);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << HEX_INT) | (1L << BINARY_INT) | (1L << FLOAT) | (1L << STRING) | (1L << OPEN_BRACE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << BAR) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MINUS) | (1L << MULTI) | (1L << NOT) | (1L << AMPERSAND))) != 0)) {
				{
				setState(270);
				expression(0);
				}
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(JzzParser.STRING, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends LiteralContext {
		public TerminalNode BINARY_INT() { return getToken(JzzParser.BINARY_INT, 0); }
		public BinaryContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(JzzParser.TRUE, 0); }
		public TrueContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends LiteralContext {
		public TerminalNode FALSE() { return getToken(JzzParser.FALSE, 0); }
		public FalseContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends LiteralContext {
		public TerminalNode HEX_INT() { return getToken(JzzParser.HEX_INT, 0); }
		public HexContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends LiteralContext {
		public TerminalNode FLOAT() { return getToken(JzzParser.FLOAT, 0); }
		public FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends LiteralContext {
		public TerminalNode INT() { return getToken(JzzParser.INT, 0); }
		public IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JzzListener ) ((JzzListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JzzVisitor ) return ((JzzVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_INT:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(HEX_INT);
				}
				break;
			case BINARY_INT:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(BINARY_INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(FLOAT);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				match(FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return subExpr_sempred((SubExprContext)_localctx, predIndex);
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
			return object_sempred((ObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean subExpr_sempred(SubExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean object_sempred(ObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u011d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\5\3,\n\3\3\3\5\3/\n\3\3\3\3\3\7\3\63\n"+
		"\3\f\3\16\3\66\13\3\3\3\3\3\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3"+
		"\5\3D\n\3\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\3\4\7\4P\n\4\f\4\16\4"+
		"S\13\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\7\4b\n"+
		"\4\f\4\16\4e\13\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\u0084\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0093\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u009b\n\n\3\n\3\n\3\13\3\13\5"+
		"\13\u00a1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\3\r\3\r\3\r\3\r\3\r\6\r\u00cb\n\r"+
		"\r\r\16\r\u00cc\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3\r\3\r\3\r\7\r\u00d8\n"+
		"\r\f\r\16\r\u00db\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16\3\17\3\17"+
		"\3\17\5\17\u00ff\n\17\3\20\3\20\3\20\5\20\u0104\n\20\3\21\3\21\5\21\u0108"+
		"\n\21\3\22\3\22\3\22\6\22\u010d\n\22\r\22\16\22\u010e\3\22\5\22\u0112"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011b\n\23\3\23\2\5\26\30"+
		"\32\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\3\2\36\"\3\2\34"+
		"\35\3\2/\60\3\2$(\3\2)*\3\2,.\2\u0141\2&\3\2\2\2\4C\3\2\2\2\6f\3\2\2\2"+
		"\bw\3\2\2\2\ny\3\2\2\2\f|\3\2\2\2\16\u0092\3\2\2\2\20\u0094\3\2\2\2\22"+
		"\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00b2\3\2\2\2\30\u00d2\3\2\2\2\32\u00ee"+
		"\3\2\2\2\34\u00fb\3\2\2\2\36\u0100\3\2\2\2 \u0107\3\2\2\2\"\u010c\3\2"+
		"\2\2$\u011a\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)+\7\25\2\2*,\5\6"+
		"\4\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\26\2\2.)\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\64\7\23\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67D\7\24\2\28:\7\25"+
		"\2\29;\5\6\4\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\26\2\2=8\3\2\2\2=>\3"+
		"\2\2\2>?\3\2\2\2?@\7\27\2\2@A\5\30\r\2AB\7\30\2\2BD\3\2\2\2C.\3\2\2\2"+
		"C=\3\2\2\2D\5\3\2\2\2EF\5\n\6\2FG\7\7\2\2GI\3\2\2\2HE\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KQ\3\2\2\2LM\5\20\t\2MN\7\7\2\2NP\3\2\2\2OL\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\20\t\2Ug\3"+
		"\2\2\2V[\5\n\6\2WX\7\7\2\2XZ\5\n\6\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\g\3\2\2\2][\3\2\2\2^c\5\20\t\2_`\7\7\2\2`b\5\20\t\2a_\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fH\3\2\2\2fV\3\2\2"+
		"\2f^\3\2\2\2g\7\3\2\2\2hi\5\20\t\2ij\7\6\2\2jx\3\2\2\2kl\5\n\6\2lm\7\6"+
		"\2\2mx\3\2\2\2no\5\f\7\2op\7\6\2\2px\3\2\2\2qr\5\16\b\2rs\7\6\2\2sx\3"+
		"\2\2\2tu\5\30\r\2uv\7\6\2\2vx\3\2\2\2wh\3\2\2\2wk\3\2\2\2wn\3\2\2\2wq"+
		"\3\2\2\2wt\3\2\2\2x\t\3\2\2\2yz\7\n\2\2z{\7\n\2\2{\13\3\2\2\2|}\7\n\2"+
		"\2}~\7\5\2\2~\177\5\30\r\2\177\r\3\2\2\2\u0080\u0081\5\32\16\2\u0081\u0083"+
		"\7\25\2\2\u0082\u0084\5 \21\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\7\26\2\2\u0086\u0087\7\5\2\2\u0087\u0088"+
		"\5\30\r\2\u0088\u0093\3\2\2\2\u0089\u008a\5\32\16\2\u008a\u008c\7\27\2"+
		"\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7\30\2\2\u008f\u0090\7\5\2\2\u0090\u0091\5\30\r\2"+
		"\u0091\u0093\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0089\3\2\2\2\u0093\17"+
		"\3\2\2\2\u0094\u0095\5\n\6\2\u0095\u0096\7\5\2\2\u0096\u0097\5\30\r\2"+
		"\u0097\21\3\2\2\2\u0098\u009a\7\25\2\2\u0099\u009b\5 \21\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\26\2\2"+
		"\u009d\23\3\2\2\2\u009e\u00a0\7\27\2\2\u009f\u00a1\5 \21\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\30\2\2"+
		"\u00a3\25\3\2\2\2\u00a4\u00a5\b\f\1\2\u00a5\u00b3\5\32\16\2\u00a6\u00a7"+
		"\7\32\2\2\u00a7\u00b3\5\26\f\f\u00a8\u00a9\7\33\2\2\u00a9\u00b3\5\26\f"+
		"\13\u00aa\u00ab\7+\2\2\u00ab\u00b3\5\26\f\n\u00ac\u00ad\7\61\2\2\u00ad"+
		"\u00b3\5\26\f\t\u00ae\u00af\7\36\2\2\u00af\u00b3\5\26\f\b\u00b0\u00b1"+
		"\7\35\2\2\u00b1\u00b3\5\26\f\7\u00b2\u00a4\3\2\2\2\u00b2\u00a6\3\2\2\2"+
		"\u00b2\u00a8\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00b5\f\6\2\2\u00b5"+
		"\u00b6\7#\2\2\u00b6\u00c1\5\26\f\6\u00b7\u00b8\f\5\2\2\u00b8\u00b9\t\2"+
		"\2\2\u00b9\u00c1\5\26\f\6\u00ba\u00bb\f\4\2\2\u00bb\u00bc\t\3\2\2\u00bc"+
		"\u00c1\5\26\f\5\u00bd\u00be\f\3\2\2\u00be\u00bf\t\4\2\2\u00bf\u00c1\5"+
		"\26\f\4\u00c0\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0"+
		"\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\27\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\b\r\1\2\u00c6\u00d3"+
		"\5\26\f\2\u00c7\u00ca\5\26\f\2\u00c8\u00c9\t\5\2\2\u00c9\u00cb\5\26\f"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\t\6\2\2"+
		"\u00d0\u00d1\5\26\f\2\u00d1\u00d3\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00c7"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\f\3\2\2\u00d5"+
		"\u00d6\t\7\2\2\u00d6\u00d8\5\30\r\4\u00d7\u00d4\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\31\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\b\16\1\2\u00dd\u00de\7\n\2\2\u00de\u00ef\5"+
		"\36\20\2\u00df\u00ef\7\n\2\2\u00e0\u00ef\5$\23\2\u00e1\u00ef\5\4\3\2\u00e2"+
		"\u00e3\7\25\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\26\2\2\u00e5\u00ef"+
		"\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\7\26\2"+
		"\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\7\31\2\2\u00eb\u00ec\5\30\r\2\u00ec"+
		"\u00ed\7\31\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00dc\3\2\2\2\u00ee\u00df\3"+
		"\2\2\2\u00ee\u00e0\3\2\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee"+
		"\u00e6\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\f\5"+
		"\2\2\u00f1\u00f7\5\34\17\2\u00f2\u00f3\f\4\2\2\u00f3\u00f7\5\22\n\2\u00f4"+
		"\u00f5\f\3\2\2\u00f5\u00f7\5\24\13\2\u00f6\u00f0\3\2\2\2\u00f6\u00f2\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\33\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\3\2"+
		"\2\u00fc\u00fe\7\n\2\2\u00fd\u00ff\5\34\17\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\35\3\2\2\2\u0100\u0101\7\3\2\2\u0101\u0103\7\n\2"+
		"\2\u0102\u0104\5\36\20\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\37\3\2\2\2\u0105\u0108\5\"\22\2\u0106\u0108\5\30\r\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108!\3\2\2\2\u0109\u010a\5\30\r\2\u010a\u010b"+
		"\7\7\2\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0112\5\30"+
		"\r\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112#\3\2\2\2\u0113\u011b"+
		"\7\f\2\2\u0114\u011b\7\r\2\2\u0115\u011b\7\16\2\2\u0116\u011b\7\13\2\2"+
		"\u0117\u011b\7\17\2\2\u0118\u011b\7\b\2\2\u0119\u011b\7\t\2\2\u011a\u0113"+
		"\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b%\3\2\2\2"+
		"\"+.\64:=CJQ[cfw\u0083\u008c\u0092\u009a\u00a0\u00b2\u00c0\u00c2\u00cc"+
		"\u00d2\u00d9\u00ee\u00f6\u00f8\u00fe\u0103\u0107\u010e\u0111\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}