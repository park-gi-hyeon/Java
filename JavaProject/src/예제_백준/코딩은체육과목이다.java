package 예제_백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 코딩은체육과목이다 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner 대신 BufferredReader 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// br에서 읽은 값을 int로 변환
		int a = Integer.parseInt(br.readLine());
		
//		StringBluilder로 객체 호출 및 생성
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< a/4;i++) { //for문으로 a/4로 나눠서 i가 a/4보다 클때까지 반복 i증가함
			sb.append("long");//append 메소드는 string에 문자를 추가함 현재는 string에 아무것도 없기 때문에 
			//long하나만 있음 이걸 i가 클떄까지 출력됨 ex a가 20이면 20/4 =5라 다섯번 반복돼서 long이 다섯번 출력됨
		}
		sb.append(" int");
		System.out.println(sb);
		//append로 int를 추가해줌 for문안에 있지 않기때문에 a에 200을 입력해도 한번만 실행됨
		
		
		br.close();
		
		
		
		
	}
}
