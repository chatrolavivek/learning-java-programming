package practice;

import java.util.Scanner;

public class TwoProduct {

	public static void main(String[] args) {

//		WAP to find product of two numbers without using "*"

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int product = 0;

		for (int i = 1; i <= num2; i++) {
			product += num1;
		}
		System.out.println("Prdoduct is = " + product);

		s.close();
	}
}
