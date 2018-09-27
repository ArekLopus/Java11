package strings;

public class Repeat {

	public Repeat() {
		
		String str = "Abc";
		
		System.out.println(str.repeat(0));
		System.out.println(str.repeat(1));
		System.out.println(str.repeat(2));
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Repeat();

	}

}
