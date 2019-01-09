package chapter09;

public class TestDuck {
	public static void main(String[] args) {
		
		int weight = 8;
		float density = 2.3F;
		String name = "Donald";
		long[] feathers = {1,2,3,4,5,6};
		boolean canFly = true;
		int airspeed = 22;
		
		Duck3[] d = new Duck3[7];
		
		d[0] = new Duck3();
		d[1] = new Duck3(density, weight);
		d[2] = new Duck3(name, feathers);
		d[3] = new Duck3(canFly);
		d[4] = new Duck3(3.3F, airspeed);
		d[5] = new Duck3(false);
		d[6] = new Duck3(airspeed, density);
	}
}
