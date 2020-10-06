package oop.assignment;

public class Account1 {

	private int accountId, accountBalance;
	private String accountType;
	private Customer customer;

	// Set the values to these attributes
	public Account1(int accountId, String accountType, Customer customer, int accountBalance) {
		this.accountId = accountId;
		this.accountType = accountType;
		this.customer = customer;
		this.accountBalance = accountBalance;
	}

	public Account1() {
		// TODO Auto-generated constructor stub
	}

	// Displays account details
	public void dispAccountDetails() {
		customer.display();
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
	}
}
