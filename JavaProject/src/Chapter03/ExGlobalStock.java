package Chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 금액을 입력하세요");
		int purchaseamount = sc.nextInt();		//매수금액
		System.out.print("매도 금액을 입력하세요");
		int sellingamount = sc.nextInt();//매도 금액
		double transfer = 0;
		if (sellingamount>purchaseamount) {
			transfer =(sellingamount-purchaseamount)/100*22;
		} else if(sellingamount<=purchaseamount){
			
		}else {
			System.out.println("값을 잘못 입력하였습니다.");
		}
		System.out.println("양도세 = "+transfer);
	}
}
