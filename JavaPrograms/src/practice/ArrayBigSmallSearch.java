package practice;

import java.util.Scanner;

public class ArrayBigSmallSearch {

	public static void main(String[] args) {

//		WAP to find biggest, second biggest, smallest and second smallest in the given array

		Scanner s = new Scanner(System.in);
		int arrSize;

		do {
			System.out.println("Enter size of an array:");
			arrSize = s.nextInt();
			if (arrSize < 2) {
				System.out.println("\nCannot find second largest/smallest number when array length is less than 2");
				System.out.println("Please enter a new array size\n");
			}
		} while (!(arrSize >= 2));

		int[] myArr = new int[arrSize];

		System.out.println("Enter " + arrSize + " value:");
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextInt();
		}

		printLargest(myArr);
		printSmallest(myArr);
		s.close();

	}

	static void printLargest(int[] myArr) {
		if (myArr.length > 1) {
			int largest = Integer.MIN_VALUE;
			int secondLargest = Integer.MIN_VALUE;
			for (int i = 0; i < myArr.length; i++) {
				if (myArr[i] > largest) {
					secondLargest = largest;
					largest = myArr[i];
				}
				if ((myArr[i] != largest) && (myArr[i] > secondLargest)) {
					secondLargest = myArr[i];
				}
			}
			System.out.println("Largest = " + largest);
			System.out.println("Second Largest = " + secondLargest);

		}
	}

	static void printSmallest(int[] myArr) {
		if (myArr.length > 1) {
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;
			for (int i = 0; i < myArr.length; i++) {
				if (myArr[i] < smallest) {
					secondSmallest = smallest;

					smallest = myArr[i];
				}
				if ((myArr[i] != smallest) && (myArr[i] < secondSmallest)) {
					secondSmallest = myArr[i];
				}
			}
			System.out.println("Smallest = " + smallest);
			System.out.println("Second Smallest = " + secondSmallest);
		}
	}
}
