package Chapter06;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) { //Object obj = new point(2,3)->업캐스팅
		System.out.println(obj.getClass().getName());//Chapter06.Point : 패키지.클래스
		System.out.println(obj.hashCode());//600746945: 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString());//Chapter06.Point@23ceabc1: 패키지.클래스@16진수코드
		System.out.println(obj); //Chapter06.Point@23ceabc1: toString() 생략
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
