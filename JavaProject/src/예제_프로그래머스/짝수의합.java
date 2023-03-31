package 예제_프로그래머스;

public class 짝수의합 {

	public static void main(String[] args) {
		int n = 4;
		int answer = 0;
		int sum = 0;
		
		for (int i = 0; i<=n; i+=2) {
			sum+=i;
			
		}
		
		System.out.println(sum);

	}

}
