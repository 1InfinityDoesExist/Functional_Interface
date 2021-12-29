package java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class CollectTerminalOperation {
	
	static List<Person> persons;
	
	static {
	persons = 	Arrays.asList(
		        new Person("Max", 18),
		        new Person("Peter", 23),
		        new Person("Pamela", 23),
		        new Person("David", 12));
	}

	public static void main(String[] args) {
		
		List<Person> filtered = persons
									.stream()
									.filter(p -> p.name.startsWith("P"))
									.collect(Collectors.toList())
									;
		filtered.forEach(System.out::println);
		
		//Group all the person by age.
		
		Map<Integer, List<Person>> personByAge = persons
													.stream()
													.collect(Collectors.groupingBy(p -> p.age));
		personByAge.forEach((age, person) -> System.out.format("age %s  : %s", age, person));

		System.out.println();
		//average age of all person
		
		Double averageAge = persons
								.stream()
								.collect(Collectors.averagingInt(p -> p.age));
		System.out.println(averageAge);
		
		
		//statistics
		
		IntSummaryStatistics collect = persons
										.stream()
										.collect(Collectors.summarizingInt(p -> p.age));
		System.out.println(collect);
		
		
		//joining
		
		String msg = persons
						.stream()
						.filter(p -> p.age >= 18)
						.map(p -> p.name)
						.collect(Collectors.joining(" and ", "We know that ", " are best friends...!!!"));
		System.out.println(msg);
		
		// map
		persons.remove(  new Person("Pamela", 23));
		
		System.out.println(persons);
		Map<Integer, String> map = persons
										.stream()
										.collect(Collectors.toMap(
												p -> p.age, 
												p -> p.name, 
												(a1, a2) -> a1 + ";" + a2)); // in case two keys are same. then do like this.
		System.out.println(map);
		
		
		//Build you own collectors
		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(
																			() -> new StringJoiner(" | "), 
																			(j, p) -> j.add(p.name.toUpperCase()), 
																			(j1, j2) -> j1.merge(j2), 
																			StringJoiner::toString);
		
		String names = persons
							.stream()
							.collect(personNameCollector);
		
		System.out.println(names);
		
	}

}
