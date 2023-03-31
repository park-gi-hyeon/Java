package 정리;

public class 자바charAt_indexOf_lastIndexOf {

	public static void main(String[] args) {
		
		String str1 = "abcde";//str1에 abcde를 저장
		//str1에서 0부터 세어서 2에 있는 문자열을 출력 하는데 charAt를 써서 반환 되는걸 아스키 코드로 출력되게함
		System.out.println(str1.charAt(2));
		
		
		String str2 = "규하는규하야"; //str2에 규하는규하야 라고 저장
		//출력되는걸 배열 위치번호로 indexOf가 알려줌 규가 두번 중복돼서 젤 첨에 있는 규의 배열번호인 0을 출력함 
		System.out.println(str2.indexOf("규"));
		
		
		String str3 = "규하는규하야";//str3에 규하는 규하야라고 저장
		//위와 같은 논리지만 규하야가 시작 하는 배열이 0부터 세어봤을때 3이라 3을 출력해줌
		System.out.println(str3.indexOf("규하야"));
		// 규하하라는 문자열은 없어서 -1를 출력해줌
		System.out.println(str3.indexOf("규하하"));
		
		String str4 = "규하는 규하야";
		//lastIndexOf의 경우 indexOf와 다르게 단어에서 알 수 있듯이 뒤에서 부터 배열을 확인해서 돌려줌
		System.out.println(str4.lastIndexOf("하"));
		
		String str5 = "a";
		//배열의 크기를 돌려줌 str5에선 하나의 배열만 가지고 있기때문에 1를 돌려줌
		System.out.println(str5.length());
		
	}

}
