package 예제_프로그래머스;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] a = {"asdf","dafsdf","asdf"};
		int[] answer = {};
		for(int i = 0 ; i < a.length; i++) {
			System.out.println(answer[i]);
			answer[i]=a[i].length();
			//a의 몇번째 원소의 문자열에 수를 가져온다
			//순차적으로 생각
		}
		
		

	}

}
