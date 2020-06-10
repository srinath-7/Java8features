package com.sri.predefined;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String args[]) {

//		Predicate<Integer> p = I -> I > 10;
//		System.out.println(p.test(100));
//		System.out.println(p.test(5));

		Predicate<Collection> o = C -> C.isEmpty();
		ArrayList l = new ArrayList();
//		l.add("Hero");

		System.out.println(o.test(l));

	}

}
