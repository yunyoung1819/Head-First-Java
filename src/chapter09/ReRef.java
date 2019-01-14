package chapter09;

/** 
 * 객체를 제거하는 3가지 방법
 * 1. 레퍼런스가 영원히 영역을 벗어납니다.
 * 2. 레퍼런스에 다른 객체를 대입합니다.
 * 3. 레퍼런스를 직접 null 로 설정합니다.
 *
 */
public class ReRef {
	
	Duck d = new Duck();
	
	public void go() {
		// d = new Duck();
		d = null;
	}
}
