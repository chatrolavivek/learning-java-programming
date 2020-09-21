package oop.assignment;

public class Customer {

	private int custId;
	private String custName, custAddress;

	// Sets values to the attributes
	public Customer(int custId, String custName, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// Displays the Customer details
	public void display() {
		System.out.println("Customer ID: " + custId);
		System.out.println("Customer Name: " + custName);
		System.out.println("Customer Address: " + custAddress);
	}

}
