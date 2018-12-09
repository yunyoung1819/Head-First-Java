package chapter04;

/**
 * 인스턴스 변수를 초기화하지 않은 상태에서 게터 메소드를 호출하기 
 * 초기화하기 전의 인스턴스 변수의 값 확인하기 
 *
 */
class PoorDog {
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
}
