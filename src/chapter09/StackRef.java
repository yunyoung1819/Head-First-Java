package chapter09;

/**
 * 원시 변수가 아닌 변수에는 객체 자체가 아닌 객체에 대한 레퍼런스가 들어있습니다.
 * 지역 변수가 객체에 대한 레퍼런스인 경우에는 변수(레퍼런스, 즉 리모컨)만 스택에 들어갑니다.
 * 객체 자체는 여전히 힙 안에 있습니다.
 *
 */
public class StackRef {
	public void foof() {
		barf();
	}
	
	public void barf() {
		Duck d = new Duck(24);
	}
}
