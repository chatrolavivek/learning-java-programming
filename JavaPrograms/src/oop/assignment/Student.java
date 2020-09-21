package oop.assignment;

public class Student {

	private int rollNum, mark1, mark2, mark3, totalMarks;
	private String studName;

	// Sets the values to all the data members except totalMarks
	// [public void setStudDetails(){}]
	public Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Calculate the totalMarks
	public int calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;
		return totalMarks;
	}

	// Displays rollNum, studName and totalMarks
	public void displayStudDetails() {
		System.out.println("Roll Number: " + rollNum);
		System.out.println("Student Name: " + studName);
		System.out.println("Total Marks: " + totalMarks);
	}

}
