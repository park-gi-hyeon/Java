package Practice;

public class StudentDriver {
	public static void main(String[] args) {
		Student student1 = new Student("", "", "");
		student1.setName("갑돌");
		student1.setNumer("100");
		student1.setDepartment("컴퓨터공학과");
		System.out.println(student1.toString());
		Student student2 = new Student("갑순","200","건축학과");
		System.out.println(student2.toString());
		student2.setDepartment("수학과");
		System.out.println(student2.toString());
	}
}
