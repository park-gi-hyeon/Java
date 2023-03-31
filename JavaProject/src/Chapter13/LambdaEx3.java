package Chapter13;

interface MyFuction3{
	void print();
}
public class LambdaEx3 {
	public static void main(String[] args) {
		MyFuction3 f = ()->{System.out.println("Hello");};//매개변수 없는 람다식 작성
		f.print();
		f=()->System.out.println("안녕");//람다식 재작성
		f.print();
	}
}
