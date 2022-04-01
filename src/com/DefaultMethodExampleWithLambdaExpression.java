package com;


interface inter{
	
	public void m1(int a );
	
	default void add (int a, int b) {
		System.out.println(a+b);
	}
	  
public class DefaultMethodExampleWithLambdaExpression {

	public static void main(String[] args) {
		inter i =a->System.out.println(a);
		i.m1(4);
		i.add(30, 10);

	}

}
}