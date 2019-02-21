package chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout5 {
	public static void main(String[] args) {
		Layout5 gui = new Layout5();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari");
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.NORTH, button);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
