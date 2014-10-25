
public class strings {
	
	public static void main(String[] args) {
		// Strings are used to declare text as a "variable" of sorts (professionally called a type)
		
		// String is a class/type of object that can hold text
		String text = "Hello";
		
		String blank = " ";
		
		String name = "Bob";
		
		// strings can be "strung together" in order to create a phrase
		String greeting = text + blank + name;
		
		// variables can be added to strings in order to create phrases
		int myInt = 7;
		double myDouble = 7.8;
		
		System.out.println(text);
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My integer is " + myInt);
		System.out.println("My number is " + myDouble + ".");
	}

}
