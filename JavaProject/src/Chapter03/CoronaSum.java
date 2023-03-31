package Chapter03;

import java.util.Scanner;

public class CoronaSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[][] arr = new int[12][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1+((i+1)*10)+j;
				sum+=arr[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는"+sum);
	}
}
