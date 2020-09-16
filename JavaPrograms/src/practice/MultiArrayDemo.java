package practice;

import java.util.Scanner;

public class MultiArrayDemo {

	public static void main(String[] args) {

//		WAP to create a 3x3 matrix and display the elements in matrix form

		Scanner s = new Scanner(System.in);

		int[][] multiArr = new int[3][3];
		System.out.println("Enter 9 values:");

		for (int i = 0; i < multiArr.length; i++) {
			for (int j = 0; j < multiArr[i].length; j++) {
				multiArr[i][j] = s.nextInt();
			}
		}

		System.out.println("Given 3x3 matrix \n-----------------");
		for (int i = 0; i < multiArr.length; i++) {
			for (int j = 0; j < multiArr[i].length; j++) {
				System.out.print(multiArr[i][j] + " ");
			}
			System.out.println();
		}

		s.close();

	}

}