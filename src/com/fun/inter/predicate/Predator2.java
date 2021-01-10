package com.fun.inter.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Predicate with lambda expression
public class Predator2 {
	public static void main(String[] args) {

		// filter ---- Stream
		String[] names = { "Avinash", "Patel", "Pyush", "Jaiswal", "Rajat", "Aayesha" };
		List<String> filteredNamed = Stream.of(names).filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.startsWith("A") ? true : false;
			}
		}).collect(Collectors.toList());
		filteredNamed.stream().forEach(System.out::println);

		// removeIf ---- Collection
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(365);
		numbers.add(21);
		numbers.add(40);
		numbers.add(10);
		numbers.add(20);
		numbers.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return (num % 2) == 0 ? true : false;
			}
		});
		numbers.stream().forEach(System.out::println);
	}

	/*
	 * List<Integer> numbers = Arrays.asList(100, 365, 21, 40, 10, 20) gives
	 * UnsupportedOperationException
	 * 
	 * Reason: When call Arrays.asList(String… a) method it returns fixed-size list
	 * backed by specified array so when you try to modify the list i.e. add or
	 * remove value from it will throw UnsupportedOperationException.
	 */

}
