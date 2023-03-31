package Chapter02;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99>>");
		int num = sc.nextInt();
			switch (num%11) {
			case 0:
				System.out.println("10의 자리와 1의 자리가 같습니다.");
				break;
			default:
				System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
				break;
			}	
		
	}
}
