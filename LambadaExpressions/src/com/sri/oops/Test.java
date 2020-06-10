package com.sri.oops;

public class Test implements Left {

	@Override
	public void m1() {
		System.out.println("This is the test class implementation");
		Left.super.m1();
	}

}
