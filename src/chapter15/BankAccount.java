package chapter15;

/**
 * 은행계좌 
 *
 */
class BankAccount {
	private int balance = 100;  // 처음에 잔고 100달러에서 시작합니다
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
