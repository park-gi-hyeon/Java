package Chapter03;

import java.util.Scanner;

public class ArithmeticExlf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요");
		int b = sc.nextInt();
		System.out.print("사칙연산을 입력하세요");
		String op = sc.next();
		if (op.equals("+")) {
			System.out.println(a+"+"+b+"의 계산 결과는"+(a+b));
		}else if(op.equals("-")) {
			System.out.println(a+"-"+b+"의 계산 결과는"+(a-b));
		}else if(op.equals("*")) {
			System.out.println(a+"*"+b+"의 계산 결과는"+(a*b));
		}else if(op.equals("/")) {
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(a+"/"+b+"의 계산 결과는"+(a/b));
			}
		}else {
			System.out.println("문자열을 잘못 입력하였습니다.");
		}
	}
}
