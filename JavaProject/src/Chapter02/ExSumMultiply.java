package Chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3자리수 정수 입력(100~999)>>>");
		int num = sc.nextInt();
		int hundred = num/100;
		int ten = num%100/10;
		int one = (num-hundred*100)%10;
		
		System.out.println("100의 자리와 10의 자리의 합은"+(hundred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은"+(ten*one));
	}
}
