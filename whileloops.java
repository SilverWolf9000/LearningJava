
public class whileloops {

	public static void main(String[] args) {
		// while loops allow code to execute repeatedly until constraint met or condition is falsified
		
		int value = 0;
		boolean loop = value < 20;
		
		System.out.println(loop);
		
		// will loop forever
		while(value < 10)
		{
			System.out.println("Hello " + value);
			
			// will eventually falsify value < 10 and will then terminate
			value = value + 1;
		}
	}

}
