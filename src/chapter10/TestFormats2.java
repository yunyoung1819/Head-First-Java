package chapter10;

/**
 * 포맷 지시자 
 *
 * % [인자 번호] [플래그] [너비] [.정밀도] 유형 
 * 
 * %d : 십진 정수
 * %f : 부동소수점 
 * %x : 16진수 
 * %c : 문자 
 */
public class TestFormats2 {

	public static void main(String[] args) {
		
		String d = String.format("%d", 42);
		String f = String.format("%.3f", 42.000000);
		String x = String.format("%x", 42);
		String c = String.format("%c", 42);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(x);
		System.out.println(c);
		
		int one = 20456654;
		double two = 100567890.248907;
		String s = String.format("The rank is %,d out of %,.2f", one, two);
		
		System.out.println(s);
		
		int firstWin = 50000;
		int secondWin = 30000;
		float thirdWin = 10.000f;
		
		String s1 = String.format("the gold medal is %d, the silver medal is %d, the bronze medal is %.2f", firstWin, secondWin, thirdWin);
		System.out.println(s1);
	}
}
