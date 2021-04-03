package com.fun.inter.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorClass {

	public static void main(String[] args) {
		UnaryOperator<String> un = new UnaryOperator<String>() {
			@Override
			public String apply(String arg0) {
				// TODO Auto-generated method stub
				return arg0.toUpperCase();
			}
		};
		System.out.println(un.apply("avinash patel"));
		UnaryOperator<String> unOperator = "Hello"::concat;
		System.out.println(unOperator.apply(" World!!!!!"));
	}

}
