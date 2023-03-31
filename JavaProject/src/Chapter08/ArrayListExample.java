package Chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //2번 인덱스에 삽입되어서 2번이 밀려남=>3:Servlet/JSP
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 list 갯수: "+size);//총 list 갯수: 5
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: "+skill);//2번째 인덱스: Database
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); //list.get(0):"Java"...
			/*
			0: java
			1: jDBC
			2: Database
			3: Servlet/JSP
			4: Spring
			*/
			System.out.println(i+": "+str);
		}
		list.remove(2); //인덱스로 객체 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
