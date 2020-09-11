package practice;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter roll number:");
		int rollNo = s.nextInt();

		s.nextLine(); // Integer.parseInt(s.nextLine());

		System.out.println("Enter name:");
		String name = s.nextLine();

		System.out.println("Enter marks of three main Subjects:");
		double sub1Marks = s.nextDouble();
		double sub2Marks = s.nextDouble();
		double sub3Marks = s.nextDouble();

		double totalMarks = sub1Marks + sub2Marks + sub3Marks;
		double averageMarks = totalMarks / 3;

		System.out.println("Name: " + name);
		System.out.println("Roll number: " + rollNo);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + averageMarks);

		s.close();

	}

}
