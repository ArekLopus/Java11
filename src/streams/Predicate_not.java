package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_not {

	public Predicate_not() {
		
		var list = List.of("aa", "", "bb", " ", "cc");
		var collected = list.stream().filter(Predicate.not(String::isEmpty)).collect(Collectors.toList());
		System.out.println(collected);
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Predicate_not();

	}

}
