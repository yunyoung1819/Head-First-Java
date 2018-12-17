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
		
	}
}
