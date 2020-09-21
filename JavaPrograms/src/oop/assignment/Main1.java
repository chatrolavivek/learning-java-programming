package oop.assignment;

public class Main1 {

	public static void main(String[] args) {

		// Tests the functionality of Account class.

		Account myAcc = new Account(3490130, "Chequing", 20000);
		myAcc.withdraw(5000);
		myAcc.deposit(7000);
		myAcc.dispAccountDetails();
	}
}
