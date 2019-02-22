package chapter14;

import java.io.Serializable;

public class Chat implements Serializable {
	
	transient String currentID; // 직렬화하는 과정에서 어떤 인스턴스 변수를 건너뛰고 싶다면 해당 변수에 transient 키워드를 써서 표시함 
	
	String userName;
}
