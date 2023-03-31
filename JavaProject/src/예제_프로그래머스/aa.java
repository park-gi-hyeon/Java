package 예제_프로그래머스;

public class aa {
	   public int solution(int n) {
		   int answer = 0;
		        int a = 0;
		        
		        while(true) {
		            a = n%10;
		            n = n/10;
		            answer += a;
		            
		            if(n==0) break;
		        }
		        
		        return answer;
		    }
		}
