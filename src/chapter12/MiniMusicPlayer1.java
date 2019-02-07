package chapter12;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * 
 * MiniMusicPlayer1
 * 
 * 쭉 올라가는 음 15개 연주하기 
 * 
 * @author: HeadFirstJava
 */
public class MiniMusicPlayer1 {

	public static void main(String[] args) {
		
		try {
			
			// 시퀀서를 만들고 엽니다.
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			// 시퀀스와 트랙을 하나씩 만듭니다.
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			// 음이 올라가는 순서대로 이벤트 여러개를 만듭니다.(피아노로 5번 음에서 61번 음까지)
			for(int i = 5; i < 61; i += 4) {
				track.add(makeEvent(144,1,i,100,i));
				track.add(makeEvent(128,1,i,100,i+2));
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) { ex.printStackTrace(); }
	}

	// 메시지를 만들기 위한 인자 네개, 메시지가 언제 실행돼야하는지를 나타내는 숫
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			// 메소드 매개변수를 써서 메시지와 이벤트를 만듭니다. 
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		}catch (Exception e) { }
		return event; // 이벤트를 리턴합니다(메시지가 모두 들어있는 MidiEvent)
	}
}
