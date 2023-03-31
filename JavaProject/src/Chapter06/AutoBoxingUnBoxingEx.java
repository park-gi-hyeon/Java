package Chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
		//n을 값으로 가지는 객체 생성(intObject: 참조변수)
		Integer intObject = Integer.valueOf(n);
		//auto boxing
		Integer intObject2=n;
		System.out.println("inObject = "+intObject);//10출력
		System.out.println("inObject2 = "+intObject2);//10출력
		
		int m = intObject.intValue()+intObject.intValue(); // unboxing
//		int m = intObject+intObject.intValue(); //auto unboxing
		System.out.println("m = "+m);//20출력
	}
}
