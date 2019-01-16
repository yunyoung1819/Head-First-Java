package chapter10;

/**
 * final 로 지정된 정적 변수를 초기화하는 방법 
 * 
 * 2. 정적 초기화 부분에서 초기화하는 방법 
 */
public class Bar {
	public static final double BAR_SIGN;
	
	static {
		BAR_SIGN = (double) Math.random();
	}
}
