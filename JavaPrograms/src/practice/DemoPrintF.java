package practice;

import java.util.Locale;

public class DemoPrintF {

	public static void main(String[] args) {

		// boolean
		System.out.printf("%b%n", null);
		System.out.printf("'%B'%n", false);
		System.out.printf("'%-15B'%n", 5.45);
		System.out.printf("'%15b'%n", "anything");

		// String
		System.out.printf("%s%n", "vivek");
		System.out.printf("'%S'%n", "vivek");
		System.out.printf("'%15s'%n", "vivek");
		System.out.printf("'%-10S'%n", "vivek");
		System.out.printf("%2.2s%n", "Hi Vivek!");
		System.out.printf("%2.6s%n", "Hi Vivek!");
		System.out.printf("%2s%n", "Hi Vivek!");
		System.out.printf("%7s %11s%n", "Number", "Factorial");

		// char
		System.out.printf("%c%n", 'v');
		System.out.printf("%C%n", 'v');

		// byte, short, int, long
		System.out.printf("Integer: %d%n", 1000L);
		System.out.printf(Locale.US, "%,d%n", 1000000L);
		System.out.printf(Locale.ITALY, "%,d%n", 1000000L);

		// float
		System.out.printf("%f%n", 5.1473);
		System.out.printf("%5.2f%n", 5.1473);
		System.out.printf("%4.2f%n", 5.1473);
		System.out.printf("%5.2ef%n", 5.1473);

		// use of \
		System.out.println("Vivek\tNathabhai\nChatrola\n\\backslash\\\n\"Double Inverted\"\n'Single'");

	}
}
