package Practice;


public class TV {
	String company;
	int year;
	int inchi;
	public TV(String company,int year,int inchi) {
		this.company = company;
		this.year = year;
		this.inchi = inchi;
	}
		void show() {
			System.out.println(company+"에서 만든"+year+"년형"+inchi+"인치 TV");
		
	}
		public static void main(String[] args) {
			TV myTV = new TV("LG",2017,32);
			myTV.show();
		}
}

