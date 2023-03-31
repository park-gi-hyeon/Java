package Chapter03;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i==3||i==6||i==9) {
				System.out.print("짝");
				continue;
			}System.out.print(i);
		}
	}
}
