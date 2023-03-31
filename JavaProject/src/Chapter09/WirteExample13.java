package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WirteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/output.txt");//upcasting
		char[] data = "홍길동2".toCharArray();
		
//		writer.write(data);
		writer.write(data,1,2);	//길동 : "홍길동2에서 인덱스 1번에서 2자를 읽어서 파일로저장	
		writer.close();
	}
}