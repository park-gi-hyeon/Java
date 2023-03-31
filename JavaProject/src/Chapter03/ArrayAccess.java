package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int num[] = new int[5];
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			int integer = sc.nextInt();
			num[i] = integer;
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}
}
