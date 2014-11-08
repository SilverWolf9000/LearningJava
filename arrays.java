public class arrays {
	public static void main(String[] args) {
		// arrays = []
		
		/* create enough memory to store int (32 bits)
		int value = 7;
		*/
		
		// refer to a list of integers
		int[] values;
		
		// allocating enough memory for 3 ints
		values = new int[3];
		
		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		// iterating through an array using a for loop
		for(int i=0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
