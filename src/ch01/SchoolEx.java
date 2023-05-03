package ch01;

public class SchoolEx {

	public static void main(String[] args) {
		School school1 = new School();
		System.out.println("school1.name" + school1.name);
		School school2 = new School("김자바");
		System.out.println();
		System.out.println("school2.name" + school2.name);
		System.out.println("school2.student" + school2.student);
		System.out.println();
		School school3 = new School("박자바","자바선생님");
		System.out.println("school3.name" + school3.name);
		System.out.println("school3.student" + school3.student);
		System.out.println("school3.teacher" + school3.teacher);
		System.out.println();
		School school4 = new School("홍자바","파이썬선생님",2);
		System.out.println("school4.name" + school3.name);
		System.out.println("school4.student" + school4.student);
		System.out.println("school4.teacher" + school4.teacher);
		System.out.println("school4.teacher" + school4.teacher);
		System.out.println("school4.num : " + school4.num);
	}

}
