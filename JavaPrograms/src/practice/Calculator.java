package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();

		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println("Enter your choice:");
		int choice = s.nextInt();
		double result = 0; // local variable should be initialized

		switch (choice) {

		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = ((1.0) * num1) / num2;
			break;
		default:
			System.out.println("Invalid Choice");
			System.exit(1); // comes out of program
		}
		System.out.println("Result: " + result);

		s.close();
	}
}
