grammar gramatica;

program: dcllist funlist sentlist;
dcllist:  | dcl dcllist;
funlist: | funlist funcdef;
sentlist:mainhead '{' code'}';
//axioma: dcl;

dcl: ctelist | varlist;
//ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue | ctelist '#define' CONST_DEF_IDENTIFIER simpvalue;
ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1;
ctelist1: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1 | ;

simpvalue: NUMERIC_INTEGER_CONST| NUMERIC_REAL_CONST| STRING_CONST;

//varlist: vardef ';' | varlist vardef ';'
varlist: vardef ';' varlist1;
varlist1: vardef ';' varlist1 | ;
//puede haber recurs izq
vardef: tbas IDENTIFIER| tbas IDENTIFIER '=' simpvalue| funcdef;

tbas: TYPE | tvoid;

tvoid: VOID;

funcdef: funchead '{' code '}'| funchead '{' code 'return' '(' IDENTIFIER ')' ';' '}';

funchead: tbas IDENTIFIER '(' typedef1 ')';

typedef1: typedef2 | ;

typedef2: tbas IDENTIFIER| typedef2 ',' tbas IDENTIFIER;

mainhead: tvoid 'Main' '(' typedef1 ')';

code: ((sent)* sent)?;
//DUDA SOBRE SI HAY RECURS IZQ O NO DETERMINISMO
sent: asig ';'| funccall ';'| vardef ';';
/*
sent: vardef_sent ';';
vardef_sent: asig | funccall | vardef;
*/

asig: IDENTIFIER '=' exp;

exp: exp op exp| factor;

op: '+'| '-'| '*'| 'DIV'| 'MOD';

factor: simpvalue | '(' exp ')'| funccall;

funccall: IDENTIFIER subpparamlist| CONST_DEF_IDENTIFIER subpparamlist;

subpparamlist: '(' explist ')' | ;

explist: exp| exp ',' explist;

text: (id|const| int| real  string | com | aux | simb | resv | typ | voi);

id: IDENTIFIER;
const: CONST_DEF_IDENTIFIER;
int: NUMERIC_INTEGER_CONST;
real: NUMERIC_REAL_CONST;
string: STRING_CONST;
com:COMENTS;
aux: Aux_text;
simb: Aux_simb;
resv:RESERVED;
typ: TYPE;
voi: VOID;

RESERVED: ('break'|'register'|'case'|'return'|'for'|'if'|'else'|'switch'|'union'|'default'|'do'|'typedef'|'union'
          |'short'|'unsigned'|'goto'|'sizeof'|'volatile'|'static'|'while'|'struct'|'_Packed'|'const');
TYPE: ('integer'|'float'|'string'|'long'|'enum'|'char'|'double'|'int');
VOID: 'void';
CONST_DEF_IDENTIFIER: [A-Z]* ([A-Z] | '_' | [0-9])* [A-Z]+ ([A-Z] | '_' | [0-9])*;
IDENTIFIER: [a-z]* ([a-z] | '_' | [0-9])* [a-z]+ ([a-z] | '_' | [0-9])*;
NUMERIC_INTEGER_CONST: ('+'|'-')?[0-9]+;
NUMERIC_REAL_CONST: (NUMERIC_INTEGER_CONST'.'[0-9]+ | ('+'|'-')?'.'[0-9]+ | NUMERIC_INTEGER_CONST('.'[0-9]+)?('e'|'E')('+'|'-')?[0-9]+);
STRING_CONST: ('\''([a-zA-Z0-9] | Aux_text)*'\'' | '"'(Aux_text | [a-zA-Z0-9])*'"');
COMENTS: ('//' Aux_text+ '//' | '/*'(Aux_text | Aux_simb)+'*/');
Aux_text:  ('{' | '(' | ')' | '}' | '\'' | '"' | '\r' | '.');
Aux_simb: (' '|'\n') -> skip;