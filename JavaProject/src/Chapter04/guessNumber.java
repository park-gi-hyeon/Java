package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess = (int)(Math.random()*10)+1;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("추측한 숫자를 입력하세요");
			int guess = sc.nextInt();
		if(numberToGuess==guess) {
			System.out.println("맞추셨습니다.");
			break;
			}
		else if (numberToGuess<guess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			System.out.println("숫자가 너무 큽니다.");
		}
		else{
			System.out.println("추측한 숫자가 틀렸습니다.");
			System.out.println("숫자가 너무 작습니다.");
		}
		}
//		int numberToGuess;
//		int guess;
//		Random generator = new Random();
//		Scanner sc = new Scanner(System.in);
//		numberToGuess = generator.nextInt(10)+1;
//		System.out.println("추측한 숫자를 입력하세요: ");
//		guess = sc.nextInt();
//		while(guess!=numberToGuess) {
//			System.out.println("추측한 숫자가 틀렸습니다.");
//			if(guess>numberToGuess) {
//				System.out.println("추측한 숫자가 너무 큽니다.");
//			}else {
//				System.out.println("추측한 숫자가 너무 작습니다.");
//			}
//			System.out.println("추측한 숫자를 입력하세요: ");
//			guess = sc.nextInt();
//		}
//		System.out.println("맞추셨습니다.");
//		sc.close();
	}
}
