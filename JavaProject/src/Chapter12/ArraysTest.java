package Chapter12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] array = {9,4,5,6,2,1};
		Arrays.sort(array); //배열 오름차순 정렬
		printarray(array);
		System.out.println();
		//9를 탐색한다. (인덱스 반환, 없으면 음수), 9는key값
		System.out.println(Arrays.binarySearch(array, 9));
		Arrays.fill(array, 8); //배열을 특정한 값으로 채운다.
		printarray(array);
	}
//	배열을 매개변수로 받아서 출력하는 메소드
	private static void printarray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("]");
	}
}
