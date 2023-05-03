package ch01;

public class School {
	String name = "자바스쿨";
	String student;
	String teacher;
	int num;
	
	School(){}
	School(String student){
			this(student,null,0);
		}
	School(String student,String teacher){
		this(student, teacher, 0);
	}
	School(String student,String teacher, int num){
		this.student = student;
		this.teacher = teacher;
		this.num = num;
		
	}
}
