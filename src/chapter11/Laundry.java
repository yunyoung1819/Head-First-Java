package chapter11;

public class Laundry {

	public void doLaundry() throws ClothingException {
		System.out.println("doLaundry 실행");
		throw new ClothingException();
	}

}
