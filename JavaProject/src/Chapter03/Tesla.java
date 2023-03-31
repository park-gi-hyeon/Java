package Chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		int stock = sc.nextInt();
		int tesla = 520*stock;
		int hundred = tesla/100;
		int ten = (tesla%100)/10;
		if(hundred>0) {
			System.out.println("100달러짜리"+hundred+"매");
			if (ten>0) {
				System.out.println("10달러짜리"+ten+"매");
			} 
		}	
	}
}
