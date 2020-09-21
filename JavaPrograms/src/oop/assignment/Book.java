package oop.assignment;

public class Book {

	private String bname;
	private int bno, price;

	public Book() {
	}

	public Book(int bno, String bname, int price) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}

	// Displays bno,bname and price
	public void display() {
		System.out.println("Book Number: " + bno);
		System.out.println("Book Name: " + bname);
		System.out.println("Price: " + price);
	}
}

class SpecialEditionBook extends Book {

	private int discount;

	public SpecialEditionBook(int bno, String bname, int price, int discount) {
		super(bno, bname, price);
		this.discount = discount;
	}

	public SpecialEditionBook() {
		// TODO Auto-generated constructor stub
	}

	// Display the value of discount
	@Override
	public void display() {
		super.display();
		System.out.println("Discount: " + discount + " %");
	}

}
