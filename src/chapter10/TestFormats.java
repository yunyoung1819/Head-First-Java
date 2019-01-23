package chapter10;

/**
 * 숫자 포매팅 
 * 
 * 숫자를 표기할 때 쉼표를 써서 포매팅하는 방법 
 */
public class TestFormats {
	
	public static void main(String[] args) {
		String s = String.format("%, d",1000000000);
		String s1 = String.format("I have %.2f bugs to fix.", 476578.09876);
		String s2 = String.format("I have %,.2f bugs to fix.", 476578.09876);
		String s3 = String.format("I have %.2f, bugs tp fix.", 476578.09876);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
