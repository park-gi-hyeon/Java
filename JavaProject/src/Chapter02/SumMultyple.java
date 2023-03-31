package Chapter02;

import java.util.Scanner;

public class SumMultyple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수두개입력>>");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a+b;
		int d = a*b;
		System.out.println("두 수의 합은:"+c);
		System.out.println("두 수의 곱은:"+d);
	}
}
