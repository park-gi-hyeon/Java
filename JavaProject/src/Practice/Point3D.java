package Practice;
class PointThree{
	private int x;
	private int y;

	public PointThree(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x;this.y = y;}
}
public class Point3D extends PointThree{
	private int z;
	public Point3D(int x, int y) {
		super(x, y);
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveDown() {z--;}
	public void moveUp() {z++;}
	protected void move(int x, int y,int z) {move(x,y); this.z=z;}
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); 
		System.out.println(p.toString() + "입니다.");
		 p.moveUp(); // z 축으로 위쪽 이동
		 System.out.println(p.toString() + "입니다.");
		 p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		 System.out.println(p.toString() + "입니다.");
		p.move(100, 200, 300); // x, y, z 축으로 이동
		 System.out.println(p.toString() + "입니다.");
	}
}
