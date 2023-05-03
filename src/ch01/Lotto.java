package ch01;

public class Lotto {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				lotto[j] = (int)(Math.random()*45)+1;
				for(int k=0; k<j; k++) {
					if(lotto[k]==lotto[j]) {
						j--;
						break;
					}
				}
			}
		}for(int j =0; j<6; j++) {
			System.out.println(lotto[j]+",");
		}
		System.out.println();

	}

}
