package com.fun.inter.consumer;

import java.util.ArrayList;
import java.util.List;

public class Consumer2 {
	public static void main(String[] args) {

		// lambda
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(100);
		listOfInteger.add(200);
		listOfInteger.add(650);
		listOfInteger.add(480);
		listOfInteger.stream().forEach(System.out::println);
	}

}
