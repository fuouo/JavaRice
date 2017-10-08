grammar JavaRice;


// Productions for the program 
program 	
	: 	Package_declaration? Import_declaration* class_declaration* EOF
	;


// Productions for declaring the project’s package
Package_declaration	
	: 	'_package' Identifier ';'
	;


// Productions for importing libraries
Import_declaration	
	: 	'_import' '_static'? Identifier ('.' '*')? ';'
	;


// Productions for declaring variable modifiers
class_declaration
	: 	(
Class_or_interface_modifier)? '_class' Identifier
      	('_extends' Data_type)?
      	('_implements' Data_type_list)?
	 	'{' class_body '}'
	;


// Productions for Class Body
class_body
	: 	';' | member_declaration
	;

member_declaration
	: 	method_declaration (method_declaration)*
	| 	Field_declaration (Field_declaration)*
	;

// Productions for Method Declaration
Formal_parameters 
    : 	'(' Formal_parameter ')'
	;

formal_parameter_list
    : 	Formal_parameter (',' Formal_parameter)* 
	;

Formal_parameter
    :	Variable_modifier* Type_type Variable_declarator_id
	;

method_declaration
	: 	(Type_type|'_void') Identifier Formal_parameters ('[' ']')*
       	('_throws' 
Qualified_name_list)?
       	( block | ';' )
	;


// Productions for Datatypes
Type_type
	: 	Data_type ('[' ']')*
	;

Data_type
	: 	'_boolean'
    | 	'_char'
    | 	'_byte'
    | 	'_short'
    | 	'_int'
    | 	'_long'
    | 	'_float'
    | 	'_double'
    | 	'_String'
	;

Data_type_list
	: 	Data_type (',' Data_type)*
	;


// Productions for statements
Field_declaration
    :   Type_type Variable_declarator_id ';'
    ;

variable_definition
    : 	Type_type variable_assignment ';'
	;

Variable_declaration
    : 	Type_type Variable_declarator_id
	;

variable_assignment
    : 	Variable_declarator_id '=' expression
	;

variable_declaration_list
    :   Variable_declaration (',' Variable_declaration )*
    ;

Variable_declarator_id
    : 	Identifier ('[' ']')*
	;
	
block
    : 	'{' block_statement* '}'
	;

block_statement
    :	local_variable_declaration_statement
    |   statement
    |   class_declaration
	;

local_variable_declaration_statement
    :   local_variable_declaration ';'
    ;

local_variable_declaration
    :   Variable_modifier* Type_type variable_assignment (',' variable_assignment)*
	;

statement
    :   block
    |   '_if' par_expression statement ('_else' statement)?
    |   '_for' '(' for_control ')' statement
    |   '_while' par_expression statement
    |   '_do' statement '_while' par_expression ';'
    |   '_try' block (catch_clause+ finally_block? | finally_block)
    |   '_switch' par_expression '{' switch_block_statement_group* switch_label* '}'
    |   '_synchronized' par_expression block
    |   '_return' expression? ';'
    |   '_throw' expression ';'
    |   '_break' Identifier? ';'
    |   '_continue' Identifier? ';'
    |   expression ';'
    |   Identifier ':' statement
    |   ';'
	;

catch_clause
	: 	'_catch' '(' Variable_modifier* Catch_type Identifier ')' block
	;

Catch_type
    :   Qualified_name ('|' Qualified_name)*
    ;

finally_block
	:	'_finally' block
	;

switch_block_statement_group
    :   switch_label+ block_statement+
    ;

switch_label
	:   '_case' constant_expression ':'
	|   '_default' ':'
	;


// Productions for Loops
for_control
	: 	shortcut_for_control
	| 	for_init ':' expression ':' for_update
	;

shortcut_for_control
	: 	Variable_modifier* Type_type Variable_declarator_id ':' expression
	;

for_init
	:   local_variable_declaration_statement
	|   expression_list
	;

for_update	
	:   expression_list
    ;


// Productions for expressions
expression
    :   Primary
    |   expression '.' Identifier
    |   expression '.' '_this'
    |   expression '.' '_super' super_suffix
    |   expression '[' expression ']'
    |   expression '(' expression_list? ')'
    |   '(' Type_type ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression '_instanceof' Type_type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   <assoc=right> expression 
		(   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '%='
        )
         expression
    ;

expression_list
    :	expression (',' expression)*
    ;

par_expression
    :   '(' expression ')'
    ;

constant_expression
    :   expression
    ;


// Productions for scanning
Scan
    :	'read' '(' Data_type ',' Variable_declarator_id ')' ';'
    ;

   
// Productions for printing
print
    :	'write' '(' expression ')' ';'
    ;

  
// Other Productions

super_suffix
    :   arguments
    |   '.' Identifier arguments?
    ;


arguments
    :   '(' expression_list? ')'
    ;



Class_or_interface_modifier
	: 	
	(   '_public'     // class or interface
    |   '_protected'  // class or interface
    |   '_private'    // class or interface
    |   '_static'     // class or interface
    |   '_abstract'   // class or interface
    |   '_final'      // class only -- does not apply to interfaces
    )
	;

Variable_modifier
	:   '_final'
	;


Qualified_name_list
    :   Qualified_name (',' Qualified_name)*
	;

Qualified_name
    :   Identifier ('.' Identifier)*
	;

Primary
    : 	Literal
    | 	Identifier 
    ;


Literal
    : 	Integer_literal
    | 	Character_literal
    | 	Floating_point_literal
    | 	String_literal
    | 	Boolean_literal
    | 	'_null'
    ;


Integer_literal
    : 	Decimal_numeral Integer_Type_Suffix?
    ;

Integer_Type_Suffix
    :   [lL]
    ;

Decimal_numeral
    :	'0'
    | 	Non_Zero_Digit(Digits?)
    ;

Digits
    : 	Digit(Digit*)
    ;

Digit
    : 	'0'
    | 	Non_Zero_Digit
    ;

Non_Zero_Digit
    : 	[1-9]
    ;

Floating_point_literal
    :   Decimal_floating_point_literal
    ;

Decimal_floating_point_literal
    :   Digit '.' Digits? Exponent_part? Float_Type_Suffix?
    |   '.' Digits Exponent_part? Float_Type_Suffix?
    |   Digits Exponent_part Float_Type_Suffix?
    |   Digits Float_Type_Suffix
    ;

Exponent_part
    :   Exponent_Indicator Signed_integer
    ;

Exponent_Indicator
    :   [eE]
    ;

Signed_integer
    :   Sign? Digits
    ;

Sign
    :   [+-]
    ;

Float_Type_Suffix
    :   [fFdD]
    ;

Character_literal
    :   '\'' Single_Character '\''
    |   '\'' Escape_Sequence '\''
    ;


Single_Character
    :   ~['\\\r\n]
    ;

String_literal
    :   '"' String_characters? '"'
    ;

String_characters
    :   String_character+
    ;

String_character
    :   ~["\\]
    |   Escape_Sequence
    ;

Escape_Sequence
    :   '\\' [btnfr"'\\]
    ;

Boolean_literal
    :   '_true'
    |   '_false'
    ;


// §3.9 Keywords

ABSTRACT      : 'abstract';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DATATYPE      : '_int' | '_float';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
//FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
//INT           : '_int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';



// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// §3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

Identifier
    :   Java_Letter Java_Letter_Or_Digit*
    ;

fragment
Java_Letter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
Java_Letter_Or_Digit
    :   [a-zA-Z0-9$_] // these are the "java letters or Digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;


//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
