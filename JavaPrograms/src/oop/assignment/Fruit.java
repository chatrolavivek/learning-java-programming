package oop.assignment;

public abstract class Fruit {

	public void cost() {
	}

}

class Apple extends Fruit {

	int price = 100;
	String fruitName = "Apple";

	@Override
	public void cost() {
		System.out.println("Price of an apple: " + price);
	}

}

class Mango extends Fruit {
	int price = 350;
	String fruitName = "Mango";

	@Override
	public void cost() {
		System.out.println("Price of a Mango: " + price);
	}
}
