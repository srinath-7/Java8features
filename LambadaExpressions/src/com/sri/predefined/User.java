package com.sri.predefined;

public class User {

	String userName;
	String pwd;

	public User(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + "]";
	}

}
