package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Foo {
	String name;
	List<Bar> bars = new ArrayList<>();

	Foo(String name) {
		this.name = name;
	}
}

class Bar {
	String name;

	Bar(String name) {
		this.name = name;
	}
}

public class FlatMap {
	public static void main(String[] args) {

		List<Foo> foos = new ArrayList<>();

		IntStream.range(1, 4).forEach(iter -> foos.add(new Foo("Foo " + iter)));
		foos.forEach(f -> IntStream.range(1, 4).forEach(iter -> f.bars.add(new Bar("Bar_" + iter + "<- " + f.name))));
		foos.stream().flatMap(foo -> foo.bars.stream()).forEach(bar -> System.out.println(bar.name));

		// above 3 lines can be summarized in sine stream operator pipeline as.

		
		IntStream.range(1, 4)
			.mapToObj(iter -> new Foo("Foo_"+iter))
			.peek(foo -> IntStream.range(1, 4)
							.forEach(jter -> foo.bars.add(new Bar("Bar_" +jter + "<- " + foo.name))))
			.flatMap(foo -> foo.bars.stream())
			.forEach(bar -> System.out.println(bar.name));
			;
	}

}
