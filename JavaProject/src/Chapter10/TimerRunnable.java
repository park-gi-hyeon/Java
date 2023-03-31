package Chapter10;

//Runnable인터페이스 상속받아서 스레드 구현
public class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			//1000밀리세컨은 1초 1초마다 실행(딜레이를 준다)
			try {
				Thread.sleep(1000);//Thread를 상속받지 않아서 Thread를 쓰지 않으면 오류가 남
//				예외 발생할때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace 메소드로 기본 예외처리 메세지를 출력
				e.printStackTrace();
			}
		}
	}
}
