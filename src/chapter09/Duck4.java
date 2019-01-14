package chapter09;

/*
 * 정적 메소드에서는 정적 변수가 아닌 변수(인스턴스 변수)를
 * 쓸 수 없습니다. 
 */
public class Duck4 {
	
	private int size;
	private static int duckCount = 0;
	
	public static void main(String[] args) {
		// System.out.println("Size of duck is " + size);
	}
	
	public Duck4() {
		duckCount++;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	public int getSize() {
		return size;
	}
	
}
