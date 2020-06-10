package com.sri.predefined;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserPredicate {
	
	public static void main(String args[]) {
		
		
		
		Predicate <User> p = user -> user.userName.equals("durga") && user.pwd.equals("Java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = sc.next();
		System.out.println("Enter the password: ");
		String pwd = sc.next();
		
		User user = new User(userName, pwd);
		
		if(p.test(user)) {
			System.out.println("Valid user, you can get all services");
			
		}else {
			System.out.println("Invalid plz login again");
		}
		
		
	}

}
