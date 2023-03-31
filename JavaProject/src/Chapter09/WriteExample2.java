package Chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
//		FileOutputStream :바이트 단위 출력을 위한 하위 스트림 클래스
//		FileOutputStream 객체 생성해서 output.txt.를 만든다
		OutputStream os = new FileOutputStream("d:/output.txt");//upcasting
//		바이트 단위로 문자열을 읽는다.
		byte[] data = "DEF".getBytes();
		os.write(data);
		/*
		for (int i = 0; i < data.length; i++) {
			//FileOutputStream 객체에 바이트 배열 원소를 만든다.
			os.write(data[i]);
		}
		*/
	}
}