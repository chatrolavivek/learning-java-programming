package practice;

import java.util.Scanner;

public class CountInString {

	public static void main(String[] args) {

		// WAP to count number of vowels, consonants and words in the given line of text

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine().toLowerCase();

		int vowelCount = 0;
		int consonantsCount = 0;
		int wordsCount = 1;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			} else if (c == ' ') {
				wordsCount++;
			} else {
				consonantsCount++;
			}
		}
		System.out.println("Number of Vowels = " + vowelCount);
		System.out.println("Number of Consonants = " + consonantsCount);
		System.out.println("Number of Words = " + (wordsCount));
	}

}
