package com;
interface interf{
	
	public void m1(int a );
	   default void add (int a, int b) {
		System.out.println(a+b);
	}
	   
}

public class DefaultMethodExample implements interf {

	public static void main(String[] args) {
		 
      DefaultMethodExample dme = new DefaultMethodExample();
      dme.add(3, 4);
      dme.m1(4);
      
	}

	@Override
	public void m1(int a) {
		System.out.println(a);
		
	}

}
