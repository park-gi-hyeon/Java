package 평가;

import java.util.HashMap;
import java.util.Scanner;

public class love {
	public static void main(String[] args) {
		HashMap<String,String> word = new HashMap<String,String>();
		word.put("사랑", "love");
		word.put("아기", " baby");
		word.put("돈", "money");
		word.put("미래", "future");
		word.put("희망", "hope");
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("한글 단어?");
			String userWord = sc.next();//입력받은 값
			String koreaWord = word.get(userWord);//사용자가 입력한 단어(key)를 value로 받는 값
			if(userWord.equals("그만")) {break;}//while문을 빠져나갈 명령어
			if (koreaWord == null) {// MAP에 없는 값
				System.out.println(userWord+"는 저의 사전에 없습니다.");				
			} else {
				System.out.println(userWord+"은 "+koreaWord);//MAP에 있는 key와 value 출력
			}
		}
		sc.close();
	}
}
