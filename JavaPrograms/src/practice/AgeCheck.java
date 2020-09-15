package practice;

import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {

//		WAP to check whether the given age is major(>=18) or minor
//		Note: if the given age is <0 then display "Invalid Age"

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = s.nextInt();

		if (age >= 18) {
			System.out.println("Major");
		} else if (age >= 0) {
			System.out.println("Minor");
		} else {
			System.out.println("Invalid Age");
		}

		s.close();

	}

}
