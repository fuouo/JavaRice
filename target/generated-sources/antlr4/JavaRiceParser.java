// Generated from JavaRice.g4 by ANTLR 4.4
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
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, Package_declaration=26, Import_declaration=27, Formal_parameters=28, 
		Formal_parameter=29, Type_type=30, Data_type=31, Data_type_list=32, Field_declaration=33, 
		Variable_declaration=34, Variable_declarator_id=35, Catch_type=36, Scan=37, 
		Class_or_interface_modifier=38, Variable_modifier=39, Qualified_name_list=40, 
		Qualified_name=41, Primary=42, Literal=43, Integer_literal=44, Integer_Type_Suffix=45, 
		Decimal_numeral=46, Digits=47, Digit=48, Non_Zero_Digit=49, Floating_point_literal=50, 
		Decimal_floating_point_literal=51, Exponent_part=52, Exponent_Indicator=53, 
		Signed_integer=54, Sign=55, Float_Type_Suffix=56, Character_literal=57, 
		Single_Character=58, String_literal=59, String_characters=60, String_character=61, 
		Escape_Sequence=62, Boolean_literal=63, ABSTRACT=64, BOOLEAN=65, BREAK=66, 
		BYTE=67, CASE=68, CATCH=69, CHAR=70, CLASS=71, CONST=72, CONTINUE=73, 
		DEFAULT=74, DO=75, DOUBLE=76, ELSE=77, ENUM=78, EXTENDS=79, FINAL=80, 
		FINALLY=81, FLOAT=82, FOR=83, IF=84, GOTO=85, IMPLEMENTS=86, IMPORT=87, 
		INSTANCEOF=88, INT=89, INTERFACE=90, LONG=91, NATIVE=92, NEW=93, PACKAGE=94, 
		PRIVATE=95, PROTECTED=96, PUBLIC=97, RETURN=98, SHORT=99, STATIC=100, 
		STRICTFP=101, SUPER=102, SWITCH=103, SYNCHRONIZED=104, THIS=105, THROW=106, 
		THROWS=107, TRANSIENT=108, TRY=109, VOID=110, VOLATILE=111, WHILE=112, 
		LPAREN=113, RPAREN=114, LBRACE=115, RBRACE=116, LBRACK=117, RBRACK=118, 
		SEMI=119, COMMA=120, DOT=121, ASSIGN=122, GT=123, LT=124, BANG=125, TILDE=126, 
		QUESTION=127, COLON=128, EQUAL=129, LE=130, GE=131, NOTEQUAL=132, AND=133, 
		OR=134, INC=135, DEC=136, ADD=137, SUB=138, MUL=139, DIV=140, BITAND=141, 
		BITOR=142, CARET=143, MOD=144, ADD_ASSIGN=145, SUB_ASSIGN=146, MUL_ASSIGN=147, 
		DIV_ASSIGN=148, AND_ASSIGN=149, OR_ASSIGN=150, XOR_ASSIGN=151, MOD_ASSIGN=152, 
		LSHIFT_ASSIGN=153, RSHIFT_ASSIGN=154, URSHIFT_ASSIGN=155, Identifier=156, 
		WS=157, COMMENT=158, LINE_COMMENT=159;
	public static final String[] tokenNames = {
		"<INVALID>", "'_instanceof'", "'_this'", "'_finally'", "'_default'", "'_for'", 
		"'_catch'", "'_break'", "'_extends'", "'_continue'", "'_if'", "'_do'", 
		"'_synchronized'", "'_switch'", "'_return'", "'_implements'", "'_throws'", 
		"'_try'", "'_void'", "'_while'", "'write'", "'_case'", "'_class'", "'_else'", 
		"'_throw'", "'_super'", "Package_declaration", "Import_declaration", "Formal_parameters", 
		"Formal_parameter", "Type_type", "Data_type", "Data_type_list", "Field_declaration", 
		"Variable_declaration", "Variable_declarator_id", "Catch_type", "Scan", 
		"Class_or_interface_modifier", "'_final'", "Qualified_name_list", "Qualified_name", 
		"Primary", "Literal", "Integer_literal", "Integer_Type_Suffix", "Decimal_numeral", 
		"Digits", "Digit", "Non_Zero_Digit", "Floating_point_literal", "Decimal_floating_point_literal", 
		"Exponent_part", "Exponent_Indicator", "Signed_integer", "Sign", "Float_Type_Suffix", 
		"Character_literal", "Single_Character", "String_literal", "String_characters", 
		"String_character", "Escape_Sequence", "Boolean_literal", "'abstract'", 
		"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
		"'implements'", "'import'", "'instanceof'", "'_int'", "'interface'", "'long'", 
		"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
		"'void'", "'volatile'", "'while'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
		"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", 
		"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
		"Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_class_declaration = 1, RULE_class_body = 2, RULE_member_declaration = 3, 
		RULE_formal_parameter_list = 4, RULE_method_declaration = 5, RULE_variable_definition = 6, 
		RULE_variable_assignment = 7, RULE_variable_declaration_list = 8, RULE_block = 9, 
		RULE_block_statement = 10, RULE_local_variable_declaration_statement = 11, 
		RULE_local_variable_declaration = 12, RULE_statement = 13, RULE_catch_clause = 14, 
		RULE_finally_block = 15, RULE_switch_block_statement_group = 16, RULE_switch_label = 17, 
		RULE_for_control = 18, RULE_shortcut_for_control = 19, RULE_for_init = 20, 
		RULE_for_update = 21, RULE_expression = 22, RULE_expression_list = 23, 
		RULE_par_expression = 24, RULE_constant_expression = 25, RULE_print = 26, 
		RULE_super_suffix = 27, RULE_arguments = 28;
	public static final String[] ruleNames = {
		"program", "class_declaration", "class_body", "member_declaration", "formal_parameter_list", 
		"method_declaration", "variable_definition", "variable_assignment", "variable_declaration_list", 
		"block", "block_statement", "local_variable_declaration_statement", "local_variable_declaration", 
		"statement", "catch_clause", "finally_block", "switch_block_statement_group", 
		"switch_label", "for_control", "shortcut_for_control", "for_init", "for_update", 
		"expression", "expression_list", "par_expression", "constant_expression", 
		"print", "super_suffix", "arguments"
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
		public TerminalNode Package_declaration() { return getToken(JavaRiceParser.Package_declaration, 0); }
		public List<TerminalNode> Import_declaration() { return getTokens(JavaRiceParser.Import_declaration); }
		public TerminalNode EOF() { return getToken(JavaRiceParser.EOF, 0); }
		public TerminalNode Import_declaration(int i) {
			return getToken(JavaRiceParser.Import_declaration, i);
		}
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
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
			setState(59);
			_la = _input.LA(1);
			if (_la==Package_declaration) {
				{
				setState(58); match(Package_declaration);
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import_declaration) {
				{
				{
				setState(61); match(Import_declaration);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==Class_or_interface_modifier) {
				{
				{
				setState(67); class_declaration();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TerminalNode Class_or_interface_modifier() { return getToken(JavaRiceParser.Class_or_interface_modifier, 0); }
		public TerminalNode Data_type() { return getToken(JavaRiceParser.Data_type, 0); }
		public TerminalNode Data_type_list() { return getToken(JavaRiceParser.Data_type_list, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==Class_or_interface_modifier) {
				{
				setState(75); match(Class_or_interface_modifier);
				}
			}

			setState(78); match(T__3);
			setState(79); match(Identifier);
			setState(82);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(80); match(T__17);
				setState(81); match(Data_type);
				}
			}

			setState(86);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(84); match(T__10);
				setState(85); match(Data_type_list);
				}
			}

			setState(88); match(LBRACE);
			setState(89); class_body();
			setState(90); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public Member_declarationContext member_declaration() {
			return getRuleContext(Member_declarationContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(SEMI);
				}
				break;
			case T__7:
			case Type_type:
			case Field_declaration:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); member_declaration();
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

	public static class Member_declarationContext extends ParserRuleContext {
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public TerminalNode Field_declaration(int i) {
			return getToken(JavaRiceParser.Field_declaration, i);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<TerminalNode> Field_declaration() { return getTokens(JavaRiceParser.Field_declaration); }
		public Member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMember_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMember_declaration(this);
		}
	}

	public final Member_declarationContext member_declaration() throws RecognitionException {
		Member_declarationContext _localctx = new Member_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member_declaration);
		int _la;
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__7:
			case Type_type:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); method_declaration();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==Type_type) {
					{
					{
					setState(97); method_declaration();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Field_declaration:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(Field_declaration);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Field_declaration) {
					{
					{
					setState(104); match(Field_declaration);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> Formal_parameter() { return getTokens(JavaRiceParser.Formal_parameter); }
		public TerminalNode Formal_parameter(int i) {
			return getToken(JavaRiceParser.Formal_parameter, i);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFormal_parameter_list(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(Formal_parameter);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113); match(COMMA);
				setState(114); match(Formal_parameter);
				}
				}
				setState(119);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TerminalNode Type_type() { return getToken(JavaRiceParser.Type_type, 0); }
		public TerminalNode Qualified_name_list() { return getToken(JavaRiceParser.Qualified_name_list, 0); }
		public TerminalNode Formal_parameters() { return getToken(JavaRiceParser.Formal_parameters, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==Type_type) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(121); match(Identifier);
			setState(122); match(Formal_parameters);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(123); match(LBRACK);
				setState(124); match(RBRACK);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(130); match(T__9);
				setState(131); match(Qualified_name_list);
				}
			}

			setState(136);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(134); block();
				}
				break;
			case SEMI:
				{
				setState(135); match(SEMI);
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public TerminalNode Type_type() { return getToken(JavaRiceParser.Type_type, 0); }
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariable_definition(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(Type_type);
			setState(139); variable_assignment();
			setState(140); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignmentContext extends ParserRuleContext {
		public TerminalNode Variable_declarator_id() { return getToken(JavaRiceParser.Variable_declarator_id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariable_assignment(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(Variable_declarator_id);
			setState(143); match(ASSIGN);
			setState(144); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_listContext extends ParserRuleContext {
		public TerminalNode Variable_declaration(int i) {
			return getToken(JavaRiceParser.Variable_declaration, i);
		}
		public List<TerminalNode> Variable_declaration() { return getTokens(JavaRiceParser.Variable_declaration); }
		public Variable_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterVariable_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitVariable_declaration_list(this);
		}
	}

	public final Variable_declaration_listContext variable_declaration_list() throws RecognitionException {
		Variable_declaration_listContext _localctx = new Variable_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(Variable_declaration);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147); match(COMMA);
				setState(148); match(Variable_declaration);
				}
				}
				setState(153);
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

	public static class BlockContext extends ParserRuleContext {
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(LBRACE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << Type_type) | (1L << Class_or_interface_modifier) | (1L << Variable_modifier) | (1L << Primary))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LPAREN - 113)) | (1L << (LBRACE - 113)) | (1L << (SEMI - 113)) | (1L << (BANG - 113)) | (1L << (TILDE - 113)) | (1L << (INC - 113)) | (1L << (DEC - 113)) | (1L << (ADD - 113)) | (1L << (SUB - 113)) | (1L << (Identifier - 113)))) != 0)) {
				{
				{
				setState(155); block_statement();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Local_variable_declaration_statementContext local_variable_declaration_statement() {
			return getRuleContext(Local_variable_declaration_statementContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitBlock_statement(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_statement);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case Type_type:
			case Variable_modifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); local_variable_declaration_statement();
				}
				break;
			case T__20:
			case T__18:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__8:
			case T__6:
			case T__1:
			case Primary:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); statement();
				}
				break;
			case T__3:
			case Class_or_interface_modifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(165); class_declaration();
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

	public static class Local_variable_declaration_statementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Local_variable_declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLocal_variable_declaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLocal_variable_declaration_statement(this);
		}
	}

	public final Local_variable_declaration_statementContext local_variable_declaration_statement() throws RecognitionException {
		Local_variable_declaration_statementContext _localctx = new Local_variable_declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_variable_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); local_variable_declaration();
			setState(169); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public TerminalNode Type_type() { return getToken(JavaRiceParser.Type_type, 0); }
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public List<TerminalNode> Variable_modifier() { return getTokens(JavaRiceParser.Variable_modifier); }
		public TerminalNode Variable_modifier(int i) {
			return getToken(JavaRiceParser.Variable_modifier, i);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterLocal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitLocal_variable_declaration(this);
		}
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_local_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable_modifier) {
				{
				{
				setState(171); match(Variable_modifier);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(Type_type);
			setState(178); variable_assignment();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179); match(COMMA);
				setState(180); variable_assignment();
				}
				}
				setState(185);
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
		public List<Catch_clauseContext> catch_clause() {
			return getRuleContexts(Catch_clauseContext.class);
		}
		public Finally_blockContext finally_block() {
			return getRuleContext(Finally_blockContext.class,0);
		}
		public Switch_block_statement_groupContext switch_block_statement_group(int i) {
			return getRuleContext(Switch_block_statement_groupContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public List<Switch_block_statement_groupContext> switch_block_statement_group() {
			return getRuleContexts(Switch_block_statement_groupContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Par_expressionContext par_expression() {
			return getRuleContext(Par_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Catch_clauseContext catch_clause(int i) {
			return getRuleContext(Catch_clauseContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_controlContext for_control() {
			return getRuleContext(For_controlContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
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
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(270);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); block();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(T__15);
				setState(188); par_expression();
				setState(189); statement();
				setState(192);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(190); match(T__2);
					setState(191); statement();
					}
					break;
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); match(T__20);
				setState(195); match(LPAREN);
				setState(196); for_control();
				setState(197); match(RPAREN);
				setState(198); statement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(200); match(T__6);
				setState(201); par_expression();
				setState(202); statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(204); match(T__14);
				setState(205); statement();
				setState(206); match(T__6);
				setState(207); par_expression();
				setState(208); match(SEMI);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(210); match(T__8);
				setState(211); block();
				setState(221);
				switch (_input.LA(1)) {
				case T__19:
					{
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(212); catch_clause();
						}
						}
						setState(215); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__19 );
					setState(218);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(217); finally_block();
						}
					}

					}
					break;
				case T__22:
					{
					setState(220); finally_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(223); match(T__12);
				setState(224); par_expression();
				setState(225); match(LBRACE);
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226); switch_block_statement_group();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21 || _la==T__4) {
					{
					{
					setState(232); switch_label();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238); match(RBRACE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(240); match(T__13);
				setState(241); par_expression();
				setState(242); block();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(244); match(T__11);
				setState(246);
				_la = _input.LA(1);
				if (_la==Primary || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LPAREN - 113)) | (1L << (BANG - 113)) | (1L << (TILDE - 113)) | (1L << (INC - 113)) | (1L << (DEC - 113)) | (1L << (ADD - 113)) | (1L << (SUB - 113)))) != 0)) {
					{
					setState(245); expression(0);
					}
				}

				setState(248); match(SEMI);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 10);
				{
				setState(249); match(T__1);
				setState(250); expression(0);
				setState(251); match(SEMI);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(253); match(T__18);
				setState(255);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(254); match(Identifier);
					}
				}

				setState(257); match(SEMI);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 12);
				{
				setState(258); match(T__16);
				setState(260);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(259); match(Identifier);
					}
				}

				setState(262); match(SEMI);
				}
				break;
			case Primary:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 13);
				{
				setState(263); expression(0);
				setState(264); match(SEMI);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 14);
				{
				setState(266); match(Identifier);
				setState(267); match(COLON);
				setState(268); statement();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 15);
				{
				setState(269); match(SEMI);
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

	public static class Catch_clauseContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public TerminalNode Catch_type() { return getToken(JavaRiceParser.Catch_type, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Variable_modifier() { return getTokens(JavaRiceParser.Variable_modifier); }
		public TerminalNode Variable_modifier(int i) {
			return getToken(JavaRiceParser.Variable_modifier, i);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitCatch_clause(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(T__19);
			setState(273); match(LPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable_modifier) {
				{
				{
				setState(274); match(Variable_modifier);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280); match(Catch_type);
			setState(281); match(Identifier);
			setState(282); match(RPAREN);
			setState(283); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFinally_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFinally_block(this);
		}
	}

	public final Finally_blockContext finally_block() throws RecognitionException {
		Finally_blockContext _localctx = new Finally_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_finally_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(T__22);
			setState(286); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_block_statement_groupContext extends ParserRuleContext {
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Switch_block_statement_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block_statement_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSwitch_block_statement_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSwitch_block_statement_group(this);
		}
	}

	public final Switch_block_statement_groupContext switch_block_statement_group() throws RecognitionException {
		Switch_block_statement_groupContext _localctx = new Switch_block_statement_groupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_block_statement_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288); switch_label();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 || _la==T__4 );
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293); block_statement();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << Type_type) | (1L << Class_or_interface_modifier) | (1L << Variable_modifier) | (1L << Primary))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LPAREN - 113)) | (1L << (LBRACE - 113)) | (1L << (SEMI - 113)) | (1L << (BANG - 113)) | (1L << (TILDE - 113)) | (1L << (INC - 113)) | (1L << (DEC - 113)) | (1L << (ADD - 113)) | (1L << (SUB - 113)) | (1L << (Identifier - 113)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSwitch_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSwitch_label(this);
		}
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_label);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); match(T__4);
				setState(299); constant_expression();
				setState(300); match(COLON);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(T__21);
				setState(303); match(COLON);
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

	public static class For_controlContext extends ParserRuleContext {
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public Shortcut_for_controlContext shortcut_for_control() {
			return getRuleContext(Shortcut_for_controlContext.class,0);
		}
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFor_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFor_control(this);
		}
	}

	public final For_controlContext for_control() throws RecognitionException {
		For_controlContext _localctx = new For_controlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_control);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); shortcut_for_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); for_init();
				setState(308); match(COLON);
				setState(309); expression(0);
				setState(310); match(COLON);
				setState(311); for_update();
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

	public static class Shortcut_for_controlContext extends ParserRuleContext {
		public TerminalNode Variable_declarator_id() { return getToken(JavaRiceParser.Variable_declarator_id, 0); }
		public TerminalNode Type_type() { return getToken(JavaRiceParser.Type_type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> Variable_modifier() { return getTokens(JavaRiceParser.Variable_modifier); }
		public TerminalNode Variable_modifier(int i) {
			return getToken(JavaRiceParser.Variable_modifier, i);
		}
		public Shortcut_for_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut_for_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterShortcut_for_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitShortcut_for_control(this);
		}
	}

	public final Shortcut_for_controlContext shortcut_for_control() throws RecognitionException {
		Shortcut_for_controlContext _localctx = new Shortcut_for_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shortcut_for_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable_modifier) {
				{
				{
				setState(315); match(Variable_modifier);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321); match(Type_type);
			setState(322); match(Variable_declarator_id);
			setState(323); match(COLON);
			setState(324); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Local_variable_declaration_statementContext local_variable_declaration_statement() {
			return getRuleContext(Local_variable_declaration_statementContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFor_init(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_init);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case Type_type:
			case Variable_modifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); local_variable_declaration_statement();
				}
				break;
			case Primary:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); expression_list();
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

	public static class For_updateContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterFor_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitFor_update(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); expression_list();
			}
		}
		catch (RecognitionException re) {
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode Type_type() { return getToken(JavaRiceParser.Type_type, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Primary() { return getToken(JavaRiceParser.Primary, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Super_suffixContext super_suffix() {
			return getRuleContext(Super_suffixContext.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(333); match(LPAREN);
				setState(334); match(Type_type);
				setState(335); match(RPAREN);
				setState(336); expression(17);
				}
				break;
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (INC - 135)) | (1L << (DEC - 135)) | (1L << (ADD - 135)) | (1L << (SUB - 135)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(338); expression(15);
				}
				break;
			case BANG:
			case TILDE:
				{
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(340); expression(14);
				}
				break;
			case Primary:
				{
				setState(341); match(Primary);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(345);
						_la = _input.LA(1);
						if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (MUL - 139)) | (1L << (DIV - 139)) | (1L << (MOD - 139)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(346); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(348);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(349); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(358);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(351); match(LT);
							setState(352); match(LT);
							}
							break;
						case 2:
							{
							setState(353); match(GT);
							setState(354); match(GT);
							setState(355); match(GT);
							}
							break;
						case 3:
							{
							setState(356); match(GT);
							setState(357); match(GT);
							}
							break;
						}
						setState(360); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(362);
						_la = _input.LA(1);
						if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (GT - 123)) | (1L << (LT - 123)) | (1L << (LE - 123)) | (1L << (GE - 123)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(363); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(365);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(366); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(368); match(BITAND);
						setState(369); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(371); match(CARET);
						setState(372); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(374); match(BITOR);
						setState(375); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(377); match(AND);
						setState(378); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(380); match(OR);
						setState(381); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(383); match(QUESTION);
						setState(384); expression(0);
						setState(385); match(COLON);
						setState(386); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(389);
						_la = _input.LA(1);
						if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (ASSIGN - 122)) | (1L << (ADD_ASSIGN - 122)) | (1L << (SUB_ASSIGN - 122)) | (1L << (MUL_ASSIGN - 122)) | (1L << (DIV_ASSIGN - 122)) | (1L << (AND_ASSIGN - 122)) | (1L << (OR_ASSIGN - 122)) | (1L << (XOR_ASSIGN - 122)) | (1L << (MOD_ASSIGN - 122)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(390); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(392); match(DOT);
						setState(393); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(395); match(DOT);
						setState(396); match(T__23);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(397);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(398); match(DOT);
						setState(399); match(T__0);
						setState(400); super_suffix();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(402); match(LBRACK);
						setState(403); expression(0);
						setState(404); match(RBRACK);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(407); match(LPAREN);
						setState(409);
						_la = _input.LA(1);
						if (_la==Primary || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LPAREN - 113)) | (1L << (BANG - 113)) | (1L << (TILDE - 113)) | (1L << (INC - 113)) | (1L << (DEC - 113)) | (1L << (ADD - 113)) | (1L << (SUB - 113)))) != 0)) {
							{
							setState(408); expression_list();
							}
						}

						setState(411); match(RPAREN);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(413);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(414);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(415); match(T__24);
						setState(416); match(Type_type);
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); expression(0);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(423); match(COMMA);
				setState(424); expression(0);
				}
				}
				setState(429);
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

	public static class Par_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Par_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterPar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitPar_expression(this);
		}
	}

	public final Par_expressionContext par_expression() throws RecognitionException {
		Par_expressionContext _localctx = new Par_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_par_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(LPAREN);
			setState(431); expression(0);
			setState(432); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); match(T__5);
			setState(437); match(LPAREN);
			setState(438); expression(0);
			setState(439); match(RPAREN);
			setState(440); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Super_suffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaRiceParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Super_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).enterSuper_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRiceListener ) ((JavaRiceListener)listener).exitSuper_suffix(this);
		}
	}

	public final Super_suffixContext super_suffix() throws RecognitionException {
		Super_suffixContext _localctx = new Super_suffixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_super_suffix);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(442); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(443); match(DOT);
				setState(444); match(Identifier);
				setState(446);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(445); arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
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
		enterRule(_localctx, 56, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(LPAREN);
			setState(452);
			_la = _input.LA(1);
			if (_la==Primary || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LPAREN - 113)) | (1L << (BANG - 113)) | (1L << (TILDE - 113)) | (1L << (INC - 113)) | (1L << (DEC - 113)) | (1L << (ADD - 113)) | (1L << (SUB - 113)))) != 0)) {
				{
				setState(451); expression_list();
				}
			}

			setState(454); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		case 22: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		case 12: return precpred(_ctx, 22);
		case 13: return precpred(_ctx, 21);
		case 14: return precpred(_ctx, 20);
		case 15: return precpred(_ctx, 19);
		case 16: return precpred(_ctx, 18);
		case 17: return precpred(_ctx, 16);
		case 18: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a1\u01cb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\5\3O\n"+
		"\3\3\3\3\3\3\3\3\3\5\3U\n\3\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\3\4\3\4\5"+
		"\4a\n\4\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13"+
		"\5\5\5q\n\5\3\6\3\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0080\n\7\f\7\16\7\u0083\13\7\3\7\3\7\5\7\u0087\n\7\3\7\3\7\5\7\u008b"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0098\n\n\f\n\16"+
		"\n\u009b\13\n\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u00a9\n\f\3\r\3\r\3\r\3\16\7\16\u00af\n\16\f\16\16"+
		"\16\u00b2\13\16\3\16\3\16\3\16\3\16\7\16\u00b8\n\16\f\16\16\16\u00bb\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\6\17\u00d8\n\17\r\17\16\17\u00d9\3\17\5\17\u00dd\n\17\3\17\5\17"+
		"\u00e0\n\17\3\17\3\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17"+
		"\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00f9\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0102\n\17\3\17\3\17\3\17\5\17\u0107\n\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0111\n\17\3\20\3\20\3\20\7\20\u0116\n\20\f\20\16\20"+
		"\u0119\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\6\22\u0124\n"+
		"\22\r\22\16\22\u0125\3\22\6\22\u0129\n\22\r\22\16\22\u012a\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0133\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u013c\n\24\3\25\7\25\u013f\n\25\f\25\16\25\u0142\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\5\26\u014b\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0159\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0169\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u019c\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u01a4\n\30\f\30\16\30\u01a7\13\30\3\31\3\31\3\31\7\31\u01ac\n\31"+
		"\f\31\16\31\u01af\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01c1\n\35\5\35\u01c3\n\35\3\36"+
		"\3\36\5\36\u01c7\n\36\3\36\3\36\3\36\2\3.\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\13\4\2\24\24  \3\2\u0089\u008c\3"+
		"\2\177\u0080\4\2\u008d\u008e\u0092\u0092\3\2\u008b\u008c\4\2}~\u0084\u0085"+
		"\4\2\u0083\u0083\u0086\u0086\4\2||\u0093\u009a\3\2\u0089\u008a\u01fc\2"+
		"=\3\2\2\2\4N\3\2\2\2\6`\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fz\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u0090\3\2\2\2\22\u0094\3\2\2\2\24\u009c\3\2\2\2\26\u00a8\3"+
		"\2\2\2\30\u00aa\3\2\2\2\32\u00b0\3\2\2\2\34\u0110\3\2\2\2\36\u0112\3\2"+
		"\2\2 \u011f\3\2\2\2\"\u0123\3\2\2\2$\u0132\3\2\2\2&\u013b\3\2\2\2(\u0140"+
		"\3\2\2\2*\u014a\3\2\2\2,\u014c\3\2\2\2.\u0158\3\2\2\2\60\u01a8\3\2\2\2"+
		"\62\u01b0\3\2\2\2\64\u01b4\3\2\2\2\66\u01b6\3\2\2\28\u01c2\3\2\2\2:\u01c4"+
		"\3\2\2\2<>\7\34\2\2=<\3\2\2\2=>\3\2\2\2>B\3\2\2\2?A\7\35\2\2@?\3\2\2\2"+
		"AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\4\3\2FE\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\2\2\3L\3\3\2\2"+
		"\2MO\7(\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\30\2\2QT\7\u009e\2\2RS\7"+
		"\n\2\2SU\7!\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VW\7\21\2\2WY\7\"\2\2XV\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7u\2\2[\\\5\6\4\2\\]\7v\2\2]\5\3\2\2\2^a"+
		"\7y\2\2_a\5\b\5\2`^\3\2\2\2`_\3\2\2\2a\7\3\2\2\2bf\5\f\7\2ce\5\f\7\2d"+
		"c\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gq\3\2\2\2hf\3\2\2\2im\7#\2\2j"+
		"l\7#\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2p"+
		"b\3\2\2\2pi\3\2\2\2q\t\3\2\2\2rw\7\37\2\2st\7z\2\2tv\7\37\2\2us\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2\2\2z{\t\2\2\2{|\7\u009e"+
		"\2\2|\u0081\7\36\2\2}~\7w\2\2~\u0080\7x\2\2\177}\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\22\2\2\u0085\u0087\7*\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u008b\5\24\13\2\u0089"+
		"\u008b\7y\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\r\3\2\2\2"+
		"\u008c\u008d\7 \2\2\u008d\u008e\5\20\t\2\u008e\u008f\7y\2\2\u008f\17\3"+
		"\2\2\2\u0090\u0091\7%\2\2\u0091\u0092\7|\2\2\u0092\u0093\5.\30\2\u0093"+
		"\21\3\2\2\2\u0094\u0099\7$\2\2\u0095\u0096\7z\2\2\u0096\u0098\7$\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\23\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\7u\2\2\u009d\u009f"+
		"\5\26\f\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\25\3\2\2\2\u00a5\u00a9\5\30\r\2\u00a6\u00a9\5\34\17\2\u00a7"+
		"\u00a9\5\4\3\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\7y\2\2\u00ac\31"+
		"\3\2\2\2\u00ad\u00af\7)\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b9\5\20\t\2\u00b5\u00b6\7z\2\2\u00b6"+
		"\u00b8\5\20\t\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u0111\5\24\13\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5\62\32\2\u00bf\u00c2"+
		"\5\34\17\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u0111\3\2\2\2\u00c4\u00c5\7\7\2\2\u00c5"+
		"\u00c6\7s\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\5\34"+
		"\17\2\u00c9\u0111\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\5\62\32\2\u00cc"+
		"\u00cd\5\34\17\2\u00cd\u0111\3\2\2\2\u00ce\u00cf\7\r\2\2\u00cf\u00d0\5"+
		"\34\17\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\7y\2\2"+
		"\u00d3\u0111\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00df\5\24\13\2\u00d6"+
		"\u00d8\5\36\20\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5 \21\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5 "+
		"\21\2\u00df\u00d7\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u0111\3\2\2\2\u00e1"+
		"\u00e2\7\17\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e7\7u\2\2\u00e4\u00e6\5"+
		"\"\22\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\5$"+
		"\23\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7v"+
		"\2\2\u00f1\u0111\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\5\62\32\2\u00f4"+
		"\u00f5\5\24\13\2\u00f5\u0111\3\2\2\2\u00f6\u00f8\7\20\2\2\u00f7\u00f9"+
		"\5.\30\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u0111\7y\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\7y"+
		"\2\2\u00fe\u0111\3\2\2\2\u00ff\u0101\7\t\2\2\u0100\u0102\7\u009e\2\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0111\7y"+
		"\2\2\u0104\u0106\7\13\2\2\u0105\u0107\7\u009e\2\2\u0106\u0105\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0111\7y\2\2\u0109\u010a"+
		"\5.\30\2\u010a\u010b\7y\2\2\u010b\u0111\3\2\2\2\u010c\u010d\7\u009e\2"+
		"\2\u010d\u010e\7\u0082\2\2\u010e\u0111\5\34\17\2\u010f\u0111\7y\2\2\u0110"+
		"\u00bc\3\2\2\2\u0110\u00bd\3\2\2\2\u0110\u00c4\3\2\2\2\u0110\u00ca\3\2"+
		"\2\2\u0110\u00ce\3\2\2\2\u0110\u00d4\3\2\2\2\u0110\u00e1\3\2\2\2\u0110"+
		"\u00f2\3\2\2\2\u0110\u00f6\3\2\2\2\u0110\u00fb\3\2\2\2\u0110\u00ff\3\2"+
		"\2\2\u0110\u0104\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\35\3\2\2\2\u0112\u0113\7\b\2\2\u0113\u0117\7s\2\2"+
		"\u0114\u0116\7)\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7&\2\2\u011b\u011c\7\u009e\2\2\u011c\u011d\7t\2\2\u011d\u011e\5"+
		"\24\13\2\u011e\37\3\2\2\2\u011f\u0120\7\5\2\2\u0120\u0121\5\24\13\2\u0121"+
		"!\3\2\2\2\u0122\u0124\5$\23\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129"+
		"\5\26\f\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b#\3\2\2\2\u012c\u012d\7\27\2\2\u012d\u012e\5"+
		"\64\33\2\u012e\u012f\7\u0082\2\2\u012f\u0133\3\2\2\2\u0130\u0131\7\6\2"+
		"\2\u0131\u0133\7\u0082\2\2\u0132\u012c\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"%\3\2\2\2\u0134\u013c\5(\25\2\u0135\u0136\5*\26\2\u0136\u0137\7\u0082"+
		"\2\2\u0137\u0138\5.\30\2\u0138\u0139\7\u0082\2\2\u0139\u013a\5,\27\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013c\'\3\2\2\2"+
		"\u013d\u013f\7)\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\7 \2\2\u0144\u0145\7%\2\2\u0145\u0146\7\u0082\2\2\u0146\u0147\5"+
		".\30\2\u0147)\3\2\2\2\u0148\u014b\5\30\r\2\u0149\u014b\5\60\31\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b+\3\2\2\2\u014c\u014d\5\60\31"+
		"\2\u014d-\3\2\2\2\u014e\u014f\b\30\1\2\u014f\u0150\7s\2\2\u0150\u0151"+
		"\7 \2\2\u0151\u0152\7t\2\2\u0152\u0159\5.\30\23\u0153\u0154\t\3\2\2\u0154"+
		"\u0159\5.\30\21\u0155\u0156\t\4\2\2\u0156\u0159\5.\30\20\u0157\u0159\7"+
		",\2\2\u0158\u014e\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0155\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\u01a5\3\2\2\2\u015a\u015b\f\17\2\2\u015b\u015c\t"+
		"\5\2\2\u015c\u01a4\5.\30\20\u015d\u015e\f\16\2\2\u015e\u015f\t\6\2\2\u015f"+
		"\u01a4\5.\30\17\u0160\u0168\f\r\2\2\u0161\u0162\7~\2\2\u0162\u0169\7~"+
		"\2\2\u0163\u0164\7}\2\2\u0164\u0165\7}\2\2\u0165\u0169\7}\2\2\u0166\u0167"+
		"\7}\2\2\u0167\u0169\7}\2\2\u0168\u0161\3\2\2\2\u0168\u0163\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u01a4\5.\30\16\u016b\u016c\f"+
		"\f\2\2\u016c\u016d\t\7\2\2\u016d\u01a4\5.\30\r\u016e\u016f\f\n\2\2\u016f"+
		"\u0170\t\b\2\2\u0170\u01a4\5.\30\13\u0171\u0172\f\t\2\2\u0172\u0173\7"+
		"\u008f\2\2\u0173\u01a4\5.\30\n\u0174\u0175\f\b\2\2\u0175\u0176\7\u0091"+
		"\2\2\u0176\u01a4\5.\30\t\u0177\u0178\f\7\2\2\u0178\u0179\7\u0090\2\2\u0179"+
		"\u01a4\5.\30\b\u017a\u017b\f\6\2\2\u017b\u017c\7\u0087\2\2\u017c\u01a4"+
		"\5.\30\7\u017d\u017e\f\5\2\2\u017e\u017f\7\u0088\2\2\u017f\u01a4\5.\30"+
		"\6\u0180\u0181\f\4\2\2\u0181\u0182\7\u0081\2\2\u0182\u0183\5.\30\2\u0183"+
		"\u0184\7\u0082\2\2\u0184\u0185\5.\30\5\u0185\u01a4\3\2\2\2\u0186\u0187"+
		"\f\3\2\2\u0187\u0188\t\t\2\2\u0188\u01a4\5.\30\3\u0189\u018a\f\30\2\2"+
		"\u018a\u018b\7{\2\2\u018b\u01a4\7\u009e\2\2\u018c\u018d\f\27\2\2\u018d"+
		"\u018e\7{\2\2\u018e\u01a4\7\4\2\2\u018f\u0190\f\26\2\2\u0190\u0191\7{"+
		"\2\2\u0191\u0192\7\33\2\2\u0192\u01a4\58\35\2\u0193\u0194\f\25\2\2\u0194"+
		"\u0195\7w\2\2\u0195\u0196\5.\30\2\u0196\u0197\7x\2\2\u0197\u01a4\3\2\2"+
		"\2\u0198\u0199\f\24\2\2\u0199\u019b\7s\2\2\u019a\u019c\5\60\31\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a4\7t"+
		"\2\2\u019e\u019f\f\22\2\2\u019f\u01a4\t\n\2\2\u01a0\u01a1\f\13\2\2\u01a1"+
		"\u01a2\7\3\2\2\u01a2\u01a4\7 \2\2\u01a3\u015a\3\2\2\2\u01a3\u015d\3\2"+
		"\2\2\u01a3\u0160\3\2\2\2\u01a3\u016b\3\2\2\2\u01a3\u016e\3\2\2\2\u01a3"+
		"\u0171\3\2\2\2\u01a3\u0174\3\2\2\2\u01a3\u0177\3\2\2\2\u01a3\u017a\3\2"+
		"\2\2\u01a3\u017d\3\2\2\2\u01a3\u0180\3\2\2\2\u01a3\u0186\3\2\2\2\u01a3"+
		"\u0189\3\2\2\2\u01a3\u018c\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3\u0193\3\2"+
		"\2\2\u01a3\u0198\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6/\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a8\u01ad\5.\30\2\u01a9\u01aa\7z\2\2\u01aa\u01ac"+
		"\5.\30\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\61\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7s\2\2"+
		"\u01b1\u01b2\5.\30\2\u01b2\u01b3\7t\2\2\u01b3\63\3\2\2\2\u01b4\u01b5\5"+
		".\30\2\u01b5\65\3\2\2\2\u01b6\u01b7\7\26\2\2\u01b7\u01b8\7s\2\2\u01b8"+
		"\u01b9\5.\30\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7y\2\2\u01bb\67\3\2\2\2"+
		"\u01bc\u01c3\5:\36\2\u01bd\u01be\7{\2\2\u01be\u01c0\7\u009e\2\2\u01bf"+
		"\u01c1\5:\36\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01bc\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c39\3\2\2\2\u01c4\u01c6"+
		"\7s\2\2\u01c5\u01c7\5\60\31\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7t\2\2\u01c9;\3\2\2\2/=BHNTX`fmpw\u0081"+
		"\u0086\u008a\u0099\u00a0\u00a8\u00b0\u00b9\u00c2\u00d9\u00dc\u00df\u00e7"+
		"\u00ed\u00f8\u0101\u0106\u0110\u0117\u0125\u012a\u0132\u013b\u0140\u014a"+
		"\u0158\u0168\u019b\u01a3\u01a5\u01ad\u01c0\u01c2\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}