grammar Jzz;

@header {
package com.mnorfolk.jzz.gen;
}

parseFile
    : lambda EOF
    ;

lambda
    : (OPEN_PAREN lambdaParams? CLOSE_PAREN)? OPEN_BRACE codeLine* CLOSE_BRACE      # multiLambda
    | (OPEN_PAREN lambdaParams? CLOSE_PAREN)? OPEN_BRACKET expression CLOSE_BRACKET # singleLambda
    ;

lambdaParams
    // mix of (Int x, Int y = 3)
    : (declareVar ARGUMENT_SEP)+ (declareAndAssign ARGUMENT_SEP)* declareAndAssign
    // just (Int x, Int y)
    | declareVar (ARGUMENT_SEP declareVar)*
    // Just (Int x = 3, Int y = 5)
    | declareAndAssign (ARGUMENT_SEP declareAndAssign)*
    ;

codeLine
     //: func END_LINE
    : declareAndAssign END_LINE  # declareAndAssignLine
    | declareVar END_LINE        # declareLine
    | assignVar END_LINE         # assignLine
    | assignCallable END_LINE    # assignCallableLine
    | expression END_LINE        # exprLine
    ;

// Int x;
declareVar
    : ID ID
    ;

// x = 5;
assignVar
    : ID ASSIGN expression
    ;

assignCallable
    : object OPEN_PAREN arguments? CLOSE_PAREN ASSIGN expression      # assignParen
    | object OPEN_BRACKET arguments? CLOSE_BRACKET ASSIGN expression  # assignBracket
    ;

// Int x = 5;
declareAndAssign
    : declareVar ASSIGN expression
    ;

parenParams
    : OPEN_PAREN arguments? CLOSE_PAREN
    ;

bracketParams
    : OPEN_BRACKET arguments? CLOSE_BRACKET
    ;

//////////////////////////////////////////////////////////////
// Expression and Precedence
//////////////////////////////////////////////////////////////

subExpr
    : object                                                         # objectExpr
    | INCREMENT subExpr                                              # preIncrement
    | DECREMENT subExpr                                              # preDecrement
    | NOT subExpr                                                    # preNot
    | AMPERSAND subExpr                                              # preAmpersand
    | MULTI subExpr                                                  # preStar
    | MINUS subExpr                                                  # preNegate
    | <assoc=right> subExpr POW subExpr                              # powOp
    | subExpr op=(MULTI | DIV | FLOOR_DIV | MOD | DIV_MOD) subExpr   # multiDivOp
    | subExpr op=(PLUS | MINUS) subExpr                              # plusMinusOp
    | subExpr op=(SHIFT_L | SHIFT_R) subExpr                         # shiftOp
    ;

expression
    : subExpr                                       # findExpr
    | subExpr (op=(EQ|GT|GTEQ|LT|LTEQ) subExpr)+    # multiCompExpr
    | subExpr op=(NEQ | INT_COMPARE) subExpr        # compExpr
    | expression op=(AND | OR | XOR) expression     # logicalExpr
    ;

object
    : ID safeAttribute                      # objSafeAttribute
    | ID                                    # objId
    | literal                               # objLiteral
    | lambda                                # objLambda
    | OPEN_PAREN array CLOSE_PAREN          # objArray
    | OPEN_PAREN expression CLOSE_PAREN     # parenExpr
    | BAR expression BAR                    # barExpr
    | object attribute                      # objAttribute
    | object parenParams                    # objParenCall
    | object bracketParams                  # objBracketCall
    ;

attribute
    : ACCESS ID attribute?
    ;

safeAttribute
    : ACCESS ID safeAttribute?
    ;

//// function
//func
//    : ID OPEN_PAREN arguments? CLOSE_PAREN
//    ;

// arguments for a function
arguments
    : array      # multiArgs // either an array
    | expression # singleArg // or a single value
    ;

array
    : (expression ARGUMENT_SEP)+ expression?
    ;

// string literal or int literal
literal
    : HEX_INT       # hex
    | BINARY_INT    # binary
    | FLOAT         # float
    | INT           # int
    | STRING        # string
    | TRUE          # true
    | FALSE         # false
    ;

// special chars
ACCESS          : '.';
COLON           : ':'; // pointer maybe?

ASSIGN          : '=';
END_LINE        : ';';
ARGUMENT_SEP    : ',';

TRUE            : 'TRUE';
FALSE           : 'FALSE';

// identifier
ID              : [a-zA-Z_] [a-zA-Z0-9_]*;

// integers
INT             :  [0-9] [0-9_]* ;
HEX_INT         :  ('0x' | '0X') [0-9a-fA-F] [0-9a-fA-F_]* ;
BINARY_INT      :  ('0b' | '0B') [01] [01_]*;

FLOAT           : INT? '.' INT 'f'?
                | INT '.' 'f'?
                | INT 'f'
                ;

STRING          : '"' (~["\r\n] | '\\"')* '"'
                | '\'' (~['\r\n] | '\\\'')* '\''
                | '`' (~[`] | '\\`' )* '`'      // multiline string
                ;

// skip
COMMENT         : '#' ~[\r\n]* -> skip;
BLOCK_COMMENT   : '#--' .*? '--#' -> skip;

WHITESPACE      :  [ \t\r\n] -> skip;

// brackets
OPEN_BRACE      : '{';
CLOSE_BRACE     : '}';
OPEN_PAREN      : '(';
CLOSE_PAREN     : ')';
OPEN_BRACKET    : '[';
CLOSE_BRACKET   : ']';
BAR             : '|';

// operators
INCREMENT       : '++';
DECREMENT       : '--';

PLUS            : '+';
MINUS           : '-';
MULTI           : '*';
DIV             : '/';
FLOOR_DIV       : '//';
MOD             : '%';
DIV_MOD         : '/%';
POW             : '^';

// comparison
LT              : '<';
GT              : '>';
LTEQ            : '<=';
GTEQ            : '>=';
EQ              : '==';
NEQ             : '!=';
INT_COMPARE     : '<=>'; // returns 1 if > 0 if == and -1 if <

// boolean
NOT             : '!' | '~';
OR              : '||';
AND             : '&&';
XOR             : '&|' | '|&'; // xor

// bitwise
SHIFT_L         : '<<';
SHIFT_R         : '>>';

AMPERSAND       : '&'; // pointer maybe?