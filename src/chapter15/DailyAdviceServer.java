package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * DailyAdviceServer 코드 
 *
 */
public class DailyAdviceServer {

	String[] adviceList = {"외국어를 열심히 배워보세요.", "연애를 충분히 많이 해보세요.", "좋은 학교와 좋은 직장에 들어가기위해 노력하세요.", "아침 일찍 일어나세요.", "젊을 때부터 건강을 관리하세요.", "매일 조금씩 운동하세요.", "다른 나라로 여행을 최대한 많이 다녀보세요.", "매일 꾸준히 일기를 쓰세요.", "다양한 분야의 책을 많이 읽으세요."};
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			
			while(true) {
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
