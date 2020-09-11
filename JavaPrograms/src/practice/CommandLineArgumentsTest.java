package practice;

public class CommandLineArgumentsTest {

	public static void main(String[] args) {
		
		
		System.out.println("Command Line Arguments Practice");
		//command line arguments allows user to affect the operation 
		// of the application without recompiling it
		
		//for loop to print command line arguments
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//for-each loop
		for (String a : args) {
			System.out.println(a);
		}

	}

}
