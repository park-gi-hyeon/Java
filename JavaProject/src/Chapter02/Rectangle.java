package Chapter02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점(x,y)의 좌표를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((100<=a&&a<=200)&&(100<=b&&b<=200)) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다. ",a,b);
		}else {
				System.out.printf("(%d,%d)는 사각형 안에 없습니다. ",a,b);
		}
	}
}
