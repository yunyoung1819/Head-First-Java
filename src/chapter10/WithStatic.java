package chapter10;

/** 정적 임포트(static import)
 * 
 * 기본 개념은 정적 클래스, 정적 변수, enum 값 등을 사용할 때 정적 임포트를 활용해서 타이핑을 더 적게 해보자는 것.
 * 이 기능의 가장 큰 단점은 (조심하지 않으면) 코드를 읽기가 훨씬 어려워질 수 있다는 
 */
import static java.lang.System.out;  // 정적 임포트는 이런 식으로 선언합니다.
import static java.lang.Math.*;

public class WithStatic {
	public static void main(String[] args) {
		out.println("sqrt " + sqrt(2.0));	// 정적 임포트를 활용한 부분 
		out.println("tan " + tan(60));
	}
}
