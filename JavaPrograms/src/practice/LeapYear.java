package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

//		WAP to check whether the given year is leap year or not

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a year:");
		int year = s.nextInt();

		if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}

		s.close();

	}
}
