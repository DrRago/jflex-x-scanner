/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Scanner-Definition
 * 
 * **********************************************
 */


package de.dhbw.compiler.jflexxscanner;

%%

%class JFlexXScanner
%type Token
%function nextToken


%unicode
%line
%column

%public
%final

%xstate INT, FRACTION, EXPVZ, EXP, STRING

%{
	private int intValue = 0;
	private String textValue = "";
	private int fracValue = 0;
	private int fracLength = 0;
	private int expValue = 0;
	private int expSign = 1;
	private int startLine = 0;
	private int startColumn = 0;
	private String stringValue = "";
%}

%%

read       { return new Token(Token.READ, yytext(), yyline + 1, yycolumn + 1); }
print      { return new Token(Token.PRINT, yytext(), yyline + 1, yycolumn + 1); }
int        { return new Token(Token.INT, yytext(), yyline + 1, yycolumn + 1); }
float      { return new Token(Token.FLOAT, yytext(), yyline + 1, yycolumn + 1); }
string     { return new Token(Token.STRING, yytext(), yyline + 1, yycolumn + 1); }
\+         { return new Token(Token.PLUS, yytext(), yyline + 1, yycolumn + 1); }
\-         { return new Token(Token.MINUS, yytext(), yyline + 1, yycolumn + 1); }
\*         { return new Token(Token.MULT, yytext(), yyline + 1, yycolumn + 1); }
\/         { return new Token(Token.DIV, yytext(), yyline + 1, yycolumn + 1); }
:=         { return new Token(Token.ASSIGN, yytext(), yyline + 1, yycolumn + 1); }
\(         { return new Token(Token.LBR, yytext(), yyline + 1, yycolumn + 1); }
\)         { return new Token(Token.RBR, yytext(), yyline + 1, yycolumn + 1); }
\<         { return new Token(Token.LESS, yytext(), yyline + 1, yycolumn + 1); }
>          { return new Token(Token.MORE, yytext(), yyline + 1, yycolumn + 1); }
=          { return new Token(Token.EQUALS, yytext(), yyline + 1, yycolumn + 1); }
if         { return new Token(Token.IF, yytext(), yyline + 1, yycolumn + 1); }
then       { return new Token(Token.THEN, yytext(), yyline + 1, yycolumn + 1); }
else       { return new Token(Token.ELSE, yytext(), yyline + 1, yycolumn + 1); }
while      { return new Token(Token.WHILE, yytext(), yyline + 1, yycolumn + 1); }
for        { return new Token(Token.FOR, yytext(), yyline + 1, yycolumn + 1); }
;          { return new Token(Token.SEMICOLON, yytext(), yyline + 1, yycolumn + 1); }
begin      { return new Token(Token.BEGIN, yytext(), yyline + 1, yycolumn + 1); }
end        { return new Token(Token.END, yytext(), yyline + 1, yycolumn + 1); }
program    { return new Token(Token.PROGRAM, yytext(), yyline + 1, yycolumn + 1); }
\.         { return new Token(Token.DOT, yytext(), yyline + 1, yycolumn + 1); }
:          { return new Token(Token.COLON, yytext(), yyline + 1, yycolumn + 1); }

[a-zA-Z][a-zA-Z0-9]*  { return new Token(Token.ID, yytext(), yyline + 1, yycolumn + 1); }

0          { return new IntConstToken(Token.INTCONST, yytext(), yyline + 1, yycolumn + 1, 0); }
0/\.       {
                yybegin(INT);
                textValue = yytext();
                startLine = yyline + 1;
                startColumn = yycolumn + 1;
                intValue = yytext().charAt(0) - '0';
                fracValue = 0;
                fracLength = 0;
                expValue = 0;
            }
[1-9]       {
                yybegin(INT);
                textValue = yytext();
                startLine = yyline + 1;
                startColumn = yycolumn + 1;
                intValue = yytext().charAt(0) - '0';
                fracValue = 0;
                fracLength = 0;
                expValue = 0;
            }

\"          {
                yybegin(STRING);
                textValue = "\"";
                stringValue = "";
                startLine = yyline+1;
                startColumn = yycolumn + 1;
            }

[\ \t\b\f\r\n]+			{ /* ignore whitespaces */ }

<<EOF>>					{ return new Token(Token.EOF, yytext(), yyline + 1, yycolumn + 1); }
[^]						{ return new Token(Token.INVALID,  yytext(), yyline + 1, yycolumn + 1); }

/* begin state definitions */
<STRING> {
	[a-zA-Z \.:]		{ textValue += yytext(); stringValue += yytext(); }
	\\\"				{ textValue += "\\\""; stringValue += "\""; }
	\"					{ yybegin(YYINITIAL); return new StringConstToken(Token.STRINGCONST, textValue + "\"", startLine, startColumn, stringValue); }
	[^]					{ yybegin(YYINITIAL); return new Token(Token.INVALID, textValue + yytext(), startLine, startColumn); }
	<<EOF>>				{ yybegin(YYINITIAL); return new Token(Token.INVALID, textValue, startLine, startColumn); }
}

<INT> {
	[0-9]        {
                    intValue = 10 * intValue + yytext().charAt(0) - '0';
                    textValue+=yytext();
                 }

	\.           {
                    yybegin(FRACTION);
					textValue += yytext();
                 }

	[eE]/-?[0-9] {
                    yybegin(EXPVZ);
                    textValue += yytext();
                 }

	[^]          {
                    yybegin(YYINITIAL);
					yypushback(1);
					return new IntConstToken(Token.INTCONST, textValue, startLine, startColumn, intValue);
                 }

	<<EOF>>      {
                    yybegin(YYINITIAL);
					yypushback(1);
					return new IntConstToken(Token.INTCONST, textValue, startLine, startColumn, intValue);
                 }
}

<FRACTION> {
	[0-9]        {
                    fracValue= 10 * fracValue + yytext().charAt(0) - '0';
					fracLength++;
					textValue += yytext();
                 }

	[eE]/-?[0-9] {
                    yybegin(EXPVZ);
					textValue += yytext();
                 }

	[^]          {
                    yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
                 }

	<<EOF>>      {
                    yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
                 }
}

<EXPVZ> {
	-0|0         {
                    yybegin(YYINITIAL);
					return new FloatConstToken(Token.FLOATCONST, textValue+yytext(), startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
                 }

	-[1-9]       {
                    yybegin(EXP);
                    expValue = yytext().charAt(1) - '0';
                    expSign = -1;
                    textValue += yytext();
                 }

	[1-9]        {
	                yybegin(EXP);
	                expValue = yytext().charAt(0) - '0';
	                expSign = 1;
	                textValue += yytext();
                 }

	[^]          {
                    yybegin(YYINITIAL);
                    yypushback(1);
                    return new Token(Token.INVALID, textValue, startLine, startColumn);
                 }

	<<EOF>>      {
                    yybegin(YYINITIAL);
                    yypushback(1);
                    return new Token(Token.INVALID, textValue, startLine, startColumn);
                 }
}

<EXP> {
	[0-9]        {
                    expValue = 10 * expValue + yytext().charAt(0) - '0';
                    textValue += yytext();
                 }

	[^]          {
                    yybegin(YYINITIAL);
                    yypushback(1);
                    return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, (intValue + fracValue / Math.pow(10, fracLength)) * Math.pow(10, expValue * expSign));
                 }

	<<EOF>>      {
                    yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, (intValue + fracValue / Math.pow(10, fracLength)) * Math.pow(10, expValue * expSign));
                 }
}
