package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample12 {
	public static void main(String[] args) throws Exception {
//		Writer writer = new FileWriter("D:\\output.txt");//upcasting
//		운영체제에 따라서 경로설정을 다르게 해야 작동됨(ex>unix,linux,mac 등)
		Writer writer = new FileWriter("D:/output.txt");//upcasting
		char[] data = "홍길동2".toCharArray();
		
		writer.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		writer.close();
	}
}

