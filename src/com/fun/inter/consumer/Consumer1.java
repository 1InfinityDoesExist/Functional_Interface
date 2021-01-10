package com.fun.inter.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
	public static void main(String[] args) {
		Consumer<List<Integer>> consumes = list -> {
			for (int iter = 0; iter < list.size(); iter++) {
				System.out.print(list.get(iter) + " ");
			}
		};
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(100);
		listOfInteger.add(200);
		listOfInteger.add(650);
		listOfInteger.add(480);
		consumes.accept(listOfInteger);
	}
}
