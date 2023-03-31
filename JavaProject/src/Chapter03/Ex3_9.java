package Chapter03;
/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex)2*7=14, 9*4 =36
 */
public class Ex3_9 {
	public static void main(String[] args) {
//		2차원 배열 선언
//		1*1=1 ~ 9*9=81
//		int[][] gugudan;
//		2차원 배열 선언, 생성(9행9열)
		int[][] gugudan = new int[10][10];//0~9까지
//		gugudan.length : 9행
//		1~9까지(<10)
		for (int i = 1; i <= 9; i++) {//행 기준
			for (int j = 1; j <= 9; j++) {//열 기준
//				행렬에 1*1=1 ~ 9*9=81까지 값을 2차원 배열원소로 저장
				gugudan[i][j]=i*j; //i : 행, j : 열(gugudan[i][j])
			}
		}
//	 반복이 끝나면 1*1~9*9까지 값들이 저장됨
		System.out.println("2 X 7 = "+gugudan[2][7]);
		System.out.println("9 X 4 = "+gugudan[9][4]);
	}
}
