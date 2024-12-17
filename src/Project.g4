grammar Project;
program: function_definitions statements ;
function_definitions : (function_definition)* ;
function_definition : 'function' identifier '(' ')' '{' statements '}' ;
statements: (statement)* ;
statement: identifier '=' expr';'                                #assignment
         | '{' statements '}'                              #beginend
         | 'if(' expr ')' statement                            #if
         | 'if(' expr ')' statement 'else' statement           #ifelse
         | 'while(' expr ')' statement                           #while
         | 'for(' identifier '=' number 'to' number ')' statement #for
         | 'print' identifier';'                                 #print 
	 |  identifier '(' ')' ';'                               #func
         ; 
expr: expr binop expr                                            #binopr
    | '!' expr                                                   #not
    | '(' expr ')'                                               #paranthesis
    | identifier                                                 #id
    | number                                                     #num
    | boolea                                                     #bool
    | mexp 							 #mexpr 
    ; 
mexp: mldv ( spop mldv )* ;                             
mldv: pow  ( mldvop pow )* ;			         
pow : fact ( faop fact )* ;					 
fact: '(' mexp ')'						 #paran
    | identifier						 #idd
    | number							 #numm
    ;
spop :  '+' | '-'; 
mldvop: '/' | '*';
faop: '^' ;
binop :'<' | '>' | '<=' | '>='  | '==' | '!=' ; 
number : ('+' | '-')? DIGITS ('.' DIGITS)? ;
identifier : ALPHABETS ('_' | ALPHABETS | DIGITS)? ;
boolea : 'true' | 'false' ;
DIGITS : [0-9]+ ;
ALPHABETS : [a-zA-Z]+ ;
WS: [ \t\r\n] -> channel(HIDDEN) ;