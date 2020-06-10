package com.sri.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String args[]) {

//		HashSet<String> set = new HashSet<String>();
//		set.add("sunny");
//		set.add("Bunny");
//		set.add("People");
//		set.add("Uncle");
////		set.add("sunny");
//
//		System.out.println(set);

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(20);
		l.add(25);

		System.out.println("Before sorting " + l);
		// Default natural sorting order
		Collections.sort(l);

		System.out.println("Default After sorting:" + l);

		// After sorting order
		Collections.sort(l, (I1, I2) -> (I1 > I2) ? -1 : (I1 > I2) ? 1 : 0);
		System.out.println("Customised sorting " + l);

	}

}
