package chapter08;

public class Dog extends Canine implements Pet {

	public void makeNoise() {
		System.out.println("멍멍!");
	}
	
	public void eat() {
		System.out.println("개");
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}
