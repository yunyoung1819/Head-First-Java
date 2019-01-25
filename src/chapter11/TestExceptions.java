package chapter11;

/**
 * 예외 처리 
 *
 */
public class TestExceptions {
	
	public static void main(String[] args) {
		
		String test = "예";
		try {
			System.out.println("try 블록 시작");
			doRisky(test);
			System.out.println("try 블록 끝");
		} catch (ScaryException se) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("finally 블록");
		}
		System.out.println("main 끝");
	}

	static void doRisky(String test) throws ScaryException {
		// TODO Auto-generated method stub
		System.out.println("위험한 메소드 시작");
		if("예".equals(test)) {
			throw new ScaryException();
		}
		System.out.println("위험한 메소드 끝");
		return;
		
	}
}
