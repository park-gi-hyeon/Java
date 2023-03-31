package Practice;

import java.util.List;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int count = sc.nextInt();
		int [] arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i]+ " ");
			if ((i+1)%10==0) {
				System.out.println();
			}
		}
	}
}
