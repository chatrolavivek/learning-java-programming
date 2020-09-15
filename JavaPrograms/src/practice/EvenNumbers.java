package practice;

public class EvenNumbers {

	public static void main(String[] args) {

//		WAP to display Even Numbers from 1 to 100

		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
