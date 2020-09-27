package collections;

import java.util.*;

class Book {
	int bno;
	String bname;
	double price;

	public Book(int bno, String bname, double price) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
//
//	public String toString() {
//		return bno + " " + bname + " " + price;
//	}
}

class Library {
	Set<Book> books;// b1,b2,b3

	Library() {
		books = new TreeSet<Book>();
//		(new PriceComparator());
	}

	void addBook(Book b) {
		books.add(b);
	}

	void displayBooks() {
		for (Book b : books)
			System.out.println(b);// invokes toString() implicitly
	}
}

class PriceComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		if (b1.price > b2.price)
			return +1;// connect left
		else if (b1.price < b2.price)
			return -1;// connect right
		else
			return 0;
	}
}

public class LibraryTest {
	public static void main(String[] args) {
		Library lib = new Library();
		Book b1 = new Book(111, "Java", 500.0);
		Book b2 = new Book(222, "XML", 800.0);
		Book b3 = new Book(333, "HTML", 400.0);
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.displayBooks();
	}

}
