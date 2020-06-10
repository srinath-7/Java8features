package com.sri.collections;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
//		String word1 = (String) o1;
//		String word2 = (String) o2;

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		Integer eno1 = e1.eno;
		Integer eno2 = e2.eno;

		return eno2.compareTo(eno1);
	}

}
