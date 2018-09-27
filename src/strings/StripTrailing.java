package strings;

public class StripTrailing {

	public StripTrailing() {
		
		String str = "\nAbc\n";
		
		String strip = str.stripTrailing();
		System.out.println(strip);
		System.out.println(strip.length());
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new StripTrailing();

	}

}
