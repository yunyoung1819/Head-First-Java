package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer2 {

	String[] advice = {"1.IT 바이블 서적 읽기", "2.알고리즘 스터디", "3.포트폴리오 만들기", "4.오픈소스 활동하기",
			"5.영어 공부하기", "6.일본어 공부하기", "7.온라인 인강 보기", "8.OCJP 취득하기", "9.운전면허 취득하기",
			"10.아픈 곳 치료받기", "11.여행 다녀오기", "12.친구들 만나기", "13.토익점수 취득하기", "14.일본어 JPLT 취득하기",
			"15.유다시티 나노디그리 수료하기", "16.블로그 운영하기", "17.컴퓨터공학 기본지식 쌓기", "18.IT 스터디모임 참여하기",
			"19.피아노 배우기", "20.여러가지 의미로 멋있어지기"};
	
	public static void main(String[] args) {
		DailyAdviceServer2 server = new DailyAdviceServer2();
		server.go();
	}
	
	private void go() {
		try {
			ServerSocket sock = new ServerSocket(4545);

			while(true) {
				Socket socket = sock.accept();
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				System.out.println(advice);
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) (Math.random() * advice.length);
		return advice[random];
	}
}
