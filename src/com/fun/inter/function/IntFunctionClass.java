package com.fun.inter.function;

import java.util.function.IntFunction;

public class IntFunctionClass {

	public static void main(String[] args) {
		IntFunction<String> intFun = new IntFunction<String>() {
			@Override
			public String apply(int arg0) {
				return String.valueOf(arg0);
			}
		};
		System.out.println(intFun.apply(20));

		IntFunction<String> intF = Integer::toString;
		System.out.println(intF.apply(20));
	}

}
