package Chapter07;

public class Box {
	private Object object;//3홍길동(멤버에 들어감)
	public Object get() {
		return object;
	}
	//1홍길동
	public void set(Object object) {
		this.object = object;//2.홍길동
	}
}
