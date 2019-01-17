package chapter10;

import java.util.ArrayList;

/**
 * 자바 5.0부터 도입된 오토박싱(autoboxing)은 원시값과 래퍼 객체 사이의 변환을 
 * 자동으로 처리해주는 기능입니다. 
 *
 */
public class AutoBoxing {
	
	public void doNumsNewWay() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(); // Integer 유형의 ArrayList
		listOfNumbers.add(3);
		// ArrayList에는 add(int)메소드가 없지만 컴파일러가 알아서 감싸는 작업(박싱(boxing))을 처리해줍니다.
		int num = listOfNumbers.get(0);
		// 컴파일러에서 Integer 객체의 포장을 자동으로 풀어주기 때문에 언박싱(unboxing) 
		// Integer 객체의 intValue() 메소드를 호출하지 않아도 int값을 바로 원시변수에 대입할 수 있습니다. 
	}
	
}
