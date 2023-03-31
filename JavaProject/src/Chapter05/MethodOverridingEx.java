package Chapter05;

class Shape{
	public void draw() { 
		System.out.println("Shape");
	}
}
class Line extends Shape{
	@Override//@는 어노테이션(시스템 주석)
	public void draw() {// 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rext");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}	
}
public class MethodOverridingEx {
	//Shape p = new Line(); upcasting
	//Shape p = new Shape();
	//Shape p = new Line(); upcasting
	//Shape p = new Rect(); upcasting
	//Shape p = new Circle(); upcasting
	static void paint(Shape p) {
		//업캐스팅으로 인해서 슈퍼클래스 draw()메소드로 갔다가 오버라이딩 되어서 Line으로 간다=동적바인딩
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
