package Practice;

import java.util.Scanner;

public class RandomArray2 {
	public static boolean exists(int a[], int from, int r) {
//		a.length: 100(100번 반복)->총 10000번 반복
//		for (int i = 0; i < a.length; i++) {
//		i=0 반복안함, i=1 1번 반복, i=2 2번반복,....
		for (int i = 0; i < from; i++) {
			if (a[i]==r) {
				return true;//중복발생
			}
		}	
		return false;//중복아님
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int count = sc.nextInt();
		int [] arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			if (exists(arr, i, arr[i])) {
				i--;
				continue;
			}
			System.out.print(arr[i]+ " ");
			if ((i+1)%10==0) {
				System.out.println();
			}
		}
	}
}

