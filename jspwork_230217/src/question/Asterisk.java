package question;

public class Asterisk {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String process(int i) {
		String result ="";
		for (int j = i; j >0; j--) {
			for (int t = 0; t < j; t++) {
				result+="*";
			}
			result += "<br>";
		}
		return result;
	}
}
