package chapter09;

/**
 * 생성자 
 *
 */
public class Duck {
	int size;	// 인스턴스 변수 
	
	public Duck(int duckSize) {		 // Duck 생성자에 int 매개변수를 추가합니다. 
		System.out.println("Quack"); // 생성자 코드 
		
		size = duckSize;	// 인자값을 이용하여 size 인스턴스 변수를 설정합니다. 
		
		System.out.println("size is " + size);
	}
}
