/* The following code was generated by JFlex 1.6.1 */

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


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Leonhard.Gahr/Programming/DHBW/Compilerbau/ÜB-Praxis-JFlex Scanner für X-Leer/src/de/dhbw/compiler/jflexxscanner/JFlexXScanner.flex</tt>
 */
public final class JFlexXScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INT = 2;
  public static final int FRACTION = 4;
  public static final int EXPVZ = 6;
  public static final int EXP = 8;
  public static final int STRING = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\3\42\1\0\2\42\22\0\1\43\1\0\1\41\5\0\1\24"+
    "\1\25\1\20\1\16\1\0\1\17\1\35\1\21\1\40\11\37\1\22"+
    "\1\32\1\26\1\23\1\27\2\0\4\36\1\45\25\36\1\0\1\44"+
    "\4\0\1\3\1\33\1\36\1\4\1\2\1\11\1\15\1\30\1\6"+
    "\2\36\1\12\1\34\1\7\1\13\1\5\1\36\1\1\1\14\1\10"+
    "\2\36\1\31\3\36\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff95\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\10\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\2\1\15\1\2"+
    "\1\16\1\17\1\20\1\21\1\22\2\23\1\24\1\25"+
    "\2\26\1\27\2\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\35\5\2\1\40\4\2\1\41\2\2"+
    "\1\42\1\0\1\43\1\0\1\44\1\45\1\46\1\2"+
    "\1\47\3\2\1\50\2\2\1\51\3\2\1\52\1\53"+
    "\2\2\1\54\4\2\1\55\1\2\1\56\1\2\1\57"+
    "\1\60\1\2\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\344"+
    "\0\344\0\344\0\344\0\u023a\0\344\0\344\0\344\0\344"+
    "\0\344\0\u0260\0\344\0\u0286\0\344\0\344\0\u02ac\0\344"+
    "\0\u02d2\0\344\0\u02f8\0\344\0\344\0\344\0\u031e\0\344"+
    "\0\344\0\u0344\0\344\0\344\0\344\0\344\0\344\0\344"+
    "\0\344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0428\0\u0156"+
    "\0\u044e\0\u0474\0\u049a\0\u04c0\0\344\0\u04e6\0\u050c\0\344"+
    "\0\u0532\0\344\0\u0558\0\344\0\344\0\344\0\u057e\0\u0156"+
    "\0\u05a4\0\u05ca\0\u05f0\0\u0156\0\u0616\0\u063c\0\u0156\0\u0662"+
    "\0\u0688\0\u06ae\0\u0156\0\u0156\0\u06d4\0\u06fa\0\u0156\0\u0720"+
    "\0\u0746\0\u076c\0\u0792\0\u0156\0\u07b8\0\u0156\0\u07de\0\u0156"+
    "\0\u0156\0\u0804\0\u0156\0\u0156";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\1\11\2\12\1\13\1\14\1\12\1\15"+
    "\1\16\2\12\1\17\1\12\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\12\1\32"+
    "\1\33\1\34\1\12\1\35\1\12\1\36\1\37\1\40"+
    "\2\41\1\7\1\12\2\42\1\43\32\42\1\44\1\42"+
    "\2\45\4\42\1\43\2\46\1\47\34\46\2\50\4\46"+
    "\1\47\17\51\1\52\17\51\1\53\1\54\5\51\37\55"+
    "\2\56\5\55\1\57\15\60\4\57\1\60\5\57\2\60"+
    "\1\57\4\60\2\57\1\61\1\57\1\60\1\62\1\60"+
    "\47\0\1\12\1\63\13\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\6\12\1\64\2\12"+
    "\1\65\3\12\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\1\0\15\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\1\66\14\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\6\12\1\67\1\12\1\70\4\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\15\12\12\0"+
    "\1\71\1\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\11\12\1\72\1\73\2\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\7\12\1\74"+
    "\5\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\23\0\1\75\23\0\15\12\12\0\1\76\1\12"+
    "\1\0\2\12\1\0\3\12\4\0\1\12\1\0\1\12"+
    "\1\77\13\12\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\35\0\1\100\52\0\2\41\21\0\1\101"+
    "\17\0\2\102\24\0\1\103\17\0\2\104\44\0\1\105"+
    "\1\54\46\0\1\106\5\0\2\12\1\107\12\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\3\12\1\110\11\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\13\12\1\111\1\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\5\12\1\112\4\12\1\113\2\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\7\12\1\114"+
    "\5\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\1\12\1\115\13\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\12\12\1\116"+
    "\2\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\1\117\14\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\1\120\14\12\12\0"+
    "\2\12\1\0\2\12\1\0\3\12\4\0\1\12\1\0"+
    "\5\12\1\121\7\12\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\14\12\1\122\12\0\2\12"+
    "\1\0\2\12\1\0\3\12\4\0\1\12\37\0\2\102"+
    "\44\0\2\104\6\0\3\12\1\123\11\12\12\0\2\12"+
    "\1\0\2\12\1\0\3\12\4\0\1\12\1\0\1\12"+
    "\1\124\13\12\12\0\2\12\1\0\2\12\1\0\3\12"+
    "\4\0\1\12\1\0\6\12\1\125\6\12\12\0\2\12"+
    "\1\0\2\12\1\0\3\12\4\0\1\12\1\0\14\12"+
    "\1\126\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\6\12\1\127\6\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\2\12\1\130"+
    "\12\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\5\12\1\131\7\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\11\12\1\132"+
    "\3\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\5\12\1\133\7\12\12\0\2\12\1\0"+
    "\2\12\1\0\3\12\4\0\1\12\1\0\7\12\1\134"+
    "\5\12\12\0\2\12\1\0\2\12\1\0\3\12\4\0"+
    "\1\12\1\0\1\135\14\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\7\12\1\136\5\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\6\12\1\137\6\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\1\12\1\140\13\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\6\12\1\141\6\12\12\0\2\12\1\0\2\12"+
    "\1\0\3\12\4\0\1\12\1\0\2\12\1\142\12\12"+
    "\12\0\2\12\1\0\2\12\1\0\3\12\4\0\1\12"+
    "\1\0\14\12\1\143\12\0\2\12\1\0\2\12\1\0"+
    "\3\12\4\0\1\12\1\0\15\12\12\0\2\12\1\0"+
    "\1\12\1\144\1\0\3\12\4\0\1\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2090];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\10\1\4\11\1\1\5\11\1\1\1\11"+
    "\1\1\2\11\1\1\1\11\1\1\1\11\1\1\3\11"+
    "\1\1\2\11\1\1\7\11\13\1\1\11\2\1\1\11"+
    "\1\0\1\11\1\0\3\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	private int intValue = 0;
	private String textValue = "";
	private int fracValue = 0;
	private int fracLength = 0;
	private int expValue = 0;
	private int expSign = 1;
	private int startLine = 0;
	private int startColumn = 0;
	private String stringValue = "";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JFlexXScanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case INT: {
              yybegin(YYINITIAL);
					yypushback(1);
					return new IntConstToken(Token.INTCONST, textValue, startLine, startColumn, intValue);
            }
            case 101: break;
            case FRACTION: {
              yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
            }
            case 102: break;
            case EXPVZ: {
              yybegin(YYINITIAL);
                    yypushback(1);
                    return new Token(Token.INVALID, textValue, startLine, startColumn);
            }
            case 103: break;
            case EXP: {
              yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, (intValue + fracValue / Math.pow(10, fracLength)) * Math.pow(10, expValue * expSign));
            }
            case 104: break;
            case STRING: {
              yybegin(YYINITIAL); return new Token(Token.INVALID, textValue, startLine, startColumn);
            }
            case 105: break;
            default:
              {
                return new Token(Token.EOF, yytext(), yyline + 1, yycolumn + 1);
              }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Token(Token.INVALID,  yytext(), yyline + 1, yycolumn + 1);
            }
          case 51: break;
          case 2: 
            { return new Token(Token.ID, yytext(), yyline + 1, yycolumn + 1);
            }
          case 52: break;
          case 3: 
            { return new Token(Token.PLUS, yytext(), yyline + 1, yycolumn + 1);
            }
          case 53: break;
          case 4: 
            { return new Token(Token.MINUS, yytext(), yyline + 1, yycolumn + 1);
            }
          case 54: break;
          case 5: 
            { return new Token(Token.MULT, yytext(), yyline + 1, yycolumn + 1);
            }
          case 55: break;
          case 6: 
            { return new Token(Token.DIV, yytext(), yyline + 1, yycolumn + 1);
            }
          case 56: break;
          case 7: 
            { return new Token(Token.COLON, yytext(), yyline + 1, yycolumn + 1);
            }
          case 57: break;
          case 8: 
            { return new Token(Token.EQUALS, yytext(), yyline + 1, yycolumn + 1);
            }
          case 58: break;
          case 9: 
            { return new Token(Token.LBR, yytext(), yyline + 1, yycolumn + 1);
            }
          case 59: break;
          case 10: 
            { return new Token(Token.RBR, yytext(), yyline + 1, yycolumn + 1);
            }
          case 60: break;
          case 11: 
            { return new Token(Token.LESS, yytext(), yyline + 1, yycolumn + 1);
            }
          case 61: break;
          case 12: 
            { return new Token(Token.MORE, yytext(), yyline + 1, yycolumn + 1);
            }
          case 62: break;
          case 13: 
            { return new Token(Token.SEMICOLON, yytext(), yyline + 1, yycolumn + 1);
            }
          case 63: break;
          case 14: 
            { return new Token(Token.DOT, yytext(), yyline + 1, yycolumn + 1);
            }
          case 64: break;
          case 15: 
            { yybegin(INT);
                textValue = yytext();
                startLine = yyline + 1;
                startColumn = yycolumn + 1;
                intValue = yytext().charAt(0) - '0';
                fracValue = 0;
                fracLength = 0;
                expValue = 0;
            }
          case 65: break;
          case 16: 
            { return new IntConstToken(Token.INTCONST, yytext(), yyline + 1, yycolumn + 1, 0);
            }
          case 66: break;
          case 17: 
            { yybegin(STRING);
                textValue = "\"";
                stringValue = "";
                startLine = yyline+1;
                startColumn = yycolumn + 1;
            }
          case 67: break;
          case 18: 
            { /* ignore whitespaces */
            }
          case 68: break;
          case 19: 
            { yybegin(YYINITIAL);
					yypushback(1);
					return new IntConstToken(Token.INTCONST, textValue, startLine, startColumn, intValue);
            }
          case 69: break;
          case 20: 
            { yybegin(FRACTION);
					textValue += yytext();
            }
          case 70: break;
          case 21: 
            { intValue = 10 * intValue + yytext().charAt(0) - '0';
                    textValue+=yytext();
            }
          case 71: break;
          case 22: 
            { yybegin(YYINITIAL);
					yypushback(1);
					return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
            }
          case 72: break;
          case 23: 
            { fracValue= 10 * fracValue + yytext().charAt(0) - '0';
					fracLength++;
					textValue += yytext();
            }
          case 73: break;
          case 24: 
            { yybegin(YYINITIAL);
                    yypushback(1);
                    return new Token(Token.INVALID, textValue, startLine, startColumn);
            }
          case 74: break;
          case 25: 
            { yybegin(EXP);
	                expValue = yytext().charAt(0) - '0';
	                expSign = 1;
	                textValue += yytext();
            }
          case 75: break;
          case 26: 
            { yybegin(YYINITIAL);
					return new FloatConstToken(Token.FLOATCONST, textValue+yytext(), startLine, startColumn, intValue + fracValue / Math.pow(10, fracLength));
            }
          case 76: break;
          case 27: 
            { yybegin(YYINITIAL);
                    yypushback(1);
                    return new FloatConstToken(Token.FLOATCONST, textValue, startLine, startColumn, (intValue + fracValue / Math.pow(10, fracLength)) * Math.pow(10, expValue * expSign));
            }
          case 77: break;
          case 28: 
            { expValue = 10 * expValue + yytext().charAt(0) - '0';
                    textValue += yytext();
            }
          case 78: break;
          case 29: 
            { yybegin(YYINITIAL); return new Token(Token.INVALID, textValue + yytext(), startLine, startColumn);
            }
          case 79: break;
          case 30: 
            { textValue += yytext(); stringValue += yytext();
            }
          case 80: break;
          case 31: 
            { yybegin(YYINITIAL); return new StringConstToken(Token.STRINGCONST, textValue + "\"", startLine, startColumn, stringValue);
            }
          case 81: break;
          case 32: 
            { return new Token(Token.IF, yytext(), yyline + 1, yycolumn + 1);
            }
          case 82: break;
          case 33: 
            { return new Token(Token.ASSIGN, yytext(), yyline + 1, yycolumn + 1);
            }
          case 83: break;
          case 34: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(INT);
                textValue = yytext();
                startLine = yyline + 1;
                startColumn = yycolumn + 1;
                intValue = yytext().charAt(0) - '0';
                fracValue = 0;
                fracLength = 0;
                expValue = 0;
            }
          case 84: break;
          case 35: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(EXPVZ);
                    textValue += yytext();
            }
          case 85: break;
          case 36: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(EXPVZ);
					textValue += yytext();
            }
          case 86: break;
          case 37: 
            { yybegin(EXP);
                    expValue = yytext().charAt(1) - '0';
                    expSign = -1;
                    textValue += yytext();
            }
          case 87: break;
          case 38: 
            { textValue += "\\\""; stringValue += "\"";
            }
          case 88: break;
          case 39: 
            { return new Token(Token.END, yytext(), yyline + 1, yycolumn + 1);
            }
          case 89: break;
          case 40: 
            { return new Token(Token.INT, yytext(), yyline + 1, yycolumn + 1);
            }
          case 90: break;
          case 41: 
            { return new Token(Token.FOR, yytext(), yyline + 1, yycolumn + 1);
            }
          case 91: break;
          case 42: 
            { return new Token(Token.READ, yytext(), yyline + 1, yycolumn + 1);
            }
          case 92: break;
          case 43: 
            { return new Token(Token.ELSE, yytext(), yyline + 1, yycolumn + 1);
            }
          case 93: break;
          case 44: 
            { return new Token(Token.THEN, yytext(), yyline + 1, yycolumn + 1);
            }
          case 94: break;
          case 45: 
            { return new Token(Token.PRINT, yytext(), yyline + 1, yycolumn + 1);
            }
          case 95: break;
          case 46: 
            { return new Token(Token.FLOAT, yytext(), yyline + 1, yycolumn + 1);
            }
          case 96: break;
          case 47: 
            { return new Token(Token.WHILE, yytext(), yyline + 1, yycolumn + 1);
            }
          case 97: break;
          case 48: 
            { return new Token(Token.BEGIN, yytext(), yyline + 1, yycolumn + 1);
            }
          case 98: break;
          case 49: 
            { return new Token(Token.STRING, yytext(), yyline + 1, yycolumn + 1);
            }
          case 99: break;
          case 50: 
            { return new Token(Token.PROGRAM, yytext(), yyline + 1, yycolumn + 1);
            }
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
