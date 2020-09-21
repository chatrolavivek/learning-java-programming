package com.account;

public class Account {

	private int acctId, acctBalance;
	private String acctType;

	// Set the values to these attributes
	public Account(int accountId, String accountType, int accountBalance) {
		this.acctId = accountId;
		this.acctType = accountType;
		this.acctBalance = accountBalance;
	}

	// Default Constructor
	public Account() {
	}

	// Gets balance
	public int getBalance() {
		return acctBalance;
	}

	// Adds given amount to the available balance
	public void deposit(int depositAmount) {
		acctBalance += depositAmount;
		System.out.println(depositAmount + " CAD deposited!");
	}

	// Subtracts the given amount from the available balance
	public void withdraw(int withdrawAmount) {
		acctBalance -= withdrawAmount;
		System.out.println(withdrawAmount + " CAD withdrawn!");
	}

	// Displays accountNo, accountType, accountBalance. Create a class Main1 which
	public void dispAccountDetails() {
		System.out.println("Account ID: " + acctId);
		System.out.println("Account Type: " + acctType);
		System.out.println("Account Balance: " + acctBalance + " CAD");
	}

}
