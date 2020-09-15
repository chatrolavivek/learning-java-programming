package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

//		WAP to find the factorial of a given number

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int factorial = 1;

		for (int i = num; i > 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial= " + factorial);
		s.close();
	}
	
	

}
