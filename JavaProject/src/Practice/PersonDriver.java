package Practice;

import java.util.Scanner;

public class PersonDriver extends Person{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하세요");
		String lname = sc.next();
		System.out.print("이름을 입력하세요");
		String fname = sc.next();
		Person person1 = new Person(lname,fname);
		System.out.print("성: "+person1.getLastName());//성
		System.out.print(" 이름: "+person1.getFirstName());
		System.out.println(" 성명의 길이: "+person1.getLength());
		System.out.print("성을 입력하세요");
		lname = sc.next();
		System.out.print("이름을 입력하세요");
		fname = sc.next();
		Person person2 = new Person(lname,fname);
		System.out.print("성: "+person2.getLastName());//성
		System.out.print(" 이름: "+person2.getFirstName());
		System.out.println(" 성명의 길이: "+person2.getLength());
		sc.close();
	}
}
