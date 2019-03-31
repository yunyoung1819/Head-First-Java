package chapter16;

import java.util.*;

public class TestGenerics1 {
	public static void main(String[] args) {
		new TestGenerics1().go();
	}
	
	public void go() {
		// Dog 객체와 Cat 객체가 섞여있는 Animal 배열을 선언하고 생성합니다.
		Animal[] animals = {new Dog(), new Cat(), new Dog()};
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};  // Dog만 들어있는 Dog 배열을 만듭니다. 
		takeAnimals(animals); // takeAnimals() 메소드를 호출합니다. 위에서 만든 두 배열을모두 인자로 전달합니다.
		takeAnimals(dogs);
	}
	
	public void takeAnimals(Animal[] animals) {  // Dog는 Animal이기 때문에 takeAnimal() 메소드에서는 Animal[]이나 Dog[] 모두 인자로 받아들일 수 있습니다. 다형성의 승리죠. 
		for(Animal a : animals) {
			a.eat();
		}
	}
	
}
