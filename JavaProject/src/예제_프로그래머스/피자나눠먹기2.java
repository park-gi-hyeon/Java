package 예제_프로그래머스;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		
		System.out.println(solution(10));
		
		//6/10 몫1에 나머지6 else로감
		//6/6 몫1 나머지 0 if로감
		//4/6 몫0에 나머지4 else로감
	
		
		
	}
	 public static int solution(int n) {
	        int answer = 0;
	        
	        
	        
	            if(n%6==0) {
					answer = n%6;
				}else {
					answer= n%6;
				}
	        return answer;
	        
	        
	       
	
	
	
	 }
	
	

}
