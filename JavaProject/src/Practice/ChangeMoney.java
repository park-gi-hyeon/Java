package Practice;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner sc = new Scanner(System.in); 
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (money/unit[i]!=0) {
				System.out.println(unit[i]+"원 짜리 : "+money/unit[i]+"개");
				money = money%unit[i];
			}
		}
//		int [] unit = {50000,10000,1000,500,100,50,10,1};
//		Scanner sc = new Scanner(System.in); 
//		System.out.print("금액을 입력하시오>>");
//		int money = sc.nextInt();
//		for (int i = 0; i < unit.length; i++) {
//			//65123/50000=몫은1 and 나머지는 15123
//			int res = money/unit[i];
//			
//			if(res>0) {
//				System.out.println(unit[i]+"원 짜리 : "+res+"개");
//				money = money%unit[i];
//			}
//		}
	}
}
