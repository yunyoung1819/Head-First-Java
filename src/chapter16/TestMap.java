package chapter16;

import java.util.HashMap;

/**
 * Map 
 * @author headfirst java
 *
 */
public class TestMap {
	
	public static void main(String[] args) {
		// HashMap을 쓸 때는 매개변수가 두 개 필요합니다. 첫번째는 키 유형을, 두번째는 값 유형을 나타냅니다. 
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Kathy", 42);  // add() 대신 put()을 사용합니다. 인자도 두 개(키, 값)를 전달합니다. 
		scores.put("Bert", 343);
		scores.put("Skyler", 420);
		
		System.out.println(scores);
		System.out.println(scores.get("Bert"));
	}

}
