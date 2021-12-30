package java8.stream;

import java.util.Optional;

class Outer {
	Nested nested;
}

class Nested {
	Inner inner;
}

class Inner {
	String foo;
}

public class OptionalOf {

	public static void main(String[] args) {

		Optional.of(new Outer()).flatMap(op -> Optional.of(op.nested)).flatMap(on -> Optional.of(on.inner))
				.flatMap(i -> Optional.of(i.foo)).ifPresent(System.out::println);
	}
}
