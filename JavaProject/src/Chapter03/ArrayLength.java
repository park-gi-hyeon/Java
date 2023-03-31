package Chapter03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		int[] arr = new int[5];
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		double score = sum/arr.length;
		System.out.println("평균은"+score);
	} 
}
