package chapter10;

/**
 * 연필을 깎으며 문제 
 * @author yunyoung
 *
 */
public class TestBox {
	Integer i;
	int j;
	
	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
	}

	public void go() {
		j = i;	// Exception in thread "main" java.lang.NullPointerException
		System.out.println(j);
		System.out.println(i);
	}
}
