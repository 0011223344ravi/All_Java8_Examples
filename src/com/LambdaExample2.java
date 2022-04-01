package com;
 

interface ABCDE{
	public void m1(int n); 
}
public class LambdaExample2   {

	 

	public static void main(String[] args) {
		 
     
      //lambda Expression
      
		ABCDE i = n->System.out.println(n*n);
         i.m1(4);
	}

  
}


