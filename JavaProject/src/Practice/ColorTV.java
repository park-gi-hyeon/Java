package Practice;

class TVS{
	private int size;
	
	public TVS(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
public class ColorTV extends TVS{
//	private int size;
//	private int color;
	public int color;
	
//	protected int getColor() {
//		return color;
//	}
	
	public ColorTV(int size, int color) {
//		this.size = size;
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}
