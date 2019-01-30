package chapter11;

public class Washer {
	Laundry laundry = new Laundry();
	
	public void foo() throws ClothingException {
		System.out.println("foo 실행");
		laundry.doLaundry();
	}
	
	public static void main(String[] args) throws ClothingException {
		System.out.println("main 실행");
		Washer a = new Washer();
		a.foo();
	}
	
}
