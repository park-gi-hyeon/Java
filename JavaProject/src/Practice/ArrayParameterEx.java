package Practice;

import org.omg.CORBA.IRObject;

public class ArrayParameterEx {
//	public void printStringArry(String[] str) {
//		String arr = String.join(" ", str);
//		System.out.println(arr);
//	}
//	public void replaceBe(String[] str) {
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals("be")) {
//				str[i] = "eat";
//			}
//		}
//	}
//	public static void main(String[] args) {
//		String[] str = {"to","be","not","to","be"};
//		ArrayParameterEx par = new ArrayParameterEx();
//		par.printStringArry(str);
//		par.replaceBe(str);
//		par.printStringArry(str);
		static void replaceBe(String a[]) {
			for (int i = 0; i < a.length; i++) {
				if (a[i].equals("be")) {
					a[i]="eat";
				}
			}
		}
		static void printStringArray(String a[]) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
		public static void main(String[] args) {
		String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
}
