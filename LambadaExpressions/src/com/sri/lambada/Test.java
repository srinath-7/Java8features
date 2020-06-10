package com.sri.lambada;

@FunctionalInterface
interface Test {

//	public void m1(int a, int b);

//	public int getLength(String s);

	public int square(int x);

	default void m2() {

		System.out.println("This is the default method");

	}

	public static void m3() {

		System.out.println("This is the static method");
	}

}