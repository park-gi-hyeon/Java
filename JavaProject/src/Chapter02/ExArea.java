package Chapter02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
		int base = sc.nextInt();
		int height = sc.nextInt();
		int upper  = sc.nextInt();

		if (upper  !=0) {
			double trapezoid = (base+height)*upper /2;
			System.out.println("사다리꼴의 넓이는"+ trapezoid);
		} else {
			double wide = base*height/2;
			System.out.println("삼각형의 넓이는"+wide);
		}
		sc.close();
	}
}
