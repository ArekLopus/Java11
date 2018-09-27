package strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lines {

	public Lines() {
		
		String str = "Abc\nDef\nGhi";
		
		Stream<String> lines = str.lines();
		List<String> collect = lines.collect(Collectors.toList());
		System.out.println(collect);
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Lines();

	}

}
