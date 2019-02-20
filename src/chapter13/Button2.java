package chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * BorderLayout
 *
 */
public class Button2 {

	public static void main(String[] args) {
		Button2 gui = new Button2();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		
		JButton east = new JButton("동쪽");
		JButton west = new JButton("서쪽");
		JButton north = new JButton("북쪽");
		JButton south = new JButton("남쪽");
		JButton center = new JButton("중앙");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
