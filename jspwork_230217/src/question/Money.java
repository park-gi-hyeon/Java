package question;

public class Money {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String process(int i) {
//		int fiveMillon = i/50000;
//		i%=50000;
//		int millon = i/10000;
//		i%=10000;
//		int thousand = i/1000;
//		i%=1000;
//		int hundred = i/100;
//		i%=100;
//		int ten = i/10;
//		i%=10;
//		int one = i;
//		return "50000원 짜리 : "+fiveMillon+"개<br>"
//		+"10000원 짜리 : "+millon+"개<br>"+"1000원 짜리 : "+thousand+"개<br>"
//		+"100원 짜리 : "+hundred+"개<br>"+"10원 짜리 : "+ten+"개<br>"+
//		"1원 짜리 : "+one+"개";
		
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		StringBuffer strBuf = new StringBuffer();
		
		for (int j = 0; j < unit.length; j++) {
			int res = num /unit[j];
			
			if(res>0) {
				strBuf.append(unit[j]+"원 짜리 : "+res+"개<br>");
				num = num%unit[j];
			}
		}
		return strBuf.toString();
	}
}
