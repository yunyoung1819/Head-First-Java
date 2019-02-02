package chapter12;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; // Graphics에는 없고 Graphics2D에만 있는 것을 호출하려면 캐스트해야 합니다. 
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor); // 시작점, 시작하는 색, 끝점, 끝나는 색 
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100); // fillOval() 메소드는 '현재 페인트브러시로 지정된 것(여기서는 그래디언트)으로 타원을 채우는 메소드 입니다. 
	}
	
}
