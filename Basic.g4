grammar Basic;

// ==========================
// PARSER
// ==========================

program
    : (line)* EOF
    ;

line
    : statement? NEWLINE
    ;

// ==========================
// STATEMENTS
// ==========================

statement
    : variableDeclaration
    | assignment
    | arrayAssignment
    | functionDefinition
    | subroutineDefinition
    | ifStatement
    | forLoop
    | whileLoop
    | printStatement
    | inputStatement
    | returnStatement
    | gotoStatement
    | labelStatement
    ;

// ==========================
// VARIABLES / ARRAYS
// ==========================

variableDeclaration
    : DIM Identifier ('(' expression ')')? (AS typeSpecifier)? ('=' expression)?
    ;

assignment
    : Identifier '=' expression
    ;

arrayAssignment
    : Identifier '(' expression ')' '=' expression
    ;

// ==========================
// TYPES
// ==========================

typeSpecifier
    : INTEGER
    | SINGLE
    | DOUBLE
    | STRING
    ;

// ==========================
// FUNCTIONS / SUBS
// ==========================

functionDefinition
    : FUNCTION Identifier '(' parameterList? ')' AS typeSpecifier NEWLINE
      (line)*
      END_FUNCTION
    ;

subroutineDefinition
    : SUB Identifier '(' parameterList? ')' NEWLINE
      (line)*
      END_SUB
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : Identifier AS typeSpecifier
    ;

returnStatement
    : RETURN expression?
    ;

// ==========================
// CONTROL FLOW
// ==========================

ifStatement
    : IF expression THEN NEWLINE
      (line)*
      (ELSEIF expression THEN NEWLINE (line)*)*
      (ELSE NEWLINE (line)*)?
      END_IF
    ;

forLoop
    : FOR Identifier '=' expression TO expression (STEP expression)? NEWLINE
      (line)*
      NEXT Identifier?
    ;

whileLoop
    : WHILE expression NEWLINE
      (line)*
      WEND
    ;

// ==========================
// GOTO / LABEL
// ==========================

labelStatement
    : Identifier ':'
    ;

gotoStatement
    : GOTO Identifier
    ;

// ==========================
// IO
// ==========================

printStatement
    : PRINT expression (',' expression)*
    ;

inputStatement
    : INPUT Identifier
    ;

// ==========================
// EXPRESSIONS
// ==========================

expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression (('=' | '<>') relationalExpression)*
    ;

relationalExpression
    : additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/') unaryExpression)*
    ;

unaryExpression
    : ('+' | '-')? primaryExpression
    ;

primaryExpression
    : functionCall
    | arrayAccess
    | Identifier
    | IntegerLiteral
    | FloatingLiteral
    | StringLiteral
    | '(' expression ')'
    ;

functionCall
    : Identifier '(' argumentList? ')'
    ;

arrayAccess
    : Identifier '(' expression ')'
    ;

argumentList
    : expression (',' expression)*
    ;

// ==========================
// LEXER (KEYWORDS)
// ==========================

DIM: 'DIM';
AS: 'AS';

INTEGER: 'INTEGER';
SINGLE: 'SINGLE';
DOUBLE: 'DOUBLE';
STRING: 'STRING';

FUNCTION: 'FUNCTION';
SUB: 'SUB';
RETURN: 'RETURN';

END_FUNCTION: 'END FUNCTION';
END_SUB: 'END SUB';
END_IF: 'END IF';

IF: 'IF';
THEN: 'THEN';
ELSEIF: 'ELSEIF';
ELSE: 'ELSE';

FOR: 'FOR';
TO: 'TO';
STEP: 'STEP';
NEXT: 'NEXT';

WHILE: 'WHILE';
WEND: 'WEND';

PRINT: 'PRINT';
INPUT: 'INPUT';

GOTO: 'GOTO';

OR: 'OR';
AND: 'AND';

// ==========================
// TOKENS
// ==========================

Identifier
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

IntegerLiteral
    : [0-9]+
    ;

FloatingLiteral
    : [0-9]* '.' [0-9]+
    ;

StringLiteral
    : '"' (~["\r\n])* '"'
    ;

NEWLINE
    : '\r'? '\n'
    ;

Whitespace
    : [ \t]+ -> skip
    ;

Comment
    : '\'' ~[\r\n]* -> skip
    ;
