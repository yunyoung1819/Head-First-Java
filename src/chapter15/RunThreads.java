package chapter15;

/**
 * 스레드 두 개를 만들고 시작하기 
 * @author headfirst java
 *
 */
public class RunThreads implements Runnable {

	public static void main(String[] args) {
		RunThreads runner = new RunThreads();  // Runnable 인스턴스 한 개를 만듭니다
		Thread alpha = new Thread(runner);     // 똑같은 Runnable 객체로 스레드 두개를 만듭니다. 두 스레드의 작업은 똑같습니다.
		Thread beta = new Thread(runner);
		alpha.setName("Alpha thread");			// 스레드에 이름을 부여합니다
		beta.setName("Beta thread");
		alpha.start();							// 스레드를 시작합니다 
		beta.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 25; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
		}
	}
	
}
