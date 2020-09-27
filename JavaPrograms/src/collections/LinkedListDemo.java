package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		LinkedList ll = new LinkedList();
		int userChoice;

		do {
			System.out.println("------------------------------------------");
			System.out.println("	  LINKEDLIST OPERATIONS");
			System.out.println("------------------------------------------");
			System.out.println("Hi there! What would you like to do today?");
			System.out.println("  1. Add element at last\n" + "  2. Add element at first\n"
					+ "  3. Add element at given position\n" + "  4. Update element at given position\n"
					+ "  5. Delete the first element\n" + "  6. Delete the last element\n"
					+ "  7. Delete the given element\n" + "  8. Delete the element at given position\n"
					+ "  9. Display the elements\n" + "  10.Exit");
			System.out.println("------------------------------------------");

			userChoice = s.nextInt();

			switch (userChoice) {

			case 1:
				System.out.println("Enter an element:");
				Object eLast = s.next();
				ll.addLast(eLast);
				System.out.println("'" + eLast + "'" + " added successfully at last position.\n");
				break;

			case 2:
				System.out.println("Enter an element:");
				Object eFirst = s.next();
				ll.addFirst(eFirst);
				System.out.println("'" + eFirst + "'" + " added successfully at first position.\n");
				break;

			case 3:
				System.out.println("Enter the position:");
				int pAdd = s.nextInt();
				while (pAdd > (ll.size() - 1)) {
					System.err.println("\nINVALID POSITION!!");
					System.out.println("Current List size = " + ll.size());
					System.out.println("Please enter a valid position:");
					pAdd = s.nextInt();
				}
				System.out.println("Enter an element:");
				Object ePosition = s.next();
				ll.add(pAdd, ePosition);
				System.out.println("'" + ePosition + "'" + " added successfully at " + "position " + pAdd + ".\n");
				break;

			case 4:
				System.out.println("Enter the position:");
				int pUpdate = s.nextInt();
				while (pUpdate > (ll.size() - 1)) {
					System.err.println("\nINVALID POSITION!!");
					System.out.println("Current List size = " + ll.size());
					System.out.println("Please enter a valid position:");
					pUpdate = s.nextInt();
				}
				System.out.println("Enter an element:");
				Object eUpdate = s.next();
				ll.set(pUpdate, eUpdate);
				System.out.println("Position " + pUpdate + " updated successfully to " + "'" + eUpdate + "'!\n");
				break;

			case 5:
				ll.removeFirst();
				System.out.println("First element deleted successfully!\n");
				break;

			case 6:
				ll.removeLast();
				System.out.println("Last element deleted successfully!\n");
				break;

			case 7:
				System.out.println("Enter the element to be deleted:");
				String eDelete = s.next();
				while (ll.remove(eDelete) == false) {
					System.err.println("\nELEMENT NOT FOUND!!");
					System.out.println("Current List = " + ll);
					System.out.println("Please enter a valid element:");
					eDelete = s.next();
				}
				System.out.println("'" + eDelete + "'" + " deleted successfully.\n");
				break;

			case 8:
				System.out.println("Enter the position:");
				int pDelete = s.nextInt();
				while (pDelete > (ll.size() - 1)) {
					System.err.println("\nINVALID POSITION!!");
					System.out.println("Present List size is " + ll.size());
					System.out.println("Please enter a valid position:");
					pDelete = s.nextInt();
				}
				ll.remove(pDelete);
				System.out.println("Element at position " + pDelete + " deleted successfully!\n");

				break;

			case 9:
				System.out.println("\n" + ll + "\n");
				break;

			case 10:
				System.out.println("Thank you for using our application!\n");
				System.exit(1);

			default:
				System.out.println("Please choose option from 1 to 10\n");
			}
		} while (userChoice != 10);

		s.close();

	}
}
