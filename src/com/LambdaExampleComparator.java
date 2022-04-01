package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExampleComparator {

	public static void main(String[] args) {
ArrayList<Integer> al = new  ArrayList<Integer>();
		
		al.add(20);
		al.add(25);
		al.add(30);
		
		al.add(5);
		al.add(10);
		al.add(15);
		
		System.out.println(al);
		
		Comparator<Integer> i =(i1, i2)->(i1<i2)?-1:(i1>i2)?1:0;
		 
			
		 
		 Collections.sort(al,i);
		System.out.println(al);

	}

}
