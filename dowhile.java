import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		// do while - loops code until condition met
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		
		int value = 0;
		
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		
		while(value != 5);
		
		System.out.println("Got 5!");
		
		scanner.close();
	}
}
