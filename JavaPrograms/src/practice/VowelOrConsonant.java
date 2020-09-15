package practice;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

//		WAP to check whether the given char/alphabet is vowel or consonant

		Scanner s = new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char c = s.next().toLowerCase().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("It's a Vowel");
		} else {
			System.out.println("It's a consonant");
		}
				
		s.close();
		
		
	}
}
