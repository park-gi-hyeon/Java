package Chapter03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int time = sc.nextInt();
		int hour = time /3600;
		int minute = (time%3600)/60;
		int second = (time%3600)%60;
		System.out.printf("%d초는 %d시간,%d,분,%d초입니다.",time,hour,minute,second);
	}
}
