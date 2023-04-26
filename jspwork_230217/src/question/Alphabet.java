package question;

public class Alphabet {
	private char alphabet;

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
	
	public String process(char i) {
		int uni = (int)i;
		String result = "";
		for(int j=97; j<=uni; j++){
			result +=(char)j;
		}
		return result;
	}
}
	
//	public String process(String str){
//		StringBuffer strBuf= new StringBuffer();
//		char c = 'a';
//		char c2 = str.charAt(0);
//		do {
//			strBuf.append(c);
//			c=(char)(c+1);
//		} while (c <=c2);
//		return strBuf.toString();
