package java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


/**
 * Primitive streams use specialized lambda expressions, e.g. 
 * IntFunction instead of Function or IntPredicate instead of Predicate. 
 * And primitive streams support the additional terminal aggregate operations sum() and average()
 * 
 * @author mossad
 *
 */
public class StreamType {
	public static void main(String[] args) {

		Arrays.asList("a1", "a2", "a3")
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		Stream.of("a1", "a2", "a3")
			.findFirst()
			.ifPresent(System.out::println);
		
		IntStream.range(1, 10)
			.forEach(System.out::println);
		
		LongStream.range(1, 20)
			.forEach(System.out::println);
		
		//Also for DoubleStream
		
		Arrays.stream(new int[] {1, 2, 3})
			.map(n -> 2 * n +1)
			.average()
			.ifPresent(System.out::println);
	}
}
