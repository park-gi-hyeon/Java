package Chapter02;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		if (3<=month&&month<=5) {
			System.out.println("봄");
		}else if (6<=month&&month<=8) {
			System.out.println("여름");
		}else if (9<=month&&month<=11) {
			System.out.println("가을");		
		}else if (month<=2&&month>0||month==12) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
		}			
	}
}
