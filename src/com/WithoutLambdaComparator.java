package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			
			return -1;
			
		}
		else if (o1>o2) {
			return 1;
			
		}
		
		else {
		return 0;
		}
	}
	
	
}

public class WithoutLambdaComparator {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new  ArrayList<Integer>();
		
		al.add(20);
		al.add(25);
		al.add(30);
		
		al.add(5);
		al.add(10);
		al.add(15);
		
		System.out.println(al);
		 Collections.sort(al,new MyComparator());
		System.out.println(al);
		

	}

}
