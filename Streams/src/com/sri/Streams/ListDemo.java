package com.sri.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("captain");
		list.add("brother");
		list.add("apple");
		list.add("superior");
		list.add("parrot");

		System.out.println(list);

		List<String> str = list.stream().filter(s -> s.length() >= 6).collect(Collectors.toList());
		System.out.println(str);

		List<String> str1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(str1);

		// count method
		long count = list.stream().filter(s -> s.length() >= 6).count();
		System.out.println("The number of string whose length is greater than 6 is " + count);

		// default Sorting method
		List<String> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);

		// customised sorting order
		List<String> customisedSorting = list.stream().sorted((s1, s2) -> s2.compareTo(s1))
				.collect(Collectors.toList());

		System.out.println(customisedSorting);

	}

}
