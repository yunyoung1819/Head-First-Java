package chapter15;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SimpleChatClient {

	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	
	public static void main(String[] args) {
		SimpleChatClient client = new SimpleChatClient();
		client.go();
	}

	// GUI Code
	public void go() {
		
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		
		// 새로운 내부 클래스를 스레드의 Runnable(작업)로 하여 새로운 스레드를 시작합니다
		// 이 스레드에서는 서버의 소켓 스트림으로부터 받은 데이터를 읽어서 그 메시지를 스크롤 텍스트 영역으로 표시합니
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
	
		frame.setSize(650, 500);
		frame.setVisible(true);
	}
	
	// 소켓을 이용하여 입력 스트림과 출력 스트림을 받아옵니다
	// 출력 스트림은 서버로 메시지를 보내기 위한 용도로 쓰이고 있었고 새로 만든 readerThread에서 메시지를 받아오기 위한 용도로 입력 스트림을 사용
	private void setUpNetworking() {
		
		try {
			sock = new Socket("127.0.0.1", 5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public class SendButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
				
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
	
	// 스레드가 일하는 부분
	// run() 메소에서는 서버에서 널이 아닌 것을 받을 때까지 순문을 돌리면서
	// 한번에 한 행씩 받아서 각 행을 스크롤 텍스트 영역에 추가합니다 
	public class IncomingReader implements Runnable {

		@Override
		public void run() {
			String message;
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("client read " + message);
					incoming.append(message + "\n");
				}
			} catch(Exception ex) { ex.printStackTrace(); }
		}
		
	}
}
