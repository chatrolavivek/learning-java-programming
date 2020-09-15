package practice;

import java.util.Scanner;

public class digitsSum {

	public static void main(String[] args) {

//		WAP to find sum of digits of a given number

		Scanner s = new Scanner(System.in);

		System.out.println("Give a Number:");
		int n = s.nextInt();
		int sum = 0;

		// while (n != 0)
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		System.out.println("Sume of a digits:" + sum);

		s.close();

	}
}
