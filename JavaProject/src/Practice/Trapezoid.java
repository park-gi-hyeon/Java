package Practice;

import java.util.Scanner;

public class Trapezoid {
	 int down , up , height;
	public Trapezoid(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
	}
	public double getArea() {
		return (up+down)*height/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>>");
		Trapezoid tra = new Trapezoid(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("사다리꼴의 면적은 "+tra.getArea());
		sc.close();
	}
}
