package chapter12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  // ActionListener와 ActionEvent가 들어있는 패키지를 사용하기 위한 import 선언문 

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 버튼의 ActionEvent를 받는 방법 
 * 
 * 1. ActionListener 인터페이스를 구현합니다.
 * 2. 버튼에 등록합니다 (이벤트가 생기면 알려달라고 말합니다).
 * 3. 이벤트 처리 메소드를 등록합니다. (ActionListener 인터페이스의 actionPerformed() 메소드를 구현합니다).
 *
 */
public class SimpleGui1B implements ActionListener { // 인터페이스를 구현합니다. 이 구문은 "SimpleGui1B의 인스턴스는 ActionListener임"이라는 것을 뜻합니다. 
	JButton button;
	
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		button.addActionListener(this); // 버튼에 등록합니다. 이때 전달하는 인자ㅏ는 반드시 ActionListener를 구현한 클래스의 객체여야 합니다. 
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	
	// ActionListener의 인터페이스의 actionPerformed() 메소드를 구현합니다. 이 메소드가 바로 실제 이벤트를 처리하는 메소드 입니다. 
	@Override
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
	
}
