package com.sri.predefined;

import java.util.function.Predicate;

public class CheckAge {

	public static void main(String args[]) {

		Entry[] list = { new Entry("Durga", 60, true), new Entry("Srinath", 28, true), new Entry("People", 32, true),
				new Entry("Tony", 17, true) };

		Predicate<Entry> allowed = entry -> entry.age >= 18 && entry.ishavingGF;

		System.out.println("The allowed members into pub are:");
		for (Entry entry : list) {
			if (allowed.test(entry)) {
				System.out.println(entry);
			} else {
				System.out.println();
			}
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age of the customer:");
//		int age = sc.nextInt();
//		System.out.println("Enter the dress of the customer:");
//		String dress = sc.next();

//		if (p.test(entry)) {
//			System.out.println("You can go and dance inside");
//		} else {
//			System.out.println("You need to be over 18");
//		}

	}

}
