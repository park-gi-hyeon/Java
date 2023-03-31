package Chapter03;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부정행위 여부(true 혹은 false)");
		boolean cheating = sc.nextBoolean();
		System.out.print("출석율(0~100)사이의 정수값");
		int attendrate = sc.nextInt();
		System.out.print("총점(0~100)사이의 정수값");
		int totalscore = sc.nextInt();
		char grade;
		if(cheating==true||attendrate<80) {
			grade = 'F';
			System.out.println("당신의 학점은"+grade+"입니다.");
		}else  {
			switch (totalscore/10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}System.out.println("당신의 학점은"+grade+"입니다.");
		}
		
	}
}
