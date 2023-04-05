package Practice;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다. ");
		draw();
	}
}
class Circle2 implements Shape{
	private int a =0;
	public Circle2(int a) {
		this.a = a;
	}
	public Circle2() {}
	@Override
	public void draw() {
		System.out.println("반지름이 "+a+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return PI*a*a;
	}
	
}
public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle2(10);
		donut.redraw();
		System.out.println("면적은" + donut.getArea());
	}
}
