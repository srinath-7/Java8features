package com.sri.collections;

public class Employee {

	int eno;
	String ename;

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}

}
