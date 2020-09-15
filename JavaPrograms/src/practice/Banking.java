package practice;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {

//		WAP to accept the current balance and display the following options/menu
//		1.Deposit
//		2.Withdraw
//		3.Display Balance
//		4.Exit
//		The menu should display repeatedly until the user chooses Exit

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the current balance: ");
		double currentBalance = s.nextDouble();

		int userChoice;

		do {

			System.out.println("Enter one of the following option:");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");

			userChoice = s.nextInt();

			switch (userChoice) {
			case 1:
				System.out.println("\n" + "Enter the amount you want to deposit:");
				currentBalance = currentBalance + s.nextDouble();
				System.out.println();
				break;
			case 2:
				System.out.println("\n" + "Enter the amount you want to withdraw:");
				double withdrawAmount = s.nextDouble();
				if (withdrawAmount > currentBalance) {
					System.out.println("Insufficient balance!");
				} else {
					currentBalance = currentBalance - withdrawAmount;
				}
				System.out.println();
				break;
			case 3:
				System.out.println("\n" + "Current account balance is: $ " + currentBalance);
				System.out.println();
				break;
			case 4:
				System.out.println("\n" + "Thank you for banking with us!");
				break;
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
			}

		} while (userChoice != 4);
		s.close();

	}
}
