package com.sri.primitiveFunctions;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String args[]) {
//
//		IntFunction<Integer> f = i -> i * i;
//
//		System.out.println(f.apply(5));
//
////		ToIntFunction<String> f1 = s -> s.length();
////		System.out.println(f1.applyAsInt("durga"));
////
////		IntToDoubleFunction f3 = i -> Math.sqrt(i);
////		System.out.println(f3.applyAsDouble(25));
//
//		IntConsumer c = i -> System.out.println(i * i);
//		c.accept(10);
//		
//		IntSupplier s = () -> (int) (Math.random() * 10);
//		String otp = "";
//		for (int i = 0; i <= 6; i++) {
//			otp = otp + s.getAsInt();
//		}
//		System.out.println("The 6 digit OTP:" + otp);

		UnaryOperator<Integer> o = i -> i * i;
		System.out.println(o.apply(10));
		System.out.println(o.apply(20));

		IntUnaryOperator f = i -> i * i;
		System.out.println(f.applyAsInt(10));
		System.out.println(f.applyAsInt(15));

	}
}
