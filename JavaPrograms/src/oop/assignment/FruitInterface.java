package oop.assignment;

public interface FruitInterface {

	void cost();

}

class AppleInt implements FruitInterface {

	int price = 100;
	String fruitName = "Apple";

	@Override
	public void cost() {
		System.out.println("Price of an apple: " + price);
	}

}

class MangoInt implements FruitInterface {
	int price = 350;
	String fruitName = "Mango";

	@Override
	public void cost() {
		System.out.println("Price of a Mango: " + price);
	}
}
