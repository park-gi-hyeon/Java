package Chapter02;

import java.util.Scanner;

/*
 * 시간을 입력받아서 임금 계산
 */
public class Pay {
	public static void main(String[] args) {
		final int RATE = 10000; //1시간 임금
		int pay; //1시간 임금을 시간에 곱한 값(급여)
		int hours; //시간
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하시오 : ");
		hours = sc.nextInt();
		
//		8시간 이하 : 1시간임금*시간
//		8시간 초과 : 1시간임금*시간*1.5
		if (hours > 8) {
//			8시간까지는 시간당 임금이고, 초과한 시간은 1.5를 곱해서 계산
			pay = (int) (RATE *8+ (1.5*RATE*(hours-8)));
			
		} else {
			pay = RATE * hours;
		}
		System.out.println("급여는"+pay+"입니다.");
	}
}
