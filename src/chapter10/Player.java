package chapter10;

/**
 * 정적 변수 초기화 
 * 1. 정적 변수는 그 클래스에 속하는 객체가 생성되기 전에 초기화 
 * 2. 정적 변수는 그 클래스에 속하는 정적 메소드가 실행되기 전에 초기화 
 */
public class Player {
	static int playerCount = 0;	// 클래스가 로딩되면 playerCount가 초기화 됩니다. 
	private String name;
	
	public Player(String n) {
		name = n;
		playerCount++;
	}
	
}
