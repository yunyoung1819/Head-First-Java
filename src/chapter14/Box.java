package chapter14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 직렬화 
 *
 */
public class Box implements Serializable { // 구현해야하는 메소드는 없지만 'implements Serializable'이라고 하면 JVM에서 이 유형의 객체는 직렬화할 수 있다는 것을 알 수 있습니다.
	
	private int width;
	private int height;  // 이 두 값이 저장됩니다.
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(20);
		
		// 입출력 부분에서 예외를던질 수 있습니다. 
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
