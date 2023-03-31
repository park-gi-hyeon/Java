package Practice;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 10개를 입력하세요");
		int[] arr = new int[10];
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
		arr[i] =sc.nextInt();
			if(i==0) {
				min=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];				
			}
			if(arr[i]>max) {
				max=arr[i];				
			}
		}
		System.out.println("가장 작은 수는 "+min+"이고, 가장 큰 수는 "+max+"최소값+최대값은 "+ (max+min)+"입니다");
//		for (int i = 0; i < 10; i++) {
//			int number = sc.nextInt();
//			arr[i] = number;  
//			for (int j = 0; j < arr.length; j++) {
//				if(max>arr[j]) {
//					max=arr[j];
//				}
//				if(min<arr[j]) {
//					min=arr[j];
//				}
//				
//			}
//		}
//		System.out.println("가장 작은 수는 "+min+"이고, 가장 큰 수는 "+max+"최소값+최대값은 "+ (max+min)+"입니다");
		
	}
}
