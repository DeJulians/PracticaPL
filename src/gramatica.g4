grammar gramatica;

dcl: ctelist | varlist;
ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue | ctelist 'define' CONST_DEF_IDENTIFIER simpvalue;
simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
varlist: vardef ';'| varlist vardef ';';
vardef: tbas IDENTIFIER | tbas IDENTIFIER '=' simpvalue;
tbas: 'integer' | 'float' | 'string' | tvoid;
tvoid: 'void';
funcdef: funchead '{' code '}';
funchead: tbas IDENTIFIER '(' typedef1 ')';
typedef1: (typedef2)?;
typedef2: tbas IDENTIFIER | typedef2 ',' tbas IDENTIFIER;
mainhead: tvoid 'Main' '(' typedef1 ')';
code: (code sent)?;
sent: asig ';' | funccall ';' | vardef ';'
asig: IDENTIFIER '=' exp;
exp: exp op exp | factor;
op: '+' | '-' | '*' | 'DIV' | 'MOD';
factor: simpvalue | '(' exp ')' | funccall;
funccall: IDENTIFIER subpparamlist | CONST_DEF_IDENTIFIER subpparamlist;
subpparamlist: ('(' explist ')')?;
explist: exp | exp ',' explist;

text:(id | const | int | real | string | com | aux | simb | resv)+;
id: IDENTIFIER;
const: CONST_DEF_IDENTIFIER;
int: NUMERIC_INTEGER_CONST;
real: NUMERIC_REAL_CONST;
string: STRING_CONST;
com:COMENTS;
aux: Aux_text;
simb: Aux_simb;
resv:RESERVED;

RESERVED: ('integer'|'float'|'string');
CONST_DEF_IDENTIFIER: ([A-Z][A-Z_0-9]*|'#' Aux_text);
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
NUMERIC_INTEGER_CONST: ('+'|'-')?[0-9]+;
NUMERIC_REAL_CONST: (NUMERIC_INTEGER_CONST'.'[0-9]+ | ('+'|'-')?'.'[0-9]+ | NUMERIC_INTEGER_CONST('.'[0-9]+)?('e'|'E')('+'|'-')?[0-9]+);
STRING_CONST: ('\''(Aux_text | Aux_simb)+'\'' | '"'(Aux_text | Aux_simb)+'"');
COMENTS: ('//' Aux_text+ '//' | '/*'(Aux_text | Aux_simb)+'*/');



Aux_text:  ('{' | IDENTIFIER | NUMERIC_REAL_CONST | NUMERIC_INTEGER_CONST | '.' | ',' | '-' | '_' | ':' | '!' | '¡' | '?' | '¿' | '=' | ' ' | '\'' | '\\"' | '(' | ')' | ';' | '+' | '}' | '*');
Aux_simb: (' '|'\n');