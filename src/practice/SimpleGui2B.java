package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Button Click Event
 * @author yunyoung
 *
 */
public class SimpleGui2B implements ActionListener {
	JButton button;
	
	public static void main(String[] args) {
		SimpleGui2B gui = new SimpleGui2B();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("버튼을 클릭하세요.");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(150, 150);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("이 버튼은 클릭되었습니다.");
	}

}
