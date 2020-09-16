package practice;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {

//		WAP to search an element in the given array

		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize = s.nextInt();

		int[] myArr = new int[arrSize];

		System.out.println("Enter " + myArr.length + " values:");
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextInt();
		}

		System.out.println("Enter an element to search:");
		int key = s.nextInt();

		if (searchElement(myArr, key)) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}

		s.close();
	}

	static boolean searchElement(int[] myArr, int key) {
		for (int i = 0; i < myArr.length; i++) {
			if (key == myArr[i]) {
				return true;
			}
		}
		return false;
	}
}
