package chapter10;

public class Wrappers {
	public static void main(String[] args) {
		// String을 원시값으로 변환하는 방법 
		String s = "2";
		int x = Integer.parseInt(s); // "2"를 2로 파싱할 수 있습니다.
		double d = Double.parseDouble("420.24");
		boolean b = Boolean.parseBoolean("true");
		
		// 원시 숫자를 Stringa으로 변환하는 방법
		double d1 = 42.5;
		String doubleString1 = "" + d1;
		
		double d2 = 42.5;
		String doubleString2 = Double.toString(d2);
	}
}
