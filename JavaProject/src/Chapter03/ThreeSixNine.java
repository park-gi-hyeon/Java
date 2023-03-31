package Chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10 ~99 사이의 정수를 입력하시오 >>");
		int num = sc.nextInt();
		int count = 0;
		if (num/10 ==3|| num/10==6 || num/10==9) {
			count++;
		}if (num%10 ==3|| num%10 ==6|| num%10 ==9) {
			count++;
		}if (count==0) {
			System.out.println(num);
		} else{
			System.out.print("박수");
			if (count==1) {
				System.out.print("짝");
			} else {
				System.out.print("짝짝");
			}
		}sc.close();
	}
}
