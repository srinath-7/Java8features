package com.sri.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

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
			if (I1 % 2 == 0) {
				l1.add(I1);
			}
		}
		System.out.println(l1);

		// with Streams
		List<Integer> list = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

	}

}
