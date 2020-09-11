package practice;

public class OperatorTest {

	public static void main(String[] args) {

		// Division
		System.out.println(5 / 2);
		System.out.println(5.0 / 2);
		System.out.println(5 / 2.0);
		System.out.println((1.0 * 5) / 2);

		// Modulus
		System.out.println(5 % 2);
		System.out.println(5.0 % 2);

		// Shorthend
		int x = 5;
		x = x + 5;
		System.out.println(x);

		x += 5;
		System.out.println(x);

		System.out.println(x *= 10);

		// Terinary Operator

		int a = 10;
		int b = 15;

		int big = (a > b) ? a : b;
		System.out.println(big);

		a += 10;
		System.out.println((a > b) ? a : b);

		// Increment and Decrement Operator

		int i = 10;
		int j = 15;
		i++;
		++j;
		System.out.println(i);
		System.out.println(j);
		i--;
		--j;
		System.out.println(i);
		System.out.println(j);

		x = 10;
		int k = x++;
		System.out.println("k= " + k + " " + "x= " + x);

		x = 10;
		int l = ++x;
		System.out.println("l= " + l + " " + "x= " + x);

		x = 10;
		System.out.println("x= " + x++);
		System.out.println("x= " + ++x);

	}

}
