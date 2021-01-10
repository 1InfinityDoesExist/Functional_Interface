package com.fun.inter.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer3 {
	public static void main(String[] args) {
		// stream
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(100);
		listOfInteger.add(200);
		listOfInteger.add(650);
		listOfInteger.add(480);
		listOfInteger.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		});

		// collection
		listOfInteger.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t + " ");
			}
		});
	}
}
