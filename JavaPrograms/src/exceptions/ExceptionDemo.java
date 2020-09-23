package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Starting of a program");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		try {
			int result = a / b;
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Divided by 0 is not permitted");
		}

		System.out.println("Ending of Program");
	}
}

/*
 * String[] args is used to store command line arguments
 * 
 * >java ExceptionDemo 10 5
 * 
 * 10 and 5 are command line arguments args[0] => 10, args[1] => 5
 */
