package 정리;

public class while문십의자리쪼개기 {

	public static void main(String[] args) {
		int num = 123;
		int one = num%10;
//		System.out.println(one);
		int ten= (num%100)/10;
//		System.out.println(ten);
		
		int i = 10; //
		while(i<=150) {
			
			one = i%10;
			ten = (i%100)/10;
			
		if(one==ten) {
			System.out.println(i);
			
		}
		i++;

		
	}

}
}