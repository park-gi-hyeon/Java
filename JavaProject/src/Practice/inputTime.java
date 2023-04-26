package Practice;

import java.util.Calendar;

public class inputTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		
		
		System.out.println("현재 시간은"+hour+"시 "+minute+"분입니다.");
		
		if(hour>=4 && hour<12) {
			System.out.println("Good Morning");
		}else if (12<=hour && hour<18) {
			System.out.println("Good Afternoon");			
		}else if (18<=hour && hour<22) {
			System.out.println("Good Evening");						
		}else {
			System.out.println("Good Night");
		}
	}
}


