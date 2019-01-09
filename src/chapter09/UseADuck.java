package chapter09;

public class UseADuck {

	public static void main(String[] args) {
		Duck d = new Duck(42);	  // Duck 생성자를 호출합니다. 
		Duck2 d1 = new Duck2(15); // 크기를 알고 있는 상태에서 Duck을 만들 때
		Duck2 d2 = new Duck2();	  // 크기를 모르는 상태에서 Duck을 만들 때 
	}
}
