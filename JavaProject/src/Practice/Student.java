package Practice;

public class Student {
	private String Name;
	private String Number;
	private String Department;
	
	public Student(String Name, String Number, String Department) {
		this.Name = Name;
		this.Number = Number;
		this.Department = Department;
	}
	public String getName() {
		return Name;
	}
	 public void setName(String Name) {
	        this.Name = Name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumer(String Number) {
        this.Number = Number;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
        this.Department = Department;
	}
	public String toString() {
		return "이름: "+getName()+"\n"+ "학번 : "+getNumber()+"\n"+"소속학과: "+getDepartment();
	}
}
