package chapter02;

public class Player {

	public int number = 0; // 찍은 숫자를 저장할 변수 
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("찍은 숫자: " + number);
	}
}
