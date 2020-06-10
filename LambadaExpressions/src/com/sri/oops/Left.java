package com.sri.oops;

public interface Left {

	default void m1() {
		System.out.println("This is the left implementation");
	}

	public static void m2() {
		System.out.println("This is the static method of the left");
	}

}
