package Study;

public class Arithmetic {
	private int num1;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String process(int i) {
		int count = 0;
		int ten = i/10;
		int one = i%10;
		
		if (ten==3||ten==6||ten==9) {
			count++;
			if(one==3||one==6||one==9) {
				count++;
			}
		} else {
			return "박수없음";
		}
		if (count==1) {
			return "박수 짝";
		} else {
			return "박수 짝짝";
		}
	}
}
