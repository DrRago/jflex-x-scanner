/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition floatConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

public class FloatConstToken extends Token {
	private double floatValue;
	
	public FloatConstToken(int type, String text, int line, int column, double floatValue) {
		super(type, text, line, column);
		this.floatValue = floatValue;
	}

	public double getValue() {
		return floatValue;
	}


}
