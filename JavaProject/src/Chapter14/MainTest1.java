package Chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sumValue = Arrays.stream(arr).sum();//배열요소의 합
		long count = Arrays.stream(arr).count();//배열요소의 합
		
		System.out.println(sumValue);
		System.out.println(count);
	}
}
