package Practice;

import java.util.Scanner;

abstract class calc2{
	public int a,b;
	public void setValue(int a, int b){this.a=a; this.b=b;}
	public abstract int calculate();
}
class Add1 extends calc2{
	public int calculate() {return a+b;}
}
class Sub1 extends calc2{
	public int calculate() {return a-b;}
}
class Mul1 extends calc2{
	public int calculate() {return a*b;}
}
class Div1 extends calc2{
	public int calculate() {return a/b;}
}
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.next().charAt(0);
		int result = 0;
//		if (c=='+') {
//			Add add = new Add();
//			add.setValue(a, b);
//			result = add.calculate();
//		}
//		if (c=='-') {
//			Sub sub = new Sub();
//			sub.setValue(a, b);
//			result = sub.calculate();
//		}
//		if (c=='*') {
//			Mul mul = new Mul();
//			mul.setValue(a, b);
//			result = mul.calculate();
//		}
//		if (c=='/') {
//			Div div = new Div();
//			div.setValue(a, b);
//			result = div.calculate();
//		}
//		System.out.println(result);
		calc2 exp = null;
		switch (c) {
		case '+': exp = new Add1(); break;
		case '-': exp = new Sub1(); break;
		case '*': exp = new Mul1(); break;
		case '/': exp = new Div1(); break;
		default:
			System.out.println("잘못된 연산자입니다.");
			sc.close();
			break;
		}
		exp.setValue(a, b );//피연산자와 a와b 값을 객체에 저장
		if (exp instanceof Div1 && b ==0) { //0으로 나누는경우
			System.out.println("계산할 수 없습니다.");
		} else {
			System.out.println(exp.calculate());
		}
		sc.close();
	}
}
