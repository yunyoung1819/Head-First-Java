package chapter09;

public class Hippo extends Animal {
	
	public Hippo(String name) {	// Hippo 생성자에서도 이름을 받아들입니다. 
		super(name);	// 스택 바로 위로 올라가는 Animal 생성자로 이름을 보냅니다. 
	}
}
