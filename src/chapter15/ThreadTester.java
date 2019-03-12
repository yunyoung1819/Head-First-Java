package chapter15;

/**
 * Thread
 * 
 * 스레드에서 할 일을 만들려면 Runnable 인터페이스를 구현하면 된다 
 *
 */
public class ThreadTester {

	public static void main(String[] args) {
		
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		
		System.out.println("back in main");
	}
}
