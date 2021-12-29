package java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements:
 * @author mossad
 *
 */
public class Stream_1 {
	
	private static final List<String> myList;
	
	static {
		myList = Arrays.asList(
				"a1",
				"a2",
				"b1",
				"c4",
				"c5",
				"c3"
				);
	}
	public static void main(String[] args) {
		
		myList
			.stream()
			.filter(str -> str.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
	}
}
