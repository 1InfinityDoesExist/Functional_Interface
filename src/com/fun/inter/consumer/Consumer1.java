package com.fun.inter.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * A Consumer is a functional interface that accepts a single input and returns
 * no output. In layman’s language, as the name suggests the implementation of
 * this interface consumes the input supplied to it.
 * 
 * @author mossad
 *
 */
public class Consumer1 {

	private static final List<Integer> listOfInteger;

	static {
		listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(100);
		listOfInteger.add(200);
		listOfInteger.add(650);
		listOfInteger.add(480);
	}

	public static void main(String[] args) {
		Consumer<Integer> consumer_1 = System.out::println;
		consumer_1.accept(10);

		Consumer<Integer> consumer_2 = (x) -> {
			System.out.println(x);
		};

		Consumer<Integer> consumer_3 = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};

		listOfInteger.stream().forEach(consumer_2);
	}
}
