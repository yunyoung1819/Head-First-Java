package chapter06;

import java.util.ArrayList;

/**
 * 닷컴(.COM) 가라앉히기 게임
 * 
 * DotCom 클래스 
 *
 */
public class DotCom {
	// DotCom의 인스턴스 변수 
	private ArrayList<String> locationCells; // 셀 위치가 들어있는 ArrayList
	private String name;					 // DotCom의 이름
	
	public void setLocationCells(ArrayList loc) {	// DotCom의 위치를 갱신하는 세터 메소
		locationCells = loc;
	}
	
	public void setName(String n) {	// 기초적인 세터 메소드 
		name = n;
	}
	
	// ArrayList의 indexOf() 메소드를 쓰고 있습니다.
	// 사용자가 추측한 위치가 ArrayList에 들어있으면 indexOf()에서 그 항목의 인덱스를 리턴합니다.
	// 그렇지 않으면 -1을 리턴합니다. 
	public String checkYourself(String userInput) {
		String status = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			} else {
				status = "hit";
			}
		}
		return status; 	// 'miss', 'hit' 또는 'kill'을 리턴합니다. 
	}
}
