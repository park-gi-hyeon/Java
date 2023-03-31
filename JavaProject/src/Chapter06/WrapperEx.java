package Chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1= '4', c2='F';
		//Character Wrapper 클래스
		//isDigit 숫자체크하는 메소드
		if (Character.isDigit(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		if (Character.isDigit(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		//isAlphabetic: 영문자 인지 체크하는 메소드
		if (Character.isAlphabetic(c2)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}
		if (Character.isAlphabetic(c1)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}
//		Integer : Wrapper클래스, Integer : 문자열을 정수로 변환
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toHexString(28));//1c=16+12=28(16진수)
		System.out.println(Integer.toBinaryString(28));//11100=16+8+4=28
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14); //3.14를 포함하는 객체를 가리키는 d 참조변수
		System.out.println(d.toString());//문자열 3.14를 출력
//		paseDouble: 문자열을 실수로 변환하는 메소드
		System.out.println(Double.parseDouble("3.14")); //실수 3.14를 출력
		
		boolean b = (4>3);
		//Boolean.toString: Boolean Wrapper 클래스의 toString 메소드로 불린값을 문자열로 변환
		System.out.println(Boolean.toString(b)); //문자열  true 출력
		//parseBoolean: parseBoolean 메소드로 문자열을 불린값으로 변환
		System.out.println(Boolean.parseBoolean("false"));//불린값 false출력
	}
}
