package practice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

//		WAP to check whether the given number is Prime or not

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();

		if (prime(num)) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

		s.close();

	}

	static boolean prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
