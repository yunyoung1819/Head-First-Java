package chapter13;

import java.awt.event.ItemEvent;

import javax.swing.JCheckBox;

// JCheckBox
public class JCheckBox1 {
	public static void main(String[] args) {
		// 생성자 
		JCheckBox check = new JCheckBox("Goes to 11");
		// 아이템 이벤트(선택 또는 선택 해제하는 이벤트)를 감시합니다
		// check.addItemListener(this);
		
		// 이벤트를 처리합니다(선택 여부를 알아냅니다)
		/*
		public void itemStateChanged(ItemEvent ev) {
			String onOrOff = "off";
			if(check.isSelected()) onOrOff = "on";
			System.out.println("Check box is " + onOrOff);
		}
		*/
		
		// 코드에서 선택 또는 선택 해제를 처리합니다
		check.setSelected(true);
		check.setSelected(false);
	}
}
