package chapter12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 버튼을 클릭할 때마다 원의 색이 바뀝니다. 
 *
 */
public class SimpleGui3C implements ActionListener {

	JFrame frame;
	
	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change Colors");
		button.addActionListener(this);	// 리스너(this)를 버튼에 추가합니다. 
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);	// 위젯(버튼과 그림
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}
