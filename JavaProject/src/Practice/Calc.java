package Practice;

import java.util.Scanner;
class Add{
	private int a ,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a+b;
	}
}
class Sub{
	private int a ,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a-b;
	}
}
class Mul{
	private int a ,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a*b;
	}
}
class Div{
	private int a ,b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a/b;
	}
}

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		int result = 0;
		if (c=='+') {
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
		}
		if (c=='-') {
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
		}
		if (c=='*') {
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
		}
		if (c=='/') {
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
		}
		System.out.println(result);
	}
}
