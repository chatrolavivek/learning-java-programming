package practice;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int number = Integer.parseInt(s.nextLine());

		if (number > 0) {
			System.out.println("Positive Number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}

		s.close();

	}

}
