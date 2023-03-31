package Practice;

import java.util.Scanner;

public class CircleVolume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원뿔 밑의 원의 반지름을 입력하세요: ");
		System.out.println("원뿔의 높이를 입력하세요: ");
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double volume = radius*radius*height*Math.PI/3;
		System.out.println("원뿔 밑의 원의 반지름: "+radius);
		System.out.println("원뿔의 높이: "+height);
		System.out.println("원뿔의 부피: "+volume);
	}
}
