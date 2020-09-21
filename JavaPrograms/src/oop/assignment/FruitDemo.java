package oop.assignment;

public class FruitDemo {

	public static void main(String[] args) {
		// Tests Fruit, Apple, Mango classes
		
		Apple a = new Apple();
		a.cost();
		
		Mango m = new Mango();
		m.cost();
		
		Fruit fa = new Apple();
		fa.cost();
		
		Fruit fm = new Mango();
		fm.cost();

	}

}
