package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 주크박스 코드 (정렬 기능 없음)
 * @author headfirst java
 *
 */
public class Jukebox1 {

	ArrayList<String> songList = new ArrayList<String>();
	
	public static void main(String[] args) {
		new Jukebox1().go();
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
	}
	
	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}
}
