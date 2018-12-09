package chapter02;

class DogTestDrive {
	public static void main(String[] args) {
		// 클래스를 테스트하기 위한 코드 
		Dog d = new Dog(); // Dog 객체를 만든다
		d.size = 40; // 점 연산자(.)를 써서 Dog의 크기를 설정한다
		d.bark();    // bark() 메소드를 호출한다
	}
}
