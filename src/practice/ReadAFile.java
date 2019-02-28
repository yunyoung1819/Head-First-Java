package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 파일 읽어오
 *
 */
public class ReadAFile {
	public static void main(String[] args) {
		
		try {
			File mfile = new File("Foo.txt");
			FileReader reader = new FileReader(mfile);
			BufferedReader breader = new BufferedReader(reader);
			
			String line = null;
			while((line = breader.readLine()) != null) {
				System.out.println(line);
			}
			breader.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
