package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

//-Returns an array containing all of the elements in this collection,
// using the provided generator function to allocate the returned array. 
//-If this collection makes any guarantees as to what order its elements are returned by its iterator,
// this method must return the elements inthe same order.

//For: impl Collection.intf: List, Queue, Set
public class Collection_toArrayIntFunction {

	public Collection_toArrayIntFunction() {
		
		String[] strings = List.of("aa","bb").toArray(String[]::new);
		System.out.println(Arrays.toString(strings));
		
		String[] strings2 = Set.of("11", "22").toArray(String[]::new);
		System.out.println(Arrays.toString(strings2));
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new Collection_toArrayIntFunction();

	}

}
