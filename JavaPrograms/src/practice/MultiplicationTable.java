package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

//		WAP to display multiplication table for a given number
//		WAP to display multiplication tables from 1 to 10

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i == num) {
				getMultiplicationTable(i);
			} else {
				getMultiplicationTable(i);
				System.out.println("------------");
			}
		}

		s.close();

	}

	static void getMultiplicationTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
