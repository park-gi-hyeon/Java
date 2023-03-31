package Chapter02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		int min = 0;
//		최대값 구하기
		if (a>b && a>c) {
			max=a;
		}else if (b>c && b>a) {
			max=b;
		}else {
			max=c;
		}
		if (a<b && a<c) {
			min=a;
		}else if (b<c && b<a) {
			min=b;
		}else {
			min=c;
		}
		System.out.println("최대값은"+max);
		System.out.println("최소값은"+min);
		sc.close();
	}
}
