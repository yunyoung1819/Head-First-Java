package chapter04;

/**
 * 인스턴스 변수에는 항상 어떤 기본값이 들어갑니다.
 * 인스턴스 변수에 직접 어떤 값을 대입하거나 세터 메소드를 호출하지 않은 경우에도 
 * 그 인스턴스 변수에는 기본값이 들어있습니다. 
 * 정수 0
 * 부동소수점수 0.0
 * 부울 false
 * 레퍼런스 null 
 *
 */
public class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
	}
}
