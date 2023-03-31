package Chapter06;

class Point2{
	private int x,y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point2("+x+","+y+")";
	}
}
public class ToStringEx {
	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		//toString() 오버라이딩 -> Point2(2,3)
		System.out.println(p);//Chapter06.Point2@23ceabc1: 패키지.클래스.16진수 해시코드
		System.out.println(p.toString());//위에랑 똑같다.
		System.out.println(p.toString()+"입니다.");//Point2(2,3)입니다.
	}
}
