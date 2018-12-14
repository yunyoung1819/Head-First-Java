package chapter06;

import java.util.ArrayList;

/**
 * 닷컴(.COM) 가라앉히기 게임
 * 
 * DotCom 클래스 
 *
 */
public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String status = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouch! You sunk " + name + " : (");
			} else {
				status = "hit";
			}
		}
		return status;
	}
}
