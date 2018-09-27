package character;

public class Character_toString {

	public Character_toString() {
		
		String string = Character.toString(65);
		
		System.out.println(string);
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Character_toString();

	}

}
