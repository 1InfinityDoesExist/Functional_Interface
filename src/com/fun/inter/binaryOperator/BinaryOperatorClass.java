package com.fun.inter.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorClass {

	public static void main(String[] args) {
		BinaryOperator<Integer> bin = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0 + arg1;
			}
		};
		
		System.out.println(bin.apply(2, 4));
	}

}
