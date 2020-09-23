package exceptions;

// Create a user defined exception "WithdrawException"
public class WithdrawException extends Exception {

	public WithdrawException(String s) {
		super(s);
	}

	public WithdrawException() {
		// TODO Auto-generated constructor stub
	}

}

// Create a class "Account" with a method "withdraw()" which takes "amount" and "balance" as arguments. 
class Account {
	void withdraw(int balance, int amount) throws WithdrawException {
		if (balance < amount) {
			throw new WithdrawException("Insufficient Balance");
		} else {
			System.out.println("Amount Withdrawn successfully");
		}
	}
}

class WithdrawDemo {
	public static void main(String[] args) {
		Account acc = new Account();
		try {
			acc.withdraw(200000, 2000000);
		} catch (WithdrawException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}