package Chapter02;

public class LongExample {
	public static void main(String[] args) {

		long var1 =10;
//		20L: 명시적으로 long 타입 리터럴(값)
		long var2 =20L;
//		범위 벗어나서 오류(기본 타입 int)
		long var3 =1000000000000000000L;
		
//		long var3 =1000000000000000000L;
		
		char a = '가';
		char c = 0x0041;
		
		System.out.println(var1+"아아아아"+"\\"+"아");
		System.out.println(var2);
		System.out.println(var3);
		
		
	}
}
