package 평가;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in=null;//입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out=null;//출력: 서버에서 보내는 데이터
		Scanner scanner=new Scanner(System.in);
		
		try {
			//서버 ip와 포트를 가지고 소켓객체 생성
			//소켓 객체로 데이터를 주고 받음
			socket = new Socket("localhost",9999);
			//입력: 서버에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 클라이언트에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				System.out.print("계산식(빈칸으로 띄어 입력,예:24 + 42)>>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equals("bye")) {
					out.write(outputMessage+"\n");//nextLine()+"\n" 해서 메시지 처리
					out.flush();
					break;	
				}
				out.write(outputMessage+"\n");//nextLine()+"\n" 해서 메시지 처리
				out.flush();
				String inputMessage = in.readLine();//한행의 문자열을 읽는다.
				System.out.println("계산결과: "+inputMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();//예외처리시 시스템에서 자동으로 출력되는 메시지
		}finally {
			try {
				scanner.close();
				socket.close();
			} catch (Exception e2) {//서버와 클라이어튼 간에 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
