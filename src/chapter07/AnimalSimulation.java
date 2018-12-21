package chapter07;


/**
 * 동물 시뮬레이션 프로그램 
 *
 */
public class AnimalSimulation {
	
	public static void main(String[] args) {
		
		Wolf w = new Wolf();
		
		w.makeNoise();
		w.roam();
		w.eat();
		w.sleep();
		
		// 다형성 
		Animal[] animals = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Wolf();
		animals[3] = new Hippo();
		animals[4] = new Lion();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].eat();
			animals[i].roam();
		}
	}
}
