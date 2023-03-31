package Chapter05;
/*
 * instanceof 연산자 사용(상속)
 */
class Person{}
class Studet extends Person{}
class Researcher extends Person{}
class Professor extends Person{}
public class InstanceofEx {
	static void print(Person p) {//Person p = new Student()->업캐스팅
		if (p instanceof Person) { //학생,연구원,교수, 객체가 사람이냐
			System.out.print("Person "); //참이면 출력
		}
		if (p instanceof Studet) { //학생 객체가 학생이냐
			System.out.print("Studet "); //참이면 출력
		}
		if (p instanceof Researcher) { //학생 객체가 연구원이냐
			System.out.print("Researcher "); //참이면 출력
		}
		if (p instanceof Professor) { //학생 객체가 교수냐
			System.out.print("Researcher "); //참이면 출력
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Studet()->\t"); print(new Studet());
		System.out.print("new Researcher()->\t"); print(new Researcher());
		System.out.print("new Professor()->\t"); print(new Professor());
	}
}
