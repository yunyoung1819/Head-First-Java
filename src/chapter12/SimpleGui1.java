package chapter12;

import javax.swing.*;	// 이 스윙 패키지는 반드시 불러와야 합니다. 

public class SimpleGui1 {
	public static void main(String[] args) {
		// 프레임과 버튼을 만듭니다. 
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이렇게하면 창을 닫았을 때 프로그램이 바로 종료됩니다.
		
		frame.getContentPane().add(button); // 버튼을 프레임의 내용 틀(content pane)에 추가합니다.
		
		frame.setSize(300, 300); // 프레임의 크기를 픽셀 단위로 지정합니다.
		
		frame.setVisible(true);  // 마지막으로 화면에 표시되도록 설정합니다. 
	}
}
