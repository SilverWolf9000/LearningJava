public class ifstatements {
	public static void main(String[] args) {
		// if statements - conditional statement; if takes supreme action, then else if, then else
		
		/*int myInt = 15;
		
		if(myInt < 10) {
			System.out.println("Yes, it is true!");
		}
		else if(myInt > 20) {
			System.out.println("No, it is false!");
		}
		else {
			System.out.println("None of the above.");
		}*/
		
		int loop = 0;
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if(loop == 5) {
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}
	}
}
