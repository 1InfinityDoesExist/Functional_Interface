package com.fun.inter.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Employee {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
}

/**
 * A Function interface is more of a generic one that takes one argument and
 * produces a result. This has a Single Abstract Method (SAM) apply which
 * accepts an argument of a type T and produces a result of type R. One of the
 * common use cases of this interface is Stream.map method.
 * 
 * @author mossad
 *
 */
public class Function1 {

	private static final List<Employee> employeeList;

	static {
		employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
	}

	public static void main(String[] args) {

		Function<String, Integer> nameMappingFunction1 = String::length;
		System.out.println(nameMappingFunction1.apply("Avinash Patel"));

		// OR
		Function<String, Integer> nameMappingFunction2 = (name) -> {
			return name.length();
		};

		// OR

		Function<Employee, Integer> nameMappingFunction3 = new Function<Employee, Integer>() {

			@Override
			public Integer apply(Employee emp) {
				return emp.getName().length();
			}
		};

		employeeList.stream().map(nameMappingFunction3).forEach(System.out::println);
	}

}
