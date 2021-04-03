package com.fun.inter.customInterface;

public class CustomeInterfaceImpl {

	public static void main(String[] args) {
		Calculator<Integer, String> calc = new Calculator<Integer, String>() {
			@Override
			public String calculate(Integer arg0, Integer arg1) {
				return String.valueOf(arg0 + arg1);
			}
		};
		System.out.println(calc.calculate(100, 100));
	}
}
