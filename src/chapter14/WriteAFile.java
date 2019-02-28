package chapter14;

import java.io.*;
/**
 * String을 텍스트 파일에 저장하기 
 *
 */
public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			
			writer.write("hello foo!");
			
			writer.close();
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
