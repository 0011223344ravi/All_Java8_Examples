package com;

import java.util.ArrayList;

public class WithoutStreamExampleMapping {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(25);
		System.out.println(al);
		
		ArrayList<Integer>al1 = new ArrayList<Integer>();
		for(Integer i :al) {
			 
				al1.add(2*i);
			
		}
		  System.out.println(al1);


	}

}
