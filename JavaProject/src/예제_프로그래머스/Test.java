package 예제_프로그래머스;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캐너 호출
		int[] b= new int [10]; // int타입 b에 배열 10개를 생성
		for(int i=0; i<b.length; i++) {//i를 b의 배열만큼 증가
			b[i]=scan.nextInt();//b에 10번(i가 10이기 때문)의 값을 넣음
			
		}
		
		Test a=new Test(); //Test 내에 있는 매서드 호출 참조변수를 a로줌
		 
		a.solution(b);//a에 있는 매서드 solution을 호출해서 매개변수로 b를줌
		
		
	
		
		
		
	}
	 public  double solution(int[] numbers) {
    double answer = 0;
    double sum=0,avg=0;
    
    for(int i = 0; i<numbers.length; i++){
        sum +=numbers[i];
        
        
        
    }
    avg=sum/numbers.length;
    answer = avg;
    System.out.println(answer);
    return answer;
}
}
