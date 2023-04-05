package Practice;
interface Shape2{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다. ");
		draw();
	}
}
class Circle3 implements Shape2{
	private int a =0;
	public Circle3(int a) {
		this.a = a;
	}
	public Circle3() {}
	@Override
	public void draw() {
		System.out.println("반지름이 "+a+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return PI*a*a;
	}
	
}
class Oval implements Shape2{
	private int a =0;
	private int b = 0;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Oval() {}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return (a/2)*(b/2)*PI;
	}
	
}
class Rect implements Shape2{
	private int a =0;
	private int b = 0;
	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Rect() {}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"크기의 사각형입니다.");
	}
	@Override
	public double getArea() {
		return a*b;
	}
	
}
public class Shapes2 {
	public static void main(String[] args) {
	
	Shape2 [] list = new Shape2[3]; // Shape 인터페이스 타입인 레퍼런스 배열
	list[0] = new Circle3(10); // 반지름이 10인 원 객체
	list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
	list[2] = new Rect(10, 40); // 10x40 크기의 사각형
	
	for (int i = 0; i < list.length; i++) {list[i].redraw();}
	for (int i = 0; i < list.length; i++) {System.out.println("면적은 "+ list[i].getArea());}
	}
}
