package practice;

import java.util.Scanner;

public class SmallTen {

	public static void main(String[] args) {

//		WAP to find smallest of given 10 numbers

		Scanner s = new Scanner(System.in);

		int i = 1, n, smallNum = 0;

		while (i <= 10) {
			System.out.println("Enter a number:");
			n = s.nextInt();
			if (n < smallNum) {
				smallNum = n;
			}
			i++;
		}
		System.out.println("The Smallest Number is: " + smallNum);

		s.close();
	}
}
