package chapter13;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 * JTextField와 달리 JTextArea에는 여러 행의 텍스트가 들어갈 수 있습니다.
 *
 */
public class JTextArea1 {
	
	public static void main(String[] args) {
		// 생성자
		JTextArea text = new JTextArea(10, 20);
		
		// 수직 스크롤바를 만듭니다 
		JScrollPane scroller = new JScrollPane(text); // JScrollPane을 만들고 그 객체에 스크롤 기능을 추가해야 하는 텍스트 영역을 전달
		text.setLineWrap(true); // 행 넘기기 기능을 켭니다
		
		// 스크롤 틀에 수직 방향의 스크롤 바만 집어넣도록 지시 
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// panel.add(scroller);
		
		// 그 안에 있는 텍스트를 바꿉니다
		text.setText("Not add who are lost are wandering");
		
		// 텍스트를 추가합니다
		text.append("button clicked");
		
		// 필드에 들어있는 텍스트를 선택/강조합니다
		text.selectAll();
		
		// 커서를 다시 필드에 위치시킵니다(그래야 사용자가 바로 타이핑을 할 수 있습니다)
		text.requestFocus();
	}
}
