package regex;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Pattern_asMatchPredicate {

	public Pattern_asMatchPredicate() {
		
		Predicate<String> predicate = Pattern.compile("aaa").asPredicate();
		System.out.println(predicate.test("aaa"));
		System.out.println(predicate.test("aaaa"));
		System.out.println(predicate.test("aaab"));
		
		System.out.println();
		
		predicate = Pattern.compile("aaa").asMatchPredicate();
		System.out.println(predicate.test("aaa"));
		System.out.println(predicate.test("aaaa"));
		System.out.println(predicate.test("aaab"));
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Pattern_asMatchPredicate();

	}

}
