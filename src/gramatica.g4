grammar gramatica;

program: {  pagina += "<TITLE>PROGRAMA: codigo_prueba.c</TITLE>";
            principal = "<DIV>\n"
            + "<A  name=\"principal\">"
            + "<H1>Programa Principal</H1>\n";
          } dcllist funlist{pagina += "<DIV>\n <A HREF=#main>Programa Principal</A>" + funciones + </DIV>;} sentlist{    pagina += "</DIV></body></html>";
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
funlist: funcdef funlist1{funciones += $funcdef.t + $funlist1.t;}
       | {funciones += "<HR/>";};
funlist1 returns [String t]: funcdef funlist1{$t = $funcdef.t + $funlist1.t;}
                           | {funciones += "<HR/>"; $t = "";};
sentlist: mainhead '{' code'}'{pagina += $mainhead.t + "{\n" + $code.t + "\n}\n";};

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
varlist returns [String t]: vardef ';' varlist1{$t = $vardef.t + "; " + $varlist1.t + " ";};
varlist1 returns [String t]: vardef ';' varlist1{$t = $vardef.t + "; " + $varlist1.t + " ";}
                           | {$t = "";};

vardef returns [String t]: tbas IDENTIFIER{$t = $tbas.t + " " + $IDENTIFIER.text;}
      | tbas IDENTIFIER '=' simpvalue{$t = $tbas.t + " " + $IDENTIFIER.text + " = " + $simpvalue.t;};
//vardef: tbas IDENTIFIER| tbas IDENTIFIER '=' simpvalue| funcdef;

tbas returns [String t]: TYPE{$t = $TYPE.text;}
    | tvoid{$t = $tvoid.t;}
    | struct{$t = $struct.t;};

struct returns [String t]: 'struct' '{' varlist '}'{$t = "struct {" + $varlist.t + "}"};

tvoid returns [String t]: VOID{$t = $VOID.text;};

funcdef returns [String t]: funchead {funciones += "<A HREF=#" + $funchead.t +">$funchead.t</A>\n"; } '{' code '}'{$t = "<A name=\"" + $funchead.t + "\">" + $funchead.t + "\n{\n" + $code.t + "\n}\n<HR/>";};
//funcdef: funchead '{' code '}'| funchead '{' code 'return' '(' IDENTIFIER ')' ';' '}';

funchead returns [String t]: tbas IDENTIFIER '(' typedef ')'{$t = $tbas.t + $IDENTIFIER.text + " (" + $typedef.t + ")";};

typedef returns [String t]: typedef1{$t = $typedef1.t;}
       | {$t = "";};

typedef1 returns [String t]: tbas IDENTIFIER{$t = $tbas.t + $IDENTIFIER.text;}
        | tbas IDENTIFIER ',' typedef1{$t = $tbas.t + $IDENTIFIER.text + ", " $typedef1.t};

mainhead returns [String t]: tvoid 'Main' '(' typedef ')'{$t = $tvoid.t + " Main(" + $typedef.t + ")";};

code returns [String t]: sent code1{$t = "<DIV style=\"text-indent: 2cm\">" + $sent.t + $code1.t + "</DIV>";}
    | {$t = "";};
code1 returns [String t]: sent code1{$t = $sent.t + $code1.t;}
     | {$t = "";};

sent returns [String t]: asig ';'{$t = $asig.t + ";";}
    | funccall ';'{$t = $funccall.t + ";";}
    | vardef ';'{$t = $vardef.t + ";";}
    | return ';'{$t = $return.t + ";";}
    | if{$t = $if.t;}
    | while{$t = $while.t;}
    | dowhile{$t = $dowhile.t;}
    | for{$t = $for.t;};

if returns [String t]: 'if' expcond '{' code '}' else{$t = "if " + $expcond.t + "{\n" + $code.t + "\n}\n" + $else.t;};

else returns [String t]: 'else' '{' code '}'{$t = "else{\n" + $code.t + "\n}\n";}
    | 'else' if{$t = "else " + $if.t;}
    | {$t = "";};

while returns [String t]: 'while' '(' expcond ')' '{' code '}'{$t = "while (" + $expcond.t + ") {\n" + $code.t + "\n}\n";};

dowhile returns [String t]: 'do' '{' code '}' 'while' '('expcond ')' ';'{$t = "do {\n" + $code.t + "\n}\n" + "while (" + $expcond.t + ");\n";};

for returns [String t]: 'for' '(' vardef ';' expcond ';' asig ')' '{' code '}'{$t = "for (" + $vardef.t + ";" + $expcond.t + ";" + $asig.t + ") {\n" + $code.t + "\n}\n";}
   | 'for' '(' asig ';' expcond';' asig ')' '{' code '}'{$t = "for (" + $asig.t + ";" + $expcond.t + ";" + $asig.t + ") {\n" + $code.t + "\n}\n";};

expcond returns [String t]: expcond oplog expcond{$t = $expcond.t + " " + $oplog.t + " " + $expcond.t;}
       | factorcond{$t = $factorcond.t;};

oplog returns [String t]: '||'{$t = "||";}
     | '&'{$t = "&";};

factorcond returns [String t]: exp opcomp exp{$t = $exp.t + " " + $opcomp.t + " " + $exp.t;}
          | '(' expcond ')'{$t = "(" + $expcond.t + ")";}
          | '!' factorcond {$t = "!" + $factorcond.t;};

opcomp returns [String t]: '<'{$t = "<";}
      | '>'{$t = ">";}
      | '<='{$t = "<=";}
      |'>='{$t = ">=";}
      | '=='{$t = "==";};

return returns [String t]: 'return' exp{$t = "return" + $exp.t;};
/*
sent: vardef_sent ';';
vardef_sent: asig | funccall | vardef;
*/

asig returns [String t]: IDENTIFIER '=' exp {$t = $IDENTIFIER.text + " = " + $exp.t;};

exp returns [String t]: exp op exp{$t = $exp.t + " " + $op.t + " " + $exp.t;}
   | factor{$t = $factor.t;};

op returns [String t]: '+'{$t = "+";}
  | '-'{$t = "-";}
  | '*'{$t = "*";}
  | 'DIV'{$t = "DIV";}
  | 'MOD'{$t = "MOD";};

factor returns [String t]: simpvalue{$t = $simpvalue.t;}
      | '(' exp ')'{$t = "(" + $exp.t + ")";}
      | funccall{$t = $funccall.t;};

funccall returns [String t]: IDENTIFIER subparamlist{$t = $IDENTIFIER.text + " " + $subparamlist.t;}
        | CONST_DEF_IDENTIFIER{$t = $CONST_DEF_IDENTIFIER.text;};
//funccall: IDENTIFIER subpparamlist| CONST_DEF_IDENTIFIER subpparamlist;

subparamlist returns [String t]: '(' explist ')'{$t = "(" + $explist.t + ")";}
             | {$t = "";};

explist returns [String t]: exp{$t = $exp.t;}
       | exp ',' explist{$t = $exp.t + ", " + $explist.t;};

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