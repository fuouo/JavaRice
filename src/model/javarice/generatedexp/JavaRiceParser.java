package model.javarice.generatedexp;

// Generated from JavaRice.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ARITHMETIC_EXPRESSION=2, ARRAY_OUT_OF_BOUNDS=3, ASSERT=4, 
		BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, CATCH=9, CHAR=10, CLASS=11, CONST=12, 
		CONTINUE=13, DEFAULT=14, DO=15, DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, 
		FINAL=20, FINALLY=21, FLOAT=22, FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, 
		IMPORT=27, INSTANCEOF=28, INT=29, INTERFACE=30, LONG=31, MAIN=32, NATIVE=33, 
		NEGATIVE_ARRAY_SIZE=34, NEW=35, PACKAGE=36, PRIVATE=37, PROTECTED=38, 
		PUBLIC=39, READ=40, RETURN=41, SHORT=42, STATIC=43, STRICTFP=44, STRING=45, 
		SUPER=46, SWITCH=47, SYNCHRONIZED=48, THIS=49, THROW=50, THROWS=51, TRANSIENT=52, 
		TRY=53, VOID=54, VOLATILE=55, WHILE=56, WRITE=57, WRITELN=58, IntegerLiteral=59, 
		FloatingPointLiteral=60, BooleanLiteral=61, CharacterLiteral=62, StringLiteral=63, 
		NullLiteral=64, LPAREN=65, RPAREN=66, LBRACE=67, RBRACE=68, LBRACK=69, 
		RBRACK=70, SEMI=71, COMMA=72, DOT=73, ASSIGN=74, GT=75, LT=76, BANG=77, 
		TILDE=78, QUESTION=79, COLON=80, EQUAL=81, LE=82, GE=83, NOTEQUAL=84, 
		AND=85, OR=86, INC=87, DEC=88, ADD=89, SUB=90, MUL=91, DIV=92, BITAND=93, 
		BITOR=94, CARET=95, MOD=96, ADD_ASSIGN=97, SUB_ASSIGN=98, MUL_ASSIGN=99, 
		DIV_ASSIGN=100, AND_ASSIGN=101, OR_ASSIGN=102, XOR_ASSIGN=103, MOD_ASSIGN=104, 
		LSHIFT_ASSIGN=105, RSHIFT_ASSIGN=106, URSHIFT_ASSIGN=107, Identifier=108, 
		AT=109, ELLIPSIS=110, WS=111, COMMENT=112, LINE_COMMENT=113;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_mainDeclaration = 22, RULE_genericMethodDeclaration = 23, 
		RULE_constructorDeclaration = 24, RULE_genericConstructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_genericInterfaceMethodDeclaration = 32, RULE_variableDeclarators = 33, 
		RULE_variableDeclarator = 34, RULE_variableDeclaratorId = 35, RULE_variableInitializer = 36, 
		RULE_arrayInitializer = 37, RULE_enumConstantName = 38, RULE_typeType = 39, 
		RULE_classOrInterfaceType = 40, RULE_primitiveType = 41, RULE_typeArguments = 42, 
		RULE_typeArgument = 43, RULE_qualifiedNameList = 44, RULE_formalParameters = 45, 
		RULE_formalParameterList = 46, RULE_formalParameter = 47, RULE_lastFormalParameter = 48, 
		RULE_methodBody = 49, RULE_constructorBody = 50, RULE_qualifiedName = 51, 
		RULE_literal = 52, RULE_annotation = 53, RULE_annotationName = 54, RULE_elementValuePairs = 55, 
		RULE_elementValuePair = 56, RULE_elementValue = 57, RULE_elementValueArrayInitializer = 58, 
		RULE_annotationTypeDeclaration = 59, RULE_annotationTypeBody = 60, RULE_annotationTypeElementDeclaration = 61, 
		RULE_annotationTypeElementRest = 62, RULE_annotationMethodOrConstantRest = 63, 
		RULE_annotationMethodRest = 64, RULE_annotationConstantRest = 65, RULE_defaultValue = 66, 
		RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclarationStatement = 69, 
		RULE_localVariableDeclaration = 70, RULE_statement = 71, RULE_catchClause = 72, 
		RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_forUpdate = 83, RULE_parExpression = 84, RULE_expressionList = 85, 
		RULE_statementExpression = 86, RULE_constantExpression = 87, RULE_expression = 88, 
		RULE_primary = 89, RULE_creator = 90, RULE_createdName = 91, RULE_innerCreator = 92, 
		RULE_arrayCreatorRest = 93, RULE_classCreatorRest = 94, RULE_explicitGenericInvocation = 95, 
		RULE_nonWildcardTypeArguments = 96, RULE_typeArgumentsOrDiamond = 97, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 98, RULE_superSuffix = 99, RULE_explicitGenericInvocationSuffix = 100, 
		RULE_arguments = 101, RULE_scan = 102;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "mainDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "typeType", "classOrInterfaceType", "primitiveType", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"constructorBody", "qualifiedName", "literal", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments", "scan"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'ARITHMETIC_EXPRESSION'", "'ARRAY_OUT_OF_BOUNDS'", 
		"'assert'", "'_boolean'", "'break'", "'_byte'", "'case'", "'catch'", "'_char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'_double'", 
		"'else'", "'enum'", "'extends'", "'final'", "'finally'", "'_float'", "'for'", 
		"'if'", "'goto'", "'implements'", "'import'", "'instanceof'", "'_int'", 
		"'interface'", "'_long'", "'main'", "'native'", "'NEGATIVE_ARRAY_SIZE'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'read'", 
		"'return'", "'_short'", "'static'", "'strictfp'", "'_String'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'_void'", "'volatile'", "'while'", "'write'", "'writeln'", null, 
		null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ARITHMETIC_EXPRESSION", "ARRAY_OUT_OF_BOUNDS", "ASSERT", 
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "MAIN", "NATIVE", "NEGATIVE_ARRAY_SIZE", "NEW", 
		"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "READ", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "STRING", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
		"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "WRITE", 
		"WRITELN", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
		"COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "JavaRice.g4"; }

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
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaRiceParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(206);
				packageDeclaration();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(209);
				importDeclaration();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(215);
				typeDeclaration();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(223);
				annotation();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(PACKAGE);
			setState(230);
			qualifiedName();
			setState(231);
			match(SEMI);
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
			setState(233);
			match(IMPORT);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(234);
				match(STATIC);
				}
			}

			setState(237);
			qualifiedName();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(238);
				match(DOT);
				setState(239);
				match(MUL);
				}
			}

			setState(242);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(244);
					classOrInterfaceModifier();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(251);
					classOrInterfaceModifier();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(258);
					classOrInterfaceModifier();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(271);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				annotation();
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
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
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
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(CLASS);
			setState(288);
			match(Identifier);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(289);
				typeParameters();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(292);
				match(EXTENDS);
				setState(293);
				typeType();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(296);
				match(IMPLEMENTS);
				setState(297);
				typeList();
				}
			}

			setState(300);
			classBody();
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
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LT);
			setState(303);
			typeParameter();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				typeParameter();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(GT);
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
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Identifier);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(314);
				match(EXTENDS);
				setState(315);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			typeType();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(319);
				match(BITAND);
				setState(320);
				typeType();
				}
				}
				setState(325);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaRiceParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ENUM);
			setState(327);
			match(Identifier);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(328);
				match(IMPLEMENTS);
				setState(329);
				typeList();
				}
			}

			setState(332);
			match(LBRACE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(333);
				enumConstants();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(336);
				match(COMMA);
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(339);
				enumBodyDeclarations();
				}
			}

			setState(342);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			enumConstant();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					enumConstant();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(352);
				annotation();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(Identifier);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(359);
				arguments();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(362);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(SEMI);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (AT - 67)))) != 0)) {
				{
				{
				setState(366);
				classBodyDeclaration();
				}
				}
				setState(371);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(INTERFACE);
			setState(373);
			match(Identifier);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(374);
				typeParameters();
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(377);
				match(EXTENDS);
				setState(378);
				typeList();
				}
			}

			setState(381);
			interfaceBody();
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
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			typeType();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(385);
				typeType();
				}
				}
				setState(390);
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
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LBRACE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (AT - 67)))) != 0)) {
				{
				{
				setState(392);
				classBodyDeclaration();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LBRACE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (SEMI - 71)) | (1L << (LT - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				{
				setState(401);
				interfaceBodyDeclaration();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(RBRACE);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(410);
					match(STATIC);
					}
				}

				setState(413);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						modifier();
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(420);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
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
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				mainDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				genericMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				fieldDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				constructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				genericConstructorDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(430);
				annotationTypeDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(431);
				classDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(432);
				enumDeclaration();
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
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
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				{
				setState(435);
				typeType();
				}
				break;
			case VOID:
				{
				setState(436);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			match(Identifier);
			setState(440);
			formalParameters();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(441);
				match(LBRACK);
				setState(442);
				match(RBRACK);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(448);
				match(THROWS);
				setState(449);
				qualifiedNameList();
				}
			}

			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(452);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(453);
				match(SEMI);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(JavaRiceParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(JavaRiceParser.MAIN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(VOID);
			setState(457);
			match(MAIN);
			setState(458);
			match(LPAREN);
			setState(459);
			match(RPAREN);
			setState(460);
			methodBody();
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			typeParameters();
			setState(463);
			methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Identifier);
			setState(466);
			formalParameters();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(467);
				match(THROWS);
				setState(468);
				qualifiedNameList();
				}
			}

			setState(471);
			constructorBody();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			typeParameters();
			setState(474);
			constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			typeType();
			setState(477);
			variableDeclarators();
			setState(478);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case STRING:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(480);
						modifier();
						}
						} 
					}
					setState(485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(486);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(495);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(496);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
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
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			typeType();
			setState(500);
			constantDeclarator();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				constantDeclarator();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(SEMI);
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
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(Identifier);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(511);
				match(LBRACK);
				setState(512);
				match(RBRACK);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			match(ASSIGN);
			setState(519);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				{
				setState(521);
				typeType();
				}
				break;
			case VOID:
				{
				setState(522);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(525);
			match(Identifier);
			setState(526);
			formalParameters();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(527);
				match(LBRACK);
				setState(528);
				match(RBRACK);
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(534);
				match(THROWS);
				setState(535);
				qualifiedNameList();
				}
			}

			setState(538);
			match(SEMI);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			typeParameters();
			setState(541);
			interfaceMethodDeclaration();
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
		enterRule(_localctx, 66, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			variableDeclarator();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(544);
				match(COMMA);
				setState(545);
				variableDeclarator();
				}
				}
				setState(550);
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
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
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
		enterRule(_localctx, 68, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			variableDeclaratorId();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(552);
				match(ASSIGN);
				setState(553);
				variableInitializer();
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
		enterRule(_localctx, 70, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(Identifier);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(557);
				match(LBRACK);
				setState(558);
				match(RBRACK);
				}
				}
				setState(563);
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
		enterRule(_localctx, 72, RULE_variableInitializer);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
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
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				expression(0);
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
		enterRule(_localctx, 74, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(LBRACE);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(569);
				variableInitializer();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						match(COMMA);
						setState(571);
						variableInitializer();
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(577);
					match(COMMA);
					}
				}

				}
			}

			setState(582);
			match(RBRACE);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(Identifier);
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
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
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
		enterRule(_localctx, 78, RULE_typeType);
		try {
			int _alt;
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				classOrInterfaceType();
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						match(LBRACK);
						setState(588);
						match(RBRACK);
						}
						} 
					}
					setState(593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				primitiveType();
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(LBRACK);
						setState(596);
						match(RBRACK);
						}
						} 
					}
					setState(601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(JavaRiceParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaRiceParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
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
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(Identifier);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(605);
				typeArguments();
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(DOT);
					setState(609);
					match(Identifier);
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(610);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 82, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(LT);
			setState(621);
			typeArgument();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				typeArgument();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(GT);
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
		enterRule(_localctx, 86, RULE_typeArgument);
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
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
				setState(631);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(QUESTION);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(633);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(634);
					typeType();
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
		enterRule(_localctx, 88, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			qualifiedName();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(640);
				match(COMMA);
				setState(641);
				qualifiedName();
				}
				}
				setState(646);
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
		enterRule(_localctx, 90, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(LPAREN);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(648);
				formalParameterList();
				}
			}

			setState(651);
			match(RPAREN);
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
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
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
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				formalParameter();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						match(COMMA);
						setState(655);
						formalParameter();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(661);
					match(COMMA);
					setState(662);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				lastFormalParameter();
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
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
		enterRule(_localctx, 94, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(668);
				variableModifier();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			typeType();
			setState(675);
			variableDeclaratorId();
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
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
		enterRule(_localctx, 96, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(677);
				variableModifier();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			typeType();
			setState(684);
			match(ELLIPSIS);
			setState(685);
			variableDeclaratorId();
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
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			block();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			block();
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
		enterRule(_localctx, 102, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(Identifier);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					match(DOT);
					setState(693);
					match(Identifier);
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public TerminalNode IntegerLiteral() { return getToken(JavaRiceParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaRiceParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaRiceParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaRiceParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaRiceParser.BooleanLiteral, 0); }
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
		enterRule(_localctx, 104, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IntegerLiteral - 59)) | (1L << (FloatingPointLiteral - 59)) | (1L << (BooleanLiteral - 59)) | (1L << (CharacterLiteral - 59)) | (1L << (StringLiteral - 59)) | (1L << (NullLiteral - 59)))) != 0)) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(AT);
			setState(702);
			annotationName();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(703);
				match(LPAREN);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(704);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(705);
					elementValue();
					}
					break;
				}
				setState(708);
				match(RPAREN);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			qualifiedName();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			elementValuePair();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(714);
				match(COMMA);
				setState(715);
				elementValuePair();
				}
				}
				setState(720);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(Identifier);
			setState(722);
			match(ASSIGN);
			setState(723);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValue);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
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
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(LBRACE);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(731);
				elementValue();
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(732);
						match(COMMA);
						setState(733);
						elementValue();
						}
						} 
					}
					setState(738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(741);
				match(COMMA);
				}
			}

			setState(744);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(AT);
			setState(747);
			match(INTERFACE);
			setState(748);
			match(Identifier);
			setState(749);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(LBRACE);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (SEMI - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				{
				setState(752);
				annotationTypeElementDeclaration();
				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(758);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case STRING:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(760);
						modifier();
						}
						} 
					}
					setState(765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(766);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementRest);
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
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
				setState(770);
				typeType();
				setState(771);
				annotationMethodOrConstantRest();
				setState(772);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				classDeclaration();
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(775);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				interfaceDeclaration();
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(779);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				enumDeclaration();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(783);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(786);
				annotationTypeDeclaration();
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(787);
					match(SEMI);
					}
					break;
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodOrConstantRest);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(Identifier);
			setState(797);
			match(LPAREN);
			setState(798);
			match(RPAREN);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(799);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(DEFAULT);
			setState(805);
			elementValue();
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
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(LBRACE);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << READ) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << WRITE) | (1L << WRITELN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(808);
				blockStatement();
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
			match(RBRACE);
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
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
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
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				typeDeclaration();
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
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			localVariableDeclaration();
			setState(822);
			match(SEMI);
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
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
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(824);
				variableModifier();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			typeType();
			setState(831);
			variableDeclarators();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaRiceParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(JavaRiceParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(JavaRiceParser.WRITELN, 0); }
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
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
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				match(ASSERT);
				setState(835);
				expression(0);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(836);
					match(COLON);
					setState(837);
					expression(0);
					}
				}

				setState(840);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(IF);
				setState(843);
				parExpression();
				setState(844);
				statement();
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(845);
					match(ELSE);
					setState(846);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(FOR);
				setState(850);
				match(LPAREN);
				setState(851);
				forControl();
				setState(852);
				match(RPAREN);
				setState(853);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				match(WHILE);
				setState(856);
				parExpression();
				setState(857);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(859);
				match(DO);
				setState(860);
				statement();
				setState(861);
				match(WHILE);
				setState(862);
				parExpression();
				setState(863);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				match(TRY);
				setState(866);
				block();
				setState(876);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(868); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(867);
						catchClause();
						}
						}
						setState(870); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(872);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(875);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(878);
				match(TRY);
				setState(879);
				resourceSpecification();
				setState(880);
				block();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(881);
					catchClause();
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(887);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(890);
				match(SWITCH);
				setState(891);
				parExpression();
				setState(892);
				match(LBRACE);
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(893);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(899);
					switchLabel();
					}
					}
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(905);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(907);
				match(SYNCHRONIZED);
				setState(908);
				parExpression();
				setState(909);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(911);
				match(RETURN);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(912);
					expression(0);
					}
				}

				setState(915);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(916);
				match(THROW);
				setState(917);
				expression(0);
				setState(918);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(920);
				match(BREAK);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(921);
					match(Identifier);
					}
				}

				setState(924);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(925);
				match(CONTINUE);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(926);
					match(Identifier);
					}
				}

				setState(929);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(930);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(931);
				statementExpression();
				setState(932);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(934);
				match(Identifier);
				setState(935);
				match(COLON);
				setState(936);
				statement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(937);
				match(WRITE);
				setState(938);
				match(LPAREN);
				setState(939);
				expression(0);
				setState(940);
				match(RPAREN);
				setState(941);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(943);
				match(WRITELN);
				setState(944);
				match(LPAREN);
				setState(945);
				expression(0);
				setState(946);
				match(RPAREN);
				setState(947);
				match(SEMI);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(949);
				scan();
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
		enterRule(_localctx, 144, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(CATCH);
			setState(953);
			match(LPAREN);
			setState(954);
			catchType();
			setState(955);
			match(RPAREN);
			setState(956);
			block();
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
		public TerminalNode ARRAY_OUT_OF_BOUNDS() { return getToken(JavaRiceParser.ARRAY_OUT_OF_BOUNDS, 0); }
		public TerminalNode ARITHMETIC_EXPRESSION() { return getToken(JavaRiceParser.ARITHMETIC_EXPRESSION, 0); }
		public TerminalNode NEGATIVE_ARRAY_SIZE() { return getToken(JavaRiceParser.NEGATIVE_ARRAY_SIZE, 0); }
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
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARITHMETIC_EXPRESSION) | (1L << ARRAY_OUT_OF_BOUNDS) | (1L << NEGATIVE_ARRAY_SIZE))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(FINALLY);
			setState(961);
			block();
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
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(LPAREN);
			setState(964);
			resources();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(965);
				match(SEMI);
				}
			}

			setState(968);
			match(RPAREN);
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
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
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
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			resource();
			setState(975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(971);
					match(SEMI);
					setState(972);
					resource();
					}
					} 
				}
				setState(977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
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
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(978);
				variableModifier();
				}
				}
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(984);
			classOrInterfaceType();
			setState(985);
			variableDeclaratorId();
			setState(986);
			match(ASSIGN);
			setState(987);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
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
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(989);
				switchLabel();
				}
				}
				setState(992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(995); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(994);
				blockStatement();
				}
				}
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << READ) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << WRITE) | (1L << WRITELN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
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
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
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
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				match(CASE);
				setState(1000);
				constantExpression();
				setState(1001);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(CASE);
				setState(1004);
				enumConstantName();
				setState(1005);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(DEFAULT);
				setState(1008);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
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
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1012);
					forInit();
					}
				}

				setState(1015);
				match(SEMI);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1016);
					expression(0);
					}
				}

				setState(1019);
				match(SEMI);
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1020);
					forUpdate();
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
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				expressionList();
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
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
		enterRule(_localctx, 164, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1029);
				variableModifier();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035);
			typeType();
			setState(1036);
			variableDeclaratorId();
			setState(1037);
			match(COLON);
			setState(1038);
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
		enterRule(_localctx, 166, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			expressionList();
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
		enterRule(_localctx, 168, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(LPAREN);
			setState(1043);
			expression(0);
			setState(1044);
			match(RPAREN);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 170, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			expression(0);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1047);
				match(COMMA);
				setState(1048);
				expression(0);
				}
				}
				setState(1053);
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
		enterRule(_localctx, 172, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		enterRule(_localctx, 174, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1059);
				primary();
				}
				break;
			case 2:
				{
				setState(1060);
				match(NEW);
				setState(1061);
				creator();
				}
				break;
			case 3:
				{
				setState(1062);
				match(LPAREN);
				setState(1063);
				typeType();
				setState(1064);
				match(RPAREN);
				setState(1065);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1067);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (INC - 87)) | (1L << (DEC - 87)) | (1L << (ADD - 87)) | (1L << (SUB - 87)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1068);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1070);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1073);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1074);
						_la = _input.LA(1);
						if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (MUL - 91)) | (1L << (DIV - 91)) | (1L << (MOD - 91)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1075);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1076);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1077);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1078);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1079);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1087);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
						case 1:
							{
							setState(1080);
							match(LT);
							setState(1081);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1082);
							match(GT);
							setState(1083);
							match(GT);
							setState(1084);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1085);
							match(GT);
							setState(1086);
							match(GT);
							}
							break;
						}
						setState(1089);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1090);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1091);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (GT - 75)) | (1L << (LT - 75)) | (1L << (LE - 75)) | (1L << (GE - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1092);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1093);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1094);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1095);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1096);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1097);
						match(BITAND);
						setState(1098);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1100);
						match(CARET);
						setState(1101);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1103);
						match(BITOR);
						setState(1104);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1106);
						match(AND);
						setState(1107);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1109);
						match(OR);
						setState(1110);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1112);
						match(QUESTION);
						setState(1113);
						expression(0);
						setState(1114);
						match(COLON);
						setState(1115);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1118);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ASSIGN - 74)) | (1L << (ADD_ASSIGN - 74)) | (1L << (SUB_ASSIGN - 74)) | (1L << (MUL_ASSIGN - 74)) | (1L << (DIV_ASSIGN - 74)) | (1L << (AND_ASSIGN - 74)) | (1L << (OR_ASSIGN - 74)) | (1L << (XOR_ASSIGN - 74)) | (1L << (MOD_ASSIGN - 74)) | (1L << (LSHIFT_ASSIGN - 74)) | (1L << (RSHIFT_ASSIGN - 74)) | (1L << (URSHIFT_ASSIGN - 74)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1119);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1121);
						match(DOT);
						setState(1122);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1123);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1124);
						match(DOT);
						setState(1125);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1127);
						match(DOT);
						setState(1128);
						match(NEW);
						setState(1130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1129);
							nonWildcardTypeArguments();
							}
						}

						setState(1132);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1133);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1134);
						match(DOT);
						setState(1135);
						match(SUPER);
						setState(1136);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1138);
						match(DOT);
						setState(1139);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1141);
						match(LBRACK);
						setState(1142);
						expression(0);
						setState(1143);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1145);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1146);
						arguments();
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1148);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1150);
						match(INSTANCEOF);
						setState(1151);
						typeType();
						}
						break;
					}
					} 
				}
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 178, RULE_primary);
		try {
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				match(LPAREN);
				setState(1158);
				expression(0);
				setState(1159);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1163);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1165);
				typeType();
				setState(1166);
				match(DOT);
				setState(1167);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1169);
				match(VOID);
				setState(1170);
				match(DOT);
				setState(1171);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1172);
				nonWildcardTypeArguments();
				setState(1176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1173);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1174);
					match(THIS);
					setState(1175);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
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
		enterRule(_localctx, 180, RULE_creator);
		try {
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				nonWildcardTypeArguments();
				setState(1181);
				createdName();
				setState(1182);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
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
				setState(1184);
				createdName();
				setState(1187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1185);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1186);
					classCreatorRest();
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
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
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
		enterRule(_localctx, 182, RULE_createdName);
		int _la;
		try {
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				match(Identifier);
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1192);
					typeArgumentsOrDiamond();
					}
				}

				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1195);
					match(DOT);
					setState(1196);
					match(Identifier);
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1197);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				primitiveType();
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
		enterRule(_localctx, 184, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(Identifier);
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1209);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1212);
			classCreatorRest();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LBRACK);
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1215);
				match(RBRACK);
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1216);
					match(LBRACK);
					setState(1217);
					match(RBRACK);
					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
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
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1224);
				expression(0);
				setState(1225);
				match(RBRACK);
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1226);
						match(LBRACK);
						setState(1227);
						expression(0);
						setState(1228);
						match(RBRACK);
						}
						} 
					}
					setState(1234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1235);
						match(LBRACK);
						setState(1236);
						match(RBRACK);
						}
						} 
					}
					setState(1241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
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
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			arguments();
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1245);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			nonWildcardTypeArguments();
			setState(1249);
			explicitGenericInvocationSuffix();
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
		enterRule(_localctx, 192, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(LT);
			setState(1252);
			typeList();
			setState(1253);
			match(GT);
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
		enterRule(_localctx, 194, RULE_typeArgumentsOrDiamond);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(LT);
				setState(1256);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				typeArguments();
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
		enterRule(_localctx, 196, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				match(LT);
				setState(1261);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				nonWildcardTypeArguments();
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_superSuffix);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(DOT);
				setState(1267);
				match(Identifier);
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1268);
					arguments();
					}
					break;
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(SUPER);
				setState(1274);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				match(Identifier);
				setState(1276);
				arguments();
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
		enterRule(_localctx, 202, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(LPAREN);
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1280);
				expressionList();
				}
			}

			setState(1283);
			match(RPAREN);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 204, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(READ);
			setState(1286);
			match(LPAREN);
			setState(1287);
			expression(0);
			setState(1288);
			match(RPAREN);
			setState(1289);
			match(SEMI);
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
		case 88:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		case 16:
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u050e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\5\2\u00d2\n\2"+
		"\3\2\7\2\u00d5\n\2\f\2\16\2\u00d8\13\2\3\2\7\2\u00db\n\2\f\2\16\2\u00de"+
		"\13\2\3\2\3\2\3\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\u00ee\n\4\3\4\3\4\3\4\5\4\u00f3\n\4\3\4\3\4\3\5\7\5\u00f8\n"+
		"\5\f\5\16\5\u00fb\13\5\3\5\3\5\7\5\u00ff\n\5\f\5\16\5\u0102\13\5\3\5\3"+
		"\5\7\5\u0106\n\5\f\5\16\5\u0109\13\5\3\5\3\5\7\5\u010d\n\5\f\5\16\5\u0110"+
		"\13\5\3\5\3\5\5\5\u0114\n\5\3\6\3\6\5\6\u0118\n\6\3\7\3\7\5\7\u011c\n"+
		"\7\3\b\3\b\5\b\u0120\n\b\3\t\3\t\3\t\5\t\u0125\n\t\3\t\3\t\5\t\u0129\n"+
		"\t\3\t\3\t\5\t\u012d\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0135\n\n\f\n\16"+
		"\n\u0138\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u013f\n\13\3\f\3\f\3\f\7\f\u0144"+
		"\n\f\f\f\16\f\u0147\13\f\3\r\3\r\3\r\3\r\5\r\u014d\n\r\3\r\3\r\5\r\u0151"+
		"\n\r\3\r\5\r\u0154\n\r\3\r\5\r\u0157\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u015e"+
		"\n\16\f\16\16\16\u0161\13\16\3\17\7\17\u0164\n\17\f\17\16\17\u0167\13"+
		"\17\3\17\3\17\5\17\u016b\n\17\3\17\5\17\u016e\n\17\3\20\3\20\7\20\u0172"+
		"\n\20\f\20\16\20\u0175\13\20\3\21\3\21\3\21\5\21\u017a\n\21\3\21\3\21"+
		"\5\21\u017e\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0185\n\22\f\22\16\22\u0188"+
		"\13\22\3\23\3\23\7\23\u018c\n\23\f\23\16\23\u018f\13\23\3\23\3\23\3\24"+
		"\3\24\7\24\u0195\n\24\f\24\16\24\u0198\13\24\3\24\3\24\3\25\3\25\5\25"+
		"\u019e\n\25\3\25\3\25\7\25\u01a2\n\25\f\25\16\25\u01a5\13\25\3\25\5\25"+
		"\u01a8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b4"+
		"\n\26\3\27\3\27\5\27\u01b8\n\27\3\27\3\27\3\27\3\27\7\27\u01be\n\27\f"+
		"\27\16\27\u01c1\13\27\3\27\3\27\5\27\u01c5\n\27\3\27\3\27\5\27\u01c9\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5"+
		"\32\u01d8\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35"+
		"\u01e4\n\35\f\35\16\35\u01e7\13\35\3\35\3\35\5\35\u01eb\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01f4\n\36\3\37\3\37\3\37\3\37\7\37\u01fa"+
		"\n\37\f\37\16\37\u01fd\13\37\3\37\3\37\3 \3 \3 \7 \u0204\n \f \16 \u0207"+
		"\13 \3 \3 \3 \3!\3!\5!\u020e\n!\3!\3!\3!\3!\7!\u0214\n!\f!\16!\u0217\13"+
		"!\3!\3!\5!\u021b\n!\3!\3!\3\"\3\"\3\"\3#\3#\3#\7#\u0225\n#\f#\16#\u0228"+
		"\13#\3$\3$\3$\5$\u022d\n$\3%\3%\3%\7%\u0232\n%\f%\16%\u0235\13%\3&\3&"+
		"\5&\u0239\n&\3\'\3\'\3\'\3\'\7\'\u023f\n\'\f\'\16\'\u0242\13\'\3\'\5\'"+
		"\u0245\n\'\5\'\u0247\n\'\3\'\3\'\3(\3(\3)\3)\3)\7)\u0250\n)\f)\16)\u0253"+
		"\13)\3)\3)\3)\7)\u0258\n)\f)\16)\u025b\13)\5)\u025d\n)\3*\3*\5*\u0261"+
		"\n*\3*\3*\3*\5*\u0266\n*\7*\u0268\n*\f*\16*\u026b\13*\3+\3+\3,\3,\3,\3"+
		",\7,\u0273\n,\f,\16,\u0276\13,\3,\3,\3-\3-\3-\3-\5-\u027e\n-\5-\u0280"+
		"\n-\3.\3.\3.\7.\u0285\n.\f.\16.\u0288\13.\3/\3/\5/\u028c\n/\3/\3/\3\60"+
		"\3\60\3\60\7\60\u0293\n\60\f\60\16\60\u0296\13\60\3\60\3\60\5\60\u029a"+
		"\n\60\3\60\5\60\u029d\n\60\3\61\7\61\u02a0\n\61\f\61\16\61\u02a3\13\61"+
		"\3\61\3\61\3\61\3\62\7\62\u02a9\n\62\f\62\16\62\u02ac\13\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\7\65\u02b9\n\65\f\65\16"+
		"\65\u02bc\13\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u02c5\n\67\3\67"+
		"\5\67\u02c8\n\67\38\38\39\39\39\79\u02cf\n9\f9\169\u02d2\139\3:\3:\3:"+
		"\3:\3;\3;\3;\5;\u02db\n;\3<\3<\3<\3<\7<\u02e1\n<\f<\16<\u02e4\13<\5<\u02e6"+
		"\n<\3<\5<\u02e9\n<\3<\3<\3=\3=\3=\3=\3=\3>\3>\7>\u02f4\n>\f>\16>\u02f7"+
		"\13>\3>\3>\3?\7?\u02fc\n?\f?\16?\u02ff\13?\3?\3?\5?\u0303\n?\3@\3@\3@"+
		"\3@\3@\3@\5@\u030b\n@\3@\3@\5@\u030f\n@\3@\3@\5@\u0313\n@\3@\3@\5@\u0317"+
		"\n@\5@\u0319\n@\3A\3A\5A\u031d\nA\3B\3B\3B\3B\5B\u0323\nB\3C\3C\3D\3D"+
		"\3D\3E\3E\7E\u032c\nE\fE\16E\u032f\13E\3E\3E\3F\3F\3F\5F\u0336\nF\3G\3"+
		"G\3G\3H\7H\u033c\nH\fH\16H\u033f\13H\3H\3H\3H\3I\3I\3I\3I\3I\5I\u0349"+
		"\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0352\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\6I\u0367\nI\rI\16I\u0368\3I\5I\u036c\nI\3I\5"+
		"I\u036f\nI\3I\3I\3I\3I\7I\u0375\nI\fI\16I\u0378\13I\3I\5I\u037b\nI\3I"+
		"\3I\3I\3I\7I\u0381\nI\fI\16I\u0384\13I\3I\7I\u0387\nI\fI\16I\u038a\13"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0394\nI\3I\3I\3I\3I\3I\3I\3I\5I\u039d\n"+
		"I\3I\3I\3I\5I\u03a2\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\5I\u03b9\nI\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3L\3M\3M\3"+
		"M\5M\u03c9\nM\3M\3M\3N\3N\3N\7N\u03d0\nN\fN\16N\u03d3\13N\3O\7O\u03d6"+
		"\nO\fO\16O\u03d9\13O\3O\3O\3O\3O\3O\3P\6P\u03e1\nP\rP\16P\u03e2\3P\6P"+
		"\u03e6\nP\rP\16P\u03e7\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03f4\nQ\3R\3"+
		"R\5R\u03f8\nR\3R\3R\5R\u03fc\nR\3R\3R\5R\u0400\nR\5R\u0402\nR\3S\3S\5"+
		"S\u0406\nS\3T\7T\u0409\nT\fT\16T\u040c\13T\3T\3T\3T\3T\3T\3U\3U\3V\3V"+
		"\3V\3V\3W\3W\3W\7W\u041c\nW\fW\16W\u041f\13W\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0432\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u0442\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\5Z\u046d\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\7Z\u0483\nZ\fZ\16Z\u0486\13Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u049b\n[\5[\u049d\n[\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\5\\\u04a6\n\\\5\\\u04a8\n\\\3]\3]\5]\u04ac\n]\3]\3]\3]\5]\u04b1"+
		"\n]\7]\u04b3\n]\f]\16]\u04b6\13]\3]\5]\u04b9\n]\3^\3^\5^\u04bd\n^\3^\3"+
		"^\3_\3_\3_\3_\7_\u04c5\n_\f_\16_\u04c8\13_\3_\3_\3_\3_\3_\3_\3_\7_\u04d1"+
		"\n_\f_\16_\u04d4\13_\3_\3_\7_\u04d8\n_\f_\16_\u04db\13_\5_\u04dd\n_\3"+
		"`\3`\5`\u04e1\n`\3a\3a\3a\3b\3b\3b\3b\3c\3c\3c\5c\u04ed\nc\3d\3d\3d\5"+
		"d\u04f2\nd\3e\3e\3e\3e\5e\u04f8\ne\5e\u04fa\ne\3f\3f\3f\3f\5f\u0500\n"+
		"f\3g\3g\5g\u0504\ng\3g\3g\3h\3h\3h\3h\3h\3h\3h\2\3\u00b2i\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\2\20\6\2##\62\62\66\6699\6"+
		"\2\3\3\26\26\')-.\13\2\7\7\t\t\f\f\22\22\30\30\37\37!!,,//\4\2\25\25\60"+
		"\60\3\2=B\4\2\4\5$$\3\2Y\\\3\2OP\4\2]^bb\3\2[\\\4\2MNTU\4\2SSVV\4\2LL"+
		"cm\3\2YZ\2\u057f\2\u00d1\3\2\2\2\4\u00e4\3\2\2\2\6\u00eb\3\2\2\2\b\u0113"+
		"\3\2\2\2\n\u0117\3\2\2\2\f\u011b\3\2\2\2\16\u011f\3\2\2\2\20\u0121\3\2"+
		"\2\2\22\u0130\3\2\2\2\24\u013b\3\2\2\2\26\u0140\3\2\2\2\30\u0148\3\2\2"+
		"\2\32\u015a\3\2\2\2\34\u0165\3\2\2\2\36\u016f\3\2\2\2 \u0176\3\2\2\2\""+
		"\u0181\3\2\2\2$\u0189\3\2\2\2&\u0192\3\2\2\2(\u01a7\3\2\2\2*\u01b3\3\2"+
		"\2\2,\u01b7\3\2\2\2.\u01ca\3\2\2\2\60\u01d0\3\2\2\2\62\u01d3\3\2\2\2\64"+
		"\u01db\3\2\2\2\66\u01de\3\2\2\28\u01ea\3\2\2\2:\u01f3\3\2\2\2<\u01f5\3"+
		"\2\2\2>\u0200\3\2\2\2@\u020d\3\2\2\2B\u021e\3\2\2\2D\u0221\3\2\2\2F\u0229"+
		"\3\2\2\2H\u022e\3\2\2\2J\u0238\3\2\2\2L\u023a\3\2\2\2N\u024a\3\2\2\2P"+
		"\u025c\3\2\2\2R\u025e\3\2\2\2T\u026c\3\2\2\2V\u026e\3\2\2\2X\u027f\3\2"+
		"\2\2Z\u0281\3\2\2\2\\\u0289\3\2\2\2^\u029c\3\2\2\2`\u02a1\3\2\2\2b\u02aa"+
		"\3\2\2\2d\u02b1\3\2\2\2f\u02b3\3\2\2\2h\u02b5\3\2\2\2j\u02bd\3\2\2\2l"+
		"\u02bf\3\2\2\2n\u02c9\3\2\2\2p\u02cb\3\2\2\2r\u02d3\3\2\2\2t\u02da\3\2"+
		"\2\2v\u02dc\3\2\2\2x\u02ec\3\2\2\2z\u02f1\3\2\2\2|\u0302\3\2\2\2~\u0318"+
		"\3\2\2\2\u0080\u031c\3\2\2\2\u0082\u031e\3\2\2\2\u0084\u0324\3\2\2\2\u0086"+
		"\u0326\3\2\2\2\u0088\u0329\3\2\2\2\u008a\u0335\3\2\2\2\u008c\u0337\3\2"+
		"\2\2\u008e\u033d\3\2\2\2\u0090\u03b8\3\2\2\2\u0092\u03ba\3\2\2\2\u0094"+
		"\u03c0\3\2\2\2\u0096\u03c2\3\2\2\2\u0098\u03c5\3\2\2\2\u009a\u03cc\3\2"+
		"\2\2\u009c\u03d7\3\2\2\2\u009e\u03e0\3\2\2\2\u00a0\u03f3\3\2\2\2\u00a2"+
		"\u0401\3\2\2\2\u00a4\u0405\3\2\2\2\u00a6\u040a\3\2\2\2\u00a8\u0412\3\2"+
		"\2\2\u00aa\u0414\3\2\2\2\u00ac\u0418\3\2\2\2\u00ae\u0420\3\2\2\2\u00b0"+
		"\u0422\3\2\2\2\u00b2\u0431\3\2\2\2\u00b4\u049c\3\2\2\2\u00b6\u04a7\3\2"+
		"\2\2\u00b8\u04b8\3\2\2\2\u00ba\u04ba\3\2\2\2\u00bc\u04c0\3\2\2\2\u00be"+
		"\u04de\3\2\2\2\u00c0\u04e2\3\2\2\2\u00c2\u04e5\3\2\2\2\u00c4\u04ec\3\2"+
		"\2\2\u00c6\u04f1\3\2\2\2\u00c8\u04f9\3\2\2\2\u00ca\u04ff\3\2\2\2\u00cc"+
		"\u0501\3\2\2\2\u00ce\u0507\3\2\2\2\u00d0\u00d2\5\4\3\2\u00d1\u00d0\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\5\6\4\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5\b\5\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\2\2\3\u00e0"+
		"\3\3\2\2\2\u00e1\u00e3\5l\67\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e8\7&\2\2\u00e8\u00e9\5h\65\2\u00e9\u00ea\7I\2\2\u00ea"+
		"\5\3\2\2\2\u00eb\u00ed\7\35\2\2\u00ec\u00ee\7-\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\5h\65\2\u00f0\u00f1"+
		"\7K\2\2\u00f1\u00f3\7]\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\7I\2\2\u00f5\7\3\2\2\2\u00f6\u00f8\5\f\7\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0114\5\20\t\2"+
		"\u00fd\u00ff\5\f\7\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0114\5\30\r\2\u0104\u0106\5\f\7\2\u0105\u0104\3\2\2\2\u0106\u0109\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u0114\5 \21\2\u010b\u010d\5\f\7\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0114\5x=\2\u0112\u0114\7I\2"+
		"\2\u0113\u00f9\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010e"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114\t\3\2\2\2\u0115\u0118\5\f\7\2\u0116"+
		"\u0118\t\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\13\3\2\2"+
		"\2\u0119\u011c\5l\67\2\u011a\u011c\t\3\2\2\u011b\u0119\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\r\3\2\2\2\u011d\u0120\7\26\2\2\u011e\u0120\5l\67\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\17\3\2\2\2\u0121\u0122\7\r\2"+
		"\2\u0122\u0124\7n\2\2\u0123\u0125\5\22\n\2\u0124\u0123\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\7\25\2\2\u0127\u0129\5P)\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\7\34"+
		"\2\2\u012b\u012d\5\"\22\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\5$\23\2\u012f\21\3\2\2\2\u0130\u0131\7N\2\2"+
		"\u0131\u0136\5\24\13\2\u0132\u0133\7J\2\2\u0133\u0135\5\24\13\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7M\2\2\u013a"+
		"\23\3\2\2\2\u013b\u013e\7n\2\2\u013c\u013d\7\25\2\2\u013d\u013f\5\26\f"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\25\3\2\2\2\u0140\u0145"+
		"\5P)\2\u0141\u0142\7_\2\2\u0142\u0144\5P)\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\27\3\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0148\u0149\7\24\2\2\u0149\u014c\7n\2\2\u014a\u014b"+
		"\7\34\2\2\u014b\u014d\5\"\22\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u0150\7E\2\2\u014f\u0151\5\32\16\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7J\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\5\36"+
		"\20\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7F\2\2\u0159\31\3\2\2\2\u015a\u015f\5\34\17\2\u015b\u015c\7J\2"+
		"\2\u015c\u015e\5\34\17\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\33\3\2\2\2\u0161\u015f\3\2\2"+
		"\2\u0162\u0164\5l\67\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u016a\7n\2\2\u0169\u016b\5\u00ccg\2\u016a\u0169\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\5$\23\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\35\3\2\2\2\u016f\u0173\7I\2\2\u0170\u0172\5(\25\2"+
		"\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\37\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7 \2\2\u0177"+
		"\u0179\7n\2\2\u0178\u017a\5\22\n\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u017c\7\25\2\2\u017c\u017e\5\"\22\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5&"+
		"\24\2\u0180!\3\2\2\2\u0181\u0186\5P)\2\u0182\u0183\7J\2\2\u0183\u0185"+
		"\5P)\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187#\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d\7E\2\2\u018a"+
		"\u018c\5(\25\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\7F\2\2\u0191%\3\2\2\2\u0192\u0196\7E\2\2\u0193\u0195\58\35\2\u0194"+
		"\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7F\2\2\u019a"+
		"\'\3\2\2\2\u019b\u01a8\7I\2\2\u019c\u019e\7-\2\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a8\5\u0088E\2\u01a0\u01a2"+
		"\5\n\6\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\5*"+
		"\26\2\u01a7\u019b\3\2\2\2\u01a7\u019d\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8"+
		")\3\2\2\2\u01a9\u01b4\5,\27\2\u01aa\u01b4\5.\30\2\u01ab\u01b4\5\60\31"+
		"\2\u01ac\u01b4\5\66\34\2\u01ad\u01b4\5\62\32\2\u01ae\u01b4\5\64\33\2\u01af"+
		"\u01b4\5 \21\2\u01b0\u01b4\5x=\2\u01b1\u01b4\5\20\t\2\u01b2\u01b4\5\30"+
		"\r\2\u01b3\u01a9\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3"+
		"\u01ac\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2"+
		"\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"+\3\2\2\2\u01b5\u01b8\5P)\2\u01b6\u01b8\78\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bf\5\\"+
		"/\2\u01bb\u01bc\7G\2\2\u01bc\u01be\7H\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c1"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c3\7\65\2\2\u01c3\u01c5\5Z.\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c9\5d\63\2\u01c7"+
		"\u01c9\7I\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9-\3\2\2\2\u01ca"+
		"\u01cb\78\2\2\u01cb\u01cc\7\"\2\2\u01cc\u01cd\7C\2\2\u01cd\u01ce\7D\2"+
		"\2\u01ce\u01cf\5d\63\2\u01cf/\3\2\2\2\u01d0\u01d1\5\22\n\2\u01d1\u01d2"+
		"\5,\27\2\u01d2\61\3\2\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d7\5\\/\2\u01d5"+
		"\u01d6\7\65\2\2\u01d6\u01d8\5Z.\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\5f\64\2\u01da\63\3\2\2\2\u01db\u01dc"+
		"\5\22\n\2\u01dc\u01dd\5\62\32\2\u01dd\65\3\2\2\2\u01de\u01df\5P)\2\u01df"+
		"\u01e0\5D#\2\u01e0\u01e1\7I\2\2\u01e1\67\3\2\2\2\u01e2\u01e4\5\n\6\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\5:\36\2\u01e9"+
		"\u01eb\7I\2\2\u01ea\u01e5\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb9\3\2\2\2\u01ec"+
		"\u01f4\5<\37\2\u01ed\u01f4\5@!\2\u01ee\u01f4\5B\"\2\u01ef\u01f4\5 \21"+
		"\2\u01f0\u01f4\5x=\2\u01f1\u01f4\5\20\t\2\u01f2\u01f4\5\30\r\2\u01f3\u01ec"+
		"\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3"+
		"\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4;\3\2\2\2"+
		"\u01f5\u01f6\5P)\2\u01f6\u01fb\5> \2\u01f7\u01f8\7J\2\2\u01f8\u01fa\5"+
		"> \2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7I"+
		"\2\2\u01ff=\3\2\2\2\u0200\u0205\7n\2\2\u0201\u0202\7G\2\2\u0202\u0204"+
		"\7H\2\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7L"+
		"\2\2\u0209\u020a\5J&\2\u020a?\3\2\2\2\u020b\u020e\5P)\2\u020c\u020e\7"+
		"8\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\7n\2\2\u0210\u0215\5\\/\2\u0211\u0212\7G\2\2\u0212\u0214\7H\2\2"+
		"\u0213\u0211\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u021a\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7\65\2\2"+
		"\u0219\u021b\5Z.\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\7I\2\2\u021dA\3\2\2\2\u021e\u021f\5\22\n\2\u021f"+
		"\u0220\5@!\2\u0220C\3\2\2\2\u0221\u0226\5F$\2\u0222\u0223\7J\2\2\u0223"+
		"\u0225\5F$\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227E\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022c"+
		"\5H%\2\u022a\u022b\7L\2\2\u022b\u022d\5J&\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022dG\3\2\2\2\u022e\u0233\7n\2\2\u022f\u0230\7G\2\2\u0230"+
		"\u0232\7H\2\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234I\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0239"+
		"\5L\'\2\u0237\u0239\5\u00b2Z\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2"+
		"\u0239K\3\2\2\2\u023a\u0246\7E\2\2\u023b\u0240\5J&\2\u023c\u023d\7J\2"+
		"\2\u023d\u023f\5J&\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0245\7J\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2"+
		"\2\2\u0246\u023b\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\7F\2\2\u0249M\3\2\2\2\u024a\u024b\7n\2\2\u024bO\3\2\2\2\u024c\u0251"+
		"\5R*\2\u024d\u024e\7G\2\2\u024e\u0250\7H\2\2\u024f\u024d\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u025d\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0259\5T+\2\u0255\u0256\7G\2\2\u0256\u0258"+
		"\7H\2\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u024c\3\2"+
		"\2\2\u025c\u0254\3\2\2\2\u025dQ\3\2\2\2\u025e\u0260\7n\2\2\u025f\u0261"+
		"\5V,\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0269\3\2\2\2\u0262"+
		"\u0263\7K\2\2\u0263\u0265\7n\2\2\u0264\u0266\5V,\2\u0265\u0264\3\2\2\2"+
		"\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0268\u026b"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026aS\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026d\t\4\2\2\u026dU\3\2\2\2\u026e\u026f\7N\2\2\u026f"+
		"\u0274\5X-\2\u0270\u0271\7J\2\2\u0271\u0273\5X-\2\u0272\u0270\3\2\2\2"+
		"\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\7M\2\2\u0278W\3\2\2\2\u0279\u0280"+
		"\5P)\2\u027a\u027d\7Q\2\2\u027b\u027c\t\5\2\2\u027c\u027e\5P)\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0279\3\2"+
		"\2\2\u027f\u027a\3\2\2\2\u0280Y\3\2\2\2\u0281\u0286\5h\65\2\u0282\u0283"+
		"\7J\2\2\u0283\u0285\5h\65\2\u0284\u0282\3\2\2\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287[\3\2\2\2\u0288\u0286\3\2\2\2"+
		"\u0289\u028b\7C\2\2\u028a\u028c\5^\60\2\u028b\u028a\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7D\2\2\u028e]\3\2\2\2\u028f\u0294"+
		"\5`\61\2\u0290\u0291\7J\2\2\u0291\u0293\5`\61\2\u0292\u0290\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0299\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7J\2\2\u0298\u029a\5b\62\2\u0299"+
		"\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u029d\5b"+
		"\62\2\u029c\u028f\3\2\2\2\u029c\u029b\3\2\2\2\u029d_\3\2\2\2\u029e\u02a0"+
		"\5\16\b\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2"+
		"\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5"+
		"\5P)\2\u02a5\u02a6\5H%\2\u02a6a\3\2\2\2\u02a7\u02a9\5\16\b\2\u02a8\u02a7"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\5P)\2\u02ae\u02af\7p\2"+
		"\2\u02af\u02b0\5H%\2\u02b0c\3\2\2\2\u02b1\u02b2\5\u0088E\2\u02b2e\3\2"+
		"\2\2\u02b3\u02b4\5\u0088E\2\u02b4g\3\2\2\2\u02b5\u02ba\7n\2\2\u02b6\u02b7"+
		"\7K\2\2\u02b7\u02b9\7n\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbi\3\2\2\2\u02bc\u02ba\3\2\2\2"+
		"\u02bd\u02be\t\6\2\2\u02bek\3\2\2\2\u02bf\u02c0\7o\2\2\u02c0\u02c7\5n"+
		"8\2\u02c1\u02c4\7C\2\2\u02c2\u02c5\5p9\2\u02c3\u02c5\5t;\2\u02c4\u02c2"+
		"\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c8\7D\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8m\3\2\2\2\u02c9"+
		"\u02ca\5h\65\2\u02cao\3\2\2\2\u02cb\u02d0\5r:\2\u02cc\u02cd\7J\2\2\u02cd"+
		"\u02cf\5r:\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2"+
		"\2\u02d0\u02d1\3\2\2\2\u02d1q\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4"+
		"\7n\2\2\u02d4\u02d5\7L\2\2\u02d5\u02d6\5t;\2\u02d6s\3\2\2\2\u02d7\u02db"+
		"\5\u00b2Z\2\u02d8\u02db\5l\67\2\u02d9\u02db\5v<\2\u02da\u02d7\3\2\2\2"+
		"\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02dbu\3\2\2\2\u02dc\u02e5\7"+
		"E\2\2\u02dd\u02e2\5t;\2\u02de\u02df\7J\2\2\u02df\u02e1\5t;\2\u02e0\u02de"+
		"\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02dd\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e9\7J\2\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7F\2\2\u02ebw\3\2\2\2\u02ec"+
		"\u02ed\7o\2\2\u02ed\u02ee\7 \2\2\u02ee\u02ef\7n\2\2\u02ef\u02f0\5z>\2"+
		"\u02f0y\3\2\2\2\u02f1\u02f5\7E\2\2\u02f2\u02f4\5|?\2\u02f3\u02f2\3\2\2"+
		"\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7F\2\2\u02f9{\3\2\2\2\u02fa\u02fc"+
		"\5\n\6\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0303\5~"+
		"@\2\u0301\u0303\7I\2\2\u0302\u02fd\3\2\2\2\u0302\u0301\3\2\2\2\u0303}"+
		"\3\2\2\2\u0304\u0305\5P)\2\u0305\u0306\5\u0080A\2\u0306\u0307\7I\2\2\u0307"+
		"\u0319\3\2\2\2\u0308\u030a\5\20\t\2\u0309\u030b\7I\2\2\u030a\u0309\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u0319\3\2\2\2\u030c\u030e\5 \21\2\u030d"+
		"\u030f\7I\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0319\3\2"+
		"\2\2\u0310\u0312\5\30\r\2\u0311\u0313\7I\2\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0319\3\2\2\2\u0314\u0316\5x=\2\u0315\u0317\7I\2"+
		"\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0304"+
		"\3\2\2\2\u0318\u0308\3\2\2\2\u0318\u030c\3\2\2\2\u0318\u0310\3\2\2\2\u0318"+
		"\u0314\3\2\2\2\u0319\177\3\2\2\2\u031a\u031d\5\u0082B\2\u031b\u031d\5"+
		"\u0084C\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0081\3\2\2\2"+
		"\u031e\u031f\7n\2\2\u031f\u0320\7C\2\2\u0320\u0322\7D\2\2\u0321\u0323"+
		"\5\u0086D\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0083\3\2\2"+
		"\2\u0324\u0325\5D#\2\u0325\u0085\3\2\2\2\u0326\u0327\7\20\2\2\u0327\u0328"+
		"\5t;\2\u0328\u0087\3\2\2\2\u0329\u032d\7E\2\2\u032a\u032c\5\u008aF\2\u032b"+
		"\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7F\2\2\u0331"+
		"\u0089\3\2\2\2\u0332\u0336\5\u008cG\2\u0333\u0336\5\u0090I\2\u0334\u0336"+
		"\5\b\5\2\u0335\u0332\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0334\3\2\2\2\u0336"+
		"\u008b\3\2\2\2\u0337\u0338\5\u008eH\2\u0338\u0339\7I\2\2\u0339\u008d\3"+
		"\2\2\2\u033a\u033c\5\16\b\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0341\5P)\2\u0341\u0342\5D#\2\u0342\u008f\3\2\2\2\u0343\u03b9"+
		"\5\u0088E\2\u0344\u0345\7\6\2\2\u0345\u0348\5\u00b2Z\2\u0346\u0347\7R"+
		"\2\2\u0347\u0349\5\u00b2Z\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\7I\2\2\u034b\u03b9\3\2\2\2\u034c\u034d\7\32"+
		"\2\2\u034d\u034e\5\u00aaV\2\u034e\u0351\5\u0090I\2\u034f\u0350\7\23\2"+
		"\2\u0350\u0352\5\u0090I\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u03b9\3\2\2\2\u0353\u0354\7\31\2\2\u0354\u0355\7C\2\2\u0355\u0356\5\u00a2"+
		"R\2\u0356\u0357\7D\2\2\u0357\u0358\5\u0090I\2\u0358\u03b9\3\2\2\2\u0359"+
		"\u035a\7:\2\2\u035a\u035b\5\u00aaV\2\u035b\u035c\5\u0090I\2\u035c\u03b9"+
		"\3\2\2\2\u035d\u035e\7\21\2\2\u035e\u035f\5\u0090I\2\u035f\u0360\7:\2"+
		"\2\u0360\u0361\5\u00aaV\2\u0361\u0362\7I\2\2\u0362\u03b9\3\2\2\2\u0363"+
		"\u0364\7\67\2\2\u0364\u036e\5\u0088E\2\u0365\u0367\5\u0092J\2\u0366\u0365"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036b\3\2\2\2\u036a\u036c\5\u0096L\2\u036b\u036a\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036f\5\u0096L\2\u036e\u0366\3\2\2"+
		"\2\u036e\u036d\3\2\2\2\u036f\u03b9\3\2\2\2\u0370\u0371\7\67\2\2\u0371"+
		"\u0372\5\u0098M\2\u0372\u0376\5\u0088E\2\u0373\u0375\5\u0092J\2\u0374"+
		"\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037b\5\u0096L\2\u037a"+
		"\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u03b9\3\2\2\2\u037c\u037d\7\61"+
		"\2\2\u037d\u037e\5\u00aaV\2\u037e\u0382\7E\2\2\u037f\u0381\5\u009eP\2"+
		"\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383"+
		"\3\2\2\2\u0383\u0388\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0387\5\u00a0Q"+
		"\2\u0386\u0385\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7F\2\2\u038c"+
		"\u03b9\3\2\2\2\u038d\u038e\7\62\2\2\u038e\u038f\5\u00aaV\2\u038f\u0390"+
		"\5\u0088E\2\u0390\u03b9\3\2\2\2\u0391\u0393\7+\2\2\u0392\u0394\5\u00b2"+
		"Z\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u03b9\7I\2\2\u0396\u0397\7\64\2\2\u0397\u0398\5\u00b2Z\2\u0398\u0399"+
		"\7I\2\2\u0399\u03b9\3\2\2\2\u039a\u039c\7\b\2\2\u039b\u039d\7n\2\2\u039c"+
		"\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03b9\7I"+
		"\2\2\u039f\u03a1\7\17\2\2\u03a0\u03a2\7n\2\2\u03a1\u03a0\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03b9\7I\2\2\u03a4\u03b9\7I\2"+
		"\2\u03a5\u03a6\5\u00aeX\2\u03a6\u03a7\7I\2\2\u03a7\u03b9\3\2\2\2\u03a8"+
		"\u03a9\7n\2\2\u03a9\u03aa\7R\2\2\u03aa\u03b9\5\u0090I\2\u03ab\u03ac\7"+
		";\2\2\u03ac\u03ad\7C\2\2\u03ad\u03ae\5\u00b2Z\2\u03ae\u03af\7D\2\2\u03af"+
		"\u03b0\7I\2\2\u03b0\u03b9\3\2\2\2\u03b1\u03b2\7<\2\2\u03b2\u03b3\7C\2"+
		"\2\u03b3\u03b4\5\u00b2Z\2\u03b4\u03b5\7D\2\2\u03b5\u03b6\7I\2\2\u03b6"+
		"\u03b9\3\2\2\2\u03b7\u03b9\5\u00ceh\2\u03b8\u0343\3\2\2\2\u03b8\u0344"+
		"\3\2\2\2\u03b8\u034c\3\2\2\2\u03b8\u0353\3\2\2\2\u03b8\u0359\3\2\2\2\u03b8"+
		"\u035d\3\2\2\2\u03b8\u0363\3\2\2\2\u03b8\u0370\3\2\2\2\u03b8\u037c\3\2"+
		"\2\2\u03b8\u038d\3\2\2\2\u03b8\u0391\3\2\2\2\u03b8\u0396\3\2\2\2\u03b8"+
		"\u039a\3\2\2\2\u03b8\u039f\3\2\2\2\u03b8\u03a4\3\2\2\2\u03b8\u03a5\3\2"+
		"\2\2\u03b8\u03a8\3\2\2\2\u03b8\u03ab\3\2\2\2\u03b8\u03b1\3\2\2\2\u03b8"+
		"\u03b7\3\2\2\2\u03b9\u0091\3\2\2\2\u03ba\u03bb\7\13\2\2\u03bb\u03bc\7"+
		"C\2\2\u03bc\u03bd\5\u0094K\2\u03bd\u03be\7D\2\2\u03be\u03bf\5\u0088E\2"+
		"\u03bf\u0093\3\2\2\2\u03c0\u03c1\t\7\2\2\u03c1\u0095\3\2\2\2\u03c2\u03c3"+
		"\7\27\2\2\u03c3\u03c4\5\u0088E\2\u03c4\u0097\3\2\2\2\u03c5\u03c6\7C\2"+
		"\2\u03c6\u03c8\5\u009aN\2\u03c7\u03c9\7I\2\2\u03c8\u03c7\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\7D\2\2\u03cb\u0099\3\2"+
		"\2\2\u03cc\u03d1\5\u009cO\2\u03cd\u03ce\7I\2\2\u03ce\u03d0\5\u009cO\2"+
		"\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2"+
		"\3\2\2\2\u03d2\u009b\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d6\5\16\b\2"+
		"\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8"+
		"\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\5R*\2\u03db"+
		"\u03dc\5H%\2\u03dc\u03dd\7L\2\2\u03dd\u03de\5\u00b2Z\2\u03de\u009d\3\2"+
		"\2\2\u03df\u03e1\5\u00a0Q\2\u03e0\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e6\5\u008a"+
		"F\2\u03e5\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u009f\3\2\2\2\u03e9\u03ea\7\n\2\2\u03ea\u03eb\5\u00b0"+
		"Y\2\u03eb\u03ec\7R\2\2\u03ec\u03f4\3\2\2\2\u03ed\u03ee\7\n\2\2\u03ee\u03ef"+
		"\5N(\2\u03ef\u03f0\7R\2\2\u03f0\u03f4\3\2\2\2\u03f1\u03f2\7\20\2\2\u03f2"+
		"\u03f4\7R\2\2\u03f3\u03e9\3\2\2\2\u03f3\u03ed\3\2\2\2\u03f3\u03f1\3\2"+
		"\2\2\u03f4\u00a1\3\2\2\2\u03f5\u0402\5\u00a6T\2\u03f6\u03f8\5\u00a4S\2"+
		"\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb"+
		"\7I\2\2\u03fa\u03fc\5\u00b2Z\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2"+
		"\u03fc\u03fd\3\2\2\2\u03fd\u03ff\7I\2\2\u03fe\u0400\5\u00a8U\2\u03ff\u03fe"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03f5\3\2\2\2\u0401"+
		"\u03f7\3\2\2\2\u0402\u00a3\3\2\2\2\u0403\u0406\5\u008eH\2\u0404\u0406"+
		"\5\u00acW\2\u0405\u0403\3\2\2\2\u0405\u0404\3\2\2\2\u0406\u00a5\3\2\2"+
		"\2\u0407\u0409\5\16\b\2\u0408\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a"+
		"\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040d\u040e\5P)\2\u040e\u040f\5H%\2\u040f\u0410\7R\2\2\u0410\u0411"+
		"\5\u00b2Z\2\u0411\u00a7\3\2\2\2\u0412\u0413\5\u00acW\2\u0413\u00a9\3\2"+
		"\2\2\u0414\u0415\7C\2\2\u0415\u0416\5\u00b2Z\2\u0416\u0417\7D\2\2\u0417"+
		"\u00ab\3\2\2\2\u0418\u041d\5\u00b2Z\2\u0419\u041a\7J\2\2\u041a\u041c\5"+
		"\u00b2Z\2\u041b\u0419\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2"+
		"\u041d\u041e\3\2\2\2\u041e\u00ad\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0421"+
		"\5\u00b2Z\2\u0421\u00af\3\2\2\2\u0422\u0423\5\u00b2Z\2\u0423\u00b1\3\2"+
		"\2\2\u0424\u0425\bZ\1\2\u0425\u0432\5\u00b4[\2\u0426\u0427\7%\2\2\u0427"+
		"\u0432\5\u00b6\\\2\u0428\u0429\7C\2\2\u0429\u042a\5P)\2\u042a\u042b\7"+
		"D\2\2\u042b\u042c\5\u00b2Z\23\u042c\u0432\3\2\2\2\u042d\u042e\t\b\2\2"+
		"\u042e\u0432\5\u00b2Z\21\u042f\u0430\t\t\2\2\u0430\u0432\5\u00b2Z\20\u0431"+
		"\u0424\3\2\2\2\u0431\u0426\3\2\2\2\u0431\u0428\3\2\2\2\u0431\u042d\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0432\u0484\3\2\2\2\u0433\u0434\f\17\2\2\u0434"+
		"\u0435\t\n\2\2\u0435\u0483\5\u00b2Z\20\u0436\u0437\f\16\2\2\u0437\u0438"+
		"\t\13\2\2\u0438\u0483\5\u00b2Z\17\u0439\u0441\f\r\2\2\u043a\u043b\7N\2"+
		"\2\u043b\u0442\7N\2\2\u043c\u043d\7M\2\2\u043d\u043e\7M\2\2\u043e\u0442"+
		"\7M\2\2\u043f\u0440\7M\2\2\u0440\u0442\7M\2\2\u0441\u043a\3\2\2\2\u0441"+
		"\u043c\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0483\5\u00b2"+
		"Z\16\u0444\u0445\f\f\2\2\u0445\u0446\t\f\2\2\u0446\u0483\5\u00b2Z\r\u0447"+
		"\u0448\f\n\2\2\u0448\u0449\t\r\2\2\u0449\u0483\5\u00b2Z\13\u044a\u044b"+
		"\f\t\2\2\u044b\u044c\7_\2\2\u044c\u0483\5\u00b2Z\n\u044d\u044e\f\b\2\2"+
		"\u044e\u044f\7a\2\2\u044f\u0483\5\u00b2Z\t\u0450\u0451\f\7\2\2\u0451\u0452"+
		"\7`\2\2\u0452\u0483\5\u00b2Z\b\u0453\u0454\f\6\2\2\u0454\u0455\7W\2\2"+
		"\u0455\u0483\5\u00b2Z\7\u0456\u0457\f\5\2\2\u0457\u0458\7X\2\2\u0458\u0483"+
		"\5\u00b2Z\6\u0459\u045a\f\4\2\2\u045a\u045b\7Q\2\2\u045b\u045c\5\u00b2"+
		"Z\2\u045c\u045d\7R\2\2\u045d\u045e\5\u00b2Z\5\u045e\u0483\3\2\2\2\u045f"+
		"\u0460\f\3\2\2\u0460\u0461\t\16\2\2\u0461\u0483\5\u00b2Z\3\u0462\u0463"+
		"\f\33\2\2\u0463\u0464\7K\2\2\u0464\u0483\7n\2\2\u0465\u0466\f\32\2\2\u0466"+
		"\u0467\7K\2\2\u0467\u0483\7\63\2\2\u0468\u0469\f\31\2\2\u0469\u046a\7"+
		"K\2\2\u046a\u046c\7%\2\2\u046b\u046d\5\u00c2b\2\u046c\u046b\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0483\5\u00ba^\2\u046f\u0470"+
		"\f\30\2\2\u0470\u0471\7K\2\2\u0471\u0472\7\60\2\2\u0472\u0483\5\u00c8"+
		"e\2\u0473\u0474\f\27\2\2\u0474\u0475\7K\2\2\u0475\u0483\5\u00c0a\2\u0476"+
		"\u0477\f\26\2\2\u0477\u0478\7G\2\2\u0478\u0479\5\u00b2Z\2\u0479\u047a"+
		"\7H\2\2\u047a\u0483\3\2\2\2\u047b\u047c\f\25\2\2\u047c\u0483\5\u00ccg"+
		"\2\u047d\u047e\f\22\2\2\u047e\u0483\t\17\2\2\u047f\u0480\f\13\2\2\u0480"+
		"\u0481\7\36\2\2\u0481\u0483\5P)\2\u0482\u0433\3\2\2\2\u0482\u0436\3\2"+
		"\2\2\u0482\u0439\3\2\2\2\u0482\u0444\3\2\2\2\u0482\u0447\3\2\2\2\u0482"+
		"\u044a\3\2\2\2\u0482\u044d\3\2\2\2\u0482\u0450\3\2\2\2\u0482\u0453\3\2"+
		"\2\2\u0482\u0456\3\2\2\2\u0482\u0459\3\2\2\2\u0482\u045f\3\2\2\2\u0482"+
		"\u0462\3\2\2\2\u0482\u0465\3\2\2\2\u0482\u0468\3\2\2\2\u0482\u046f\3\2"+
		"\2\2\u0482\u0473\3\2\2\2\u0482\u0476\3\2\2\2\u0482\u047b\3\2\2\2\u0482"+
		"\u047d\3\2\2\2\u0482\u047f\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2"+
		"\2\2\u0484\u0485\3\2\2\2\u0485\u00b3\3\2\2\2\u0486\u0484\3\2\2\2\u0487"+
		"\u0488\7C\2\2\u0488\u0489\5\u00b2Z\2\u0489\u048a\7D\2\2\u048a\u049d\3"+
		"\2\2\2\u048b\u049d\7\63\2\2\u048c\u049d\7\60\2\2\u048d\u049d\5j\66\2\u048e"+
		"\u049d\7n\2\2\u048f\u0490\5P)\2\u0490\u0491\7K\2\2\u0491\u0492\7\r\2\2"+
		"\u0492\u049d\3\2\2\2\u0493\u0494\78\2\2\u0494\u0495\7K\2\2\u0495\u049d"+
		"\7\r\2\2\u0496\u049a\5\u00c2b\2\u0497\u049b\5\u00caf\2\u0498\u0499\7\63"+
		"\2\2\u0499\u049b\5\u00ccg\2\u049a\u0497\3\2\2\2\u049a\u0498\3\2\2\2\u049b"+
		"\u049d\3\2\2\2\u049c\u0487\3\2\2\2\u049c\u048b\3\2\2\2\u049c\u048c\3\2"+
		"\2\2\u049c\u048d\3\2\2\2\u049c\u048e\3\2\2\2\u049c\u048f\3\2\2\2\u049c"+
		"\u0493\3\2\2\2\u049c\u0496\3\2\2\2\u049d\u00b5\3\2\2\2\u049e\u049f\5\u00c2"+
		"b\2\u049f\u04a0\5\u00b8]\2\u04a0\u04a1\5\u00be`\2\u04a1\u04a8\3\2\2\2"+
		"\u04a2\u04a5\5\u00b8]\2\u04a3\u04a6\5\u00bc_\2\u04a4\u04a6\5\u00be`\2"+
		"\u04a5\u04a3\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u049e"+
		"\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a8\u00b7\3\2\2\2\u04a9\u04ab\7n\2\2\u04aa"+
		"\u04ac\5\u00c4c\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b4"+
		"\3\2\2\2\u04ad\u04ae\7K\2\2\u04ae\u04b0\7n\2\2\u04af\u04b1\5\u00c4c\2"+
		"\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04ad"+
		"\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b9\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b9\5T+\2\u04b8\u04a9\3\2\2"+
		"\2\u04b8\u04b7\3\2\2\2\u04b9\u00b9\3\2\2\2\u04ba\u04bc\7n\2\2\u04bb\u04bd"+
		"\5\u00c6d\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2"+
		"\2\u04be\u04bf\5\u00be`\2\u04bf\u00bb\3\2\2\2\u04c0\u04dc\7G\2\2\u04c1"+
		"\u04c6\7H\2\2\u04c2\u04c3\7G\2\2\u04c3\u04c5\7H\2\2\u04c4\u04c2\3\2\2"+
		"\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9"+
		"\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04dd\5L\'\2\u04ca\u04cb\5\u00b2Z\2"+
		"\u04cb\u04d2\7H\2\2\u04cc\u04cd\7G\2\2\u04cd\u04ce\5\u00b2Z\2\u04ce\u04cf"+
		"\7H\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04cc\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2"+
		"\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d9\3\2\2\2\u04d4\u04d2\3\2"+
		"\2\2\u04d5\u04d6\7G\2\2\u04d6\u04d8\7H\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04db"+
		"\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dd\3\2\2\2\u04db"+
		"\u04d9\3\2\2\2\u04dc\u04c1\3\2\2\2\u04dc\u04ca\3\2\2\2\u04dd\u00bd\3\2"+
		"\2\2\u04de\u04e0\5\u00ccg\2\u04df\u04e1\5$\23\2\u04e0\u04df\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u00bf\3\2\2\2\u04e2\u04e3\5\u00c2b\2\u04e3\u04e4"+
		"\5\u00caf\2\u04e4\u00c1\3\2\2\2\u04e5\u04e6\7N\2\2\u04e6\u04e7\5\"\22"+
		"\2\u04e7\u04e8\7M\2\2\u04e8\u00c3\3\2\2\2\u04e9\u04ea\7N\2\2\u04ea\u04ed"+
		"\7M\2\2\u04eb\u04ed\5V,\2\u04ec\u04e9\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed"+
		"\u00c5\3\2\2\2\u04ee\u04ef\7N\2\2\u04ef\u04f2\7M\2\2\u04f0\u04f2\5\u00c2"+
		"b\2\u04f1\u04ee\3\2\2\2\u04f1\u04f0\3\2\2\2\u04f2\u00c7\3\2\2\2\u04f3"+
		"\u04fa\5\u00ccg\2\u04f4\u04f5\7K\2\2\u04f5\u04f7\7n\2\2\u04f6\u04f8\5"+
		"\u00ccg\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2"+
		"\u04f9\u04f3\3\2\2\2\u04f9\u04f4\3\2\2\2\u04fa\u00c9\3\2\2\2\u04fb\u04fc"+
		"\7\60\2\2\u04fc\u0500\5\u00c8e\2\u04fd\u04fe\7n\2\2\u04fe\u0500\5\u00cc"+
		"g\2\u04ff\u04fb\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u00cb\3\2\2\2\u0501"+
		"\u0503\7C\2\2\u0502\u0504\5\u00acW\2\u0503\u0502\3\2\2\2\u0503\u0504\3"+
		"\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7D\2\2\u0506\u00cd\3\2\2\2\u0507"+
		"\u0508\7*\2\2\u0508\u0509\7C\2\2\u0509\u050a\5\u00b2Z\2\u050a\u050b\7"+
		"D\2\2\u050b\u050c\7I\2\2\u050c\u00cf\3\2\2\2\u0094\u00d1\u00d6\u00dc\u00e4"+
		"\u00ed\u00f2\u00f9\u0100\u0107\u010e\u0113\u0117\u011b\u011f\u0124\u0128"+
		"\u012c\u0136\u013e\u0145\u014c\u0150\u0153\u0156\u015f\u0165\u016a\u016d"+
		"\u0173\u0179\u017d\u0186\u018d\u0196\u019d\u01a3\u01a7\u01b3\u01b7\u01bf"+
		"\u01c4\u01c8\u01d7\u01e5\u01ea\u01f3\u01fb\u0205\u020d\u0215\u021a\u0226"+
		"\u022c\u0233\u0238\u0240\u0244\u0246\u0251\u0259\u025c\u0260\u0265\u0269"+
		"\u0274\u027d\u027f\u0286\u028b\u0294\u0299\u029c\u02a1\u02aa\u02ba\u02c4"+
		"\u02c7\u02d0\u02da\u02e2\u02e5\u02e8\u02f5\u02fd\u0302\u030a\u030e\u0312"+
		"\u0316\u0318\u031c\u0322\u032d\u0335\u033d\u0348\u0351\u0368\u036b\u036e"+
		"\u0376\u037a\u0382\u0388\u0393\u039c\u03a1\u03b8\u03c8\u03d1\u03d7\u03e2"+
		"\u03e7\u03f3\u03f7\u03fb\u03ff\u0401\u0405\u040a\u041d\u0431\u0441\u046c"+
		"\u0482\u0484\u049a\u049c\u04a5\u04a7\u04ab\u04b0\u04b4\u04b8\u04bc\u04c6"+
		"\u04d2\u04d9\u04dc\u04e0\u04ec\u04f1\u04f7\u04f9\u04ff\u0503";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}