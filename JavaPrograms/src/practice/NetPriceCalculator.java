package practice;

import java.util.Scanner;

public class NetPriceCalculator {

	public static void main(String[] args) {

//		WAP to accept item number, item name, rate and quantity. Find price (rate * qty)

		Scanner s = new Scanner(System.in);

		System.out.print("Item Number: ");
		int itemNumber = Integer.parseInt(s.nextLine());

		System.out.print("Item Name: ");
		String itemName = s.nextLine();

		System.out.print("Item Price: ");
		double itemRate = s.nextDouble();

		System.out.print("Item Quantity: ");
		int itemQuantity = s.nextInt();

		double price = itemRate * itemQuantity;

		double discountInPercent;

		if (itemRate >= 1000 && itemRate < 2000) {
			discountInPercent = 10;
		} else if (itemRate < 3000) {
			discountInPercent = 15;
		} else if (itemRate < 5000) {
			discountInPercent = 20;
		} else {
			discountInPercent = 25;
		}

		double netPrice = price * (1 - (discountInPercent / 100));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Summary");
		System.out.println("---------------------------------");
		System.out.println("Item Number: " + itemNumber);
		System.out.println("Item name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Discount: " + discountInPercent + " %");
		System.out.println("Price after discount: $ " + netPrice);

		s.close();
	}

}
