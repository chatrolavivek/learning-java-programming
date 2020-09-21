package oop.assignment;

public class Rectangle {

	private int length, breadth;

	// Assign the values to datamembers
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	// Finds the area of the rectangle
	public void area() {
		int area = length * breadth;
		System.out.println(area);
	}

}
