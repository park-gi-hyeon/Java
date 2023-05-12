package 평가;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class server {
	public static void main(String[] args) {
		ServerSocket listener=null;//서버 소켓 선언
		Socket socket=null;//클라이언트 소켓 선언
		BufferedReader in=null;//입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out=null;//출력: 서버에서 보내는 데이터
		Scanner scanner=new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);//서버소켓객체 생성
			System.out.println("연결을 기다리고 있습니다.....");
			//소켓 객체로 데이터를 주고 받음
			socket = listener.accept();//클라이언트의 연결을 대기
			System.out.println("연결되었습니다.");
			//입력: 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String inputMessage = in.readLine();//한행의 문자열을 읽는다.
				if (inputMessage.equals("bye")) {//클라이언트의 메시지가 bye 일때
					System.out.println("클라이언트에서 bye 로 연결을 종료하였음");
					break;
				}
				System.out.println(inputMessage);//클라이언트에서 온 메시지
				String outputMessage = operation(inputMessage);//서버에서 보내는 메시지
				out.write(outputMessage+"\n");//nextLine()+"\n" 해서 메시지 처리
				out.flush();//비정상적인 종료일때 메시지 재전송
			}
		} catch (Exception e) {
			e.printStackTrace();//예외처리시 시스템에서 자동으로 출력되는 메시지
		}finally {
			try {
//				자원 반납(예외발생까지 고려)
				scanner.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {//서버와 클라이어튼 간에 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
	public static String operation(String value) {
		String[] tokens = value.split(" "); // 빈칸을 기준으로 나누겠다
		if (tokens.length !=3) // 토큰 갯수가 3이 아니라면
			return "잘못된 방식입니다 다시 입력해주세요!";
		
		int num1 = Integer.parseInt(tokens[0]); //첫번째 오는 값은 정수1
		String ope = tokens[1]; //두번째 오는 값은 연산식
		int num2 = Integer.parseInt(tokens[2]); //세번째 오는 값은 정수2
		int res = 0;
		
		switch (ope) {
		case "+":
			res = num1+num2;
			break;
		case "-":
			res = num1-num2;
			break;
		case "*":
			res = num1*num2;
			break;	
			
		default:
			return "error";
		}
		return Integer.toString(res); //문자열로 리턴하기
	}
	
}

