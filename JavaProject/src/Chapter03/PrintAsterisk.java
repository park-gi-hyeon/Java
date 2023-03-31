package Chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int num = sc.nextInt();
//		for(int i =num; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}	
		for(int i =num; i>0; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
