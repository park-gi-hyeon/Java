package Chapter07;

//대문자 알파벳 T를 타입파라미터로 받은 제너릭
public class Box2<T> { //T가 Stirng, Integer
//	필드 타입도 T가 Stirng, Integer
	//3.hello
	private T t; //타입파라미터를 t의 타입으로 사용
	//타입파라미터를 메소드의 리턴타입으로 사용
//	T가 String 메소드 타입도 Integer
	public T get() {
		return t;
	}
	//타입파라미터를 메소드의 매개변수 타입으로 사용
//	매개 변수도 String 타입 Integer
	public void set(T t) {//1.hello
		this.t = t;//2.hello
	}
}
