package question;

public class Capital {
	private char alphabet;

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
//	public String process(char i) {
//		int uni = (int)i;
//		String result = "";
//		for (int j = uni-65; j >= 0; j--) {
//			for (int t = 65; t <=j+65 ; t++) {
//				result += (char)t;
//			}
//			result+="<br>";
//		}
//		return result;
	
	public String process(String str) {
		StringBuffer strBuf = new StringBuffer();
		char c= 'A';
		char c2= str.charAt(0);
		for (char i = c2; i >=c; i--) {
			for (int j = c; j <=i; j++) {
				strBuf.append(j);
			}
			strBuf.append("<br>");
		}
		return strBuf.toString();
		
	}
}
