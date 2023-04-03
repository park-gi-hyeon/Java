package Practice;

class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")의 점";
	}
}
public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y,String color) {
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void SetXY(int x, int y) {
		move(x,y);
	}
	@Override
	public String toString() {
		return color+"색의 "+super.toString();
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.SetXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다");
	}
}
