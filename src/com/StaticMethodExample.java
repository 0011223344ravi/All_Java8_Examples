package com;
interface test{
	public static void m1() {
		
		System.out.println("interface m1 () method");
	}
	
	
}

public class StaticMethodExample implements test  {

	public static void main(String[] args) {
		 test.m1();

	}

}
