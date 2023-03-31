package 정리;

public class 등차수열 {

	public static void main(String[] args) {
//		등차수열 >> 연속하는 수의 차이가 일정한 수열
		int answer = 0;
		
//		1부터 N까지의 수 중
//		홀수/짝수 인 값만 더하거나 하는 등으로 사용
		for(int i = 1; i<=10; i++) {
//			for문을 돌리면서 if로 조건에 해당하는지 판별후 계산
//			if(i%2 !=0) { %2로 나머지값을 그래서 0이면 짝수 0이 아니면(!=)홀수임
			if(i%1 !=0) {
				answer += i;
			}
			System.out.println(answer);
				
			}
		}
		
		
		

	}


