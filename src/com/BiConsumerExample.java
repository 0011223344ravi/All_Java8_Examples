package com;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		 BiConsumer<Integer,Integer> bc =(x,y)->System.out.println(x+y);
		 bc.accept(1, 2);

	}

}
