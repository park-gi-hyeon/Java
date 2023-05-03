package ch01;

public class Airthmetic {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		System.out.println("첫번째 숫자 : "+num1);
		System.out.println("두번째 숫자 : "+num2);
		System.out.printf("두수의 합:%d, 차: %d, 곱: %d, 나눈 몫%d, 나눈 나머지%d",num1+num2,num1-num2,num1*num2,num1/num2,num1%num2); 

	}

}
