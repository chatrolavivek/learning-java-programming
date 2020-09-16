package practice;

import java.util.Scanner;

public class MultiArrayDiagonalSum {

	public static void main(String[] args) {

//		 WAP to find the sum of principal diagonal elements of a given 3x3 matrix

		Scanner s = new Scanner(System.in);
		int[][] multiArr = new int[3][3];
		System.out.println("Enter 9 values:");

		for (int i = 0; i < multiArr.length; i++) {
			for (int j = 0; j < multiArr[i].length; j++) {
				multiArr[i][j] = s.nextInt();
			}
		}

		int sum = 0;
		for (int i = 0; i < multiArr.length; i++) {
			for (int j = 0; j < multiArr[i].length; j++) {
				if (i == j) {
					sum = sum + multiArr[i][j];
				}
			}
		}
		System.out.println("Sum of principal diagonal elements of a given 3x3 matrix = " + sum);

		s.close();
	}
}
