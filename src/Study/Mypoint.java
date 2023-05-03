package Study;


public class Mypoint {
	private int a, b;

	public Mypoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Point("+a+","+b+")";
	}
	@Override
	public boolean equals(Object obj) {
		Mypoint p = (Mypoint)obj;
		if (a==p.a && b==p.b) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Mypoint p = new Mypoint(3,50);
		Mypoint q = new Mypoint(4,50);
		System.out.println(p);
	}
}
