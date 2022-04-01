package com;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int id ;
	String Name ;
	Employee(int id , String Name ){
		
		this.id =id;
		this.Name =Name;
	}
	
	public String toString() {
		
		return id+""+Name;
	}
	
}

public class LambdaExampleComparable {

	public static void main(String[] args) {
		 ArrayList<Employee> al = new ArrayList<Employee>();
		 al.add(new Employee(1,"Ravi"));
		 al.add(new Employee(2,"Kavi"));
		 al.add(new Employee(3,"Tabi"));
		 
		 System.out.println(al);
		 Collections.sort(al,(e1,e2)->e1.Name.compareTo(e2.Name));
		 
		 System.out.println(al);
	}

}
