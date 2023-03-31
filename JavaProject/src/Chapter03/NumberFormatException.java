package Chapter03;
/*
 * 문자열을 정수로 변환
 * 변환안될때를 대비해서 예외처리
 */
public class NumberFormatException {
	public static void main(String[] args) {
		String[]stringNumber = {"23","12","3.141592","998"};
		int i;
	
		for (i = 0; i < stringNumber.length; i++) {
//			문자열을 정수로 받을떄 오류
//			int j = stringNumber[i];
//			Stiring 변수로 받을 수 있음
//			String j = stringNumber[i];
//			Integer : Wrapper 클래스
//			parseInt : 문자열을 정수로 변환하는 메소드
//			NumberFormatException: For input string: "3.141592"
			try {				
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은"+j);
			} catch (Exception e) {
				System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
