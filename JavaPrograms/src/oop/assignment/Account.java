package oop.assignment;

public class Account {

	private int accountNo, accountBalance;
	private String accountType;

	// Set the values to these attributes [setAccountDetails(){}]
	public Account(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	// Subtracts the given amount from the available balance
	public void withdraw(int withdrawAmount) {
		accountBalance -= withdrawAmount;
	}

	// Adds given amount to the available balance
	public void deposit(int depositAmount) {
		accountBalance += depositAmount;
	}

	// Displays accountNo, accountType, accountBalance. Create a class Main1 which
	public void dispAccountDetails() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
	}

}
