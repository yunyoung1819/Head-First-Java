package chapter05;

/**
 * SimpleDotCom 클래스 
 * 
 * 닷컴(.COM) 가라앉히기 닷컴 클래스 
 * 
 */
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for(int i = 0; i < locationCells.length; i++) {
			if(guess == locationCells[i]) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
