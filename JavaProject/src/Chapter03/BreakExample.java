package Chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		while (true) {
			String input = sc.next();
			if (input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		}
	}
}
