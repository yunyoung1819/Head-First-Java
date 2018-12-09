package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 보조 클래스(helper class)
 * 
 * 닷컴(.COM) 가라앉히기 헬퍼 클래스 
 * 
 */
public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			
			if (inputLine.length() == 0) return null;
			
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}
