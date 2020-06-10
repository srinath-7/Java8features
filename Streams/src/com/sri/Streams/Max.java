package com.sri.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Max {

	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(4);
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(45);

		System.out.println(list);

		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i1)).get();
		System.out.println("Minimum value :" + min);

		Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum value :" + max);

//		list.stream().forEach(s -> System.out.println(s));

		// By using method reference
//		list.stream().forEach(System.out::println);

		// toArrayMethod
		Integer[] array = list.stream().toArray(Integer[]::new);
		for (Integer x : array) {
			System.out.println(x);
		}

		// .Stream of method
		Double[] d = { 10.0, 10.1, 10.2, 10.3, 10.4 };
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);

	}

}
