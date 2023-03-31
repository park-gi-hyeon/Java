package 예제_프로그래머스;

import java.util.Scanner;

public class 숫자비교하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력: ");
		int a = scan.nextInt();
		System.out.println("두번째 수 입력: ");
		int b = scan.nextInt();
		
		solution(a,b);
		
		
		
		
		
		
	
		
		
	}

//	public static class Solution{
		public static int solution(int num1, int num2) {

			int answer = 0;
			if((num1>=0&&num1<=10000)&&(num2>=0&&num2<=10000)){
				if(num1==num2){
					answer=1;
				}else{
					answer=-1;
				}
				System.out.println(answer);
			}
			return answer;
		}
		
	}

//}
