/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition stringConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

public class StringConstToken extends Token {
	private String stringValue;

	public StringConstToken(int type, String text, int line, int column, String stringValue) {
		super(type, text, line, column);
		this.stringValue = stringValue;
	}

	public String getValue() {
		return stringValue;
	}


}
