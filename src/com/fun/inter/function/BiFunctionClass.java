package com.fun.inter.function;

import java.util.function.BiFunction;

public class BiFunctionClass {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFun = new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer arg0, Integer arg1) {
				return String.valueOf(arg0 + arg1);
			}
		};

		System.out.println(biFun.apply(2, 10));
	}

}
