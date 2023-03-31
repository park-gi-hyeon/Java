package Chapter05;

//생명 1개, 날개2개, 걷다, 먹는다. +수영한다.(인터페이스)
//객체 생성시 멤버 5개
//Swim 클래스는 다중상속 안된다.
//인터페이스 다중상속 됨(implements 키워드 사용)
public class Penguin extends Bird implements Swim2{
//	추상메소드는 구현해야 함
	@Override
	public void swim() {
		System.out.println("Penguin swims");
	}
	
}
