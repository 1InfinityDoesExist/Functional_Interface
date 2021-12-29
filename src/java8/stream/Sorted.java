package java8.stream;

import java.util.stream.Stream;

public class Sorted {
	
	public static void main(String[] args) {
		
		Stream.of("d1", "a2", "b1", "b3", "c")
			.sorted((a1, a2) -> {
				return a1.compareTo(a2);
			})
			.filter(str -> str.startsWith("b"))
			.map(mp -> mp.toUpperCase())
			.forEach(System.out::println);
		
	}

}
