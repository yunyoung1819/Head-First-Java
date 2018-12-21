package chapter08;

public class MakeCanine {
	public void go() {
		Canine c ;
		c = new Dog();
		// c = new Canine();
		// Canine 클래스는 추상 클래스기 때문에 컴파일러에서 이런 선언문을 허용하지 않습니다. 
		c.roam();
	}
}
