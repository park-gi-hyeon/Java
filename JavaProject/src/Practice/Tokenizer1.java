package Practice;

import java.util.StringTokenizer;

public class Tokenizer1 {
	public static void main(String[] args) {
		String input = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer token = new StringTokenizer(input, "/");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
