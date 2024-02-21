/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

/**
 * @author AKG
 *
 */
public class UserInputClass {
	
	public static void main(String args[]){
		 // Get the console
	    java.io.Console console = System.console();
	    if (console == null) {
	        System.out.println("No console available");
	        return;
	    }

	    // Read a line from the user
	    String input = console.readLine("Enter your input: ");
	    
	    // Print the input
	    System.out.println("Your input was: " + input);
	}

}
