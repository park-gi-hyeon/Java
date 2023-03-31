package Chapter10;

public class TimeThread extends Thread{
	int n=0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			//1000밀리세컨은 1초 1초마다 실행(딜레이를 준다)
			try {
				sleep(1000);
//				예외 발생할때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace 메소드로 기본 예외처리 메세지를 출력
				e.printStackTrace();
			}
		}
	}
}
