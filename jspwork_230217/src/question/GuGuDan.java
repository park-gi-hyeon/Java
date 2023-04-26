package question;

public class GuGuDan {
	public String process(int n) {
		String result="";
		for (int i = 1; i <= 9; i++) {
			result += n+" * "+i+" = "+(n*i)+"<br>"; 
		}
		System.out.println(result);
		return result;
	}
}
