package question;

public class TwoArray {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String process(int integer) {
//		String result ="";
//		int [][]arr = new int[integer][integer];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=(int)(Math.random()*10)+1;
//				result += arr[i][j]+" ";
//			}
//			result +="<br>";
//		}
//		return result;
		StringBuffer strBuf = new StringBuffer();
		int [][]arr = new int[integer][integer];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=(int)(Math.random()*10)+1;
				strBuf.append(arr[i][j]+"&nbsp;&nbsp;&nbsp;");
			}
			strBuf.append("<br>");
		}
		return strBuf.toString();
	}
}
