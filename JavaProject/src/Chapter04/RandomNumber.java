package Chapter04;

import java.util.Random;

/*
 * 난수를 발생 Math(클래스),Random(클래스)
 */
public class RandomNumber {
	public static void main(String[] args) {
		int rNumber;
		Random generator = new Random();
//		while (true) {
//			rNumber = generator.nextInt(10)+1;
//			System.out.println(rNumber);
//			if(rNumber==7) {
//				break;
//			}
//		}
//		for (;;) {
//			rNumber = generator.nextInt(10)+1;
//			System.out.println(rNumber);
//				if(rNumber==7) {
//					break;
//			}
//		}
		do {
			rNumber=generator.nextInt(10)+1;
			System.out.println(rNumber);
		} while (rNumber!=7);
		/*
		rNumber = generator.nextInt();//난수 발생(범위: int 타입 범위->-2의32승~1의32승-1까지)
		rNumber = generator.nextInt(10);//난수발생(0~9의정수)
		rNumber = generator.nextInt(10)+1;//난수발생(1~10의정수)
		rNumber = generator.nextInt(10)*(-1);//난수발생(-9~0의정수)
		*/
//		generator.nextBoolean();참거짓 nextLong();long타입범위nextDouble()double범위 nextFloat()float범위
	}

	
}
