package Practice;

public class IPTV extends ColorTV{
	private String address;
	public IPTV(String address, int size, int color) {
		super(size,color);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+address+"주소의"+getSize()+"인치 "+color+"컬러");
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("1992.1.1.2",32,2048);
		iptv.printProperty();
	}
}
