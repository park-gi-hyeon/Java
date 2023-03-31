package 평가;

public class Game {
	public static void main(String[] args) {
//		for (int i = 1; i <= 99; i++) {
//			int ten = i/10;
//			int one = i%10;
//			if(ten==3||ten==6||ten==9) {
//				if(one==3||one==6||one==9) {
//					System.out.println(i+" 박수두번");
//				}else{
//					System.out.println(i+" 박수한번");
//				}
//			}else if (one==3||one==6||one==9) {
//				System.out.println(i+" 박수한번");
//			}
//		}
		for (int i = 0; i < 99; i++) {
			int count = 0;
			String game = i+"";
			for (int j = 0; j < game.length(); j++) {
				char a = game.charAt(j);
				if (a=='3'||a=='6'||a=='9') {
					count++;		
				}
			}
			if (count==2) {
				System.out.println(i+" 박수두번");
			}else if(count==1){
				System.out.println(i+" 박수한번");
			}
		}
	}
}




