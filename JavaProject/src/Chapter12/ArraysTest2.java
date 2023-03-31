package Chapter12;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest2 {
	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(Arrays.asList(a));//List로 배열을 받음(for문을 돌리지 않고 출력가능)
		
		Arrays.sort(b,4,14);//인덱스정렬(4~13)
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);//오름차순 정렬
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a, Collections.reverseOrder());//문자열 배열을 거꾸로
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);//오름차순 정렬
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,2,4,Collections.reverseOrder());//오름차순 정렬
		System.out.println(Arrays.toString(a));
		
		String [] cc = {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc,Collections.reverseOrder());
		//실제론 223이 제일 크지만 53이 제일 앞에 나온다 이유는 문자열이기 때문에 앞에5만 본것이다
		System.out.println(Arrays.toString(cc)); 
		
		int[] c = Arrays.copyOf(b, b.length); //배열객체를 복사
		System.out.println(Arrays.toString(c)); 	
		
		String[] d = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(d)); //String으로	
	}
}
