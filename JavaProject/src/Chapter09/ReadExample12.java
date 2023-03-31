package Chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
//		FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
//		Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
		Reader reader = new FileReader("D:\\test.txt");//upcasting
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		while (true) {
//			readData = reader.read();//한개의 문자 단위로 읽는다. ex>호미
			readData = reader.read(cbuf);//한개의 문자 단위로 읽는다. ex>삽
			if (readData == -1) { //한개의 문자 단위로 읽는다.
				break;
			}
//			System.out.print((char)readData); //유니코드를 문자로 변환해서 출력
			data+= new String(cbuf,0,readData);
		}
		System.out.println(data);
		reader.close();
	}
}

