package Chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
//		Box2<String> new Box2<T>();
//		Box2<String> box1= new Box2<String>();
		//자바 7부터 생략가능 (다이아몬드 파라미터<>)
		Box2<String> box1= new Box2<>();
		box1.set("hellow");
		//제네릭 컴파일 단계에서 타입 감지
//		box1.set(777);
		String greet = box1.get();
		System.out.println(greet);
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(777);
//		auto unboxing
		int value  = box2.get();
		System.out.println(value);
	}
}
