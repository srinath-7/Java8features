package com.sri.BiFunctions;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String args[]) {
//
//		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
//
//		System.out.println(p.test(10, 20));
//
//		BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
//
//		System.out.println(f.apply(10, 20));

		ArrayList<Student> list = new ArrayList<Student>();

		BiFunction<String, Integer, Student> f = (name, rollno) -> new Student(name, rollno);
		list.add(f.apply("Durga", 100));
		list.add(f.apply("Ravi", 200));
		list.add(f.apply("Shiva", 300));

		for (Student s : list) {
			System.out.println("name :" + s.name);
			System.out.println("Roll no " + s.rollno);
			System.out.println();
		}

		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
		c.accept("Sri", "nath");

	}

}
