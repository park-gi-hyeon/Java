package question;

public class Season {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String process(int i) {
		String result ="";
		if (i>=3 && i<=5) {
			result = "봄";
		}else if(i>=6 && i<=8) {
			result = "여름";
		}else if(i>=9 && i<=11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		return result;
	}
}
