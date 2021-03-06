package chapter11;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * 첫번째 사운드 애플리케이션 
 * 
 * 피아노로 한 음을 연주하는 것을 들을 수 있다. 
 *
 */
public class MiniMiniMusicApp {
	
	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}
	
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();	//Sequencer를 받아서 엽니다. 
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();	// Sequence에 Track을 요청합니다. 
			
			// Track에 MidiEvent를 집어넣습니다. 
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq); // Sequencer에 Sequence를 보냅니다. 
			
			player.start(); // Sequencer의 start() 메소드를 호출합니다. 
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
