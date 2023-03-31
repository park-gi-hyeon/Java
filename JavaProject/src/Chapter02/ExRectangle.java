package Chapter02;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("가로,세로를입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();


		System.out.println("사각형의 면적은"+(a*b)+"입니다.");
		
	}
}
