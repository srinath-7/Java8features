package com.sri.functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class SalaryIncrement {

	public static void main(String args[]) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Sri", 70000));
		l.add(new Employee("Ram", 80000));
		l.add(new Employee("Mark", 90000));
		l.add(new Employee("Monk", 70000));

		System.out.println(l);

		Function<ArrayList<Employee>, Double> f = l1 -> {
			double total = 0;
			for (Employee e : l1) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("The total salary of this month " + f.apply(l));

	}

}
