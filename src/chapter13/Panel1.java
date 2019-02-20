package chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * FlowLayout
 *
 */
public class Panel1 {

	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		
		panel.add(button);
		panel.add(buttonTwo);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
