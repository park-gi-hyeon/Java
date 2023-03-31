package Chapter07;

public class ProductExample {
	public static void main(String[] args) {
		product<Tv, String> product1 = new product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();//new Tv()
		//Chapter07.Tv@5d5eef3d(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvModel = product1.getModel();//스마트TV"
		System.out.println(tvModel);//스마트TV
		
		product<Car, String> product2 = new product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		//Chapter07.Car@6cc4c815(패키지.클래스@해시코드)
		System.out.println(car);
		String carModel = product2.getModel();//디젤
		System.out.println(carModel);//디젤
	}
}
