package exceptions;

public class MultipleCatchDemo {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.err.println("Divided by zero not permitter");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two numbers");
		} catch (NumberFormatException e) {
			System.err.println("Please enter numbers only");
		} catch (RuntimeException e) {
			System.err.println("Run Time Exception Occured");
		} catch (Exception e) {
			System.err.println("Exception Occured");
		}

	}

}
