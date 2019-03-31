package chapter16;

import java.util.ArrayList;

/**
 * 와일드카드 사용 
 *
 */
public class TestGenerics5 {
	public static void main(String[] args) {
		new TestGenerics5().go();
	}
	
	public void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);
	}
	
    public void takeAnimals(ArrayList<? extends Animal> animals) {
    	for(Animal a : animals) {
    		a.eat();
    	}
    	// animals.add(new Cat());  Error!
    }
}
