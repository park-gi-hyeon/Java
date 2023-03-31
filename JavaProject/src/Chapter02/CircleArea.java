package Chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double g = 1.0f;
		int f = 1;
		
		double m = 0.1f;
		double n = m*10;
		System.out.println(m);
		System.out.println(n);
		System.out.println(n==f);
		System.out.println(f==g);
		
		
		double pi = Math.PI;
		int radius = 10;
		//원의 넓이 공식
//		숫자 연산시 결과는 큰 타입을 따라감
		double circleArea = radius*radius*pi;
		
		
		
		
		System.out.println(circleArea);
		int z = 300;
		byte a = (byte)z;
		System.out.println(a);
		double x = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(x);
		System.out.println(x==1);
		if(Double.compare(x,x)==f) {
			System.out.println(2);
		
			
		}else {
			System.out.println(1);
		}
		
		
	}
}
