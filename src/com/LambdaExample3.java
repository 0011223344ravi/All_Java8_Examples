package com;

 

interface A{
	
	public void m1(String s);
}
public class LambdaExample3 {
	
	

	public static void main(String[] args) {
		 
   A i = s->System.out.println(s.length());
   i.m1("ravi");
	}

}
