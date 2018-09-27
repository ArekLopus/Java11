package optional;

import java.util.Optional;

public class Optional_isEmpty {

	public Optional_isEmpty() {
		
		boolean test1 = Optional.ofNullable(null).isEmpty();
		System.out.println(test1);
		
		boolean test2 = Optional.empty().isEmpty();
		System.out.println(test2);
		
		boolean test3 = Optional.of(11).isEmpty();
		System.out.println(test3);
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Optional_isEmpty();

	}

}
