package Chapter03;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[10];
		System.out.print("10개의 정수를 입력하세요>>");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("합계는 "+sum);
	}
}
