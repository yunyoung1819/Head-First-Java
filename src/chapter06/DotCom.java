package chapter06;

import java.util.ArrayList;

/**
 * DotCom 클래스 
 *
 */
public class DotCom {
	// 배열 대신 string이 들어가는 ArrayList를 사용합니다. 
	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public String checkYourself(String userInput) {	// 새로 바뀐 인자명입니다. 
		String result = "miss";
		// 사용자가 추측한 위치가 ArrayList에 들어있는지 확인합니다. 들어있으면 인덱스 번호가, 그렇지 않으면 -1이 리턴됩니다.
		int index = locationCells.indexOf(userInput);
		// 인덱스가 0 이상이면 사용자가 추측한 위치가 목록에 들어있는 것이므로 제거합니다. 
		if(index >= 0) {
			locationCells.remove(index);
			
			if(locationCells.isEmpty()) { // 목록이 비어있다면 그 닷컴이 죽었다는 것을 알 수 있습니다. 
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}
