package Chapter03;

public class IrregularArrayEx {
	public static void main(String[] args) {
		int n[][] = new int[4][];
		n[0] = new int[3];
		n[1] = new int[2];
		n[2] = new int[3];
		n[3] = new int[2];
//		4번 반복
		for (int i = 0; i < n.length; i++) {//행의 크기 만큼 반복
//			3,2,3,2 번 반복
			for (int j = 0; j < n[i].length; j++) {//열의 크기만큼반복
				n[i][j] = (i+1)*10+j;
				System.out.print(n[i][j]+" ");		
			}
			System.out.println();
		}
	}
}
