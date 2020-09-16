package practice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

//		WAP to find sum of given array elements

		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize = s.nextInt();

		int[] myArr = new int[arrSize];
		int sum = 0;

		System.out.println("Enter " + myArr.length + " values:");
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextInt();
			sum = sum + myArr[i];
		}

		System.out.println("Sum of given array elements: " + sum);

		s.close();
	}
}
