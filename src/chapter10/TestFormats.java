package chapter10;

/**
 * 숫자 포매팅 
 * 
 * 숫자를 표기할 때 쉼표를 써서 포매팅하는 방법 
 */
public class TestFormats {
	
	public static void main(String[] args) {
		String s = String.format("%, d", 1000000000);
		System.out.println(s);
	}
}
