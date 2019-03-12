package chapter15;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		go();
	}
	
	// sleep()을 써서 실행 결과의 예측성을 높이기 
	public void go() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		doMore();
	}

	public void doMore() {
		System.out.println("top o' the stack");
	}
}
