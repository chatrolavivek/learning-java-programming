package practice;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the length in mm: ");
		double length = s.nextDouble();

		System.out.println("Enter the breadth in mm: ");
		double breadth = s.nextDouble();

		double areaOfRectangle = length * breadth;
		System.out.println("Area of the Rectange is: " + areaOfRectangle + " mm2");

		s.close();

	}

}
