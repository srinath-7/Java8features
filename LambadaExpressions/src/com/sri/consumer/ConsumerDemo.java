package com.sri.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String args[]) {

//		ArrayList<Movie> l = new ArrayList<Movie>();
//		l.add(new Movie("X", "Prabhas", "Ramba"));
//		l.add(new Movie("Y", "Ram", "Rasi"));
//		l.add(new Movie("Z", "Charan", "neptun"));

//		System.out.println(l);

//		Consumer<String> c = s -> System.out.println(s);
//		c.accept("hello");
//		c.accept("Durgasoft");
//
//		Consumer<Movie> c = m -> {
//			System.out.println("Movie name: " + m.name);
//			System.out.println("Movie name " + m.actor);
//
//		};
//		for (Movie m : l) {
//			c.accept(m);
//		}
//
		Movie movie = new Movie("X", "Prabhas", "Ramba");
		Movie m1 = new Movie("Salute", "Ram", "Chiru");

		Consumer<Movie> c1 = m -> System.out.println("Movie " + m.name + " is ready to release ");
		Consumer<Movie> c2 = m -> System.out.println("Movie " + m.actor + " is Hero");
		Consumer<Movie> c3 = m -> System.out.println("Movie " + m.acteress + " is actress");
		Consumer<Movie> c4 = m -> System.out.println();

		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3).andThen(c4);
		chainedC.accept(movie);
		chainedC.accept(m1);

	}

}
