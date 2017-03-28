/** 
 * Grammar of Aemilia language
 **/

grammar AemiliaGrammar;

options {
	backtrack=true; 
}

archi_type 
	: 'ARCHI_TYPE' WORD archi_header archi_elem_types archi_topology 'END';

archi_header
	: '(' 'void' ')' | '(' init_constant_list ')';
	
init_constant_list
	: init_constant (',' init_constant)*;
	
init_constant
	: 'const' dataType constName ':=' expr;
	
constName
	: WORD;
	
archi_elem_types
	: 'ARCHI_ELEM_TYPES' (elem_type)+;
	
elem_type
	: 'ELEM_TYPE' WORD et_header 
	  'BEHAVIOR' behavior_equation_list
	  'INPUT_INTERACTIONS' interaction_list_input 
	  'OUTPUT_INTERACTIONS' interaction_list_output;
	  
et_header
	: '(' 'void' ')' | '(' constant_list ')';
	
constant_list
	: constant (',' constant)*;
	
constant
	: 'const' dataType constName;
	
interaction_list_input
	: 'void'
	| interactionInput (';' interactionInput)*;
	
interaction_list_output
	: 'void'
	| interactionOutput (';' interactionOutput)*;
	
interactionInput
	: (interaction_type WORD);
	
interactionOutput
	: (interaction_type WORD);
	
interaction_type
	: 'UNI' | 'AND' | 'OR';
	
behavior_equation_list
	: first_equation equations_list? ;
	
first_equation
	: WORD '(' behavior_header_first ')' '=' processTerm ';'?;
	
equations_list
	: equations*;
	
equations
	: WORD '(' behavior_header ')' '=' processTerm ';'?;
	
eqName
	: WORD;
	
behavior_header_first
	: ('void' | leftSide_first) ';' ('void' | rightSide);
	
behavior_header
	: ('void' | leftSide) ';' ('void' | rightSide);
	
leftSide_first
	: varInit (',' varInit)*;

varInit
	: normalType WORD ':=' expr;
	
leftSide
	: var (',' var)*;
	
var
	: normalType WORD;
	
rightSide
	:local (',' local)*;
	
local
	: 'local' normalType WORD;

processTerm :'stop'
			 | action '.' process_term_1
			 | 'choice' '{' process_term_2_list '}';
			 
process_term_2_list : process_term_2 (',' process_term_2)*;
			 
process_term_1 : processTerm
			   | behavEqInvocation;
			   
behavEqInvocation :
			 eqName '(' expressionList? ')';
			 
expressionList
	: expr (',' expr)*;
	
wordList
	: WORD (',' WORD)*;
			   
process_term_2 : condExpr? processTerm;

condExpr
	:  'cond' '(' expr ')' '->';

action : '<' actionName action_type? ',' action_rate '>';

actionName : WORD;

action_type : '?' '(' wordList? ')'
			| '!' '(' expressionList? ')';
			
action_rate : 'exp' '(' expr ')'
			| 'inf' '(' expr ',' expr ')'
			| 'inf'
			| '_' '(' expr ',' expr ')'
			| '_';
	
archi_topology
	: 'ARCHI_TOPOLOGY' archi_elem_instances archi_interactions archi_attachments;

archi_elem_instances
	: 'ARCHI_ELEM_INSTANCES' (instances)+;
	
instances
	: WORD ':' elementType '(' parList? ')' ';'?; 
	
istanceNameFrom
	: WORD;
	
istanceNameTo
	: WORD;
	
istanceName
	: WORD;
	
elementType
	: WORD;
	
parList
	: WORD  (',' WORD)*;
	
archi_interactions
	: 'ARCHI_INTERACTIONS' (archi_interaction_list);
	
archi_interaction_list
	: 'void'
	| archi_interaction (';' archi_interaction)*;
	
archi_interaction
	: istanceName '.' interactionName;
	
archi_attachments
	: 'ARCHI_ATTACHMENTS' (attachment_list);

attachment_list
	: attachment (';' attachment)*;

attachment
	: fromPart toPart
	;
	
fromPart : 'FROM' istanceNameFrom '.' interactionNameFrom;

toPart : 'TO' istanceNameTo '.' interactionNameTo;
	
interactionNameFrom
	: WORD;
	
interactionNameTo
	: WORD;
	
interactionName
	: WORD;
	
dataType
	: normalType | specialType;
	
normalType
	: 'integer' 
	  | 'integer' '(' NUMBER ',' NUMBER ')' 
	  | 'real' 
	  | 'boolean' 
	  | 'list' '(' normalType* ')' 
	  | 'array' '(' NUMBER ',' normalType* ')'
	  | 'record' '(' recordList? ')';
	  
recordList
	: typeName elemName (',' typeName elemName )*;
	
typeName :'integer' | 'real' | 'boolean' | 'list' | 'array' | 'record' | 'prio' | 'rate' | 'weight';

elemName : WORD;
	
specialType
	: 'prio' | 'rate' | 'weight';
	
expr 
	: arithExpr
	| relationalExpr
	| booleanExpr
	| numGenExpr
	| mathExpr
	| listExpr
	| arrayExpr
	| recordExpr
	| term
	;
	
arithExpr
	: term arithOp term
	;
	
arithOp
	: '+'| '-'| '*'| '/';
	
relationalExpr
	: term relatOp term
	;
	
relatOp
	: '=' | '!=' | '<' | '<=' | '>' | '>=';
	
booleanExpr 
	: term? boolOp term
	;
	
boolOp
	: '&&'| '||' | '!';
	
numGenExpr
	: numGenOp '(' expressionList? ')'
	;
	
numGenOp
	: 'c_uniform' 
	| 'erlang' 
	| 'gamma'
	| 'exponential' 
	| 'weibull'
	| 'beta' 
	| 'normal' 
	| 'pareto' 
	| 'b_pareto' 
	| 'd_uniform'
	| 'bernoulli' 
	| 'binomial' 
	| 'poisson' 
	| 'neg_binomial'
	| 'geometric'
	| 'pascal'
	;
	
mathExpr
	: mathOp '('expressionList? ')'
	;
	
mathOp
	: 'mod' 
	| 'abs' 
	| 'ceil'
	| 'floor' 
	| 'min' 
	| 'max'
	| 'power' 
	| 'epower' 
	| 'loge' 
	| 'log10' 
	| 'sqrt' 
	| 'sin' 
	| 'cos'
	; 
	
listExpr
	: listOp '(' expressionList? ')'
	;
	
listOp
	: 'list_cons'
	| 'first'
	| 'tail'
	| 'concat'
	| 'insert'
	| 'remove' 
	| 'length' 
	;
	
arrayExpr
	: arrayOp '(' expressionList? ')'
	;
	
arrayOp
	: 'array_cons' | 'read' | 'write';
	
recordExpr
	: recordOp '(' expressionList? ')'
	;
	
recordOp
	: 'record_cons' | 'get' | 'put';
	
term
	: WORD | NUMBER;										

WORD : LETTER DIGIT? LETTER?;
NUMBER : DIGIT ('.'? DIGIT)?;

fragment LETTER : ('a'..'z' | 'A'..'Z' | '_')+;
fragment DIGIT : ('0'..'9')+;	

DQUOTE : '\u0022';

DQVAL  : DQUOTE (options {greedy=false;} : .)* DQUOTE;

WS 	   : (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};

COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;    

LINE_COMMENT
    : '%' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
 