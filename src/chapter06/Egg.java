package chapter06;

import java.util.ArrayList;

public class Egg {
	public static void main(String[] args) {
		// 새로 만듭니다.
		ArrayList<Egg> myList = new ArrayList<Egg>();
		// 뭔가를 집어넣습니다. 
		Egg s = new Egg();
		myList.add(s);
		// 다른 것을 또 집어넣습니다. 
		Egg b = new Egg();
		myList.add(b);
		// 몇 개가 들어가 있는지 알아냅니다. 
		int theSize = myList.size();
		System.out.println("size: " + theSize);
		// 어떤 것이 안에 들어있는지 찾아냅니다.
		boolean isIn = myList.contains(s);
		System.out.println("isIn: " + isIn);
		// 어떤 것의 위치(즉 인덱스)를 찾아냅니다.
		int idx = myList.indexOf(b);
		System.out.println("idx: " + idx);
		// 비어있는지 확인합니다.
		boolean empty = myList.isEmpty();
		System.out.println("empth : " + empty);
		// 목록에 들어있는 것을 제거합니다.
		myList.remove(s);
		System.out.println("size: " + myList.size());
	}
}
