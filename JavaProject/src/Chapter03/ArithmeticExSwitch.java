package Chapter03;
import java.util.Scanner;
public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요");
		int b = sc.nextInt();
		System.out.print("사칙연산을 입력하세요");
		String op = sc.next();
		switch (op) {
		case "+":
			System.out.println(a+"+"+b+"의 계산 결과는"+(a+b));
			break;
		case "-":
			System.out.println(a+"-"+b+"의 계산 결과는"+(a-b));
			break;
		case "*":
			System.out.println(a+"*"+b+"의 계산 결과는"+(a*b));
			break;
		case "/":
			if (b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(a+"/"+b+"의 계산 결과는"+(a/b));
			}break;
		default:System.out.println("사칙연산이 아닙니다.");
			break;
		}
	}
}
