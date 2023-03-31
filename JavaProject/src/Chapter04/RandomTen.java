package Chapter04;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		Random generator = new Random();
		int[]rNumber = new int[10];
		double sum = 0;
		System.out.print("랜덤한 정수들 ");
		for (int i = 0; i < rNumber.length; i++) {
			int randomNumber = generator.nextInt(10)+1;
			System.out.print(randomNumber+" ");
			rNumber[i]= randomNumber;
			sum += randomNumber;
		}
		System.out.println();
		System.out.println("평균은 "+sum/10);
	}
}
