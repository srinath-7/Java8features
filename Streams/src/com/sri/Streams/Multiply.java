package com.sri.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply {

	public static void main(String args[]) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(30);
		l.add(12);
		l.add(15);
		l.add(25);
		l.add(40);

		System.out.println(l);

		// Without streams
		List<Integer> l1 = new ArrayList<Integer>();
		for (Integer I1 : l) {
			l1.add(I1 * 2);
		}
		System.out.println(l1);

		// with Streams
		List<Integer> list = l.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println(list);

	}

}
