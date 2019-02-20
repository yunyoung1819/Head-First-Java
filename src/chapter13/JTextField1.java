package chapter13;

import javax.swing.JTextField;

public class JTextField1 {

	public static void main(String[] args) {
		//생성자 
		JTextField field1 = new JTextField(20);
		JTextField field2 = new JTextField("your name");
		
		// 텍스트 필드에 들어있는 텍스트를 알아내는 방법
		System.out.println(field1.getText());
		
		// 텍스트를 집어넣는 방법
		field1.setText("whatever");
		field1.setText("");	// 이렇게 하면 필드에 들어있는 것을 지울 수 있습니다.
		
		// 사용자가 리턴 또는 엔터 키를 눌렀을 때 ActionEvent를 받아옵니다.
		// field1.addActionListener(myActionListener);
		
		// 필드에 들어있는 텍스트를 선택/강조합니다
		field1.selectAll();
		
		// 커서를 필드로 돌려놓습니다 (사용자가 타이핑을 시작할 수 있게 말이죠)
		field1.requestFocus();
		
		
	}
}
