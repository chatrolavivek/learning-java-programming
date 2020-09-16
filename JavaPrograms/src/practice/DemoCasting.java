package practice;

public class DemoCasting {

	static int x; // default value = 0
	static String str; // default value = null
	float y; //// default value = 0.0

	public static void main(String[] args) {

		/*
		 * VARIABLE NAME NOT ALLOWED int 123abc; int im casting; int else; int
		 * vivek#chatrola;
		 */

		// Default Value

		DemoCasting obj = new DemoCasting();

		System.out.println(x);
		System.out.println(obj.y);
		System.out.println(str);

		/*
		 * int z; //LOCAL VARIABLE must be initialized String str1;
		 * System.out.println(str1); // ERROR: The local variable z may not have been
		 * initialized System.out.println(z); // ERROR: The local variable z may not
		 * have been initialized
		 */

		int z = 3;
		System.out.println(z);

		String str1 = "not null";
		System.out.println(str1);

		// Implicit Casting

		int i = 5;
		long l = i;
		System.out.println(l);

		char c = 'A';
		int ii = c;
		System.out.println(ii); // prints UNICODE of char 'A'

		// Explicit Casting
		long ll = 556;
		// int iii = ll; // Error: Type mismatch: cannot convert from long to int
		int iii = (int) ll;
		System.out.println(iii);

		double d = 5.78;
		byte b = (byte) d;
		System.out.println(b);

		// float f = 9.80; // Type mismatch: cannot convert from double to float

		float f = (float) 9.80;
		float ff = 9.80f;
		float fff = 9.80F;
		System.out.println(f + " " + ff + " " + fff);

	}

}
