package Chapter03;

public class ReturnArray2 {
	public static void main(String[] args) {
		int[] arrEx = {1,2,3,4,5,6,7,8,9,10};
		makeArray(arrEx);
		for (int i = 0; i < arrEx.length; i++) {
			System.out.println(arrEx[i]);
		}
	}
	public static int[] makeArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=100;
		}
		return arr;
	}
}
