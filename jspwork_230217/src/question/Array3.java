package question;

public class Array3 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String process(int integer) {
		int array[] = new int[integer];
		StringBuffer strBuf = new StringBuffer();
		
		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100+1);
			array[i]=r;
			if (i==0) {
				strBuf.append(array[i]+" ");
			}else {
				if(i%10==0) {
					strBuf.append("<br>");
				}
				strBuf.append(array[i]+" ");
			}
		}
		return strBuf.toString();
//		String result = "";
//		for (int i = 1; i <= integer; i++) {
//			int value= (int)(Math.random()*100)+1;
//			result += value+" ";
//			if(i%10==0) {
//				result +="<br>";
//			}
//		}
//		return result;
	}
}
