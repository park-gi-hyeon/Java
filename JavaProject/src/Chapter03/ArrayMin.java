package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("가장 작은 수는"+arr[0]);
	}
}
