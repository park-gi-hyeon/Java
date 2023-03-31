package Chapter03;

import java.util.Scanner;

/*
 * 정수 3개를 입력받음
 * 정수가 아닌 경우 패스,
 * 3개의 합출력
 * 예외처리 사용
 */
public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0, n=0;
//		InputMismatchException
//		정수가 아닌 것이 오면 재입력 받게 예외처리
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i+">>");
			try {
				n = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("합은"+sum);
	}
}
