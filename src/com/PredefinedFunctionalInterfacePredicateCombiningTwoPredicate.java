package com;

import java.util.Scanner;
import java.util.function.Predicate;

//and , or and negate

public class PredefinedFunctionalInterfacePredicateCombiningTwoPredicate {

	public static void main(String[] args) {
	 int [] x = {0,5,10,15,20,25,30};
	 Predicate<Integer> p1 = i ->i%2==0;
	 Predicate<Integer> p2 = i ->i>10 ;
	 System.out.println("The no which are even and greater than 10 are ");
	 for (int x1:x) {
		 if(p1.and(p2).test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 
	 System.out.println("The no which are even ");
	 for (int x1:x) {
		 if(p1. test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 System.out.println("The no which are greater than 10   ");
	 for (int x1:x) {
		 if(p2.test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 System.out.println("The no which are even or greater than 10 are ");
	 for (int x1:x) {
		 if(p1.or(p2).test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 System.out.println("The no which are not  even   ");
	 for (int x1:x) {
		 if(p1.negate().test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 System.out.println("The no which are not  greater than 10 ");
	 for (int x1:x) {
		 if(p2.negate().test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }
	 
	 
	 System.out.println("The no which are not even and not  greater than 10 ");
	 for (int x1:x) {
		 if(p1.and(p2).negate().test(x1)) {
			 System.out.println(x1);
		 }
		 
	 }

	}

}
