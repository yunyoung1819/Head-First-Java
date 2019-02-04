package chapter12;

/** 
 * 내부 클래스(inner class)
 * @author yunyoung
 *
 */
public class MyOuter {
	
	private int x;	// 외부 클래스에 'x'라는 private로 지정한 인스턴스 변수가 있습니다. 
	
	MyInner inner = new MyInner(); // 내부 클래스의 인스턴스를 만듭니다. 
	
	public void doStuff() {
		inner.go();	// 내부 클래스의 메소드를 호출합니다. 
	}
	
	class MyInner {
		void go() {
			x = 42; // 내부 클래스에 있는 메소드에서는 외부 클래스의 인스턴스 변수인 'x'를 그냥 자기 객체 안에 들어있는 변수와 마찬가지로 사용할 수 있습니다. 
		}
	}
}
