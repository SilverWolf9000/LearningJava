import java.util.Scanner;
public class userinput {
	public static void main(String[] args) {
		// getting user input - using system input (system.in)
		
		// Create scanner object (resource leak never fixed in video...)
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a floating point value: ");
		
		// Wait for the user to enter something
		double value = input.nextDouble();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);
		
		input.close();
	}
}
