package Chapter03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 5개 입력하세요");
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if(num>0) {
				sum+=num;
		}
		
		}System.out.println("양수의 합은 "+sum);
	}
}
