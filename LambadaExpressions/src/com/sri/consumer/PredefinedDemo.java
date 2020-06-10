package com.sri.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedDemo {

	public static void main(String args[]) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("John", 90));
		list.add(new Student("Bob", 75));
		list.add(new Student("Babu", 55));
		list.add(new Student("Boe", 100));
		list.add(new Student("Ram", 78));
		list.add(new Student("Baby", 92));

		Predicate<Student> p = s -> s.marks >= 60;

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Dictiontion]";
			} else if (marks >= 60) {
				return "B[first class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 35) {
				return "D[Third Class]";
			} else {
				return "E[failed]";
			}
		};

		Consumer<Student> c = s -> {
			System.out.println("Name:" + s.name);
			System.out.println("Marks :" + s.marks);
			System.out.println("Grade" + f.apply(s));
			System.out.println();
		};

		for (Student s : list) {
			if (p.test(s)) {
				c.accept(s);
			}
		}

	}

}
