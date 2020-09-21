package oop.assignment;

public class FruitInterfaceDemo {
	
	public static void main(String[] args) {
		
		AppleInt a = new AppleInt();
		a.cost();
		
		MangoInt m = new MangoInt();
		m.cost();
		
		FruitInterface fia = new AppleInt();
		fia.cost();
		
		FruitInterface fim = new MangoInt();
		fim.cost();
		
		
	}

}
