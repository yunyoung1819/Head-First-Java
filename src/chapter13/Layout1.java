package chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout1 {

	public static void main(String[] args) {
		Layout1 gui = new Layout1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari");
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
