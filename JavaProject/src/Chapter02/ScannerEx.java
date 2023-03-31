package Chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요");
//		System.in:바이트 표준 입력 스트림
//		scan : 참조변수
//		new Scanner(System.in) : 객체생성
//		Scanner 객체를 생성하고 Scanner 클래스 타입의 scan참조변수가 가리킴
//		System.in : 매개변수(인자,파라미터)
		Scanner scan = new Scanner(System.in);
//		next():문자열 받는 메서드
		String name = scan.next();
		System.out.println(name);
		String city = scan.next();
		System.out.println(city);
		
		int age = scan.nextInt();
		System.out.println(city);
		
		int  weight = scan.nextInt();
		System.out.println(weight+"kg");
		
		boolean single = scan.nextBoolean();
		System.out.println("독신여부는"+single+"입니다.");
		
		
		
		scan.close();
		
		
		
		
		
	}
}
