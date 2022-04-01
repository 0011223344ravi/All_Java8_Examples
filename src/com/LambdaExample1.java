package com;
 
interface ABCD {
public void m1(int a, int b);
	
}
public class LambdaExample1 {

	public static void main(String[] args) {
	ABCD i =(a,b)->System.out.println(a+b);
	i.m1(2,3);

	}

}
