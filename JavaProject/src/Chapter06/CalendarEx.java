package Chapter06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //컴퓨터는 달을 0~11로인식
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);//MILLISECOND : 1000분의 1초
		
		System.out.print(msg+":"+year+"-"+month+"-"+day+" ");
//		System.out.println(dayOfWeek);//2 (일요일:1 월요일:2, 화요일:3~)
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;

		default:
			break;
		}
		System.out.println("("+hourOfDay+"시)");//24시간 기준
		if (ampm == Calendar.AM) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
//		오전 10시 48분 23초 833밀리 초
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.print(second+"초 ");
		System.out.print(millisecond+"밀리 초 ");
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); //날짜, 시간정보를 삭제
		firstDate.set(2016, 11,25);
		firstDate.set(Calendar.HOUR_OF_DAY,20);
		firstDate.set(Calendar.MINUTE,30);
		firstDate.set(Calendar.SECOND,30);
		firstDate.set(Calendar.MILLISECOND,30);
		
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
