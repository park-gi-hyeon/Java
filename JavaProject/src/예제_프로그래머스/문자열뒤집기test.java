package 예제_프로그래머스;
public class 문자열뒤집기test {
	public static void main(String[] args) {
        String my_string = "안녕하세용";
		String answer = "";
        
        String a = new StringBuffer(my_string).reverse().toString();
        answer =a ;
        
        System.out.println(answer);
	}
}
