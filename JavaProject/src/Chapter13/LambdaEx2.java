package Chapter13;

interface MyFuction2{
	int cal(int x);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		MyFuction2 square = x->x*x;
		System.out.println(square.cal(2));
	}
}
