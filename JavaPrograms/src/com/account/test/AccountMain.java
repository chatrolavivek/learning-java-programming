package com.account.test;

import java.util.Scanner;

import com.account.Account;

public class AccountMain {

	public static void main(String[] args) {
		// Tests com.account.Account class

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Account ID: ");
		int accountId = s.nextInt();
		s.nextLine();
		System.out.println("Enter Accont Type: ");
		String accountType = s.nextLine();
		System.out.println("Enter Account Balance: ");
		int accountBalance = s.nextInt();

		Account userAcc = new Account(accountId, accountType, accountBalance);

		int userChoice, depositAmount, withdrawAmount;
		do {
			System.out.println("\nWhat would you like to do today?");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit\n");

			userChoice = s.nextInt();

			switch (userChoice) {
			case 1:
				System.out.println("Enter the amount to be deposited: ");
				depositAmount = s.nextInt();
				userAcc.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn: ");
				withdrawAmount = s.nextInt();
				System.out.println(userAcc.getBalance());
				System.out.println(withdrawAmount);
				if (withdrawAmount > userAcc.getBalance()) {
					System.out.println("Sorry! You don't have enough balance ):");
				} else {
					userAcc.withdraw(withdrawAmount);
				}
				break;
			case 3:
				userAcc.dispAccountDetails();
				// System.out.println(userAcc.getBalance());
				break;
			case 4:
				System.out.println("\nThank you for banking with us today :)");
				System.exit(1);
			default:
				System.out.println("Please choose the right option");
			}
		} while (userChoice != 4);

		s.close();
	}

}
