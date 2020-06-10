package com.sri.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String args[]) {

		// Generate a random name from given string
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinnu", "Vinay" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
//
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
////
//	}

//		// Generate otp number randomly
//		
		Supplier<String> s1 = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s1.get());

	}

}
