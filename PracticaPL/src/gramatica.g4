grammar gramatica;

program: dcllist funlist sentlist;
dcllist:(dcllist dcl)?;
funlist:(funlist func)?;
sentlist:mainhead | '{' code '}';
dcl:ctelist | varlist;
ctelist:'#define' CONST_DEF_IDENTIFIER simpvalue '\n' | ctelist '#define' CONST_DEF_IDENTIFIER simpvalue '\n';
simpvalue:NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
varlist: vardef ';' | varlist vardef ';';
tbas:'integer'|'float'|'string'|tvoid;
tvoid:'void';
funlist:  funcdef | funclist funcdef;
funcdef: funchead '{' code '}' ;
funchead:tbas IDENTIFIER '(' typedef ')' ;
typedef: (typedef tbas IDENTIFIER )?;
mainhead : tvoid 'Main' '(' typedef ')';
code: (code sent)?;
sent: asig ';' | func_call ';';
asig: IDENTIFIER '=' exp;
exp : exp op exp | factor;
op: '+'|'-'|'*'|'DIV'|'MOD';
factor:  simpvalue | '(' exp ')' | IDENTIFIER subpparamlist ;
subpparamlist: ('('explist ')')?;
explist: exp | exp ',' explist;
func_call: IDENTIFIER subpparamlist;
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
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*; // ^(_)
NUMERIC_INTEGER_CONST: ('+'|'-')?[0-9]+;
NUMERIC_REAL_CONST: (NUMERIC_INTEGER_CONST'.'[0-9]+ | ('+'|'-')?'.'[0-9]+ | NUMERIC_INTEGER_CONST('.'[0-9]+)?('e'|'E')('+'|'-')?[0-9]+);
STRING_CONST: ('\''(Aux_text | Aux_simb)+'\'' | '"'(Aux_text | Aux_simb)+'"');
COMENTS: ('//' Aux_text+ '//' | '/*'(Aux_text | Aux_simb)+'*/');



Aux_text:  ('{' | IDENTIFIER | NUMERIC_REAL_CONST | NUMERIC_INTEGER_CONST | '.' | ',' | '-' | '_' | ':' | '!' | '¡' | '?' | '¿' | '=' | ' ' | '\'' | '\\"' | '(' | ')' | ';' | '+' | '}' | '*');
Aux_simb: (' '|'\n');