package practice;

import java.util.Scanner;

public class ItemPrice {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Item Number: ");
		int itemNumber = Integer.parseInt(s.nextLine());

		System.out.print("Item Name: ");
		String itemName = s.nextLine();

		System.out.print("Item Price: ");
		double itemPrice = s.nextDouble();

		System.out.print("Item Quantity: ");
		int itemQuantity = s.nextInt();

		double totalPrice = itemPrice * itemQuantity;
		
		System.out.println();
		System.out.println();

		System.out.println("Item Summary:" + "\n------------------------------------------");
		
		System.out.println("Item Number: " + itemNumber + "\nItem Name: " + itemName + "\nTotal Price: " + totalPrice);

		s.close();
	}

}
