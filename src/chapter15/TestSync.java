package chapter15;

/**
 * 무시무시한 갱신 내용 손실 문제 
 *
 */
class TestSync implements Runnable {
	private int balance;

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			increment();
			System.out.println("balance is " + balance);
		}
	}
	
	// 동기화 
	public synchronized void increment() {
		int i = balance;
		balance = i + 1;
	}
}
