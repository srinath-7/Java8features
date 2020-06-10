package com.sri.predefined;

public class Entry {

	String name;
	int age;
	boolean ishavingGF;

	public Entry(String name, int age, boolean ishavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.ishavingGF = ishavingGF;
	}

	@Override
	public String toString() {
		return name;
	}

}
