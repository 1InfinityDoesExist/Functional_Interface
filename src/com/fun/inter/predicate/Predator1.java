package com.fun.inter.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predator1 {
	public static void main(String[] args) {
		String[] names = { "Avinash", "Patel", "Pyush", "Jaiswal", "Rajat", "Aayesha" };
		List<String> filteredNamed = Stream.of(names).filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.startsWith("A") ? true : false;
			}
		}).collect(Collectors.toList());
		filteredNamed.stream().forEach(System.out::println);
		// Lambda expression

		List<Integer> amounts = new ArrayList<Integer>();
		amounts.add(1200);
		amounts.add(4500);
		amounts.add(6520);
		amounts.add(8453);
		amounts.stream().filter(amount -> amount % 2 != 0 ? true : false).forEach(System.out::println);
	}

}
