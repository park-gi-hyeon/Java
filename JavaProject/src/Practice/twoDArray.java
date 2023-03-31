package Practice;

public class twoDArray {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int num = (int)(Math.random()*10)+1;
				arr[i][j] = num;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
