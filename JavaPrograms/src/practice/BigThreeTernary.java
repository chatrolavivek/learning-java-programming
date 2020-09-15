package practice;

import java.util.Scanner;

public class BigThreeTernary {

	public static void main(String[] args) {

//		WAP to find biggest of given three numbers using conditional operator (?)

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();

		int bigNum = num1 > (num2 > num3 ? num2 : num3) ? num1 : (num2 > num3 ? num2 : num3);

//		int mn =((num1>num2) && (num1>num3))?num1:((num2>num3)?num2:num3);
		System.out.println(bigNum);

		s.close();
	}

}
