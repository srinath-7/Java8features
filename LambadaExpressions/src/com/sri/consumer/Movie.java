package com.sri.consumer;

public class Movie {

	String name;
	String actor;
	String acteress;

	public Movie(String name, String actor, String acteress) {
		super();
		this.name = name;
		this.actor = actor;
		this.acteress = acteress;
	}

	@Override
	public String toString() {
		return name + " " + actor;
	}

}
