package com.sri.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {

//		TreeSet<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		TreeSet<String> set = new TreeSet<String>((S1, S2) -> S2.compareTo(S1));

		set.add("dower");
		set.add("cood");
		set.add("aython");
		set.add("zebra");
//		set.add(10);
//		set.add(15);
//		set.add(20);
//		set.add(3);
//		set.add(45);

//		System.out.println("Default natural sorting order:" + set);

		System.out.println(set);

		// After customised sorting order
//		System.out.println("natural sorting order:" + (String S1, String S2) -> (S1 > S2) ? -1 : (S1 > S2) ? 1 : 0));
//		Collections.SortedSet(set);

	}

}
