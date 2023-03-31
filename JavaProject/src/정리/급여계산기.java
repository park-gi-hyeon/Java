package 정리;

import java.text.NumberFormat;
import java.util.Scanner;

public class 급여계산기 {

	public static void main(String[] args) {
		Scanner 급여계산기 = new Scanner(System.in);
		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println("====내가 만든 월급계산기====");
		System.out.print("시급을 입력하세요: ");
		while(true) {
			try{
		double 시급 = 급여계산기.nextDouble();

		System.out.print("오늘 근무시간: ");
		double 근무시간 = 급여계산기.nextDouble();
		System.out.print("총 출근일: ");
		double 출근 = 급여계산기.nextDouble();
		System.out.print("한 주 근무시간: ");
		double 한주근무시간 = 급여계산기.nextDouble();
		double 주급 = 한주근무시간*시급;
		double 주휴수당 = 주급*20/100.0;
		double 세전월급 = (시급*근무시간*출근)+주휴수당;
		double 국민연금 = 세전월급*4.5/100;
		double 건강보험 = 세전월급*3.545/100;
		double 고용보험 = 세전월급*0.9/100;
		double 장기요양 = 건강보험*12.81/100;
		double 사대보험 = 건강보험+고용보험+장기요양+국민연금;
		//		double 사대보험 = 세전월급*/100.0;
		int 세후월급 =(int) 세전월급-(int)사대보험;
		int 세전연봉 = (int)세전월급*12;
		int 오백만원이하 = (세전연봉*70/100);
		//		double pay = 주급+

		String 주휴 = numberFormat.format(주휴수당);
		String 세전 = numberFormat.format(세전월급);
		String 세후 = numberFormat.format(세후월급);
		String 일주 = numberFormat.format(주급);
		String 국민 = numberFormat.format(국민연금);
		String 건강 = numberFormat.format(건강보험);
		String 고용 = numberFormat.format(고용보험);
		String 장기 = numberFormat.format(장기요양);
		String 전연봉 = numberFormat.format(세전연봉);
		String 사대 = numberFormat.format(사대보험);
		System.out.println("^================================");	
		System.out.println("주휴수당은:"+주휴);
		System.out.println("주급: "+주급);
		System.out.println("월급(세전) : "+세전);


		System.out.println("===============공제액===============");
		System.out.println("국민연금: "+Math.round(국민연금));
		System.out.println("건강연금: "+Math.round(건강보험));
		System.out.println("장기요양: "+Math.round(장기요양));
		System.out.println("고용보험: "+Math.round(고용보험));
		System.out.printf("사대보험 공제 총액:%.2f"+사대);


		System.out.println("================월급===============");
		System.out.println("세후 월급:"+세후);
		System.out.println("=================================");
		if(세전연봉<=5000000) {
			System.out.println("고생했다");	

		}else if(세전연봉<15000000&&세전연봉>5000000){
			System.out.println("열심히했네");	
			break;
		}else if(세전연봉>15000000&&세전연봉<45000000) {
			System.out.println("수고했다.");
			break;
		}else if(세전연봉>45000000&&세전연봉<100000000){
			break;
		}else{
			System.out.println("난부자야~");
			break;
		}
	}catch(Exception e) {
		System.out.println("숫자가 아닙니다");
		급여계산기.nextLine();
		
		
	}

		}
			
			
		
		}
	}





//		System.out.println(사대보험);
//		System.out.println("이번달 월급은:"+pay+"입니다.");





//주휴수당


