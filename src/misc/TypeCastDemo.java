package com.java4rohit.misc;

import com.java4rohit.inherit.Employee;
import com.java4rohit.inherit.Person;
import com.java4rohit.inherit.Student;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		//1. Auto Conversion (type casting)
		double d = i;
		
		System.out.println(d);
		
		double x = 10.5;		
		//2. manual Type casting
		int y = (int)x;
		System.out.println(y);
		
		System.out.println("==============================");
		
		Person p = new Person();
		Student s = new Student();
		
		//Auto type casting
		p = s;
		
		//Manual Type casting
		s=(Student)p;
		
		 Employee emp = new Employee();
		
	}
	
}

//Type Casting : 1. Auto, 2. mannual
