package chapter08;

public class AnimalTestDrive {
	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog();
		Cat c = new Cat();
		list.add(a);
		list.add(c);
		
		// Object 클래스의 주요 네가지 메소드 
		// equals(Object o) 두 객체를 같은 것으로 볼 수 있을지 판단하는 메소드 
		Dog b = new Dog();
		Cat d = new Cat();
		
		if (b.equals(d)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// getClass() 어떤 클래스의 인스턴스인지 알 수 있도록 그 객체의 클래스를 리턴
		Cat e = new Cat();
		System.out.println(e.getClass());
		
		// hashCode() 그 객체에 해당하는 해시코드(고유 ID)를 출력 
		Cat f = new Cat();
		System.out.println(f.hashCode());
		
		// toString() 클래스명과 몇 가지 별로 잘 쓰이지 않는 숫자가 포함된 String 메시지를 출력 
		Cat g = new Cat();
		System.out.println(g.toString());
	}
}
