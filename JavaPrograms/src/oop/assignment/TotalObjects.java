package oop.assignment;

import java.util.Scanner;

public class TotalObjects {

	static int objCounter;
	static int x;

	public TotalObjects() {
		objCounter++;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Write a program to find the number of instances created for a given class

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Objects: ");
		int objNum = s.nextInt();

		for (int i = 1; i <= objNum; i++) {
			TotalObjects obj = new TotalObjects();
			System.out.println("Object" + i + " x = " + obj.x);
		}
		System.out.println("Total Instances Created = " + objCounter);

		s.close();

	}
}
