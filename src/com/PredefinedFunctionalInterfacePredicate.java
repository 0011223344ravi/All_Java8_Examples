package com;

import java.util.function.Predicate;

public class PredefinedFunctionalInterfacePredicate {

	public static void main(String[] args) {
	 
		Predicate<Integer> p = I ->I%2==0;
		if(p.test(10)) {
			System.out.println("Even Number ");
			
		}
		
		else {
			
			System.out.println("Odd Number ");
		}

	}

}
