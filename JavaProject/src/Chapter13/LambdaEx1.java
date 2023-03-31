package Chapter13;

interface myFuction{
	int calc(int x,int y);//람다식으로 구현할 추상 메소드
}
public class LambdaEx1 {
	public static void main(String[] args) {
		myFuction add =(x,y)->{return x+y;};//람다식
//		myFuction minus = (x,y)->return x-y; //람다식 return이 있어서 안됨
		myFuction minus = (x,y)->x-y; //람다식 {}와 return 생략
		
		//인터페이스 참조변수 선언후 위에 메소드를 가지고 와야함
		System.out.println(add.calc(1, 2));//합 구하기
		System.out.println(minus.calc(1, 2));//차 구하기
	}
}
