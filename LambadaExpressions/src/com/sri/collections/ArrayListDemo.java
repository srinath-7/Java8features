package com.sri.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String args[]) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(100, "Alpha"));
		l.add(new Employee(50, "Beta"));
		l.add(new Employee(28, "Cake"));
		l.add(new Employee(75, "Bake"));

		System.out.println(l);
		// Using the lambada expressions
//		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting:" + l);

	}

}
