package Chapter04;

public class ValuePassing {
	public static void main(String[] args) {
		int n=10;
//		1.매개변수 n을 가지고 메소드 호출
//		n을 넘기기만 하고 값은 변하지 않음
		increase(n);
		System.out.println("@@@### n ===>"+n);
	}
//	increase 메소드 : 매개 변수를 받아서 1증가
//	2.n변수를 m 매개변수로 받음
	static void increase(int m) {
//		3.매개변수를 1증가
		m=m+1;
		System.out.println("@@@### m ===>"+m);
	}
}
