package ch01;

public class School2 {
	String name;
	int maxNum;
	
	School2(String name, int maxNum){
		this.name = name;
		this.maxNum = maxNum;
	}
	void teach(String student) {
		System.out.println(student + "학생이 학교에 옵니다.");
	}
	void teach(String student, String teacher) {
		System.out.println(teacher+ "께서" + student + "학생을 지도합니다.");
	}

}
