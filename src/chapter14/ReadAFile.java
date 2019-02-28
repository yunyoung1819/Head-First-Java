package chapter14;

import java.io.*;
/**
 * 텍스트 파일을 읽는 방법 
 *
 */
class ReadAFile {
	public static void main(String[] args) {
		
		try {
			File myFile = new File("Foo.txt");
			FileReader fileReader = new FileReader(myFile);  // FileReader는 텍스트 파일로 연결되는 문자를 위한 연결 스트름입니다.
			// 읽기 작업의 효율을 향상시키기 위해 FileReader를 BufferedReader에 연쇄시킵니다. 
			// (프로그에서 버퍼에 들어있는 내용을 모두 읽어서) 버퍼가 비워진 후에만 실제로 파일을 읽어오는 작업을 합니다.
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
