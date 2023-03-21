grammar gramatica;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]+;
CONST_DEF_IDENTIFIER: [A-Z][A-Z_0-9]+;
NUMERIC_INTEGER_CONST: ('+'|'-')?[0-9]+;
NUMERIC_REAL_CONST: (NUMERIC_INTEGER_CONST'.'[0-9]+ | ('+'|'-')?'.'[0-9]+ | NUMERIC_INTEGER_CONST('.'[0-9]+)?('e'|'E')('+'|'-')?[0-9]+);
STRING_CONST: ('\''(Aux_text | Aux_simb)+'\'' | '"'(Aux_text | Aux_simb)+'"');
COMENTS: ('//' Aux_text+ '//' | '/*'(Aux_text | Aux_simb)+'*/');

Aux_text:  (IDENTIFIER | NUMERIC_REAL_CONST | NUMERIC_INTEGER_CONST | '.' | ',' | '-' | '_' | ':' | '!' | '¡' | '?' | '¿' | '=' | ' ' | '\'' | '\\"' | '(' | ')');
Aux_simb: '\n';
