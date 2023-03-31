package 예제_프로그래머스;

public class 분수의덧셈 {
	public static void main(String[] args) {
		
	}
	//1 / 2 + 3 / 4 =    5 / 4입니다. 따라서 [5, 4]를 return 합니다.
	
//	9 / 2 + 1 / 3 =    29 / 6입니다. 따라서 [29, 6]을 return 합니다.
//	System.out.println(solution(answer));
	

public	static int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int[] answer = new int[2];
    
    	
    if(denom1==denom2) {
    	answer[0] = denom1;
    	answer[1] = numer1+numer2;
    	
    	
    }else {
    	int a =  denom1+denom2;
    			
    			
    			
    	
    	
    	
    	
    	
   
   
   
    	}
    return answer;
}
}


