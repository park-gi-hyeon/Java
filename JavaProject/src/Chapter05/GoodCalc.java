package Chapter05;


abstract class Calculatior{//추상클래스 선언
//	public int add(int a,int b) {return 1;}
//	public abstract int add(int a,int b) {return 1;}//추상메소드 구현시 오류
	public abstract int add(int a,int b);//추상메소드 선언
	public abstract int subtract(int a,int b);//추상메소드 선언
	public abstract double average(int[] a);//추상메소드 선언
}

//public  abstract class GoodCalc extends Calculator {//추상클래스는 구현 불필요
public class GoodCalc extends Calculatior {
	public static void main(String[] args) {
//		new Calculator();// 추상클래스인 경우에는 객체 생성못함
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
}
