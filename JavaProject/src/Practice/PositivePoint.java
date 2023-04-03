package Practice;
class Pointfour{
	private int x;
	private int y;
	
	public Pointfour(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x;this.y = y;}
}
public class PositivePoint extends Pointfour{
	public PositivePoint(){super(0,0);}
	
	protected void move(int x,int y) {
		if (x>=0&&y>=0) {
			super.move(x, y);
		}
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if (x<0||y<0) {
			move(0,0);
		}
	}
	
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}

