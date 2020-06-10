package com.sri.collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {

//		TreeMap<Integer, String> m = new TreeMap<Integer, String>();

		TreeMap<Integer, String> m = new TreeMap<Integer, String>((I1, I2) -> (I2.compareTo(I1)));
		m.put(150, "Apple");
		m.put(200, "Banana");
		m.put(500, "Orange");
		m.put(800, "Dog");
		m.put(50, "Monk");

		System.out.println(m);

	}

}
