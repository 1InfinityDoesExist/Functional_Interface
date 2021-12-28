package com.fun.inter.supplier;

import java.util.function.Supplier;

/**
 * A Supplier is a simple interface which indicates that this implementation is
 * a supplier of results. This interface, however, does not enforce any
 * restrictions that supplier implementation needs to return a different result
 * on each invocation. The supplier has only one method get() and does not have
 * any other default and static methods.
 * 
 * @author mossad
 * 
 *         IntSupplier int getAsInt();
 *         DoubleSupplier double getAsDouble();
 *         LongSupplier long getAsLong(); 
 *         BooleanSupplier boolean getAsBoolean();
 *
 */
public class SupplierClass {

	public static void main(String[] args) {

		Supplier<Double> supplier_1 = Math::random;

		Supplier<String> supplier_2 = () -> {
			return "Hello World";
		};

		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "I am with you . I am within you.!!!!!";
			}
		};

		System.out.println(supplier.get());
	}
}
