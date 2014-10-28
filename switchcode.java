import java.util.Scanner;

public class switchcode {
	public static void main(String[] args) {
		// switch - similar to if, but more efficient and choosing execution by values (generally int or string)

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped.");
			break;

		default:
			System.out.println("Command not recognized");
		}
		
		input.close();
	}
}
