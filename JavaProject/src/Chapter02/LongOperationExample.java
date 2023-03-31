package Chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1=10;
		int value2 = 20;
		long value3 = 1000;
		
		
//		연산된 결과에서 가장 큰 타입인 long 타입을 int로 변환
		int result=(int)(value3+value1+value2);
		System.out.println(result);
	}
	
}
