package com;

interface left {
	default void m1() {
		System.out.println("default method of interface left");
	}
	
}

interface right {
	default void m1() {
		System.out.println("default method of interface right");
	}
	
}

 

public class DefaultMethodExampleSecond  implements left , right {

	public static void main(String[] args) {
		 
		DefaultMethodExampleSecond dmes = new DefaultMethodExampleSecond();
		dmes.m1();
	}

	public void m1() {
		System.out.println("our own m1() method");
		
		right.super.m1();
		left.super.m1();
	}
	
	
}
