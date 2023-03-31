package Chapter13;

interface MyFunction4{
	int calc(int x,int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x,y)->x*y); //람다식((x,y)->x*y)을 매개 변수로 전달
	}
//	메소드 매개변수로 인터페이스 객체를 받음
//	f로 (x,y)->x*y 람다식 전달받음
	static void printMultiply(int x, int y, MyFunction4 f) {
		System.out.println(f.calc(x, y));
	}
}
