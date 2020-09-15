package practice;

public class ContinueDemo {

	public static void main(String[] args) {

//		WAP to display the following output
//		1 2 3 4 6 7 8 9 10

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
