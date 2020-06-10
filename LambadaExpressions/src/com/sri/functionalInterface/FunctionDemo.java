package com.sri.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String args[]) {

		ArrayList<Student> list = new ArrayList<Student>();
//		populate(list);
		list.add(new Student("John", 90));
		list.add(new Student("Bob", 75));
		list.add(new Student("Babu", 55));
		list.add(new Student("Boe", 100));
		list.add(new Student("Ram", 78));

		Predicate<Student> p = s -> s.marks >= 60;

		for (Student s : list) {
			if (p.test(s)) {
				System.out.print("name " + s.name);
				System.out.print("marks " + s.marks);
			}
		}

//		Function<Student, String> f = s -> {
//			int marks = s.marks;
//			if (marks >= 80) {
//				return "A[Dictiontion]";
//			} else if (marks >= 60) {
//				return "B[first class]";
//			} else if (marks >= 50) {
//				return "C[Second Class]";
//			} else if (marks >= 35) {
//				return "D[Third Class]";
//			} else {
//				return "E[failed]";
//			}
//		};
//		for (Student s : list) {
//			System.out.println("Student name " + s.name);
//			System.out.println("Student Marks:" + s.marks);
//			System.out.println("Student Grade:" + f.apply(s));
//			System.out.println();
//		}
//
//	}

//	public static void populate(ArrayList<Student> list) {
//		list.add(new Student("John", 90));
//		list.add(new Student("Bob", 75));
//		list.add(new Student("Babu", 55));
//		list.add(new Student("Boe", 100));
//		list.add(new Student("Ram", 78));
//
//	}

	}
}
