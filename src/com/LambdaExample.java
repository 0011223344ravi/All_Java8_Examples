package com;
 
interface ABC{
	
	public void m1();
}
public class LambdaExample {
	
	
	 
	  
public static void main(String[] args) {
		
		ABC i =()-> System.out.println("Hello");
		i.m1();
	}

}
