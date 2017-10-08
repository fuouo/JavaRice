// Generated from JavaRice.g4 by ANTLR 4.4
package model.javarice;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaRiceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, BOOLEAN=8, BREAK=9, 
		CASE=10, CATCH=11, CHAR=12, CLASS=13, CONST=14, CONTINUE=15, DEFAULT=16, 
		DO=17, DOUBLE=18, ELSE=19, EXTENDS=20, FINAL=21, FINALLY=22, FLOAT=23, 
		FOR=24, IF=25, GOTO=26, IMPLEMENTS=27, IMPORT=28, INSTANCEOF=29, INT=30, 
		INTERFACE=31, LONG=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, PUBLIC=37, 
		READ=38, RETURN=39, SHORT=40, STATIC=41, STRING=42, SUPER=43, SWITCH=44, 
		SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, TRY=49, VOID=50, WHILE=51, 
		WRITE=52, IntegerLiteral=53, FloatingPointLiteral=54, BooleanLiteral=55, 
		CharacterLiteral=56, StringLiteral=57, NullLiteral=58, LPAREN=59, RPAREN=60, 
		LBRACE=61, RBRACE=62, LBRACK=63, RBRACK=64, SEMI=65, COMMA=66, DOT=67, 
		ASSIGN=68, GT=69, LT=70, BANG=71, TILDE=72, QUESTION=73, COLON=74, EQUAL=75, 
		LE=76, GE=77, NOTEQUAL=78, AND=79, OR=80, INC=81, DEC=82, ADD=83, SUB=84, 
		MUL=85, DIV=86, BITAND=87, BITOR=88, CARET=89, MOD=90, ADD_ASSIGN=91, 
		SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, OR_ASSIGN=96, 
		XOR_ASSIGN=97, MOD_ASSIGN=98, Identifier=99, WS=100, COMMENT=101, LINE_COMMENT=102;
	public static final String[] tokenNames = {
		"<INVALID>", "'void'", "'<<='", "'abstract'", "'>>>='", "'_byte'", "'>>='", 
		"'...'", "'_boolean'", "'break'", "'case'", "'catch'", "'_char'", "'class'", 
		"'const'", "'continue'", "'default'", "'do'", "'_double'", "'else'", "'extends'", 
		"'final'", "'finally'", "'_float'", "'for'", "'if'", "'goto'", "'implements'", 
		"'import'", "'instanceof'", "'_int'", "'interface'", "'_long'", "'new'", 
		"'package'", "'private'", "'protected'", "'public'", "'read'", "'return'", 
		"'_short'", "'static'", "'_String'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'throw'", "'throws'", "'try'", "'_void'", "'while'", "'write'", 
		"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classOrInterfaceModifier = 3, RULE_variableModifier = 4, RULE_classDeclaration = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeList = 8, RULE_classBody = 9, 
		RULE_classBodyDeclaration = 10, RULE_memberDeclaration = 11, RULE_methodDeclaration = 12, 
		RULE_variableDeclaration = 13, RULE_constDeclaration = 14, RULE_constantDeclarator = 15, 
		RULE_variableDeclarators = 16, RULE_variableDeclarator = 17, RULE_variableDeclaratorId = 18, 
		RULE_variableInitializer = 19, RULE_arrayInitializer = 20, RULE_typeType = 21, 
		RULE_classOrInterfaceType = 22, RULE_primitiveType = 23, RULE_typeArguments = 24, 
		RULE_typeArgument = 25, RULE_qualifiedNameList = 26, RULE_formalParameters = 27, 
		RULE_formalParameterList = 28, RULE_formalParameter = 29, RULE_lastFormalParameter = 30, 
		RULE_methodBody = 31, RULE_qualifiedName = 32, RULE_literal = 33, RULE_block = 34, 
		RULE_blockStatement = 35, RULE_localVariableDeclarationStatement = 36, 
		RULE_localVariableDeclaration = 37, RULE_statement = 38, RULE_catchClause = 39, 
		RULE_catchType = 40, RULE_finallyBlock = 41, RULE_resourceSpecification = 42, 
		RULE_resources = 43, RULE_resource = 44, RULE_switchBlockStatementGroup = 45, 
		RULE_switchLabel = 46, RULE_forControl = 47, RULE_forInit = 48, RULE_enhancedForControl = 49, 
		RULE_forUpdate = 50, RULE_parExpression = 51, RULE_expressionList = 52, 
		RULE_statementExpression = 53, RULE_constantExpression = 54, RULE_expression = 55, 
		RULE_primary = 56, RULE_creator = 57, RULE_createdName = 58, RULE_innerCreator = 59, 
		RULE_nonWildcardTypeArguments = 60, RULE_typeArgumentsOrDiamond = 61, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 62, RULE_arrayCreatorRest = 63, 
		RULE_classCreatorRest = 64, RULE_arguments = 65, RULE_scan = 66, RULE_print = 67;
	public static final String[] ruleNames = {
		"program", "packageDeclaration", "importDeclaration", "classOrInterfaceModifier", 
		"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
		"typeList", "classBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "variableDeclaration", "constDeclaration", "constantDeclarator", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "typeType", "classOrInterfaceType", "primitiveType", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"qualifiedName", "literal", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "arrayCreatorRest", 
		"classCreatorRest", "arguments", "scan", "print"
	};

	@Override
	public String getGrammarFileName() { return "JavaRice.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaRiceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaRiceParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(136); packageDeclaration();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(139); importDeclaration();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(145); classDeclaration();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(PACKAGE);
			setState(154); qualifiedName();
			setState(155); match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(IMPORT);
			setState(159);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(158); match(STATIC);
				}
			}

			setState(161); qualifiedName();
			setState(164);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(162); match(DOT);
				setState(163); match(MUL);
				}
			}

			setState(166); match(SEMI);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(FINAL);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(CLASS);
			setState(173); match(Identifier);
			setState(175);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(174); typeParameters();
				}
			}

			setState(179);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(177); match(EXTENDS);
				setState(178); typeType();
				}
			}

			setState(181); classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(LT);
			setState(184); typeParameter();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185); match(COMMA);
				setState(186); typeParameter();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192); match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(Identifier);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); typeType();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197); match(COMMA);
				setState(198); typeType();
				}
				}
				setState(203);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(LBRACE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << LBRACE))) != 0) || _la==SEMI || _la==Identifier) {
				{
				{
				setState(205); classBodyDeclaration();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(219);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(SEMI);
				}
				break;
			case STATIC:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(214); match(STATIC);
					}
				}

				setState(217); block();
				}
				break;
			case T__6:
			case T__2:
			case BOOLEAN:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberDeclaration);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223); classDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch (_input.LA(1)) {
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				{
				setState(226); typeType();
				}
				break;
			case T__6:
				{
				setState(227); match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230); match(Identifier);
			setState(231); formalParameters();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(232); match(LBRACK);
				setState(233); match(RBRACK);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(239); match(THROWS);
				setState(240); qualifiedNameList();
				}
			}

			setState(245);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(243); methodBody();
				}
				break;
			case SEMI:
				{
				setState(244); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); typeType();
			setState(248); variableDeclarators();
			setState(249); match(SEMI);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); typeType();
			setState(252); constantDeclarator();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253); match(COMMA);
				setState(254); constantDeclarator();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260); match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(Identifier);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(263); match(LBRACK);
				setState(264); match(RBRACK);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270); match(ASSIGN);
			setState(271); variableInitializer();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); variableDeclarator();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274); match(COMMA);
				setState(275); variableDeclarator();
				}
				}
				setState(280);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); variableDeclaratorId();
			setState(284);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(282); match(ASSIGN);
				setState(283); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(Identifier);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(287); match(LBRACK);
				setState(288); match(RBRACK);
				}
				}
				setState(293);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableInitializer);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); arrayInitializer();
				}
				break;
			case T__6:
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case STRING:
			case SUPER:
			case THIS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(LBRACE);
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(299); variableInitializer();
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300); match(COMMA);
						setState(301); variableInitializer();
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(308);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(307); match(COMMA);
					}
				}

				}
			}

			setState(312); match(RBRACE);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeType);
		try {
			int _alt;
			setState(330);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); classOrInterfaceType();
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315); match(LBRACK);
						setState(316); match(RBRACK);
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); primitiveType();
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323); match(LBRACK);
						setState(324); match(RBRACK);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaRiceParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaRiceParser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(Identifier);
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(333); typeArguments();
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336); match(DOT);
					setState(337); match(Identifier);
					setState(339);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(338); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(LT);
			setState(349); typeArgument();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350); match(COMMA);
				setState(351); typeArgument();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357); match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeArgument);
		int _la;
		try {
			setState(365);
			switch (_input.LA(1)) {
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(359); typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); match(QUESTION);
				setState(363);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(362); typeType();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); qualifiedName();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368); match(COMMA);
				setState(369); qualifiedName();
				}
				}
				setState(374);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(LPAREN);
			setState(377);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0) || _la==Identifier) {
				{
				setState(376); formalParameterList();
				}
			}

			setState(379); match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381); formalParameter();
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382); match(COMMA);
						setState(383); formalParameter();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(391);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389); match(COMMA);
					setState(390); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(396); variableModifier();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402); typeType();
			setState(403); variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(405); variableModifier();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411); typeType();
			setState(412); match(T__0);
			setState(413); variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); block();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaRiceParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaRiceParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(Identifier);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418); match(DOT);
					setState(419); match(Identifier);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public TerminalNode StringLiteral() { return getToken(JavaRiceParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaRiceParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaRiceParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaRiceParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaRiceParser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(LBRACE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(428); blockStatement();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434); match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockStatement);
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437); statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); localVariableDeclaration();
			setState(441); match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(443); variableModifier();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449); typeType();
			setState(450); variableDeclarators();
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
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); match(IF);
				setState(454); parExpression();
				setState(455); statement();
				setState(458);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(456); match(ELSE);
					setState(457); statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460); match(FOR);
				setState(461); match(LPAREN);
				setState(462); forControl();
				setState(463); match(RPAREN);
				setState(464); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466); match(WHILE);
				setState(467); parExpression();
				setState(468); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470); match(DO);
				setState(471); statement();
				setState(472); match(WHILE);
				setState(473); parExpression();
				setState(474); match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(476); match(TRY);
				setState(477); block();
				setState(487);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(479); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(478); catchClause();
						}
						}
						setState(481); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(484);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(483); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(486); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489); match(TRY);
				setState(490); resourceSpecification();
				setState(491); block();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(492); catchClause();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(498); finallyBlock();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(501); match(SWITCH);
				setState(502); parExpression();
				setState(503); match(LBRACE);
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(504); switchBlockStatementGroup();
						}
						} 
					}
					setState(509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(510); switchLabel();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516); match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(518); match(SYNCHRONIZED);
				setState(519); parExpression();
				setState(520); block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(522); match(RETURN);
				setState(524);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(523); expression(0);
					}
				}

				setState(526); match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(527); match(THROW);
				setState(528); expression(0);
				setState(529); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(531); match(BREAK);
				setState(533);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(532); match(Identifier);
					}
				}

				setState(535); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(536); match(CONTINUE);
				setState(538);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(537); match(Identifier);
					}
				}

				setState(540); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(541); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(542); statementExpression();
				setState(543); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(545); match(Identifier);
				setState(546); match(COLON);
				setState(547); statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(CATCH);
			setState(551); match(LPAREN);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(552); variableModifier();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558); catchType();
			setState(559); match(Identifier);
			setState(560); match(RPAREN);
			setState(561); block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); qualifiedName();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(564); match(BITOR);
				setState(565); qualifiedName();
				}
				}
				setState(570);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(FINALLY);
			setState(572); block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(LPAREN);
			setState(575); resources();
			setState(577);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(576); match(SEMI);
				}
			}

			setState(579); match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581); resource();
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582); match(SEMI);
					setState(583); resource();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(589); variableModifier();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595); classOrInterfaceType();
			setState(596); variableDeclaratorId();
			setState(597); match(ASSIGN);
			setState(598); expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(600); switchLabel();
				}
				}
				setState(603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(606); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(605); blockStatement();
				}
				}
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switchLabel);
		try {
			setState(616);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); match(CASE);
				setState(611); constantExpression();
				setState(612); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(614); match(DEFAULT);
				setState(615); match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forControl);
		int _la;
		try {
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(619); forInit();
					}
				}

				setState(622); match(SEMI);
				setState(624);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(623); expression(0);
					}
				}

				setState(626); match(SEMI);
				setState(628);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(627); forUpdate();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forInit);
		try {
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633); expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(636); variableModifier();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(642); typeType();
			setState(643); variableDeclaratorId();
			setState(644); match(COLON);
			setState(645); expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); match(LPAREN);
			setState(650); expression(0);
			setState(651); match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); expression(0);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654); match(COMMA);
				setState(655); expression(0);
				}
				}
				setState(660);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); expression(0);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitExpression(this);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(666); match(LPAREN);
				setState(667); typeType();
				setState(668); match(RPAREN);
				setState(669); expression(17);
				}
				break;
			case 2:
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (ADD - 81)) | (1L << (SUB - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(672); expression(15);
				}
				break;
			case 3:
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(674); expression(14);
				}
				break;
			case 4:
				{
				setState(675); primary();
				}
				break;
			case 5:
				{
				setState(676); match(NEW);
				setState(677); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(746);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(681);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (MUL - 85)) | (1L << (DIV - 85)) | (1L << (MOD - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(682); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(684);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(685); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(694);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(687); match(LT);
							setState(688); match(LT);
							}
							break;
						case 2:
							{
							setState(689); match(GT);
							setState(690); match(GT);
							setState(691); match(GT);
							}
							break;
						case 3:
							{
							setState(692); match(GT);
							setState(693); match(GT);
							}
							break;
						}
						setState(696); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(697);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(698);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (LE - 69)) | (1L << (GE - 69)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(699); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(700);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(701);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(702); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(704); match(BITAND);
						setState(705); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(707); match(CARET);
						setState(708); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(709);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(710); match(BITOR);
						setState(711); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(712);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(713); match(AND);
						setState(714); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(716); match(OR);
						setState(717); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(719); match(QUESTION);
						setState(720); expression(0);
						setState(721); match(COLON);
						setState(722); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(724);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(725);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__3) | (1L << T__1))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68)) | (1L << (ADD_ASSIGN - 68)) | (1L << (SUB_ASSIGN - 68)) | (1L << (MUL_ASSIGN - 68)) | (1L << (DIV_ASSIGN - 68)) | (1L << (AND_ASSIGN - 68)) | (1L << (OR_ASSIGN - 68)) | (1L << (XOR_ASSIGN - 68)) | (1L << (MOD_ASSIGN - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(726); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(728); match(DOT);
						setState(729); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(730);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(731); match(LBRACK);
						setState(732); expression(0);
						setState(733); match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(736); match(LPAREN);
						setState(738);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
							{
							setState(737); expressionList();
							}
						}

						setState(740); match(RPAREN);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(742);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(744); match(INSTANCEOF);
						setState(745); typeType();
						}
						break;
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primary);
		try {
			setState(766);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751); match(LPAREN);
				setState(752); expression(0);
				setState(753); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756); match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(757); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(758); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(759); typeType();
				setState(760); match(DOT);
				setState(761); match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(763); match(T__6);
				setState(764); match(DOT);
				setState(765); match(CLASS);
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

	public static class CreatorContext extends ParserRuleContext {
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_creator);
		try {
			setState(777);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); nonWildcardTypeArguments();
				setState(769); createdName();
				setState(770); classCreatorRest();
				}
				break;
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); createdName();
				setState(775);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(773); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(774); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaRiceParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaRiceParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_createdName);
		int _la;
		try {
			setState(794);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(779); match(Identifier);
				setState(781);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(780); typeArgumentsOrDiamond();
					}
				}

				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(783); match(DOT);
					setState(784); match(Identifier);
					setState(786);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(785); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(793); primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796); match(Identifier);
			setState(798);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(797); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(800); classCreatorRest();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802); match(LT);
			setState(803); typeList();
			setState(804); match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeArgumentsOrDiamond);
		try {
			setState(809);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); match(LT);
				setState(807); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808); typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811); match(LT);
				setState(812); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813); nonWildcardTypeArguments();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(816); match(LBRACK);
			setState(844);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(817); match(RBRACK);
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(818); match(LBRACK);
					setState(819); match(RBRACK);
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(825); arrayInitializer();
				}
				break;
			case T__6:
			case T__2:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case STRING:
			case SUPER:
			case THIS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(826); expression(0);
				setState(827); match(RBRACK);
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(828); match(LBRACK);
						setState(829); expression(0);
						setState(830); match(RBRACK);
						}
						} 
					}
					setState(836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(837); match(LBRACK);
						setState(838); match(RBRACK);
						}
						} 
					}
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); arguments();
			setState(848);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(847); classBody();
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850); match(LPAREN);
			setState(852);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(851); expressionList();
				}
			}

			setState(854); match(RPAREN);
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

	public static class ScanContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); match(READ);
			setState(857); match(LPAREN);
			setState(858); primitiveType();
			setState(859); match(COMMA);
			setState(860); variableDeclaratorId();
			setState(861); match(RPAREN);
			setState(862); match(SEMI);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); match(WRITE);
			setState(865); match(LPAREN);
			setState(866); expression(0);
			setState(867); match(RPAREN);
			setState(868); match(SEMI);
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
		case 55: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 4);
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		case 11: return precpred(_ctx, 1);
		case 12: return precpred(_ctx, 21);
		case 13: return precpred(_ctx, 20);
		case 14: return precpred(_ctx, 19);
		case 15: return precpred(_ctx, 16);
		case 16: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u0369\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\5\2\u008c\n\2\3\2"+
		"\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\7\2\u0095\n\2\f\2\16\2\u0098\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00a2\n\4\3\4\3\4\3\4\5\4\u00a7"+
		"\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u00b2\n\7\3\7\3\7\5\7\u00b6"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00be\n\b\f\b\16\b\u00c1\13\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\3\13\3\13\7\13"+
		"\u00d1\n\13\f\13\16\13\u00d4\13\13\3\13\3\13\3\f\3\f\5\f\u00da\n\f\3\f"+
		"\3\f\5\f\u00de\n\f\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\5\16\u00e7\n\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\16\3\16"+
		"\5\16\u00f4\n\16\3\16\3\16\5\16\u00f8\n\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\7\20\u0102\n\20\f\20\16\20\u0105\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\23\3\23\3\23\5\23\u011f"+
		"\n\23\3\24\3\24\3\24\7\24\u0124\n\24\f\24\16\24\u0127\13\24\3\25\3\25"+
		"\5\25\u012b\n\25\3\26\3\26\3\26\3\26\7\26\u0131\n\26\f\26\16\26\u0134"+
		"\13\26\3\26\5\26\u0137\n\26\5\26\u0139\n\26\3\26\3\26\3\27\3\27\3\27\7"+
		"\27\u0140\n\27\f\27\16\27\u0143\13\27\3\27\3\27\3\27\7\27\u0148\n\27\f"+
		"\27\16\27\u014b\13\27\5\27\u014d\n\27\3\30\3\30\5\30\u0151\n\30\3\30\3"+
		"\30\3\30\5\30\u0156\n\30\7\30\u0158\n\30\f\30\16\30\u015b\13\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\7\32\u0163\n\32\f\32\16\32\u0166\13\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u016e\n\33\5\33\u0170\n\33\3\34\3\34\3\34"+
		"\7\34\u0175\n\34\f\34\16\34\u0178\13\34\3\35\3\35\5\35\u017c\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\7\36\u0183\n\36\f\36\16\36\u0186\13\36\3\36\3\36"+
		"\5\36\u018a\n\36\3\36\5\36\u018d\n\36\3\37\7\37\u0190\n\37\f\37\16\37"+
		"\u0193\13\37\3\37\3\37\3\37\3 \7 \u0199\n \f \16 \u019c\13 \3 \3 \3 \3"+
		" \3!\3!\3\"\3\"\3\"\7\"\u01a7\n\"\f\"\16\"\u01aa\13\"\3#\3#\3$\3$\7$\u01b0"+
		"\n$\f$\16$\u01b3\13$\3$\3$\3%\3%\5%\u01b9\n%\3&\3&\3&\3\'\7\'\u01bf\n"+
		"\'\f\'\16\'\u01c2\13\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u01cd\n(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u01e2\n(\r(\16"+
		"(\u01e3\3(\5(\u01e7\n(\3(\5(\u01ea\n(\3(\3(\3(\3(\7(\u01f0\n(\f(\16(\u01f3"+
		"\13(\3(\5(\u01f6\n(\3(\3(\3(\3(\7(\u01fc\n(\f(\16(\u01ff\13(\3(\7(\u0202"+
		"\n(\f(\16(\u0205\13(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u020f\n(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u0218\n(\3(\3(\3(\5(\u021d\n(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0227"+
		"\n(\3)\3)\3)\7)\u022c\n)\f)\16)\u022f\13)\3)\3)\3)\3)\3)\3*\3*\3*\7*\u0239"+
		"\n*\f*\16*\u023c\13*\3+\3+\3+\3,\3,\3,\5,\u0244\n,\3,\3,\3-\3-\3-\7-\u024b"+
		"\n-\f-\16-\u024e\13-\3.\7.\u0251\n.\f.\16.\u0254\13.\3.\3.\3.\3.\3.\3"+
		"/\6/\u025c\n/\r/\16/\u025d\3/\6/\u0261\n/\r/\16/\u0262\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u026b\n\60\3\61\3\61\5\61\u026f\n\61\3\61\3\61\5"+
		"\61\u0273\n\61\3\61\3\61\5\61\u0277\n\61\5\61\u0279\n\61\3\62\3\62\5\62"+
		"\u027d\n\62\3\63\7\63\u0280\n\63\f\63\16\63\u0283\13\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u0293\n\66"+
		"\f\66\16\66\u0296\13\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\59\u02a9\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u02b9"+
		"\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u02e5"+
		"\n9\39\39\39\39\39\39\79\u02ed\n9\f9\169\u02f0\139\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0301\n:\3;\3;\3;\3;\3;\3;\3;\5;\u030a\n"+
		";\5;\u030c\n;\3<\3<\5<\u0310\n<\3<\3<\3<\5<\u0315\n<\7<\u0317\n<\f<\16"+
		"<\u031a\13<\3<\5<\u031d\n<\3=\3=\5=\u0321\n=\3=\3=\3>\3>\3>\3>\3?\3?\3"+
		"?\5?\u032c\n?\3@\3@\3@\5@\u0331\n@\3A\3A\3A\3A\7A\u0337\nA\fA\16A\u033a"+
		"\13A\3A\3A\3A\3A\3A\3A\3A\7A\u0343\nA\fA\16A\u0346\13A\3A\3A\7A\u034a"+
		"\nA\fA\16A\u034d\13A\5A\u034f\nA\3B\3B\5B\u0353\nB\3C\3C\5C\u0357\nC\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\2\3pF\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\16\6\2\5\5\27\27%\'++\13"+
		"\2\7\7\n\n\16\16\24\24\31\31  \"\"**,,\4\2\26\26--\3\2\67<\3\2SV\3\2I"+
		"J\4\2WX\\\\\3\2UV\4\2GHNO\4\2MMPP\7\2\4\4\6\6\b\bFF]d\3\2ST\u03aa\2\u008b"+
		"\3\2\2\2\4\u009b\3\2\2\2\6\u009f\3\2\2\2\b\u00aa\3\2\2\2\n\u00ac\3\2\2"+
		"\2\f\u00ae\3\2\2\2\16\u00b9\3\2\2\2\20\u00c4\3\2\2\2\22\u00c6\3\2\2\2"+
		"\24\u00ce\3\2\2\2\26\u00dd\3\2\2\2\30\u00e2\3\2\2\2\32\u00e6\3\2\2\2\34"+
		"\u00f9\3\2\2\2\36\u00fd\3\2\2\2 \u0108\3\2\2\2\"\u0113\3\2\2\2$\u011b"+
		"\3\2\2\2&\u0120\3\2\2\2(\u012a\3\2\2\2*\u012c\3\2\2\2,\u014c\3\2\2\2."+
		"\u014e\3\2\2\2\60\u015c\3\2\2\2\62\u015e\3\2\2\2\64\u016f\3\2\2\2\66\u0171"+
		"\3\2\2\28\u0179\3\2\2\2:\u018c\3\2\2\2<\u0191\3\2\2\2>\u019a\3\2\2\2@"+
		"\u01a1\3\2\2\2B\u01a3\3\2\2\2D\u01ab\3\2\2\2F\u01ad\3\2\2\2H\u01b8\3\2"+
		"\2\2J\u01ba\3\2\2\2L\u01c0\3\2\2\2N\u0226\3\2\2\2P\u0228\3\2\2\2R\u0235"+
		"\3\2\2\2T\u023d\3\2\2\2V\u0240\3\2\2\2X\u0247\3\2\2\2Z\u0252\3\2\2\2\\"+
		"\u025b\3\2\2\2^\u026a\3\2\2\2`\u0278\3\2\2\2b\u027c\3\2\2\2d\u0281\3\2"+
		"\2\2f\u0289\3\2\2\2h\u028b\3\2\2\2j\u028f\3\2\2\2l\u0297\3\2\2\2n\u0299"+
		"\3\2\2\2p\u02a8\3\2\2\2r\u0300\3\2\2\2t\u030b\3\2\2\2v\u031c\3\2\2\2x"+
		"\u031e\3\2\2\2z\u0324\3\2\2\2|\u032b\3\2\2\2~\u0330\3\2\2\2\u0080\u0332"+
		"\3\2\2\2\u0082\u0350\3\2\2\2\u0084\u0354\3\2\2\2\u0086\u035a\3\2\2\2\u0088"+
		"\u0362\3\2\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0090\3\2\2\2\u008d\u008f\5\6\4\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\f\7\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\2\2\3\u009a\3\3\2\2\2\u009b\u009c"+
		"\7$\2\2\u009c\u009d\5B\"\2\u009d\u009e\7C\2\2\u009e\5\3\2\2\2\u009f\u00a1"+
		"\7\36\2\2\u00a0\u00a2\7+\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a6\5B\"\2\u00a4\u00a5\7E\2\2\u00a5\u00a7\7W\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\7C\2\2\u00a9\7\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\t\3\2\2\2\u00ac\u00ad"+
		"\7\27\2\2\u00ad\13\3\2\2\2\u00ae\u00af\7\17\2\2\u00af\u00b1\7e\2\2\u00b0"+
		"\u00b2\5\16\b\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b6\5,\27\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\r\3\2\2"+
		"\2\u00b9\u00ba\7H\2\2\u00ba\u00bf\5\20\t\2\u00bb\u00bc\7D\2\2\u00bc\u00be"+
		"\5\20\t\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\7G\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\21\3\2\2\2\u00c6\u00cb"+
		"\5,\27\2\u00c7\u00c8\7D\2\2\u00c8\u00ca\5,\27\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\23\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\7?\2\2\u00cf\u00d1\5\26\f\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\25\3\2\2\2"+
		"\u00d7\u00de\7C\2\2\u00d8\u00da\7+\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\5F$\2\u00dc\u00de\5\30\r\2\u00dd"+
		"\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\27\3\2\2"+
		"\2\u00df\u00e3\5\32\16\2\u00e0\u00e3\5\34\17\2\u00e1\u00e3\5\f\7\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00e7\5,\27\2\u00e5\u00e7\7\3\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ee\58\35\2\u00ea"+
		"\u00eb\7A\2\2\u00eb\u00ed\7B\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7\62\2\2\u00f2\u00f4\5\66\34\2\u00f3\u00f1\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f8\5@!\2\u00f6\u00f8"+
		"\7C\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\33\3\2\2\2\u00f9"+
		"\u00fa\5,\27\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7C\2\2\u00fc\35\3\2\2"+
		"\2\u00fd\u00fe\5,\27\2\u00fe\u0103\5 \21\2\u00ff\u0100\7D\2\2\u0100\u0102"+
		"\5 \21\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7C"+
		"\2\2\u0107\37\3\2\2\2\u0108\u010d\7e\2\2\u0109\u010a\7A\2\2\u010a\u010c"+
		"\7B\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7F"+
		"\2\2\u0111\u0112\5(\25\2\u0112!\3\2\2\2\u0113\u0118\5$\23\2\u0114\u0115"+
		"\7D\2\2\u0115\u0117\5$\23\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119#\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011e\5&\24\2\u011c\u011d\7F\2\2\u011d\u011f\5(\25\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f%\3\2\2\2\u0120\u0125\7e\2\2\u0121\u0122"+
		"\7A\2\2\u0122\u0124\7B\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\'\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u012b\5*\26\2\u0129\u012b\5p9\2\u012a\u0128\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012b)\3\2\2\2\u012c\u0138\7?\2\2\u012d\u0132\5(\25\2\u012e\u012f"+
		"\7D\2\2\u012f\u0131\5(\25\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0137\7D\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\7@\2\2\u013b+\3\2\2\2\u013c\u0141\5.\30\2\u013d\u013e"+
		"\7A\2\2\u013e\u0140\7B\2\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u014d\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0149\5\60\31\2\u0145\u0146\7A\2\2\u0146\u0148\7B\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u013c\3\2\2\2\u014c"+
		"\u0144\3\2\2\2\u014d-\3\2\2\2\u014e\u0150\7e\2\2\u014f\u0151\5\62\32\2"+
		"\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0159\3\2\2\2\u0152\u0153"+
		"\7E\2\2\u0153\u0155\7e\2\2\u0154\u0156\5\62\32\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a/\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u015d\t\3\2\2\u015d\61\3\2\2\2\u015e\u015f\7H\2\2\u015f"+
		"\u0164\5\64\33\2\u0160\u0161\7D\2\2\u0161\u0163\5\64\33\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7G\2\2\u0168\63\3\2\2\2"+
		"\u0169\u0170\5,\27\2\u016a\u016d\7K\2\2\u016b\u016c\t\4\2\2\u016c\u016e"+
		"\5,\27\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0169\3\2\2\2\u016f\u016a\3\2\2\2\u0170\65\3\2\2\2\u0171\u0176\5B\"\2"+
		"\u0172\u0173\7D\2\2\u0173\u0175\5B\"\2\u0174\u0172\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\67\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017b\7=\2\2\u017a\u017c\5:\36\2\u017b\u017a\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7>\2\2\u017e"+
		"9\3\2\2\2\u017f\u0184\5<\37\2\u0180\u0181\7D\2\2\u0181\u0183\5<\37\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0189\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7D\2\2\u0188"+
		"\u018a\5> \2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2"+
		"\2\u018b\u018d\5> \2\u018c\u017f\3\2\2\2\u018c\u018b\3\2\2\2\u018d;\3"+
		"\2\2\2\u018e\u0190\5\n\6\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0195\5,\27\2\u0195\u0196\5&\24\2\u0196=\3\2\2\2\u0197\u0199"+
		"\5\n\6\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\5,"+
		"\27\2\u019e\u019f\7\t\2\2\u019f\u01a0\5&\24\2\u01a0?\3\2\2\2\u01a1\u01a2"+
		"\5F$\2\u01a2A\3\2\2\2\u01a3\u01a8\7e\2\2\u01a4\u01a5\7E\2\2\u01a5\u01a7"+
		"\7e\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9C\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\t\5\2\2"+
		"\u01acE\3\2\2\2\u01ad\u01b1\7?\2\2\u01ae\u01b0\5H%\2\u01af\u01ae\3\2\2"+
		"\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7@\2\2\u01b5G\3\2\2\2\u01b6\u01b9"+
		"\5J&\2\u01b7\u01b9\5N(\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"I\3\2\2\2\u01ba\u01bb\5L\'\2\u01bb\u01bc\7C\2\2\u01bcK\3\2\2\2\u01bd\u01bf"+
		"\5\n\6\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\5,"+
		"\27\2\u01c4\u01c5\5\"\22\2\u01c5M\3\2\2\2\u01c6\u0227\5F$\2\u01c7\u01c8"+
		"\7\33\2\2\u01c8\u01c9\5h\65\2\u01c9\u01cc\5N(\2\u01ca\u01cb\7\25\2\2\u01cb"+
		"\u01cd\5N(\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u0227\3\2\2"+
		"\2\u01ce\u01cf\7\32\2\2\u01cf\u01d0\7=\2\2\u01d0\u01d1\5`\61\2\u01d1\u01d2"+
		"\7>\2\2\u01d2\u01d3\5N(\2\u01d3\u0227\3\2\2\2\u01d4\u01d5\7\65\2\2\u01d5"+
		"\u01d6\5h\65\2\u01d6\u01d7\5N(\2\u01d7\u0227\3\2\2\2\u01d8\u01d9\7\23"+
		"\2\2\u01d9\u01da\5N(\2\u01da\u01db\7\65\2\2\u01db\u01dc\5h\65\2\u01dc"+
		"\u01dd\7C\2\2\u01dd\u0227\3\2\2\2\u01de\u01df\7\63\2\2\u01df\u01e9\5F"+
		"$\2\u01e0\u01e2\5P)\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5T+\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01ea\5T"+
		"+\2\u01e9\u01e1\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u0227\3\2\2\2\u01eb"+
		"\u01ec\7\63\2\2\u01ec\u01ed\5V,\2\u01ed\u01f1\5F$\2\u01ee\u01f0\5P)\2"+
		"\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\5T+\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0227\3\2\2\2\u01f7\u01f8\7."+
		"\2\2\u01f8\u01f9\5h\65\2\u01f9\u01fd\7?\2\2\u01fa\u01fc\5\\/\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0203\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5^\60\2\u0201\u0200\3\2"+
		"\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7@\2\2\u0207\u0227\3\2"+
		"\2\2\u0208\u0209\7/\2\2\u0209\u020a\5h\65\2\u020a\u020b\5F$\2\u020b\u0227"+
		"\3\2\2\2\u020c\u020e\7)\2\2\u020d\u020f\5p9\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0227\7C\2\2\u0211\u0212\7\61"+
		"\2\2\u0212\u0213\5p9\2\u0213\u0214\7C\2\2\u0214\u0227\3\2\2\2\u0215\u0217"+
		"\7\13\2\2\u0216\u0218\7e\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0227\7C\2\2\u021a\u021c\7\21\2\2\u021b\u021d\7e"+
		"\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0227\7C\2\2\u021f\u0227\7C\2\2\u0220\u0221\5l\67\2\u0221\u0222\7C\2"+
		"\2\u0222\u0227\3\2\2\2\u0223\u0224\7e\2\2\u0224\u0225\7L\2\2\u0225\u0227"+
		"\5N(\2\u0226\u01c6\3\2\2\2\u0226\u01c7\3\2\2\2\u0226\u01ce\3\2\2\2\u0226"+
		"\u01d4\3\2\2\2\u0226\u01d8\3\2\2\2\u0226\u01de\3\2\2\2\u0226\u01eb\3\2"+
		"\2\2\u0226\u01f7\3\2\2\2\u0226\u0208\3\2\2\2\u0226\u020c\3\2\2\2\u0226"+
		"\u0211\3\2\2\2\u0226\u0215\3\2\2\2\u0226\u021a\3\2\2\2\u0226\u021f\3\2"+
		"\2\2\u0226\u0220\3\2\2\2\u0226\u0223\3\2\2\2\u0227O\3\2\2\2\u0228\u0229"+
		"\7\r\2\2\u0229\u022d\7=\2\2\u022a\u022c\5\n\6\2\u022b\u022a\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5R*\2\u0231\u0232\7e\2\2\u0232\u0233"+
		"\7>\2\2\u0233\u0234\5F$\2\u0234Q\3\2\2\2\u0235\u023a\5B\"\2\u0236\u0237"+
		"\7Z\2\2\u0237\u0239\5B\"\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bS\3\2\2\2\u023c\u023a\3\2\2\2"+
		"\u023d\u023e\7\30\2\2\u023e\u023f\5F$\2\u023fU\3\2\2\2\u0240\u0241\7="+
		"\2\2\u0241\u0243\5X-\2\u0242\u0244\7C\2\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7>\2\2\u0246W\3\2\2\2\u0247\u024c"+
		"\5Z.\2\u0248\u0249\7C\2\2\u0249\u024b\5Z.\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024dY\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024f\u0251\5\n\6\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0256\5.\30\2\u0256\u0257\5&\24\2\u0257\u0258\7F"+
		"\2\2\u0258\u0259\5p9\2\u0259[\3\2\2\2\u025a\u025c\5^\60\2\u025b\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u0260\3\2\2\2\u025f\u0261\5H%\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263]\3\2\2\2\u0264\u0265"+
		"\7\f\2\2\u0265\u0266\5n8\2\u0266\u0267\7L\2\2\u0267\u026b\3\2\2\2\u0268"+
		"\u0269\7\22\2\2\u0269\u026b\7L\2\2\u026a\u0264\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026b_\3\2\2\2\u026c\u0279\5d\63\2\u026d\u026f\5b\62\2\u026e\u026d"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\7C\2\2\u0271"+
		"\u0273\5p9\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2"+
		"\2\u0274\u0276\7C\2\2\u0275\u0277\5f\64\2\u0276\u0275\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u026c\3\2\2\2\u0278\u026e\3\2\2\2\u0279"+
		"a\3\2\2\2\u027a\u027d\5L\'\2\u027b\u027d\5j\66\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027b\3\2\2\2\u027dc\3\2\2\2\u027e\u0280\5\n\6\2\u027f\u027e\3\2\2\2"+
		"\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284"+
		"\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\5,\27\2\u0285\u0286\5&\24\2\u0286"+
		"\u0287\7L\2\2\u0287\u0288\5p9\2\u0288e\3\2\2\2\u0289\u028a\5j\66\2\u028a"+
		"g\3\2\2\2\u028b\u028c\7=\2\2\u028c\u028d\5p9\2\u028d\u028e\7>\2\2\u028e"+
		"i\3\2\2\2\u028f\u0294\5p9\2\u0290\u0291\7D\2\2\u0291\u0293\5p9\2\u0292"+
		"\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295k\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\5p9\2\u0298m\3\2\2"+
		"\2\u0299\u029a\5p9\2\u029ao\3\2\2\2\u029b\u029c\b9\1\2\u029c\u029d\7="+
		"\2\2\u029d\u029e\5,\27\2\u029e\u029f\7>\2\2\u029f\u02a0\5p9\23\u02a0\u02a9"+
		"\3\2\2\2\u02a1\u02a2\t\6\2\2\u02a2\u02a9\5p9\21\u02a3\u02a4\t\7\2\2\u02a4"+
		"\u02a9\5p9\20\u02a5\u02a9\5r:\2\u02a6\u02a7\7#\2\2\u02a7\u02a9\5t;\2\u02a8"+
		"\u029b\3\2\2\2\u02a8\u02a1\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a8\u02a5\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ee\3\2\2\2\u02aa\u02ab\f\17\2\2\u02ab"+
		"\u02ac\t\b\2\2\u02ac\u02ed\5p9\20\u02ad\u02ae\f\16\2\2\u02ae\u02af\t\t"+
		"\2\2\u02af\u02ed\5p9\17\u02b0\u02b8\f\r\2\2\u02b1\u02b2\7H\2\2\u02b2\u02b9"+
		"\7H\2\2\u02b3\u02b4\7G\2\2\u02b4\u02b5\7G\2\2\u02b5\u02b9\7G\2\2\u02b6"+
		"\u02b7\7G\2\2\u02b7\u02b9\7G\2\2\u02b8\u02b1\3\2\2\2\u02b8\u02b3\3\2\2"+
		"\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02ed\5p9\16\u02bb\u02bc"+
		"\f\f\2\2\u02bc\u02bd\t\n\2\2\u02bd\u02ed\5p9\r\u02be\u02bf\f\n\2\2\u02bf"+
		"\u02c0\t\13\2\2\u02c0\u02ed\5p9\13\u02c1\u02c2\f\t\2\2\u02c2\u02c3\7Y"+
		"\2\2\u02c3\u02ed\5p9\n\u02c4\u02c5\f\b\2\2\u02c5\u02c6\7[\2\2\u02c6\u02ed"+
		"\5p9\t\u02c7\u02c8\f\7\2\2\u02c8\u02c9\7Z\2\2\u02c9\u02ed\5p9\b\u02ca"+
		"\u02cb\f\6\2\2\u02cb\u02cc\7Q\2\2\u02cc\u02ed\5p9\7\u02cd\u02ce\f\5\2"+
		"\2\u02ce\u02cf\7R\2\2\u02cf\u02ed\5p9\6\u02d0\u02d1\f\4\2\2\u02d1\u02d2"+
		"\7K\2\2\u02d2\u02d3\5p9\2\u02d3\u02d4\7L\2\2\u02d4\u02d5\5p9\5\u02d5\u02ed"+
		"\3\2\2\2\u02d6\u02d7\f\3\2\2\u02d7\u02d8\t\f\2\2\u02d8\u02ed\5p9\3\u02d9"+
		"\u02da\f\27\2\2\u02da\u02db\7E\2\2\u02db\u02ed\7e\2\2\u02dc\u02dd\f\26"+
		"\2\2\u02dd\u02de\7A\2\2\u02de\u02df\5p9\2\u02df\u02e0\7B\2\2\u02e0\u02ed"+
		"\3\2\2\2\u02e1\u02e2\f\25\2\2\u02e2\u02e4\7=\2\2\u02e3\u02e5\5j\66\2\u02e4"+
		"\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02ed\7>"+
		"\2\2\u02e7\u02e8\f\22\2\2\u02e8\u02ed\t\r\2\2\u02e9\u02ea\f\13\2\2\u02ea"+
		"\u02eb\7\37\2\2\u02eb\u02ed\5,\27\2\u02ec\u02aa\3\2\2\2\u02ec\u02ad\3"+
		"\2\2\2\u02ec\u02b0\3\2\2\2\u02ec\u02bb\3\2\2\2\u02ec\u02be\3\2\2\2\u02ec"+
		"\u02c1\3\2\2\2\u02ec\u02c4\3\2\2\2\u02ec\u02c7\3\2\2\2\u02ec\u02ca\3\2"+
		"\2\2\u02ec\u02cd\3\2\2\2\u02ec\u02d0\3\2\2\2\u02ec\u02d6\3\2\2\2\u02ec"+
		"\u02d9\3\2\2\2\u02ec\u02dc\3\2\2\2\u02ec\u02e1\3\2\2\2\u02ec\u02e7\3\2"+
		"\2\2\u02ec\u02e9\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02efq\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7=\2\2\u02f2"+
		"\u02f3\5p9\2\u02f3\u02f4\7>\2\2\u02f4\u0301\3\2\2\2\u02f5\u0301\7\60\2"+
		"\2\u02f6\u0301\7-\2\2\u02f7\u0301\5D#\2\u02f8\u0301\7e\2\2\u02f9\u02fa"+
		"\5,\27\2\u02fa\u02fb\7E\2\2\u02fb\u02fc\7\17\2\2\u02fc\u0301\3\2\2\2\u02fd"+
		"\u02fe\7\3\2\2\u02fe\u02ff\7E\2\2\u02ff\u0301\7\17\2\2\u0300\u02f1\3\2"+
		"\2\2\u0300\u02f5\3\2\2\2\u0300\u02f6\3\2\2\2\u0300\u02f7\3\2\2\2\u0300"+
		"\u02f8\3\2\2\2\u0300\u02f9\3\2\2\2\u0300\u02fd\3\2\2\2\u0301s\3\2\2\2"+
		"\u0302\u0303\5z>\2\u0303\u0304\5v<\2\u0304\u0305\5\u0082B\2\u0305\u030c"+
		"\3\2\2\2\u0306\u0309\5v<\2\u0307\u030a\5\u0080A\2\u0308\u030a\5\u0082"+
		"B\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u030c\3\2\2\2\u030b"+
		"\u0302\3\2\2\2\u030b\u0306\3\2\2\2\u030cu\3\2\2\2\u030d\u030f\7e\2\2\u030e"+
		"\u0310\5|?\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0318\3\2\2"+
		"\2\u0311\u0312\7E\2\2\u0312\u0314\7e\2\2\u0313\u0315\5|?\2\u0314\u0313"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0311\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031d\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031b\u031d\5\60\31\2\u031c\u030d\3\2\2\2\u031c"+
		"\u031b\3\2\2\2\u031dw\3\2\2\2\u031e\u0320\7e\2\2\u031f\u0321\5~@\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\5\u0082"+
		"B\2\u0323y\3\2\2\2\u0324\u0325\7H\2\2\u0325\u0326\5\22\n\2\u0326\u0327"+
		"\7G\2\2\u0327{\3\2\2\2\u0328\u0329\7H\2\2\u0329\u032c\7G\2\2\u032a\u032c"+
		"\5\62\32\2\u032b\u0328\3\2\2\2\u032b\u032a\3\2\2\2\u032c}\3\2\2\2\u032d"+
		"\u032e\7H\2\2\u032e\u0331\7G\2\2\u032f\u0331\5z>\2\u0330\u032d\3\2\2\2"+
		"\u0330\u032f\3\2\2\2\u0331\177\3\2\2\2\u0332\u034e\7A\2\2\u0333\u0338"+
		"\7B\2\2\u0334\u0335\7A\2\2\u0335\u0337\7B\2\2\u0336\u0334\3\2\2\2\u0337"+
		"\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033b\u034f\5*\26\2\u033c\u033d\5p9\2\u033d\u0344"+
		"\7B\2\2\u033e\u033f\7A\2\2\u033f\u0340\5p9\2\u0340\u0341\7B\2\2\u0341"+
		"\u0343\3\2\2\2\u0342\u033e\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345\u034b\3\2\2\2\u0346\u0344\3\2\2\2\u0347"+
		"\u0348\7A\2\2\u0348\u034a\7B\2\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2"+
		"\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b"+
		"\3\2\2\2\u034e\u0333\3\2\2\2\u034e\u033c\3\2\2\2\u034f\u0081\3\2\2\2\u0350"+
		"\u0352\5\u0084C\2\u0351\u0353\5\24\13\2\u0352\u0351\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0083\3\2\2\2\u0354\u0356\7=\2\2\u0355\u0357\5j\66\2\u0356"+
		"\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7>"+
		"\2\2\u0359\u0085\3\2\2\2\u035a\u035b\7(\2\2\u035b\u035c\7=\2\2\u035c\u035d"+
		"\5\60\31\2\u035d\u035e\7D\2\2\u035e\u035f\5&\24\2\u035f\u0360\7>\2\2\u0360"+
		"\u0361\7C\2\2\u0361\u0087\3\2\2\2\u0362\u0363\7\66\2\2\u0363\u0364\7="+
		"\2\2\u0364\u0365\5p9\2\u0365\u0366\7>\2\2\u0366\u0367\7C\2\2\u0367\u0089"+
		"\3\2\2\2`\u008b\u0090\u0096\u00a1\u00a6\u00b1\u00b5\u00bf\u00cb\u00d2"+
		"\u00d9\u00dd\u00e2\u00e6\u00ee\u00f3\u00f7\u0103\u010d\u0118\u011e\u0125"+
		"\u012a\u0132\u0136\u0138\u0141\u0149\u014c\u0150\u0155\u0159\u0164\u016d"+
		"\u016f\u0176\u017b\u0184\u0189\u018c\u0191\u019a\u01a8\u01b1\u01b8\u01c0"+
		"\u01cc\u01e3\u01e6\u01e9\u01f1\u01f5\u01fd\u0203\u020e\u0217\u021c\u0226"+
		"\u022d\u023a\u0243\u024c\u0252\u025d\u0262\u026a\u026e\u0272\u0276\u0278"+
		"\u027c\u0281\u0294\u02a8\u02b8\u02e4\u02ec\u02ee\u0300\u0309\u030b\u030f"+
		"\u0314\u0318\u031c\u0320\u032b\u0330\u0338\u0344\u034b\u034e\u0352\u0356";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}