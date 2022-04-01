package com;

import java.util.function.Consumer;

public class PredefinedFunctionalInterfaceConsumerExample {

	public static void main(String[] args) {
		 Consumer<String> c= s->System.out.println(s);
		 c.accept("durga");

	}

}
