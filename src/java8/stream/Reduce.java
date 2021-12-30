package java8.stream;

import java.util.Arrays;
import java.util.List;

class Person1 {
	String name;
	int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class Reduce {

	static List<Person1> persons;

	static {
		persons = Arrays.asList(new Person1("Max", 18), new Person1("Peter", 23), new Person1("Pamela", 23),
				new Person1("David", 12));
	}

	public static void main(String[] args) {
		persons.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2).ifPresent(System.out::println);
		
		Person1 person = persons.stream().reduce(new Person1("", 0), (p1, p2) -> {
			p1.age += p2.age;
			p1.name  += p2.name;
			return p1;
		});
		System.out.println(String.format("name : %s and age is %s", person.name, person.age));
	}

}