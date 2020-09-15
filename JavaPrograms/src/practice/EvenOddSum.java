package practice;

public class EvenOddSum {

	public static void main(String[] args) {

//		WAP to find sum of even numbers and odd numbers from 1 to 100

		int i = 1, sumEven = 0, sumOdd = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
			i++;
		}
		System.out.println("Sum of Odd Numbers: " + sumOdd);
		System.out.println("Sum of Even Numbers: " + sumEven);
	}
}
