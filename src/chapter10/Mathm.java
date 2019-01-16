package chapter10;

/**
 * Math 메소드 
 *
 */
public class Mathm {
	public static void main(String[] args) {
		// Math.random(): 0.0 이상 1.0 미만의 double 값을 리턴합니다.
		double r1 = Math.random();
		int r2 = (int) (Math.random() * 5);

		System.out.println(r1);
		System.out.println(r2);
		
		// Math.abs(): 주어진 인자의 절대값을 나타내는 값을 리턴합니다. 
		// 이 메소드는 오버로드되어있기 때문에 int를 전달하면 int가, double을 전달하면 double이 리턴됩니다.
		int d1 = Math.abs(-240);
		double d2 = Math.abs(240.45);
		
		System.out.println(d1);
		System.out.println(d2);
		
		// Math.min(): 두 인자 중 더 작은 값을 리턴합니다. 
		// 이 메소드는 오버로드되어있기 때문에 int, long, float, double을 모두 사용할 수 있습니다.
		int x1 = Math.min(24, 240);
		double y1 = Math.min(90876.5, 90876.49);
		
		System.out.println(x1);
		System.out.println(y1);
		
		// Math.max(): 두 인자 중 더 큰 값을 리턴합니다. 
		// 이 메소드는 오버로드되어있기 때문에 int, long, float, double을 모두 사용할 수 있습니다.
		int x2 = Math.max(24, 240);
		double y2 = Math.max(90876.5, 90876.49);
		
		System.out.println(x2);
		System.out.println(y2);
	}
}
