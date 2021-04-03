package com.fun.inter.binaryOperator.premitive;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicPremitiveExample {
	public static void main(String[] args) {
		IntStream.range(1, 4).forEach(System.out::println);
		Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).map(n -> n * n).average().ifPresent(System.out::println);
		Stream.of(15.5, 2.8, 9.6).mapToInt(Double::intValue).forEach(System.out::println);
	}
}
