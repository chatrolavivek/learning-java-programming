package practice;

import java.util.Scanner;

public class ArrayCreate {

	public static void main(String[] args) {

//		WAP to create an int array of given size and display the elements of the array

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int arrSize = s.nextInt();

		int[] myArr = new int[arrSize];

//		int []myArr1 = new int[arrSize];	Valid
//		int myArr2[] = new int[arrSize];	Valid
//		[]int myArr3 = new int[arrSize];	Invalid

		System.out.println("Enter " + arrSize + " values:");
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = s.nextInt();
		}

		System.out.println("\nSize of the array: " + myArr.length);
		System.out.println("Elements of the array:");
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}
		System.out.println();

//		Enhanced for loop - for each loop

		for (int a : myArr) {
			System.out.print(a + " ");
		}

		s.close();
	}

}
