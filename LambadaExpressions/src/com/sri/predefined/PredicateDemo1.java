package com.sri.predefined;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String args[]) {

//		String[] names = { "Sunny", "Kajal", "Mallika", "Katrina", "Karena" };

//		System.out.println(names[0]);

		String[] names = { "Sunny", "Kajal", "", null, "Super", "Ball", null };
		Predicate<String> p = s -> s != null && s.length() > 0;
		ArrayList<String> l = new ArrayList<String>();

		for (String s : names) {
			if (p.test(s)) {
				l.add(s);
			}
		}
		System.out.println(l);

//
//		Predicate<String> StartsWithK = s -> s.charAt(0) == 'K';
//
//		for (String S : names) {
//			if (StartsWithK.test(S)) {
//				System.out.println(S);
//			}
//		}
	}

}
