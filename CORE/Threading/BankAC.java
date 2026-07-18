class BankAC {
	void main() throws Exception {
	Account sharedAccount = new Account();
	WithdrawJob t1 = new WithdrawJob(sharedAccount, 700, "Thread-A");
	WithdrawJob t2 = new WithdrawJob(sharedAccount, 500, "Thread-B");
	   t1.start();
	   t2.start();
	}
}
// 1. Shared resource containing the balance
class Account {
    private int balance = 1000;

    // synchronized prevents two threads from executing this at the same time on the same object
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " - Before Withdraw Balance is : " + balance);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " - After Withdraw Balance is : " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient.....");
        }
    }
}

class WithdrawJob extends Thread {
	private Account account;
	private int amountTOWithdraw;
	
	WithdrawJob(Account account, int amountTOWithdraw,String threadName) {
		this.account = account;
		this.amountTOWithdraw = amountTOWithdraw;
		super(threadName);
	}
	@Override
	public void run() {
		IO.println("Run Got Called");
		account.withdraw(amountTOWithdraw);
	}
	
}
