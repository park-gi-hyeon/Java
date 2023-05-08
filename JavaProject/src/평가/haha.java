package 평가;

public class haha {
	public static String operation(String value) {
		String[] tokens = value.split(" ");
		if (tokens.length !=3) 
			return "잘못된 방식입니다 다시 입력해주세요!";
		
		int num1 = Integer.parseInt(tokens[0]);
		String ope = tokens[1];
		int num2 = Integer.parseInt(tokens[2]);
		int res = 0;
		
		switch (ope) {
		case "+":
			res = num1+num2;
			break;
		case "-":
			res = num1-num2;
			break;
		case "*":
			res = num1*num2;
			break;	
			
		default:
			return "error";
		}
		return Integer.toString(res);
	}
	public static void main(String[] args) {
		String res = "24 + 42";
		System.out.println(operation(res));
	}
}
