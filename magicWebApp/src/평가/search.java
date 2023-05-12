package 평가;

import java.util.HashMap;
import java.util.Scanner;

public class search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> word = new HashMap<String,String>();
		System.out.print("인원수>>");
		int people = sc.nextInt();
		
		for (int i = 0; i <= people; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력>>");
			String userText = sc.next();
			String[] tokens = userText.split(" ");
			
			if(tokens.length != 2) {
				System.out.println("잘못된 방식입니다.");
			}
			
			String name = tokens[0];
			String phone = tokens[1];			
			word.put(name, phone);
		}
		System.out.println("저장되었습니다..");
		
		while (true) {
			System.out.print("검색할 이름>>");
			String userWord = sc.next();
			
		}
	}
}
