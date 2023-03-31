package Practice;

public class dasf {
	public static void main(String[] args) {

		
System.out.println(	solution(15));		
	}
	  public static int solution(int n) {
	        int answer = 0;     
	        if(n%7>0){
	        	answer = n/7+1;
	        }else{
	        	answer = n/7;
	        }
	        return answer ;
	    }
}
