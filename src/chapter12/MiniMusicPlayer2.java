package chapter12;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

/**
 * 두번째 버전 : ControllerEvent를 등록하고 받는 방법
 * 
 * @author : HeadFirst Java
 *
 */
public class MiniMusicPlayer2 implements ControllerEventListener {
	
	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	
	public void go() {
		
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
		
			// 이벤트를 시퀀서에 등록합니다. 이 이벤트 등록 메소드에서는 리스너와 필요한 ControllerEvent의 목록을 나타내 
			// int 배열을 인자로 받아들입니다. 여기에서는 127번 이벤트 하나만 필요합니다.
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
			Sequencer seq = new Sequencer(Sequence.PPQ, 4);
			
		} catch(Exception ex) { ex.printStackTrace(); }
	}
	
	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		
	}
	
}
