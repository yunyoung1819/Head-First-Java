package chapter16;

import java.util.HashMap;

public class TestMap2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("spes", 80);
		scores.put("skyler", 90);
		scores.put("young", 90);
		
		System.out.println(scores);
		System.out.println("spes: " + scores.get("spes"));
		System.out.println("skyler: " + scores.get("skyler"));
		System.out.println("young: " + scores.get("young"));
	}
}
