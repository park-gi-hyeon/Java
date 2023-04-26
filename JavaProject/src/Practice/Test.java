package Practice;

public class Test {
	public static void main(String[] args) {
		
		String a = "1,2,3,4,5";
		String[] b = a.split(",");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"");
		}
	}
}
