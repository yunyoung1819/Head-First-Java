package chapter13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 레이아웃 관리자 : BorderLayout
 * @author : HeadFirst Java
 *
 */
public class Button1 {
	
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click This!");
		Font bigFont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
