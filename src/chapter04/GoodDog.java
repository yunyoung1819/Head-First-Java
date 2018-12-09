package chapter04;

/**
 * Dog 클래스 캡슐화 
 *
 */
class GoodDog {
	private int size;	// 인스턴스 변수를 private로 만듭니다.
	
	// 게터와 세터 메소드는 public으로 만듭니다.
	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	void bark() {
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}
