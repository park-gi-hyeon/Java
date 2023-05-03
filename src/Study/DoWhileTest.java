package Study;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		do {
			i+=2;
			sum+=i;
			System.out.println(i);
		} while (i<98);
		System.out.println(sum);
		
	}
}
