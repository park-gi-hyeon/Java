package Chapter03;

import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100):");
		System.out.print("점수를 입력하세요(1~4):");
		int score = sc.nextInt();
		int grade = sc.nextInt();
		if (grade==4) {
			if (score>=70) {
				System.out.println("합격입니다!");
			} else {
				System.out.println("불합격!");
			}
		} else {
			if (score>=60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격!");
			}
		} 
	}
}
