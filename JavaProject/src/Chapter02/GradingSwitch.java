package Chapter02;

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 10: //100점
//			grade ='A';
//			break;
		case 9: //90~99점
			grade ='A';
			break;
		case 8: //80~89점
			grade ='B';
			break;
		case 7: //70~79점
			grade ='C';
			break;
		case 6: //60~69점
			grade ='D';
			break;

		default:
			grade = 'f';
			break;
			
		}
		System.out.println("학점은 "+grade+"입니다.");
	}
}
