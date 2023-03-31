package Chapter03;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int i= 0;
		do {
//			99까지 반복 -> 99보다 크면 break
			if(i>99) {
				break;
			}
			sum+=i;
			i+=2;
		} while (true);
		System.out.println(sum);
	}
}
