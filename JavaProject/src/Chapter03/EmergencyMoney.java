package Chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		int family = sc.nextInt();
		int dollar = 0;
		int won = 0;
		if(family==1) {
			won = 400000;
		}else if(family==2){
			won = 600000;
		}else if(family==3) {
			won = 800000;
		}else {
			won = 1000000;
		}
		dollar = won/1200;
		int hundred = dollar/100;
		int ten = (dollar%100)/10;
		if(hundred>0) {
			System.out.println("100달러짜리"+hundred+"매");
			if (ten>0) {
				System.out.println("10달러짜리"+ten+"매");
			} 
		}	
	}
}
