package com.fun.inter.function;

import java.util.ArrayList;
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

public class Function1 {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		Function<Employee, Integer> function = (emp) -> {
			return emp.getAge();
		};

		List<Integer> ages = new ArrayList<Integer>();
		for (Employee emp : employeeList) {
			ages.add(function.apply(emp));
		}
		ages.stream().forEach(System.out::println);
	}

}
