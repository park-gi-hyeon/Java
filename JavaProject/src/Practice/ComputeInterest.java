package Practice;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int years =0;
		System.out.print("원금을 입력하세요: ");
		int principal = sc.nextInt();  //원금
		System.out.print("연이율을 입력하세요 ");
		double rate = sc.nextDouble(); //연이율
		System.out.println("연도수\t\t원리금");		
		double balance = principal;		//원리금
//		do {
//			years++;
//			balance = balance * (1.0 + rate / 100.0);
//			System.out.println(years+"\t\t"+balance);
//		} while (balance<=principal*2);
//		System.out.println("필요한 연도수 = "+years);
//		while (true) {
//			if (balance<=principal*2) {
//				balance = balance * (1.0 + rate / 100.0);
//				years++;
//			}else {
//				break;	
//			}
//			System.out.println(years+"\t\t"+balance);
//		}
//		System.out.println("필요한 연도수 = "+years);
		for (years=1;  balance<= principal*2; years++) {
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"\t\t"+balance);
		}
		System.out.println("필요한 연도수 = "+(years-1));
	}
}
