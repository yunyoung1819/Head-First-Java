package chapter16;

import java.util.*;

public class TestGenerics4 {
	public static void main(String[] args) {
		new TestGenerics4().go();
	}
	
	public void go() {
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		takeAnimals(dogs);
	}
	
	public void takeAnimals(Animal[] animals) {
		animals[0] = new Cat();  // Error! Dog[]로 선언된 배열에 Cat이 들어가는 문제가 발생!
	}
}
