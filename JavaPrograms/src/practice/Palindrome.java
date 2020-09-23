package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// WAP to check whether the given String is palindrome or not eg:madam, liril

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.nextLine().toLowerCase();
		if (isPalindrome(str)) {
			System.out.println("It's a Palindrome");
		} else {
			System.out.println("It's not a Palindrom");
		}

	}

	static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
