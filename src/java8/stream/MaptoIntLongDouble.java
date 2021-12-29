package java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Sometimes it's useful to transform a regular object stream to a primitive stream or vice versa.
 * For that purpose object streams support the special mapping operations mapToInt(), mapToLong() and mapToDouble:
 * 
 */
public class MaptoIntLongDouble {
	public static void main(String[] args) {
		
		Stream.of("a1", "a2", "a3", "a4", "a5")
		 	.map(s -> s.substring(1))
		 	.mapToInt(Integer::parseInt)
		 	.max()
		 	.ifPresent(System.out::println);
		
		IntStream.range(1, 5)
			.mapToObj(mp -> "a" + mp)
			.forEach(System.out::println);
		
		Stream.of(1.0, 2.5 , 3.8, 4.0, 5.9)
			.mapToInt(Double::intValue)
			.mapToObj(mp -> "a" + mp)
			.forEach(System.out::println);
	}

}
