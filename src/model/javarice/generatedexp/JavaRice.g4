grammar JavaRice;

// starting point for parsing a java file
program
    :   packageDeclaration? importDeclaration* classDeclaration* EOF
    ;

packageDeclaration
    :   'package' qualifiedName ';'
    ;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

classOrInterfaceModifier
    :  (   'public'     // class or interface
        |   'protected'  // class or interface
        |   'private'    // class or interface
        |   'static'     // class or interface
        |   'abstract'   // class or interface
        |   'final'      // class only -- does not apply to interfaces
        )
    ;

variableModifier
    :   'final'
    ;

classDeclaration
    :   (classOrInterfaceModifier)? 'class' Identifier typeParameters?
        ('extends' typeType)?
        classBody
    ;

typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier 
    ;

typeList
    :   typeType (',' typeType)*
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   ';'
    |   'static'? block
    |   memberDeclaration
    ;

memberDeclaration
    :   mainDeclaration
    |	methodDeclaration
    |   variableDeclaration
    |   classDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   (typeType|'_void') Identifier formalParameters ('[' ']')*
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
    
mainDeclaration
	: VOID MAIN '(' ')' methodBody
	;

variableDeclaration
    :   typeType variableDeclarators ';'
    ;

constDeclaration
    :   typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

typeType
    :   classOrInterfaceType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

classOrInterfaceType
    :   Identifier typeArguments? ('.' Identifier typeArguments? )*
    ;

primitiveType
    :   '_boolean'
    |   '_char'
    |   '_byte'
    |   '_short'
    |   '_int'
    |   '_long'
    |   '_float'
    |   '_double'
    |   '_String'
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    :   typeType
    |   '?' (('extends' | 'super') typeType)?
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* typeType '...' variableDeclaratorId
    ;

methodBody
    :   block
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

// STATEMENTS / BLOCKS

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   variableModifier* typeType variableDeclarators
    ;

statement
    :   block
    |	ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block (catchClause+ finallyBlock? | finallyBlock)
    |   'try' resourceSpecification block catchClause* finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
    |   'continue' Identifier? ';'
    |   ';'
    |   statementExpression ';'
    |   Identifier ':' statement
    |   WRITE '(' expression ')' ';'
    |   scan
    ;

catchClause
    :   'catch' '(' variableModifier* catchType Identifier ')' block
    ;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    :   'finally' block
    ;

resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'default' ':'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* typeType variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary
    |   expression '.' Identifier
    |   expression '[' expression ']'
    |   expression arguments
    |   'new' creator
    |   '(' typeType ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' typeType
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
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
    ;

primary
    :   '(' expression ')'
    |   'this'
    |   'super'
    |   literal
    |   Identifier
    |   typeType '.' 'class'
    |   'void' '.' 'class'
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? ('.' Identifier typeArgumentsOrDiamond?)*
    |   primitiveType
    ;

innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;


nonWildcardTypeArguments
    :   '<' typeList '>'
    ;

typeArgumentsOrDiamond
    :   '<' '>'
    |   typeArguments
    ;


nonWildcardTypeArgumentsOrDiamond
    :   '<' '>'
    |   nonWildcardTypeArguments
    ;



arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;

arguments
    :   '(' expressionList? ')'
    ;

// INPUT
scan
    :   'read' '(' primitiveType ',' Identifier ')' ';'
    ;

// LEXER

// §3.9 Keywords

ASSERT        : 'assert';
BOOLEAN       : '_boolean';
BREAK         : 'break';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : '_char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : '_double';
ELSE          : 'else';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : '_float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : '_int';
INTERFACE     : 'interface';
LONG          : '_long';
MAIN		  : 'main';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
READ          : 'read';
RETURN        : 'return';
SHORT         : '_short';
STATIC        : 'static';
STRING        : '_String';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRY           : 'try';
VOID          : '_void';
WHILE         : 'while';
WRITE         : 'write';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;


fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\\r\n]
    ;

// §3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    ;


// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

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

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
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