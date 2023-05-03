package ch01;

import java.util.Iterator;

public class Hell {
	public static void main(String[] args) {
		int [] arr = new int [10];
		int sum = 0;
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < arr.length; i++) {
			int ramdomNumber = (int)(Math.random()*10)+1;
			System.out.print(ramdomNumber+" ");
			arr[i] = ramdomNumber;
			sum += arr[i];
		}
		System.out.println();
		System.out.println("평균은 "+ sum/10);
	}
}
