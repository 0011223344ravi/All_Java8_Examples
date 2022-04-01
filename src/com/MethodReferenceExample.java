package com;
interface xyz{
	
	public void add(int a , int b);
}


public class MethodReferenceExample {
	
	public static void sum (int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
	 
        xyz i =(a,b)->System.out.println(a+b);
        i.add(1, 2);
        xyz i1 =MethodReferenceExample ::sum;
        i1.add(100, 200);
	}

}

//note :-if implementation is already there then go for method reference else go for Lambda 
//expression
