package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		List<String> list = new ArrayList<>();
		String longName = "";
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >>");
			String name = sc.next();
			list.add(name);
		}
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str+" ");
			if (str.length()>longName.length()) {
				longName=str;
			}
		}
		System.out.println();
//		for (String name : list) {
//			if (name.length()>longName.length()) {
//				longName = name;
//			}
//		}
//		int longestIndex=0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(longestIndex).length()<list.get(i).length()) {
//				longestIndex=i;
//			}
//		}
		System.out.println("가장 긴 이름: "+longName);
	}	
}
