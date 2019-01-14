package chapter09;

public abstract class Animal {
	private String name;  // 모든 동물(하위클래스 포함)에 이름이 있습니다.
	
	public String getName() {  // Hippo에서도 상속하는 게터 메소드 
		return name;
	}
	
	public Animal(String theName) {
		name = theName;		// 이름을 받아서 그 값을 name 인스턴스 변수에 저장하는 생성자 
	}
}
