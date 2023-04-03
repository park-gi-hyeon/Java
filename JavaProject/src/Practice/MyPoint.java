package Practice;

public class MyPoint {
	private int x,y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//객체 출력을 오버라이딩
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if (x==p.x && y==p.y) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		//생성자 호출해서 멤버에 값 저장
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if (p.equals(q)) {
			System.out.println("같은 점");
		}else {
			System.out.println("다른 점");
		}
	}
}
