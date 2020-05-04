/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition intConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

public class IntConstToken extends Token {
	private int intValue;

	public IntConstToken(int type, String text, int line, int column, int intValue) {
		super(type, text, line, column);
		this.intValue = intValue;
	}

	public int getValue() {
		return intValue;
	}


}
