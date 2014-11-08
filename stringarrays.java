public class stringarrays {
	public static void main(String[] args) {
		// arrays of strings -
		
		// works same as ints
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//int value = 0;
		
		// allocating enough memory for a reference to a string
		// null = pointless ref
		String text = null;
		
		System.out.println(text);
		
		// only allocating enough memory for 2 strings
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
	}
}
