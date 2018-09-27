package strings;

//This method may be used to strip white space from the beginning and end of a string.
//How is this different to the existing trim()  method? The answer is that how whitespace is defined differs between the two.
public class Strip {

	public Strip() {
		
		String str = "\nAbc\n";
		
		String strip = str.strip();
		System.out.println(strip);
		System.out.println("Length after strip: "+strip.length());
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Strip();

	}

}
