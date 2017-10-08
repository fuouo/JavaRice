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
			while (_la==CLASS || _la==PUBLIC) {
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
			setState(173);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(172); match(PUBLIC);
				}
			}

			setState(175); match(CLASS);
			setState(176); match(Identifier);
			setState(178);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(177); typeParameters();
				}
			}

			setState(182);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(180); match(EXTENDS);
				setState(181); typeType();
				}
			}

			setState(184); classBody();
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
			setState(186); match(LT);
			setState(187); typeParameter();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188); match(COMMA);
				setState(189); typeParameter();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(GT);
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
			setState(197); match(Identifier);
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
			setState(199); typeType();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200); match(COMMA);
				setState(201); typeType();
				}
				}
				setState(206);
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
			setState(207); match(LBRACE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << LBRACE))) != 0) || _la==SEMI || _la==Identifier) {
				{
				{
				setState(208); classBodyDeclaration();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214); match(RBRACE);
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
			setState(222);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(SEMI);
				}
				break;
			case STATIC:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(217); match(STATIC);
					}
				}

				setState(220); block();
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
			case PUBLIC:
			case SHORT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(221); memberDeclaration();
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
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); classDeclaration();
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
			setState(231);
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
				setState(229); typeType();
				}
				break;
			case T__6:
				{
				setState(230); match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233); match(Identifier);
			setState(234); formalParameters();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(235); match(LBRACK);
				setState(236); match(RBRACK);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(242); match(THROWS);
				setState(243); qualifiedNameList();
				}
			}

			setState(248);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(246); methodBody();
				}
				break;
			case SEMI:
				{
				setState(247); match(SEMI);
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
			setState(250); typeType();
			setState(251); variableDeclarators();
			setState(252); match(SEMI);
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
			setState(254); typeType();
			setState(255); constantDeclarator();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256); match(COMMA);
				setState(257); constantDeclarator();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); match(SEMI);
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
			setState(265); match(Identifier);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(266); match(LBRACK);
				setState(267); match(RBRACK);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273); match(ASSIGN);
			setState(274); variableInitializer();
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
			setState(276); variableDeclarator();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277); match(COMMA);
				setState(278); variableDeclarator();
				}
				}
				setState(283);
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
			setState(284); variableDeclaratorId();
			setState(287);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(285); match(ASSIGN);
				setState(286); variableInitializer();
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
			setState(289); match(Identifier);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(290); match(LBRACK);
				setState(291); match(RBRACK);
				}
				}
				setState(296);
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
			setState(299);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); arrayInitializer();
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
				setState(298); expression(0);
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
			setState(301); match(LBRACE);
			setState(313);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(302); variableInitializer();
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303); match(COMMA);
						setState(304); variableInitializer();
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(311);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(310); match(COMMA);
					}
				}

				}
			}

			setState(315); match(RBRACE);
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
			setState(333);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); classOrInterfaceType();
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318); match(LBRACK);
						setState(319); match(RBRACK);
						}
						} 
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
				setState(325); primitiveType();
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326); match(LBRACK);
						setState(327); match(RBRACK);
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(335); match(Identifier);
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(336); typeArguments();
				}
				break;
			}
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339); match(DOT);
					setState(340); match(Identifier);
					setState(342);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(341); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(349);
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
			setState(351); match(LT);
			setState(352); typeArgument();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353); match(COMMA);
				setState(354); typeArgument();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360); match(GT);
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
			setState(368);
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
				setState(362); typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); match(QUESTION);
				setState(366);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(364);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(365); typeType();
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
			setState(370); qualifiedName();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371); match(COMMA);
				setState(372); qualifiedName();
				}
				}
				setState(377);
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
			setState(378); match(LPAREN);
			setState(380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0) || _la==Identifier) {
				{
				setState(379); formalParameterList();
				}
			}

			setState(382); match(RPAREN);
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
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384); formalParameter();
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385); match(COMMA);
						setState(386); formalParameter();
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(394);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(392); match(COMMA);
					setState(393); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); lastFormalParameter();
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
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(399); variableModifier();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405); typeType();
			setState(406); variableDeclaratorId();
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
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(408); variableModifier();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414); typeType();
			setState(415); match(T__0);
			setState(416); variableDeclaratorId();
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
			setState(418); block();
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
			setState(420); match(Identifier);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421); match(DOT);
					setState(422); match(Identifier);
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			setState(428);
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
			setState(430); match(LBRACE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(431); blockStatement();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437); match(RBRACE);
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
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); statement();
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
			setState(443); localVariableDeclaration();
			setState(444); match(SEMI);
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
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(446); variableModifier();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452); typeType();
			setState(453); variableDeclarators();
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
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456); match(IF);
				setState(457); parExpression();
				setState(458); statement();
				setState(461);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(459); match(ELSE);
					setState(460); statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463); match(FOR);
				setState(464); match(LPAREN);
				setState(465); forControl();
				setState(466); match(RPAREN);
				setState(467); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469); match(WHILE);
				setState(470); parExpression();
				setState(471); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473); match(DO);
				setState(474); statement();
				setState(475); match(WHILE);
				setState(476); parExpression();
				setState(477); match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(479); match(TRY);
				setState(480); block();
				setState(490);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(481); catchClause();
						}
						}
						setState(484); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(487);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(486); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(489); finallyBlock();
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
				setState(492); match(TRY);
				setState(493); resourceSpecification();
				setState(494); block();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(495); catchClause();
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(501); finallyBlock();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(504); match(SWITCH);
				setState(505); parExpression();
				setState(506); match(LBRACE);
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(507); switchBlockStatementGroup();
						}
						} 
					}
					setState(512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(513); switchLabel();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519); match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(521); match(SYNCHRONIZED);
				setState(522); parExpression();
				setState(523); block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(525); match(RETURN);
				setState(527);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(526); expression(0);
					}
				}

				setState(529); match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(530); match(THROW);
				setState(531); expression(0);
				setState(532); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(534); match(BREAK);
				setState(536);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(535); match(Identifier);
					}
				}

				setState(538); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(539); match(CONTINUE);
				setState(541);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(540); match(Identifier);
					}
				}

				setState(543); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(544); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(545); statementExpression();
				setState(546); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(548); match(Identifier);
				setState(549); match(COLON);
				setState(550); statement();
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
			setState(553); match(CATCH);
			setState(554); match(LPAREN);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(555); variableModifier();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); catchType();
			setState(562); match(Identifier);
			setState(563); match(RPAREN);
			setState(564); block();
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
			setState(566); qualifiedName();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(567); match(BITOR);
				setState(568); qualifiedName();
				}
				}
				setState(573);
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
			setState(574); match(FINALLY);
			setState(575); block();
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
			setState(577); match(LPAREN);
			setState(578); resources();
			setState(580);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(579); match(SEMI);
				}
			}

			setState(582); match(RPAREN);
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
			setState(584); resource();
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585); match(SEMI);
					setState(586); resource();
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(592); variableModifier();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598); classOrInterfaceType();
			setState(599); variableDeclaratorId();
			setState(600); match(ASSIGN);
			setState(601); expression(0);
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
			setState(604); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(603); switchLabel();
				}
				}
				setState(606); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(609); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(608); blockStatement();
				}
				}
				setState(611); 
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
			setState(619);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(613); match(CASE);
				setState(614); constantExpression();
				setState(615); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(617); match(DEFAULT);
				setState(618); match(COLON);
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
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(622); forInit();
					}
				}

				setState(625); match(SEMI);
				setState(627);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(626); expression(0);
					}
				}

				setState(629); match(SEMI);
				setState(631);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(630); forUpdate();
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
			setState(637);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636); expressionList();
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
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(639); variableModifier();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645); typeType();
			setState(646); variableDeclaratorId();
			setState(647); match(COLON);
			setState(648); expression(0);
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
			setState(650); expressionList();
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
			setState(652); match(LPAREN);
			setState(653); expression(0);
			setState(654); match(RPAREN);
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
			setState(656); expression(0);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(657); match(COMMA);
				setState(658); expression(0);
				}
				}
				setState(663);
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
			setState(664); expression(0);
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
			setState(666); expression(0);
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
			setState(681);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(669); match(LPAREN);
				setState(670); typeType();
				setState(671); match(RPAREN);
				setState(672); expression(17);
				}
				break;
			case 2:
				{
				setState(674);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (ADD - 81)) | (1L << (SUB - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(675); expression(15);
				}
				break;
			case 3:
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(677); expression(14);
				}
				break;
			case 4:
				{
				setState(678); primary();
				}
				break;
			case 5:
				{
				setState(679); match(NEW);
				setState(680); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(749);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(684);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (MUL - 85)) | (1L << (DIV - 85)) | (1L << (MOD - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(685); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(687);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(688); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(689);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(697);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(690); match(LT);
							setState(691); match(LT);
							}
							break;
						case 2:
							{
							setState(692); match(GT);
							setState(693); match(GT);
							setState(694); match(GT);
							}
							break;
						case 3:
							{
							setState(695); match(GT);
							setState(696); match(GT);
							}
							break;
						}
						setState(699); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(700);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(701);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (LE - 69)) | (1L << (GE - 69)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(702); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(704);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(705); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(707); match(BITAND);
						setState(708); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(709);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(710); match(CARET);
						setState(711); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(712);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(713); match(BITOR);
						setState(714); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(716); match(AND);
						setState(717); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(719); match(OR);
						setState(720); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(721);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(722); match(QUESTION);
						setState(723); expression(0);
						setState(724); match(COLON);
						setState(725); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(728);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__3) | (1L << T__1))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68)) | (1L << (ADD_ASSIGN - 68)) | (1L << (SUB_ASSIGN - 68)) | (1L << (MUL_ASSIGN - 68)) | (1L << (DIV_ASSIGN - 68)) | (1L << (AND_ASSIGN - 68)) | (1L << (OR_ASSIGN - 68)) | (1L << (XOR_ASSIGN - 68)) | (1L << (MOD_ASSIGN - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(729); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(730);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(731); match(DOT);
						setState(732); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(733);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(734); match(LBRACK);
						setState(735); expression(0);
						setState(736); match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(739); match(LPAREN);
						setState(741);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
							{
							setState(740); expressionList();
							}
						}

						setState(743); match(RPAREN);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(745);
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
						setState(746);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(747); match(INSTANCEOF);
						setState(748); typeType();
						}
						break;
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754); match(LPAREN);
				setState(755); expression(0);
				setState(756); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758); match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759); match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(760); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(761); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(762); typeType();
				setState(763); match(DOT);
				setState(764); match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(766); match(T__6);
				setState(767); match(DOT);
				setState(768); match(CLASS);
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
			setState(780);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); nonWildcardTypeArguments();
				setState(772); createdName();
				setState(773); classCreatorRest();
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
				setState(775); createdName();
				setState(778);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(776); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(777); classCreatorRest();
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
			setState(797);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(782); match(Identifier);
				setState(784);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(783); typeArgumentsOrDiamond();
					}
				}

				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(786); match(DOT);
					setState(787); match(Identifier);
					setState(789);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(788); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(795);
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
				setState(796); primitiveType();
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
			setState(799); match(Identifier);
			setState(801);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(800); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(803); classCreatorRest();
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
			setState(805); match(LT);
			setState(806); typeList();
			setState(807); match(GT);
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
			setState(812);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809); match(LT);
				setState(810); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811); typeArguments();
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
			setState(817);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814); match(LT);
				setState(815); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816); nonWildcardTypeArguments();
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
			setState(819); match(LBRACK);
			setState(847);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(820); match(RBRACK);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(821); match(LBRACK);
					setState(822); match(RBRACK);
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(828); arrayInitializer();
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
				setState(829); expression(0);
				setState(830); match(RBRACK);
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(831); match(LBRACK);
						setState(832); expression(0);
						setState(833); match(RBRACK);
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(840); match(LBRACK);
						setState(841); match(RBRACK);
						}
						} 
					}
					setState(846);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
			setState(849); arguments();
			setState(851);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(850); classBody();
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
			setState(853); match(LPAREN);
			setState(855);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__2) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(854); expressionList();
				}
			}

			setState(857); match(RPAREN);
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
			setState(859); match(READ);
			setState(860); match(LPAREN);
			setState(861); primitiveType();
			setState(862); match(COMMA);
			setState(863); variableDeclaratorId();
			setState(864); match(RPAREN);
			setState(865); match(SEMI);
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
			setState(867); match(WRITE);
			setState(868); match(LPAREN);
			setState(869); expression(0);
			setState(870); match(RPAREN);
			setState(871); match(SEMI);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u036c\4\2\t\2\4"+
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
		"\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7\u00b0\n\7\3\7\3\7\3\7\5\7\u00b5\n"+
		"\7\3\7\3\7\5\7\u00b9\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16"+
		"\b\u00c4\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0"+
		"\13\n\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\3\13\3\13\3\f\3"+
		"\f\5\f\u00dd\n\f\3\f\3\f\5\f\u00e1\n\f\3\r\3\r\3\r\5\r\u00e6\n\r\3\16"+
		"\3\16\5\16\u00ea\n\16\3\16\3\16\3\16\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3"+
		"\13\16\3\16\3\16\5\16\u00f7\n\16\3\16\3\16\5\16\u00fb\n\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20\16\20\u0108\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\7\21\u010f\n\21\f\21\16\21\u0112\13\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\7\22\u011a\n\22\f\22\16\22\u011d\13\22\3\23\3"+
		"\23\3\23\5\23\u0122\n\23\3\24\3\24\3\24\7\24\u0127\n\24\f\24\16\24\u012a"+
		"\13\24\3\25\3\25\5\25\u012e\n\25\3\26\3\26\3\26\3\26\7\26\u0134\n\26\f"+
		"\26\16\26\u0137\13\26\3\26\5\26\u013a\n\26\5\26\u013c\n\26\3\26\3\26\3"+
		"\27\3\27\3\27\7\27\u0143\n\27\f\27\16\27\u0146\13\27\3\27\3\27\3\27\7"+
		"\27\u014b\n\27\f\27\16\27\u014e\13\27\5\27\u0150\n\27\3\30\3\30\5\30\u0154"+
		"\n\30\3\30\3\30\3\30\5\30\u0159\n\30\7\30\u015b\n\30\f\30\16\30\u015e"+
		"\13\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0166\n\32\f\32\16\32\u0169"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0171\n\33\5\33\u0173\n\33\3"+
		"\34\3\34\3\34\7\34\u0178\n\34\f\34\16\34\u017b\13\34\3\35\3\35\5\35\u017f"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0186\n\36\f\36\16\36\u0189\13\36"+
		"\3\36\3\36\5\36\u018d\n\36\3\36\5\36\u0190\n\36\3\37\7\37\u0193\n\37\f"+
		"\37\16\37\u0196\13\37\3\37\3\37\3\37\3 \7 \u019c\n \f \16 \u019f\13 \3"+
		" \3 \3 \3 \3!\3!\3\"\3\"\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad\13\"\3#\3#\3"+
		"$\3$\7$\u01b3\n$\f$\16$\u01b6\13$\3$\3$\3%\3%\5%\u01bc\n%\3&\3&\3&\3\'"+
		"\7\'\u01c2\n\'\f\'\16\'\u01c5\13\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u01d0"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u01e5"+
		"\n(\r(\16(\u01e6\3(\5(\u01ea\n(\3(\5(\u01ed\n(\3(\3(\3(\3(\7(\u01f3\n"+
		"(\f(\16(\u01f6\13(\3(\5(\u01f9\n(\3(\3(\3(\3(\7(\u01ff\n(\f(\16(\u0202"+
		"\13(\3(\7(\u0205\n(\f(\16(\u0208\13(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0212"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\5(\u021b\n(\3(\3(\3(\5(\u0220\n(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u022a\n(\3)\3)\3)\7)\u022f\n)\f)\16)\u0232\13)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\7*\u023c\n*\f*\16*\u023f\13*\3+\3+\3+\3,\3,\3,\5,\u0247"+
		"\n,\3,\3,\3-\3-\3-\7-\u024e\n-\f-\16-\u0251\13-\3.\7.\u0254\n.\f.\16."+
		"\u0257\13.\3.\3.\3.\3.\3.\3/\6/\u025f\n/\r/\16/\u0260\3/\6/\u0264\n/\r"+
		"/\16/\u0265\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u026e\n\60\3\61\3\61\5"+
		"\61\u0272\n\61\3\61\3\61\5\61\u0276\n\61\3\61\3\61\5\61\u027a\n\61\5\61"+
		"\u027c\n\61\3\62\3\62\5\62\u0280\n\62\3\63\7\63\u0283\n\63\f\63\16\63"+
		"\u0286\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\7\66\u0296\n\66\f\66\16\66\u0299\13\66\3\67\3\67\38\38\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\59\u02ac\n9\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u02bc\n9\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u02e8\n9\39\39\39\39\39\39\79\u02f0\n9\f9\16"+
		"9\u02f3\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0304\n:\3"+
		";\3;\3;\3;\3;\3;\3;\5;\u030d\n;\5;\u030f\n;\3<\3<\5<\u0313\n<\3<\3<\3"+
		"<\5<\u0318\n<\7<\u031a\n<\f<\16<\u031d\13<\3<\5<\u0320\n<\3=\3=\5=\u0324"+
		"\n=\3=\3=\3>\3>\3>\3>\3?\3?\3?\5?\u032f\n?\3@\3@\3@\5@\u0334\n@\3A\3A"+
		"\3A\3A\7A\u033a\nA\fA\16A\u033d\13A\3A\3A\3A\3A\3A\3A\3A\7A\u0346\nA\f"+
		"A\16A\u0349\13A\3A\3A\7A\u034d\nA\fA\16A\u0350\13A\5A\u0352\nA\3B\3B\5"+
		"B\u0356\nB\3C\3C\5C\u035a\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3"+
		"E\3E\3E\3E\2\3pF\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\2\16\6\2\5\5\27\27%\'++\13\2\7\7\n\n\16\16\24\24\31\31  \"\"**,,\4\2"+
		"\26\26--\3\2\67<\3\2SV\3\2IJ\4\2WX\\\\\3\2UV\4\2GHNO\4\2MMPP\7\2\4\4\6"+
		"\6\b\bFF]d\3\2ST\u03ae\2\u008b\3\2\2\2\4\u009b\3\2\2\2\6\u009f\3\2\2\2"+
		"\b\u00aa\3\2\2\2\n\u00ac\3\2\2\2\f\u00af\3\2\2\2\16\u00bc\3\2\2\2\20\u00c7"+
		"\3\2\2\2\22\u00c9\3\2\2\2\24\u00d1\3\2\2\2\26\u00e0\3\2\2\2\30\u00e5\3"+
		"\2\2\2\32\u00e9\3\2\2\2\34\u00fc\3\2\2\2\36\u0100\3\2\2\2 \u010b\3\2\2"+
		"\2\"\u0116\3\2\2\2$\u011e\3\2\2\2&\u0123\3\2\2\2(\u012d\3\2\2\2*\u012f"+
		"\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60\u015f\3\2\2\2\62\u0161\3\2\2"+
		"\2\64\u0172\3\2\2\2\66\u0174\3\2\2\28\u017c\3\2\2\2:\u018f\3\2\2\2<\u0194"+
		"\3\2\2\2>\u019d\3\2\2\2@\u01a4\3\2\2\2B\u01a6\3\2\2\2D\u01ae\3\2\2\2F"+
		"\u01b0\3\2\2\2H\u01bb\3\2\2\2J\u01bd\3\2\2\2L\u01c3\3\2\2\2N\u0229\3\2"+
		"\2\2P\u022b\3\2\2\2R\u0238\3\2\2\2T\u0240\3\2\2\2V\u0243\3\2\2\2X\u024a"+
		"\3\2\2\2Z\u0255\3\2\2\2\\\u025e\3\2\2\2^\u026d\3\2\2\2`\u027b\3\2\2\2"+
		"b\u027f\3\2\2\2d\u0284\3\2\2\2f\u028c\3\2\2\2h\u028e\3\2\2\2j\u0292\3"+
		"\2\2\2l\u029a\3\2\2\2n\u029c\3\2\2\2p\u02ab\3\2\2\2r\u0303\3\2\2\2t\u030e"+
		"\3\2\2\2v\u031f\3\2\2\2x\u0321\3\2\2\2z\u0327\3\2\2\2|\u032e\3\2\2\2~"+
		"\u0333\3\2\2\2\u0080\u0335\3\2\2\2\u0082\u0353\3\2\2\2\u0084\u0357\3\2"+
		"\2\2\u0086\u035d\3\2\2\2\u0088\u0365\3\2\2\2\u008a\u008c\5\4\3\2\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008f\5\6"+
		"\4\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\f"+
		"\7\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\2"+
		"\2\3\u009a\3\3\2\2\2\u009b\u009c\7$\2\2\u009c\u009d\5B\"\2\u009d\u009e"+
		"\7C\2\2\u009e\5\3\2\2\2\u009f\u00a1\7\36\2\2\u00a0\u00a2\7+\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\5B"+
		"\"\2\u00a4\u00a5\7E\2\2\u00a5\u00a7\7W\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7C\2\2\u00a9\7\3\2\2\2\u00aa"+
		"\u00ab\t\2\2\2\u00ab\t\3\2\2\2\u00ac\u00ad\7\27\2\2\u00ad\13\3\2\2\2\u00ae"+
		"\u00b0\7\'\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b4\7e\2\2\u00b3\u00b5\5\16\b\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\7\26"+
		"\2\2\u00b7\u00b9\5,\27\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\5\24\13\2\u00bb\r\3\2\2\2\u00bc\u00bd\7H\2"+
		"\2\u00bd\u00c2\5\20\t\2\u00be\u00bf\7D\2\2\u00bf\u00c1\5\20\t\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7G\2\2\u00c6"+
		"\17\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\21\3\2\2\2\u00c9\u00ce\5,\27\2\u00ca"+
		"\u00cb\7D\2\2\u00cb\u00cd\5,\27\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d5\7?\2\2\u00d2\u00d4\5\26\f\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\25\3\2\2\2\u00da\u00e1"+
		"\7C\2\2\u00db\u00dd\7+\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e1\5F$\2\u00df\u00e1\5\30\r\2\u00e0\u00da\3\2"+
		"\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e6"+
		"\5\32\16\2\u00e3\u00e6\5\34\17\2\u00e4\u00e6\5\f\7\2\u00e5\u00e2\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00ea"+
		"\5,\27\2\u00e8\u00ea\7\3\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00f1\58\35\2\u00ed\u00ee\7A\2"+
		"\2\u00ee\u00f0\7B\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\62\2\2\u00f5\u00f7\5\66\34\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fb\5@!\2\u00f9\u00fb\7C\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\33\3\2\2\2\u00fc\u00fd\5,\27"+
		"\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\7C\2\2\u00ff\35\3\2\2\2\u0100\u0101"+
		"\5,\27\2\u0101\u0106\5 \21\2\u0102\u0103\7D\2\2\u0103\u0105\5 \21\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7C\2\2\u010a"+
		"\37\3\2\2\2\u010b\u0110\7e\2\2\u010c\u010d\7A\2\2\u010d\u010f\7B\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7F\2\2\u0114"+
		"\u0115\5(\25\2\u0115!\3\2\2\2\u0116\u011b\5$\23\2\u0117\u0118\7D\2\2\u0118"+
		"\u011a\5$\23\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c#\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121"+
		"\5&\24\2\u011f\u0120\7F\2\2\u0120\u0122\5(\25\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122%\3\2\2\2\u0123\u0128\7e\2\2\u0124\u0125\7A\2\2\u0125"+
		"\u0127\7B\2\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\'\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012e"+
		"\5*\26\2\u012c\u012e\5p9\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		")\3\2\2\2\u012f\u013b\7?\2\2\u0130\u0135\5(\25\2\u0131\u0132\7D\2\2\u0132"+
		"\u0134\5(\25\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\7D\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0130\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\7@\2\2\u013e+\3\2\2\2\u013f\u0144\5.\30\2\u0140\u0141\7A\2\2\u0141"+
		"\u0143\7B\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0150\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014c\5\60\31\2\u0148\u0149\7A\2\2\u0149\u014b\7B\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u013f\3\2\2\2\u014f\u0147\3\2"+
		"\2\2\u0150-\3\2\2\2\u0151\u0153\7e\2\2\u0152\u0154\5\62\32\2\u0153\u0152"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015c\3\2\2\2\u0155\u0156\7E\2\2\u0156"+
		"\u0158\7e\2\2\u0157\u0159\5\62\32\2\u0158\u0157\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d/\3\2\2\2\u015e\u015c\3\2\2\2"+
		"\u015f\u0160\t\3\2\2\u0160\61\3\2\2\2\u0161\u0162\7H\2\2\u0162\u0167\5"+
		"\64\33\2\u0163\u0164\7D\2\2\u0164\u0166\5\64\33\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7G\2\2\u016b\63\3\2\2\2\u016c"+
		"\u0173\5,\27\2\u016d\u0170\7K\2\2\u016e\u016f\t\4\2\2\u016f\u0171\5,\27"+
		"\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u016c"+
		"\3\2\2\2\u0172\u016d\3\2\2\2\u0173\65\3\2\2\2\u0174\u0179\5B\"\2\u0175"+
		"\u0176\7D\2\2\u0176\u0178\5B\"\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2"+
		"\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\67\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u017e\7=\2\2\u017d\u017f\5:\36\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7>\2\2\u01819\3\2\2\2\u0182"+
		"\u0187\5<\37\2\u0183\u0184\7D\2\2\u0184\u0186\5<\37\2\u0185\u0183\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018c\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7D\2\2\u018b\u018d\5> "+
		"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u0190"+
		"\5> \2\u018f\u0182\3\2\2\2\u018f\u018e\3\2\2\2\u0190;\3\2\2\2\u0191\u0193"+
		"\5\n\6\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5,"+
		"\27\2\u0198\u0199\5&\24\2\u0199=\3\2\2\2\u019a\u019c\5\n\6\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\5,\27\2\u01a1\u01a2\7\t"+
		"\2\2\u01a2\u01a3\5&\24\2\u01a3?\3\2\2\2\u01a4\u01a5\5F$\2\u01a5A\3\2\2"+
		"\2\u01a6\u01ab\7e\2\2\u01a7\u01a8\7E\2\2\u01a8\u01aa\7e\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"C\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\t\5\2\2\u01afE\3\2\2\2\u01b0"+
		"\u01b4\7?\2\2\u01b1\u01b3\5H%\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2"+
		"\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01b8\7@\2\2\u01b8G\3\2\2\2\u01b9\u01bc\5J&\2\u01ba\u01bc"+
		"\5N(\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcI\3\2\2\2\u01bd\u01be"+
		"\5L\'\2\u01be\u01bf\7C\2\2\u01bfK\3\2\2\2\u01c0\u01c2\5\n\6\2\u01c1\u01c0"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\5,\27\2\u01c7\u01c8\5\""+
		"\22\2\u01c8M\3\2\2\2\u01c9\u022a\5F$\2\u01ca\u01cb\7\33\2\2\u01cb\u01cc"+
		"\5h\65\2\u01cc\u01cf\5N(\2\u01cd\u01ce\7\25\2\2\u01ce\u01d0\5N(\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u022a\3\2\2\2\u01d1\u01d2\7\32"+
		"\2\2\u01d2\u01d3\7=\2\2\u01d3\u01d4\5`\61\2\u01d4\u01d5\7>\2\2\u01d5\u01d6"+
		"\5N(\2\u01d6\u022a\3\2\2\2\u01d7\u01d8\7\65\2\2\u01d8\u01d9\5h\65\2\u01d9"+
		"\u01da\5N(\2\u01da\u022a\3\2\2\2\u01db\u01dc\7\23\2\2\u01dc\u01dd\5N("+
		"\2\u01dd\u01de\7\65\2\2\u01de\u01df\5h\65\2\u01df\u01e0\7C\2\2\u01e0\u022a"+
		"\3\2\2\2\u01e1\u01e2\7\63\2\2\u01e2\u01ec\5F$\2\u01e3\u01e5\5P)\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\5T+\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ed\5T+\2\u01ec\u01e4\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\u022a\3\2\2\2\u01ee\u01ef\7\63\2\2\u01ef\u01f0\5"+
		"V,\2\u01f0\u01f4\5F$\2\u01f1\u01f3\5P)\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f7\u01f9\5T+\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2"+
		"\2\u01f9\u022a\3\2\2\2\u01fa\u01fb\7.\2\2\u01fb\u01fc\5h\65\2\u01fc\u0200"+
		"\7?\2\2\u01fd\u01ff\5\\/\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0206\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0203\u0205\5^\60\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u020a\7@\2\2\u020a\u022a\3\2\2\2\u020b\u020c\7/\2\2\u020c\u020d"+
		"\5h\65\2\u020d\u020e\5F$\2\u020e\u022a\3\2\2\2\u020f\u0211\7)\2\2\u0210"+
		"\u0212\5p9\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2"+
		"\2\u0213\u022a\7C\2\2\u0214\u0215\7\61\2\2\u0215\u0216\5p9\2\u0216\u0217"+
		"\7C\2\2\u0217\u022a\3\2\2\2\u0218\u021a\7\13\2\2\u0219\u021b\7e\2\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u022a\7C"+
		"\2\2\u021d\u021f\7\21\2\2\u021e\u0220\7e\2\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022a\7C\2\2\u0222\u022a\7C\2"+
		"\2\u0223\u0224\5l\67\2\u0224\u0225\7C\2\2\u0225\u022a\3\2\2\2\u0226\u0227"+
		"\7e\2\2\u0227\u0228\7L\2\2\u0228\u022a\5N(\2\u0229\u01c9\3\2\2\2\u0229"+
		"\u01ca\3\2\2\2\u0229\u01d1\3\2\2\2\u0229\u01d7\3\2\2\2\u0229\u01db\3\2"+
		"\2\2\u0229\u01e1\3\2\2\2\u0229\u01ee\3\2\2\2\u0229\u01fa\3\2\2\2\u0229"+
		"\u020b\3\2\2\2\u0229\u020f\3\2\2\2\u0229\u0214\3\2\2\2\u0229\u0218\3\2"+
		"\2\2\u0229\u021d\3\2\2\2\u0229\u0222\3\2\2\2\u0229\u0223\3\2\2\2\u0229"+
		"\u0226\3\2\2\2\u022aO\3\2\2\2\u022b\u022c\7\r\2\2\u022c\u0230\7=\2\2\u022d"+
		"\u022f\5\n\6\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0234\5R*\2\u0234\u0235\7e\2\2\u0235\u0236\7>\2\2\u0236\u0237\5F$\2\u0237"+
		"Q\3\2\2\2\u0238\u023d\5B\"\2\u0239\u023a\7Z\2\2\u023a\u023c\5B\"\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023eS\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7\30\2\2\u0241\u0242"+
		"\5F$\2\u0242U\3\2\2\2\u0243\u0244\7=\2\2\u0244\u0246\5X-\2\u0245\u0247"+
		"\7C\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\7>\2\2\u0249W\3\2\2\2\u024a\u024f\5Z.\2\u024b\u024c\7C\2\2\u024c"+
		"\u024e\5Z.\2\u024d\u024b\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2"+
		"\2\u024f\u0250\3\2\2\2\u0250Y\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254"+
		"\5\n\6\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\5."+
		"\30\2\u0259\u025a\5&\24\2\u025a\u025b\7F\2\2\u025b\u025c\5p9\2\u025c["+
		"\3\2\2\2\u025d\u025f\5^\60\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0264\5H"+
		"%\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266]\3\2\2\2\u0267\u0268\7\f\2\2\u0268\u0269\5n8\2\u0269"+
		"\u026a\7L\2\2\u026a\u026e\3\2\2\2\u026b\u026c\7\22\2\2\u026c\u026e\7L"+
		"\2\2\u026d\u0267\3\2\2\2\u026d\u026b\3\2\2\2\u026e_\3\2\2\2\u026f\u027c"+
		"\5d\63\2\u0270\u0272\5b\62\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0275\7C\2\2\u0274\u0276\5p9\2\u0275\u0274\3\2\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\7C\2\2\u0278\u027a"+
		"\5f\64\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b"+
		"\u026f\3\2\2\2\u027b\u0271\3\2\2\2\u027ca\3\2\2\2\u027d\u0280\5L\'\2\u027e"+
		"\u0280\5j\66\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280c\3\2\2\2"+
		"\u0281\u0283\5\n\6\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287"+
		"\u0288\5,\27\2\u0288\u0289\5&\24\2\u0289\u028a\7L\2\2\u028a\u028b\5p9"+
		"\2\u028be\3\2\2\2\u028c\u028d\5j\66\2\u028dg\3\2\2\2\u028e\u028f\7=\2"+
		"\2\u028f\u0290\5p9\2\u0290\u0291\7>\2\2\u0291i\3\2\2\2\u0292\u0297\5p"+
		"9\2\u0293\u0294\7D\2\2\u0294\u0296\5p9\2\u0295\u0293\3\2\2\2\u0296\u0299"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298k\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u029a\u029b\5p9\2\u029bm\3\2\2\2\u029c\u029d\5p9\2\u029d"+
		"o\3\2\2\2\u029e\u029f\b9\1\2\u029f\u02a0\7=\2\2\u02a0\u02a1\5,\27\2\u02a1"+
		"\u02a2\7>\2\2\u02a2\u02a3\5p9\23\u02a3\u02ac\3\2\2\2\u02a4\u02a5\t\6\2"+
		"\2\u02a5\u02ac\5p9\21\u02a6\u02a7\t\7\2\2\u02a7\u02ac\5p9\20\u02a8\u02ac"+
		"\5r:\2\u02a9\u02aa\7#\2\2\u02aa\u02ac\5t;\2\u02ab\u029e\3\2\2\2\u02ab"+
		"\u02a4\3\2\2\2\u02ab\u02a6\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ac\u02f1\3\2\2\2\u02ad\u02ae\f\17\2\2\u02ae\u02af\t\b\2\2\u02af"+
		"\u02f0\5p9\20\u02b0\u02b1\f\16\2\2\u02b1\u02b2\t\t\2\2\u02b2\u02f0\5p"+
		"9\17\u02b3\u02bb\f\r\2\2\u02b4\u02b5\7H\2\2\u02b5\u02bc\7H\2\2\u02b6\u02b7"+
		"\7G\2\2\u02b7\u02b8\7G\2\2\u02b8\u02bc\7G\2\2\u02b9\u02ba\7G\2\2\u02ba"+
		"\u02bc\7G\2\2\u02bb\u02b4\3\2\2\2\u02bb\u02b6\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02f0\5p9\16\u02be\u02bf\f\f\2\2\u02bf"+
		"\u02c0\t\n\2\2\u02c0\u02f0\5p9\r\u02c1\u02c2\f\n\2\2\u02c2\u02c3\t\13"+
		"\2\2\u02c3\u02f0\5p9\13\u02c4\u02c5\f\t\2\2\u02c5\u02c6\7Y\2\2\u02c6\u02f0"+
		"\5p9\n\u02c7\u02c8\f\b\2\2\u02c8\u02c9\7[\2\2\u02c9\u02f0\5p9\t\u02ca"+
		"\u02cb\f\7\2\2\u02cb\u02cc\7Z\2\2\u02cc\u02f0\5p9\b\u02cd\u02ce\f\6\2"+
		"\2\u02ce\u02cf\7Q\2\2\u02cf\u02f0\5p9\7\u02d0\u02d1\f\5\2\2\u02d1\u02d2"+
		"\7R\2\2\u02d2\u02f0\5p9\6\u02d3\u02d4\f\4\2\2\u02d4\u02d5\7K\2\2\u02d5"+
		"\u02d6\5p9\2\u02d6\u02d7\7L\2\2\u02d7\u02d8\5p9\5\u02d8\u02f0\3\2\2\2"+
		"\u02d9\u02da\f\3\2\2\u02da\u02db\t\f\2\2\u02db\u02f0\5p9\3\u02dc\u02dd"+
		"\f\27\2\2\u02dd\u02de\7E\2\2\u02de\u02f0\7e\2\2\u02df\u02e0\f\26\2\2\u02e0"+
		"\u02e1\7A\2\2\u02e1\u02e2\5p9\2\u02e2\u02e3\7B\2\2\u02e3\u02f0\3\2\2\2"+
		"\u02e4\u02e5\f\25\2\2\u02e5\u02e7\7=\2\2\u02e6\u02e8\5j\66\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f0\7>\2\2\u02ea"+
		"\u02eb\f\22\2\2\u02eb\u02f0\t\r\2\2\u02ec\u02ed\f\13\2\2\u02ed\u02ee\7"+
		"\37\2\2\u02ee\u02f0\5,\27\2\u02ef\u02ad\3\2\2\2\u02ef\u02b0\3\2\2\2\u02ef"+
		"\u02b3\3\2\2\2\u02ef\u02be\3\2\2\2\u02ef\u02c1\3\2\2\2\u02ef\u02c4\3\2"+
		"\2\2\u02ef\u02c7\3\2\2\2\u02ef\u02ca\3\2\2\2\u02ef\u02cd\3\2\2\2\u02ef"+
		"\u02d0\3\2\2\2\u02ef\u02d3\3\2\2\2\u02ef\u02d9\3\2\2\2\u02ef\u02dc\3\2"+
		"\2\2\u02ef\u02df\3\2\2\2\u02ef\u02e4\3\2\2\2\u02ef\u02ea\3\2\2\2\u02ef"+
		"\u02ec\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2q\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7=\2\2\u02f5\u02f6"+
		"\5p9\2\u02f6\u02f7\7>\2\2\u02f7\u0304\3\2\2\2\u02f8\u0304\7\60\2\2\u02f9"+
		"\u0304\7-\2\2\u02fa\u0304\5D#\2\u02fb\u0304\7e\2\2\u02fc\u02fd\5,\27\2"+
		"\u02fd\u02fe\7E\2\2\u02fe\u02ff\7\17\2\2\u02ff\u0304\3\2\2\2\u0300\u0301"+
		"\7\3\2\2\u0301\u0302\7E\2\2\u0302\u0304\7\17\2\2\u0303\u02f4\3\2\2\2\u0303"+
		"\u02f8\3\2\2\2\u0303\u02f9\3\2\2\2\u0303\u02fa\3\2\2\2\u0303\u02fb\3\2"+
		"\2\2\u0303\u02fc\3\2\2\2\u0303\u0300\3\2\2\2\u0304s\3\2\2\2\u0305\u0306"+
		"\5z>\2\u0306\u0307\5v<\2\u0307\u0308\5\u0082B\2\u0308\u030f\3\2\2\2\u0309"+
		"\u030c\5v<\2\u030a\u030d\5\u0080A\2\u030b\u030d\5\u0082B\2\u030c\u030a"+
		"\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u0305\3\2\2\2\u030e"+
		"\u0309\3\2\2\2\u030fu\3\2\2\2\u0310\u0312\7e\2\2\u0311\u0313\5|?\2\u0312"+
		"\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u031b\3\2\2\2\u0314\u0315\7E"+
		"\2\2\u0315\u0317\7e\2\2\u0316\u0318\5|?\2\u0317\u0316\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0314\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0320\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031e\u0320\5\60\31\2\u031f\u0310\3\2\2\2\u031f\u031e\3\2\2\2\u0320"+
		"w\3\2\2\2\u0321\u0323\7e\2\2\u0322\u0324\5~@\2\u0323\u0322\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\5\u0082B\2\u0326y\3\2\2"+
		"\2\u0327\u0328\7H\2\2\u0328\u0329\5\22\n\2\u0329\u032a\7G\2\2\u032a{\3"+
		"\2\2\2\u032b\u032c\7H\2\2\u032c\u032f\7G\2\2\u032d\u032f\5\62\32\2\u032e"+
		"\u032b\3\2\2\2\u032e\u032d\3\2\2\2\u032f}\3\2\2\2\u0330\u0331\7H\2\2\u0331"+
		"\u0334\7G\2\2\u0332\u0334\5z>\2\u0333\u0330\3\2\2\2\u0333\u0332\3\2\2"+
		"\2\u0334\177\3\2\2\2\u0335\u0351\7A\2\2\u0336\u033b\7B\2\2\u0337\u0338"+
		"\7A\2\2\u0338\u033a\7B\2\2\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033e\u0352\5*\26\2\u033f\u0340\5p9\2\u0340\u0347\7B\2\2\u0341\u0342"+
		"\7A\2\2\u0342\u0343\5p9\2\u0343\u0344\7B\2\2\u0344\u0346\3\2\2\2\u0345"+
		"\u0341\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u034e\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\7A\2\2\u034b"+
		"\u034d\7B\2\2\u034c\u034a\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2"+
		"\2\2\u034e\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0351"+
		"\u0336\3\2\2\2\u0351\u033f\3\2\2\2\u0352\u0081\3\2\2\2\u0353\u0355\5\u0084"+
		"C\2\u0354\u0356\5\24\13\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0083\3\2\2\2\u0357\u0359\7=\2\2\u0358\u035a\5j\66\2\u0359\u0358\3\2"+
		"\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\7>\2\2\u035c"+
		"\u0085\3\2\2\2\u035d\u035e\7(\2\2\u035e\u035f\7=\2\2\u035f\u0360\5\60"+
		"\31\2\u0360\u0361\7D\2\2\u0361\u0362\5&\24\2\u0362\u0363\7>\2\2\u0363"+
		"\u0364\7C\2\2\u0364\u0087\3\2\2\2\u0365\u0366\7\66\2\2\u0366\u0367\7="+
		"\2\2\u0367\u0368\5p9\2\u0368\u0369\7>\2\2\u0369\u036a\7C\2\2\u036a\u0089"+
		"\3\2\2\2a\u008b\u0090\u0096\u00a1\u00a6\u00af\u00b4\u00b8\u00c2\u00ce"+
		"\u00d5\u00dc\u00e0\u00e5\u00e9\u00f1\u00f6\u00fa\u0106\u0110\u011b\u0121"+
		"\u0128\u012d\u0135\u0139\u013b\u0144\u014c\u014f\u0153\u0158\u015c\u0167"+
		"\u0170\u0172\u0179\u017e\u0187\u018c\u018f\u0194\u019d\u01ab\u01b4\u01bb"+
		"\u01c3\u01cf\u01e6\u01e9\u01ec\u01f4\u01f8\u0200\u0206\u0211\u021a\u021f"+
		"\u0229\u0230\u023d\u0246\u024f\u0255\u0260\u0265\u026d\u0271\u0275\u0279"+
		"\u027b\u027f\u0284\u0297\u02ab\u02bb\u02e7\u02ef\u02f1\u0303\u030c\u030e"+
		"\u0312\u0317\u031b\u031f\u0323\u032e\u0333\u033b\u0347\u034e\u0351\u0355"+
		"\u0359";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}