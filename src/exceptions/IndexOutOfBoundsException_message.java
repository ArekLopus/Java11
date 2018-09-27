package exceptions;

import java.util.List;

//Before 	- java.lang.ArrayIndexOutOfBoundsException thrown: 0 ... and more
//Now		- java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
public class IndexOutOfBoundsException_message {

	public IndexOutOfBoundsException_message() {
		
		System.out.println(List.of().get(0));
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new IndexOutOfBoundsException_message();

	}

}
