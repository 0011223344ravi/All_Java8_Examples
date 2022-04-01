package com;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionalInterfaceCombiningFunctionAndPredicate {

	public static void main(String[] args) {
		 int x [] = {0,5,10,15,20,25,30};
		 Predicate<Integer> p =i->i%2==0;
		 Function<Integer, Integer> f = s->10;
		 for (int x1:x) {
			 if(p.test(x1)) {
				 f.apply(x1);
			 }
			 
			 
		 }

	}

}
