package com.fun.inter.customInterface;

@FunctionalInterface
public interface Calculator<T, R> {

	public abstract R calculate(T arg0, T arg1);

}
