package Chapter02;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a<b) {
			if(b<c) {
				System.out.println("중간 값은 "+b);
			}
		}
		if (c<b) {
			if(b<a) {
				System.out.println("중간 값은 "+b);
			}
		}
		if (b<a) {
			if(a<c) {
				System.out.println("중간 값은 "+a);
			}
		}
		if (c<a) {
			if(a<b) {
				System.out.println("중간 값은 "+a);
			}
		}
		if (c<a) {
			if(c>b) {
				System.out.println("중간 값은 "+c);
			}
		}
		if (c<b) {
			if(c>a) {
				System.out.println("중간 값은 "+c);
			}
		}
	}
}
