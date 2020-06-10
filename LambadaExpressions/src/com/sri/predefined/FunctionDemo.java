package com.sri.predefined;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String args[]) {
//
//		Function<String, Integer> f = s -> s.length();
//		Function<Integer, Integer> f1 = I -> I * I;
//		System.out.println(f.apply("Srinath"));
//		System.out.println(f.apply("Microsoft"));
//		System.out.println(f1.apply(5));

		// To remove the spaces in the string
//		String s = "Sri nath";
//		Function<String, String> Spaces = s1 -> s1.replaceAll(" ", "");
//
//		System.out.println(Spaces.apply(s));

		// To find the number of spaces present in the String

		String s = "Sri nath";
		Function<String, Integer> noSpaces = s1 -> s1.length() - s1.replaceAll(" ", "").length();

		System.out.println(noSpaces.apply(s));

	}

}
