package practice;

import java.util.Scanner;

public class ArrayEvenSum {

	public static void main(String[] args) {

//		 WAP to find sum of even elements in the given array

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int arrSize = s.nextInt();

		int[] myArr = new int[arrSize];

		System.out.println("Enter " + arrSize + " value:");
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] % 2 == 0) {
				sum = sum + myArr[i];
			}
		}

		System.out.println("Sum of even elements in the given array = " + sum);

		s.close();
	}
}
