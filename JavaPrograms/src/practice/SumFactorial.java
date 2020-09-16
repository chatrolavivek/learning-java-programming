package practice;

import java.util.Scanner;

public class SumFactorial {

	static int factorial;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		s.close();

		int sum = 0, f;

		System.out.println("-------------------");
		System.out.printf("%7s %11s%n", "Number", "Factorial");
		System.out.println("-------------------");

		for (int i = 1; i <= n; i++) {
			factorial = 1;
			f = getFactorial(i);
			System.out.printf("%4d %9d%n", i, f);
			sum = sum + f;
		}

		System.out.println("-------------------");
		System.out.printf("%4s %2s %7d%n", "Sum", "=", sum);
		System.out.println("-------------------");

	}

	static int getFactorial(int num) {
		for (int i = num; i > 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
