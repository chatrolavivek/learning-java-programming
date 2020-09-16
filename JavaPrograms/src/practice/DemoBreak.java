package practice;

import java.util.Scanner;

public class DemoBreak {

	public static void main(String[] args) {

//		WAP to accept the numbers until the user enter zero and find the sum of these 
//		given numbers

		Scanner s = new Scanner(System.in);
		int n, sum = 0;

		while (true) {
			System.out.println("Enter a number:");
			n = s.nextInt();
			if (n == 0) {
				break;
			}
			sum = sum + n;
		}
		System.out.println("Sum: " + sum);

		s.close();
	}

}
