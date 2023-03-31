package Chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue =10;
		int intValue=byteValue;
		System.out.println("intValue: "+intValue);
		
		char charValue = '가';
//		변수에 유니코드가 저장
		intValue = charValue;
		System.out.println("intValue:"+intValue);
		
		intValue=50;
		long longValue=intValue;
		System.out.println("longVlue: "+longValue);
		
		longValue=100;
//		정수를 실수로 받음()
		float floatValue = longValue;
		
		System.out.println("floatValue: "+floatValue);
		
		
//		작은 타입을 큰 타입으로 받음: 자동변환
		floatValue=100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
	}
}
