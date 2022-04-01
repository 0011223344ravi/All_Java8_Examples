package com;

class Sample{
	
	Sample(){
		System.out.println("constructor reference example");
	}
}

interface cde{
	public Sample get();
}
public class ConstructorReferenceExample {

	public static void main(String[] args) {
	 cde i =Sample ::new ;
	 Sample s1 = i.get();
	 Sample s2 = i.get();

	}

}
