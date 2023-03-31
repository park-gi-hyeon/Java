package 성준;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class 예제3에1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100) :");
		int a = sc.nextInt();
		
		if (a >= 60) {
			System.out.println("학년을 입력하세요");
		} else {
			System.out.println("학년을 입력하세요");
		}  
		
		int b = sc.nextInt();
		
		if (b>1 && b<3) {
			System.out.println("합격입니다요");
		} else if(b < 4) {
			System.out.println("불합격입니다요");
		}sc.close();
	}
}