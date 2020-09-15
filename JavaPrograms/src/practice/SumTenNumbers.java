package practice;

import java.util.Scanner;

public class SumTenNumbers {

	public static void main(String[] args) {

//		WAP to find the sum of given 10 numbers

		Scanner s = new Scanner(System.in);

		int n, sum = 0, i = 1;
		while (i <= 10) {
			System.out.println("Enter a number: ");
			n = s.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println("Sum of given ten numbers: " + sum);

		s.close();
	}
}
