package Chapter10;

public class TestRunnable {
	public static void main(String[] args) {
//		Runnable로 만든 스레드는 Thread객체의 생성자로 호출
		Thread th = new Thread(new TimerRunnable());
//		스레드 실행되면서 JVM 스케줄링
		th.start();
	}
}
