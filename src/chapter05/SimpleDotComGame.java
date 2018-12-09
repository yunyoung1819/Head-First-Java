package chapter05;

/**
 * SimpleDotComGame
 * 
 * 닷컴(.COM) 가라앉히기 게임 클래스 
 */
public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;	// 사용자가 추측한 횟수를 추적하기 위한 변수를 만듭니다. 
		// 일단 사용자로부터 입력을 받기 위한 메소드가 들어있는 특별한 클래스가 있다고 생각합시다.
		GameHelper helper = new GameHelper();	
		SimpleDotCom theDotCom = new SimpleDotCom(); // 닷컴 객체를 만듭니다.
		
		int randomNum = (int) (Math.random() * 5);   // 첫번째 셀 위치를 정하기 위한 난수를 만들고 그 갓ㅂ을 써서 셀 위치 배열을 만듭니다.
		int[] locations = {randomNum, randomNum+1, randomNum+2}; 
		theDotCom.setLocationCells(locations); // 닷컴의 위치를 지정합니다. (배열 사용)
		boolean isAlive = true; // 닷컴이 살아있는지 추적하기 위한 부울 변수를 만들고 아직 살아있으면 계속 반복합니다.
		
		while(isAlive = true) {
			String guess = helper.getUserInput("enter a number"); //사용자가 입력한 String을 받아옵니다.
			String result = theDotCom.checkYourself(guess);
			// 닷컴 객체를 통해 추측한 값이 맞는지 확인합니다. 리턴된 결과는 String에 저장합니다. 
			numOfGuesses++;	// 추측 횟수를 증가시킵니다. 
			
			if(result.equals("kill")) { //"kill"이면 isAlive를 false로 설정합니다.
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
