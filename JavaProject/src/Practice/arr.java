package Practice;

public class arr {
	public static void main(String[] args) {
		int result = 0;
		int[][]arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*9);		
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result+=arr[i][j];
			}
		}
		System.out.println("합은 "+result);
	}
}
