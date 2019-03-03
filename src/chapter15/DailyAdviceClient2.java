package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient2 {

	public static void main(String[] args) {
		DailyAdviceClient2 adviceClient = new DailyAdviceClient2();
		adviceClient.go();
	}

	private void go() {
		try {
			Socket sock = new Socket("127.0.0.1", 4545);
			
			InputStreamReader reader = new InputStreamReader(sock.getInputStream());
			BufferedReader breader = new BufferedReader(reader);
			
			String line = breader.readLine();
			
			System.out.println(line);
			
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
