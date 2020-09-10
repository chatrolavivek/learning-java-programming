import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		final byte monthsInYear = 12;
		final byte percent = 100;

		int principal = 0;
		float monthlyInterestRate = 0;
		int numberOfPayments = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Principal ($1K - $1M):");
			principal = sc.nextInt();
			if (principal >= 1_000 && principal <= 1_000_000)
				break;
			System.out.println("Please enter a number between 1,000 and 1,000,000.");
		}

		while (true) {
			System.out.print("Annual Interest Rate:");
			float annualInterestRate = sc.nextFloat();
			if (annualInterestRate > 0 && annualInterestRate <= 30) {
				monthlyInterestRate = annualInterestRate / monthsInYear / percent;
				break;
			}
			System.out.println("Please enter a value greater than 0 or less than or equal to 30");
		}

		while (true) {
			System.out.print("Period(Years):");
			byte periodInYears = sc.nextByte();
			if (periodInYears >= 1 && periodInYears <= 30) {
				numberOfPayments = periodInYears * monthsInYear;
				break;
			}
			System.out.println("Please enter a value between 1 and 30");
		}
		
		sc.close();

		double mortgage = principal * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
				/ (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1));
		String mortgageConverted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage:" + mortgageConverted);

	}

}
