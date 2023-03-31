package Chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 오류: 실수는 기본이 double
		//		float var1= 3.14;
		float var1= 3.14f;
		double var2= 3.14;
//		소수점 자리수 제한은 없이 값을 가지나 출력시 반올림(반올림 자리수는 double>float)
		float var3 = 0.12345678901234567890123456789012345678901234567890f;
		float var4 = 0.98765432109876543210987654321098765432109876543210f;
		double var5 = 0.12345678901234567890123456789012345678901234567890;
		double var6 = 0.98765432109876543210987654321098765432109876543210;
	
		double var7=3e6;
		double var8=3e6F;
		double var9=2e-3;
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		System.out.println("var3 :"+var3);
		System.out.println("var4 :"+var4);
	
		System.out.println("var5 :"+var5);
		System.out.println("var6 :"+var6);
		
		System.out.println("var7 :"+var7);
		System.out.println("var8 :"+var8);
		System.out.println("var9 :"+var9);
		
		
		
	}
}
