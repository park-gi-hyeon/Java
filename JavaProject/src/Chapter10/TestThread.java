package Chapter10;

public class TestThread {
	public static void main(String[] args) {
		//스레드 객체 생성
		TimeThread th = new TimeThread();
		//스레드 실행되면서 JVM 스케쥴링
		th.start();
	}
}

