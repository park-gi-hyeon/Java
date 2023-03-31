package Chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		
		
		
//		결과는 큰타입으로 int
		
		System.out.println(b+i);
//		정수 기본타입 int 로 연산
		System.out.println(10/4);
//		실수 큰타입으로 계산됨(double/int)
		System.out.println(10.0/4);
//		실수 연산으로 결과는 실수
		System.out.println(2.9+1.8);
//		2+1.8 실수
		System.out.println((int)2.9+1.8);
//		2+1
		System.out.println((int)2.9+(int)1.8);
//		4.7을 정수로 변환 괄호안에 있는 2.9와.1.8를 먼저 연산하고 인트로 캐스팅 해서 4가됨
		System.out.println((int)(2.9+1.8));
		
		
		
		
		
		
	}
}
