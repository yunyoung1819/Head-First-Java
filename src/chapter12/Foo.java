package chapter12;

/**
 * 다른 클래스 안에 들어있는 내부 클래스 사용하기 
 * @author yunyoung
 *
 */
public class Foo {
	public static void main(String[] args) {
		MyOuter outerObj = new MyOuter();
		MyOuter.MyInner innerObj = outerObj.new MyInner();
	}
}
