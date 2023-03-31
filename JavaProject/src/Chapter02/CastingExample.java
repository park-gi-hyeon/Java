package Chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue= 44032;
		//int 타입을 char로 바로 저장할려고 하면 오류
//		char charValue = intValue;
//		char 로 변환 (casting)해서 저장
//		44032 유니코드에 해당하는 '가' 문자가 저장
		char charValue=(char)intValue;
		System.out.println(charValue);
		
		
		
		//정수 작은타입에서 큰 타입으로 변환(자동변환)묵시적변환이라고도 함
//		long longValue=500;
//		500000000L에서 L을 안붙이면 int로 인식해서 오류
		long longValue=500000000L;
		intValue= (int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
//		실수에서 정수로변환(변환 안 하면 오류)
		intValue= (int) doubleValue;
		System.out.println(intValue);
	}
}
