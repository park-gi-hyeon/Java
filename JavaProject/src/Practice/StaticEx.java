package Practice;

import java.util.Arrays;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int[] result = new int[a.length+b.length];
		 System.arraycopy(a, 0, result, 0, a.length);
		 System.arraycopy(b, 0, result, a.length, b.length);
		 return result;
	}
	public static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
public class StaticEx {
	public static void main(String[] args) {
	int[]array1 = {1,5,7,9};
	int[]array2 = {3,6,-1,100,77};
	int[]array3 = ArrayUtil.concat(array1, array2);
	ArrayUtil.print(array3);
	}
}
