grammar gramatica;

program: {  pagina += "<TITLE>PROGRAMA: codigo_prueba.c</TITLE>";
            principal = "<DIV>\n"
            + "<A  name=\"principal\">"
            + "<H1>Programa Principal</H1>\n";
          } dcllist funlist sentlist{    pagina += "</DIV></body></html>";
                                        File f = new File("codigo_prueba.html");
                                        try {
                                            f.createNewFile();
                                            FileWriter fw = new FileWriter(f);
                                            BufferedWriter bw = new BufferedWriter(fw);

                                            bw.write(pagina);
                                            bw.close();
                                        }catch(Exception e){System.out.println(e);}
                                    };
dcllist: dcl dcllist1
       | ;
dcllist1: dcl dcllist1
        | ;
funlist: funcdef funlist1{funciones += $funcdef.t + $funclist.t;}
       | {funciones += "<HR/>";};
funlist1 returns [String t]: funcdef funlist1{$t = funcdef.t + $funclist1.t;}
                           | ;
sentlist: mainhead '{' code'}';

dcl: ctedef {principal += $ctedef.t;}
   | varlist{principal += $varlist.t;};

//ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue | ctelist '#define' CONST_DEF_IDENTIFIER simpvalue;
ctedef returns [String t]: '#define' CONST_DEF_IDENTIFIER simpvalue{$t = "define " + $CONST_DEF_IDENTIFIER.text + " " + $simpvalue.t;};
//ctedef: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1;
//ctelist1: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1 | ;

simpvalue returns [String t]: NUMERIC_INTEGER_CONST {$t = $NUMERIC_INTEGER_CONST.text;}
                            | NUMERIC_REAL_CONST {$t = $NUMERIC_REAL_CONST.text;}
                            | STRING_CONST {$t = $STRING_CONST.text;};

//varlist: vardef ';' | varlist vardef ';'
varlist returns [String t]: vardef ';' varlist1;
varlist1 returns [String t]: vardef ';' varlist1
                           | ;

vardef: tbas IDENTIFIER
      | tbas IDENTIFIER '=' simpvalue;
//vardef: tbas IDENTIFIER| tbas IDENTIFIER '=' simpvalue| funcdef;

tbas: TYPE
    | tvoid
    | struct;

struct: 'struct' '{' varlist '}';

tvoid: VOID;

funcdef: funchead '{' code '}';
//funcdef: funchead '{' code '}'| funchead '{' code 'return' '(' IDENTIFIER ')' ';' '}';

funchead: tbas IDENTIFIER '(' typedef ')';

typedef: typedef1
       | ;

typedef1: tbas IDENTIFIER
        | typedef1 ',' tbas IDENTIFIER;

mainhead: tvoid 'Main' '(' typedef ')';

code: sent code1
    | ;
code1: sent code1
     | ;

sent: asig ';'
    | funccall ';'
    | vardef ';'
    | return ';'
    | if
    | while
    | dowhile
    | for;

if: 'if' expcond '{' code '}' else;

else: 'else' '{' code '}'
    | 'else' if
    | ;

while: 'while' '(' expcond ')' '{' code '}';

dowhile: 'do' '{' code '}' 'while' '('expcond ')' ';';

for: 'for' '(' vardef ';' expcond ';' asig ')' '{' code '}'
   | 'for' '(' asig ';' expcond';' asig ')' '{' code '}';

expcond: expcond oplog expcond
       | factorcond;

oplog: '||'
     | '&';

factorcond: exp opcomp exp
          | '(' expcond ')'
          | '!' factorcond;

opcomp: '<'
      | '>'
      | '<='
      |'>='
      | '==';

return: 'return' exp;
/*
sent: vardef_sent ';';
vardef_sent: asig | funccall | vardef;
*/

asig: IDENTIFIER '=' exp;

exp: exp op exp
   | factor;

op: '+'
  | '-'
  | '*'
  | 'DIV'
  | 'MOD';

factor: simpvalue
      | '(' exp ')'
      | funccall;

funccall: IDENTIFIER subpparamlist
        | CONST_DEF_IDENTIFIER;
//funccall: IDENTIFIER subpparamlist| CONST_DEF_IDENTIFIER subpparamlist;

subpparamlist: '(' explist ')'
             | ;

explist: exp
       | exp ',' explist;

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
Aux_text:  ('{' | '(' | ')' | '}' | '\'' | '\\''"' | '\r' | '.' | '@' | '$' | '€' | '%' | '#');
Aux_simb: (' '|'\n'|'\t') -> skip;