package chapter09;

public class Mini extends Car {

	Color color;
	
	// 인자가 없는 생성자에서는 기본 색을 지정하여 오버로드된 
	// 진짜 생성자(super()를 호출하는 생성자)를 호출합니다.
	public Mini() {
		this(Color.red);
	}
	
	// 이게 바로 객체를 초기화하는 일(super() 호출 과정 포함)을
	// 실제로 처리하는 진짜 생성자입니다. 
	public Mini(Color c) {
		super("Mini");
		color = c;
		/// 나머지 초기화 코드 
	}
}
