package chapter05;

/**
 * SimpleDotComTestDrive
 * 
 * 닷컴(.COM) 가라앉히기 게임 테스트 코드 
 *
 */
public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();	// SimpleDotCom 클래스의 인스턴스를 만듭니다.
		// 닷컴의 위치를 나타내기 위한 int 배열을 만듭니다 (0에서 6까지의 숫자 가운데 연속된 정수 세 개)
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);	// 닷컴에 대해 세터 메소드를 호출합니다. 
		
		String userGuess = "2"; 					  // 사용자가 추측한 위치 역할을 할 가짜 값을 만듭니다.
		String result = dot.checkYourself(userGuess); // 닷컴 객체에 대해 checkYourself() 메소드를 호출하고 그 메소드에 가짜값을 전달합니다.
		/* String testResult = "failed";
		
		if(result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult); */
	}
}
