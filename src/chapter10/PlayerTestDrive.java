package chapter10;

public class PlayerTestDrive {
	public static void main(String[] args) {
		System.out.println(Player.playerCount);
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playerCount); 
		Player two = new Player("Ericson");
		System.out.println(Player.playerCount);
		// 정적변수를 접근할 때에도 정적메소드를 접근할 때와 마찬가지로 클래스명을 사용합니다. 
	}
}
