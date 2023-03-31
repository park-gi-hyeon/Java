package Chapter03;
/*
 *  문자열에서 r 파벳 갯수 구하기
 *  알파벳 대/소문자 상관없음
 *  toCharArray()메소드 사용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count =0;
		String str ="programming is fum! Right?";
//		str.toCharArray() : 문자열에서 문자 하나씩 가지고 옴
		char[] charArr = str.toCharArray();
		
//		programming is fum! Right? => 문자열 크기만큼 반복
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] =='R' || charArr[i]=='r') {
				count++;
			}
		}
		System.out.println(str);
		System.out.println("=> R(r)의 갯수: "+count);
	}
}
