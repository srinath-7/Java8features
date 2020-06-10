package com.sri.BiFunctions;

import java.util.function.BiFunction;

public class CalculateWage {

	public static void main(String args[]) {

		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;

		Employee e = new Employee(101, "Durga", 2000);
		TimeSheet t = new TimeSheet(101, 30);

		Employee e1 = new Employee(102, "Sri", 3000);
		TimeSheet t1 = new TimeSheet(102, 30);

		System.out.println("Monthly salary is: " + f.apply(e, t));
		System.out.println("Montly salary is: " + f.apply(e1, t1));

	}

}
