package com.fun.inter.supplier;

import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {
		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "I am with you . I am within you.!!!!!";
			}
		};

		System.out.println(supplier.get());
	}

}
