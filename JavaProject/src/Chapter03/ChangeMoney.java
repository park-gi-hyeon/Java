package Chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		if(money/50000 !=0) {
			System.out.println("오만원권"+money/50000+"매");
			money%=50000;
		}
		if(money/10000 !=0) {
			System.out.println("만원권"+money/10000+"매");
			money%=10000;
		}
		if(money/1000 !=0) {
			System.out.println("천원권"+money/1000+"매");
			money%=1000;
		}
		if(money/100 !=0) {
			System.out.println("백원"+money/100+"개");
			money%=100;
		}
		if(money/50 !=0) {
			System.out.println("오십원"+money/50+"개");
			money%=50;
		}
		if(money/10 !=0) {
			System.out.println("십원"+money/10+"개");
			money%=10;
		}
		if(money/10 !=0) {
			System.out.println("일원"+money/1+"개");
			money%=10;
		}
		
//		if(money==0) {
//			System.out.println("변환할 금액이 없습니다.");
//		}else {
//		int num50000 = money/50000;
//			money%=50000;
//		int num10000 = money/10000;
//			money%=10000;
//		int num1000 = money/1000;
//			money%=1000;
//		int num100 = money/100;
//			money%=100;
//		int num50 = money/50;
//			money%=50;
//		int num10 = money/10;
//			money%=10;
//		int num1 = money/1;
//			money%=1;
//		
//		System.out.println("오만원권 "+ num50000+"매");
//		System.out.println("만원권 "+ num10000+"매");
//		System.out.println("천원권 "+ num1000+"매");
//		System.out.println("백원 "+ num100+"개");
//		System.out.println("오십원 "+ num50+"개");
//		System.out.println("십원 "+ num10+"개");
//		System.out.println("일원 "+ num1+"개");
//		}
	}
}
