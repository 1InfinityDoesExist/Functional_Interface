package com.fun.inter.predicate;

import java.util.function.Predicate;

/*
a predicate is a function that receives a value and returns a boolean value.
The Predicate functional interface is a specialization of a Function that receives a generified value and returns a boolean. 
A typical use case of the Predicate lambda is to filter a collection of values:
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
	public static void main(String[] args) {
		Predicate<String> predicate = str -> str.length() > 10;
		System.out.println(predicate.test("Avinash Patel"));
		Predicate<Integer> ageCheck = Example::is18Plus;
		System.out.println(ageCheck.test(2));
	}
}
