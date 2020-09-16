package practice;

public class PrimeSum {

	public static void main(String[] args) {

//		WAP to find sum of prime numbers from 2 to 100

		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			if (PrimeOrNot.prime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Prime numbers [2-100] = " + sum);
	}

}
