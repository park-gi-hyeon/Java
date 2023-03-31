package Chapter03;

public class IrregularArray {
	public static void main(String[] args) {
		int[][] arr = new int[4][];
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				arr[i] = new int[3];
			} else {
				arr[i] = new int[2];
			}
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*10+j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
}
