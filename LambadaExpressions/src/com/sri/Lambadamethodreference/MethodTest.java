package com.sri.Lambadamethodreference;

public class MethodTest {

	public static void m2() {
		System.out.println("Implementation by method reference");
	}

	public static void main(String args[]) {
		Interf i = MethodTest::m2;
		i.m1();

	}

}
