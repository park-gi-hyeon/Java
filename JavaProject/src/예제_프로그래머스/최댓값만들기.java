package 예제_프로그래머스;

import java.util.Arrays;

public class 최댓값만들기 {
	public static void main(String[] args) {

		int[] numbers= {1,2,3,4,5};
		Arrays.sort(numbers);
		int a= numbers[0];
		int b= numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>a) {
			a=numbers[i];
		}
			for(int j=0; j<numbers.length-1; j++) {
				if(numbers[j]>b) {
					b=numbers[j];
						
						
						
				}
			}
			//최대값을 구해서 변수1에 저장하고
			//다른값보단 크면서 최대값보다 작은 수를 저장하고 곱하기
			//how?
				
			}
			int answer= a*b;
			System.out.println(answer);
			System.out.println(b);
		}
		
		
		
		
	}

