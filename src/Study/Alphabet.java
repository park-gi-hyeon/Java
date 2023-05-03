package Study;

import java.util.Iterator;

public class Alphabet {
	private char alphabet;

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
	public String process(String str) {
		StringBuffer buffer = new StringBuffer();
		char c = 'A';
		char c2 = str.charAt(0);
		for (char i = c2; i >= c; i--) {
			for(char j=c; j<i; j++) {
				buffer.append(j);
			}
			buffer.append("<br>");
		}
		return buffer.toString();
	}
}
