package question;

public class ThreeSixNine {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String processs(int i) {
		String result ="";
		int count = 0;
		int ten = i/10;
		int one = i%10;
			if (one ==3 ||one==6||one ==9) {
				count++;
				if(ten ==3 ||one==6||one ==9) {
					count++;
				}
			}
			 if (count == 1) {
		            result = "박수짝";
		        } else if (count == 2) {
		            result = "박수짝짝";
		        } else {
		            result = "박수 없음";
		        }
		return result;
	}
}
