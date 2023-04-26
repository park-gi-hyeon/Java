package Practice;

import java.util.Scanner;

public class rock {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
	        while (true) {
	            System.out.print("가위 바위 보!>>>");
	            String userinput = sc.next();
	            if (userinput.equals("그만")) {
	                System.out.println("게임을 종료합니다...");
	                break;
	            }
	            int computerChoice = (int) (Math.random() * 3) + 1; // 1: 가위, 2: 바위, 3: 보
	            String result;
	            if ((userinput.equals("가위") && computerChoice == 3)
	                    || (userinput.equals("바위") && computerChoice == 1)
	                    || (userinput.equals("보") && computerChoice == 2)) {
	                result = "사용자가 이겼습니다!";
	            } else if ((userinput.equals("가위") && computerChoice == 1)
	                    || (userinput.equals("바위") && computerChoice == 3)
	                    || (userinput.equals("보") && computerChoice == 1)) {
	                result = "컴퓨터가 이겼습니다!";
	            } else {
	                result = "비겼습니다.";
	            }
	            System.out.println("사용자는 = " + userinput + ", 컴퓨터는 = " + rsp(computerChoice) + ", " + result);
	        }
	        sc.close();
	    }
public static String rsp(int choice) {
	  switch (choice) {
	     case 1:
	         return "가위";
	       case 2:
	         return "바위";
	       case 3:
	         return "보";
	       default:
	         return "";
	    }
	}
}
