package chapter11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();  // 위험한 부분은 'try' 블록에 넣습니다. 
			System.out.println("Successfully got a sequencer");
		}  catch(MidiUnavailableException ex) {  // 예외적인 상황이 일어났을 때 할 일을 지정하기 위한 'catch' 블록을 만듭니다.
			System.out.println("Bummer");
		}
	}
	
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}
