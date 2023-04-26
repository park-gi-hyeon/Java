package Practice;

import java.util.Scanner;

public class rockSissorPaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		int computer_random = (int)(Math.random()*3)+1;//1일때 묵 2일떄 찌 3일떄 빠
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user_input = sc.next();
			if(user_input.equals("바위")) {
				System.out.print("사용자는 = 바위");
				if (computer_random==1) {
					System.out.println("컴퓨터는 = 바위 비겼습니다.");
				}else if(computer_random==2) {
					System.out.println("컴퓨터는 = 가위 사용자가 이겼습니다. ");
				}else {
					System.out.println("컴퓨터는 = 보 컴퓨터가 이겼습니다.");
				}
			}else if(user_input.equals("가위")) {
				System.out.print("사용자는 = 가위");
				if (computer_random==1) {
					System.out.println("컴퓨터는 = 바위 컴퓨터가 이겼습니다.");
				}else if(computer_random==2) {
					System.out.println("컴퓨터는 = 가위 비겼습니다. ");
				}else {
					System.out.println("컴퓨터는 = 보 사용자가 이겼습니다.");
				}
			}else if(user_input.equals("보")) {
				System.out.print("사용자는 = 보");
				if (computer_random==1) {
					System.out.println("컴퓨터는 = 사용자가 이겼습니다.");
				}else if(computer_random==2) {
					System.out.println("컴퓨터는 = 가위 컴퓨터가 이겼습니다. ");
				}else {
					System.out.println("컴퓨터는 = 보 비겼습니다.");
				}
			}
		if(user_input.equals("그만")) {
			break;
		}
		}
		System.out.println("게임을 종료합니다...");
		sc.close();
	}
}
