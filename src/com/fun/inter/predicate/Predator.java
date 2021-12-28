package com.fun.inter.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
a predicate is a function that receives a value and returns a boolean value.
The Predicate functional interface is a specialization of a Function that receives a generified value and returns a boolean. 
A typical use case of the Predicate lambda is to filter a collection of values:


A Predicate interface represents a boolean-valued-function of an argument. This is mainly used to filter data from a Java Stream. The filter method of a stream accepts a predicate to filter the data and return a new stream satisfying the predicate. A predicate has a test() method which accepts an argument and returns a boolean value.
 */
class Example {
	public static boolean is18Plus(Integer age) {
		if (age < 18) {
			return false;
		}
		return true;
	}
}

public class Predator {

	private static final List<String> names;

	static {
		names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
	}

	public static void main(String[] args) {

		Predicate<Integer> ageCheck = Example::is18Plus;
		System.out.println(ageCheck.test(10));

		Predicate<String> str = (s) -> {
			return s.length() < 5;
		};

		Predicate<Integer> ageCheck_1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer age) {
				return age == 20;
			}
		};

		names.stream().filter(str).forEach(System.out::println);
	}
}
