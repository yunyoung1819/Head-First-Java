package chapter12;

/**
 * 간단한 애니메이션 코드 
 *
 */

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

	int x = 70; // 메인 GUI 클래스에 원의 x와 y좌표를 저장하기 위한 인스턴스 변수 두 개를 만듭니다. 
	int y = 70;
	
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		// 애니메이션을 수행하는 부분 
		for(int i = 0; i < 130; i++) {
			x++;
			y++;
			
			drawPanel.repaint();
			
			try {
				Thread.sleep(50);
			} catch(Exception ex) { }
		}
	}
	
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}
	}
}
