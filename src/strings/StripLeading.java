package strings;

public class StripLeading {

	public StripLeading() {
		
		String str = "\nAbc\n";
		
		String strip = str.stripLeading();
		System.out.println(strip);
		System.out.println(strip.length());
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new StripLeading();

	}

}
