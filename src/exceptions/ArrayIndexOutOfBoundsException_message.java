package exceptions;

//Before 	- java.lang.ArrayIndexOutOfBoundsException thrown: 0
//Now		- java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
public class ArrayIndexOutOfBoundsException_message {

	public ArrayIndexOutOfBoundsException_message() {
		
		System.out.println(new int[]{}[0]);
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new ArrayIndexOutOfBoundsException_message();

	}

}
