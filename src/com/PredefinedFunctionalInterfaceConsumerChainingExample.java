package com;

import java.util.function.Consumer;

public class PredefinedFunctionalInterfaceConsumerChainingExample {

	public static void main(String[] args) {
		 Consumer<String> c1 =m->System.out.println(m);
		 Consumer<String> c2 =n->System.out.println(n);
		 Consumer<String> c3 =o->System.out.println(o);
		 Consumer<String> c4 =c1.andThen(c2).andThen(c3);
		 c4.accept("ravi");
		 
		 

	}

}
