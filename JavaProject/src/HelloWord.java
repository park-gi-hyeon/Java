/*
 * 작성일 : 2023-02-20
 * 작성자 : 홍길동
 * 내용 : HelloWorld 클래스로 문자열 출력
 */
public class HelloWord {
	public static void main(String[] args) {
		//String : 문자열 타입이다.
		//message : 변수명
		//String message : 변수 선언
		String message = "헬로 월드!"; //변수 초기화
		System.out.println(message);
		message = "웰컴 투헬!";
		System.out.println(message);
		String a = "안녕";
		String b = "하세요";
		String c = a+b;
		System.out.println(c);
		
		String d = "자바 수업은 ";
		String e = "어렵지 ";
		String f = "않습니다. ";
		String g = d+e+f;
		System.out.println(g);
	}
}

