package chapter09;

/**
 * 생성자 오버로딩 
 * 
 * 생성자 오버로딩을 이용하면 한 클래스에 두 개 이상의 생성자를 만들 수 있습니다. 
 * 이 때 각 생성자의 인자 목록이 서로 다르지 않으면 컴파일이 되지 않습니다. 
 * 
 * 서로 다른 생성자 네 개가 있다는 것은 네 가지의 서로 다른 방법으로
 * 새로운 버섯(Mushroom 객체)을 만들 수 있다는 것을 의미합니다. 
 */
public class Mushroom {

	// 생성자 오버로딩 
	public Mushroom(int size) { }
	
	public Mushroom() { }
	
	public Mushroom(boolean isMagic) { }
	
	public Mushroom(boolean isMagic, int size) { } 
	
	public Mushroom(int size, boolean isMagic) { }
}
