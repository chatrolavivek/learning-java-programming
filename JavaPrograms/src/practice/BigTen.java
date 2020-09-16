package practice;

import java.util.Scanner;

public class BigTen {

	public static void main(String[] args) {

//		WAP to find biggest of given 10 numbers

		Scanner s = new Scanner(System.in);

		int i = 1, n, big = Integer.MIN_VALUE;

		while (i <= 10) {
			System.out.println("Enter a number: ");
			n = s.nextInt();
			if (n > big) {
				big = n;
			}
			i++;
		}
		System.out.println("Biggest Number is: " + big);

		s.close();

	}
}
