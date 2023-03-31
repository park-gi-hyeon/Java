package Chapter04;

public class Book2 {
//	("어린왕자","생텍쥐베리")저장
//		6.멤버 저장
//		f.멤버 저장
	String title; //"춘향전"
	String author; 
//	4.생성자 호출됨
//	d.생성자 호출됨
	public Book2(String title, String author) {
//		매개 변수를 this 자기자신의 객체 멤버로 저장
//		5.멤버 저장
//		e.멤버 저장
		this.title = title; //"춘향전"
		this.author = author; //"작자미상"
	}
//	2.생성자 호출됨
	public Book2(String title) {
//		3.this로 생성자 호출
		this(title, "작자미상");
	}
//	b.생성자 호출됨
	public Book2() {
//		c.this로 생성자 호출
		this("",""); //첫번째 라인에 안오면 오류 발생
		System.out.println("생성자 호출됨");
	}
	void show() {
		System.out.println(title+" "+author);
	}
	public static void main(String[] args) {
		Book2 littlePrice = new Book2("어린왕자","생텍쥐베리");
//		1.객체 생성하면서 생성자 호출
		Book2 loveStory = new Book2("춘향전");
//		a.객체 생성하면서 생성자 호출
		Book2 emptyBook = new Book2();
		
		
		//System.out.println(littlePrice.title+" "+littlePrice.author);
//		System.out.println(loveStory.title+" "+loveStory.author);
//		System.out.println(emptyBook.title+" "+emptyBook.author);
		littlePrice.show();
		loveStory.show();
		emptyBook.show();
	}
}
