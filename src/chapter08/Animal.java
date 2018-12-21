package chapter08;

/**
 * 상속 
 *
 * Animal 클래스 
 *
 */
public class Animal {
	
	private String picture;
	private String food;
	private int hunger;
	private int[] boundaries;
	private int[] location;
	
	public void makeNoise() {
		// 동물이 소리를 낼 때의 행동 
		System.out.println("울음소리를 낸다.");
	}
	
	public void eat() {
		// 그 동물이 음식을 접했을 때의 행동 
		System.out.println("음식을 먹는다.");
	}
	
	public void sleep() {
		// 그 동물이 잠들어 있을 때의 행동
		System.out.println("잠을 잔다.");
	}
	
	public void roam() {
		// 그 동물이 먹거나 자고 있지 않을 때의 행동 
		System.out.println("어슬렁거린다.");
	}
}
