grammar gramatica;

program:  dcllist{principal += $dcllist.t;}
          funlist{funcionesCod += $funlist.t;}
          sentlist{principal += $sentlist.t;
          pagina += name;
          pagina += resto;
          pagina += name;
          pagina += titulo1;
          pagina += funciones;
          pagina += "<HR>";
          pagina += funcionesCod;
          pagina += principal;
          pagina += "</BODY></HTML>";
          File f = new File("codigo_prueba.html");
          try {
              f.createNewFile();
              FileWriter fw = new FileWriter(f);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(pagina);
              bw.close();
          }catch(Exception e){System.out.println(e);}
        };
dcllist returns [String t]: dcl dcllist1{$t = $dcl.t + " " + $dcllist1.t;}
       | {$t = "";};
dcllist1 returns [String t]: dcl dcllist1{$t = $dcl.t + $dcllist1.t;}
        | {$t = "";};
funlist returns [String t]: funcdef funlist1{$t = $funcdef.t + $funlist1.t;}
       | {$t = "";};
funlist1 returns [String t]: funcdef funlist1{$t = $funcdef.t + $funlist1.t;}
                           | {$t = "";};
sentlist returns [String t]: mainhead '{' code'}'{$t = $mainhead.t + " {" + $code.t + "}<br>" + "<A HREF=\"#principal\">Inicio del Programa Principal</A><a>  </a><A HREF=\"#programa\">Inicio del Programa</A>";};

dcl returns [String t]: ctedef {$t = $ctedef.t;}
   | varlist{$t = $varlist.t;};

ctedef returns [String t]: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1{$t = "<SPAN CLASS=\"palres\">#define</SPAN> " + "<SPAN CLASS=\"cte\">" + $CONST_DEF_IDENTIFIER.text + "</SPAN> " + $simpvalue.t + "<br>" + $ctelist1.t + "";};
ctelist1 returns [String t]: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1 {$t = "<SPAN CLASS=\"palres\">#define</SPAN> " + "<SPAN CLASS=\"cte\">" + $CONST_DEF_IDENTIFIER.text + "</SPAN> " + $simpvalue.t + "<br>" + $ctelist1.t;}
        | {$t = "";};

simpvalue returns [String t]: NUMERIC_INTEGER_CONST {$t = "<SPAN CLASS=\"cte\">" + $NUMERIC_INTEGER_CONST.text + "</SPAN>";}
                            | NUMERIC_REAL_CONST {$t = "<SPAN CLASS=\"cte\">" + $NUMERIC_REAL_CONST.text + "</SPAN>";}
                            | STRING_CONST {$t = "<SPAN CLASS=\"cte\">" + $STRING_CONST.text + "</SPAN>";};


varlist returns [String t]: vardef ';' varlist1{$t = $vardef.t + ";<br>" + $varlist1.t;};
varlist1 returns [String t]: vardef ';' varlist1{$t = $vardef.t + ";<br>" + $varlist1.t;}
                           | {$t = "";};

vardef returns [String t]: tbas IDENTIFIER{$t = $tbas.t + " <SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>;<br>";}
      | tbas IDENTIFIER '=' simpvalue{$t = $tbas.t + " <SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN> = " + $simpvalue.t;};

tbas returns [String t]: TYPE{$t = "<SPAN CLASS=\"palres\">" + $TYPE.text + "</SPAN>";}
    | tvoid{$t = $tvoid.t;}
    | struct{$t = $struct.t;};

struct returns [String t]: 'struct' '{' varlist '}'{$t = "<SPAN CLASS=\"palres\">struct</SPAN> {" + $varlist.t + "}";};

tvoid returns [String t]: VOID{$t = " <SPAN CLASS=\"palres\">" + $VOID.text + "</SPAN>";};

funcdef returns [String t]: funchead {funciones += "<UL><A HREF=\"#FUNCIONES:funcion" + contador + "\">" + "<LI>" + $funchead.t + "</LI></A></UL>";} '{' code '}'{$t = "<DIV><A name=\"FUNCIONES:funcion" + contador + "\">" + $funchead.t + "</A>{<br>" + $code.t + "<br>}<br></DIV><A HREF=\"#FUNCIONES:funcion" + contador + "\">Iicio de la funcion</A><a>  </a><A HREF=\"#principal\">Programa Principal</A><HR>"; contador++;};

funchead returns [String t]: tbas IDENTIFIER '(' typedef ')'{$t = $tbas.t + " <SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN> (" + $typedef.t + ")";};

typedef returns [String t]: typedef1{$t = $typedef1.t;}
       | {$t = "";};

typedef1 returns [String t]: tbas IDENTIFIER{$t = $tbas.t + " <SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>";}
        | tbas IDENTIFIER ',' typedef1{$t = $tbas.t + " <SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>, " + $typedef1.t;};

mainhead returns [String t]: tvoid 'Main' '(' typedef ')'{$t = $tvoid.t + " <SPAN CLASS=\"palres\">Main</SPAN>(" + $typedef.t + ")";};

code returns [String t]: sent code1{$t = "<DIV style=\"text-indent: 2cm\">" + $sent.t + $code1.t + "</DIV>";}
    | {$t = "";};
code1 returns [String t]: sent code1{$t = $sent.t + $code1.t;}
     | {$t = "";};

sent returns [String t]: asig ';'{$t = $asig.t + ";<br>";}
    | funccall ';'{$t = $funccall.t + ";<br>";}
    | vardef ';'{$t = $vardef.t;}
    | returna ';'{$t = $returna.t + ";<br>";}
    | ifa{$t = $ifa.t;}
    | whilea{$t = $whilea.t;}
    | dowhile{$t = $dowhile.t;}
    | fora{$t = $fora.t;};

ifa returns [String t]: 'if' expcond '{' code '}' elsea{$t = "<SPAN CLASS=\"palres\">if</SPAN> " + $expcond.t + "{<br>" + $code.t + "<br>}<br>" + $elsea.t;};

elsea returns [String t]: 'else' '{' code '}'{$t = "<SPAN CLASS=\"palres\">else</SPAN>{<br>" + $code.t + "<br>}<br>";}
    | 'else' ifa{$t = "<SPAN CLASS=\"palres\">else " + "</SPAN>" + $ifa.t;}
    | {$t = "";};

whilea returns [String t]: 'while' '(' expcond ')' '{' code '}'{$t = "<SPAN CLASS=\"palres\">while</SPAN> (" + $expcond.t + "){<br>" + $code.t + "<br>}<br>";};

dowhile returns [String t]: 'do' '{' code '}' 'while' '('expcond ')' ';'{$t = "<SPAN CLASS=\"palres\">do</SPAN>{<br>" + $code.t + "<br>}<br>" + "while(" + $expcond.t + ");<br>";};

fora returns [String t]: 'for' '(' vardef ';' expcond ';' asig ')' '{' code '}'{$t = "<SPAN CLASS=\"palres\">for</SPAN>(" + $vardef.t + "; " + $expcond.t + "; " + $asig.t + "){<br>" + $code.t +"<br>}<br>";}
   | 'for' '(' asig ';' expcond';' asig ')' '{' code '}'{$t = "<SPAN CLASS=\"palres\">for</SPAN>(" + $asig.t + "; " + $expcond.t + "; " + $asig.t + "){<br>" + $code.t + "<br>}<br>";};

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

returna returns [String t]: 'return' exp{$t = "<SPAN CLASS=\"palres\">return</SPAN>" + $exp.t;};


asig returns [String t]: IDENTIFIER '=' exp {$t = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN> = " + $exp.t;};

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

funccall returns [String t]: IDENTIFIER subparamlist{$t = "<A HREF=\"#" + $IDENTIFIER.text + "\"><SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN></A> " + $subparamlist.t;}
        | CONST_DEF_IDENTIFIER subparamlist{$t = "<A HREF=\"#" + $CONST_DEF_IDENTIFIER.text + "\">" + "<SPAN CLASS=\"cte\">" + $CONST_DEF_IDENTIFIER.text + "</SPAN></A>" + $subparamlist.t;};

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
TYPE: ('integer'|'float'|'string'|'long'|'enum'|'char'|'double'|'int' | 'String');
VOID: 'void';
CONST_DEF_IDENTIFIER: ('_')?[A-Z]+ ([A-Z] | '_' | [0-9])* [A-Z]+ ([A-Z] | '_' | [0-9])*;
IDENTIFIER: /*[a-z]* ([a-z] | '_' | [0-9])*/('_')?[a-z]+ ([a-z] | '_' | [0-9])*;
NUMERIC_INTEGER_CONST: ('+'|'-')?[0-9]+;
NUMERIC_REAL_CONST: (NUMERIC_INTEGER_CONST'.'[0-9]+ | ('+'|'-')?'.'[0-9]+ | NUMERIC_INTEGER_CONST('.'[0-9]+)?('e'|'E')('+'|'-')?[0-9]+);
STRING_CONST: ('\''([a-zA-Z0-9] | Aux_text)*'\'' | '"'(Aux_text | [a-zA-Z0-9])*'"');
COMENTS: ('//' Aux_text+ '//' | '/*'(Aux_text | Aux_simb)+'*/');
Aux_text:  ('{' | '(' | ')' | '}' | '\'' | '\\' | '"' | '.' | '@' | '$' | '€' | '%' | '#');
Aux_simb: (' '|'\n'|'\r'|'\t') -> skip;