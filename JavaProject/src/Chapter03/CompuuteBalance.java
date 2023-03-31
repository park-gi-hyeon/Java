package Chapter03;

import java.util.Scanner;

public class CompuuteBalance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요");
		int purchaseAmount = sc.nextInt();
		int balance = 0;
		if (purchaseAmount>=300000) {
			balance  = purchaseAmount-30000;
		}else if(purchaseAmount>=100000&&purchaseAmount<300000) {
			balance = purchaseAmount-5000;
		}else if(purchaseAmount<100000) {
			balance = purchaseAmount;
		}else {
			System.out.println("값을 잘못 입력하였습니다.");
		}
		System.out.println("구매금액 = "+purchaseAmount);
		System.out.println("청구금액 = "+balance);
	}
}
