package com;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Emp{
	
	int eno;
	String ename;
	Emp(int eno, String ename){
		this.eno=eno;
		this.ename=ename;
		
		
	}
	
}

public class BiFunctionExample {

	public static void main(String[] args) {
		 
ArrayList<Emp> l = new ArrayList<Emp>();
BiFunction<Integer, String, Emp> f = (eno, ename )-> new Emp(eno, ename);
l.add(f.apply(100, "Ravi"));
l.add(f.apply(200, "Durga"));

for(Emp e:l) {
	System.out.print("Employee no "+e.eno);
	 
	System.out.println("Employee name "+e.ename);
	
}
	}

}
