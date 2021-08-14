package com.java4rohit.collection;

import java.util.HashSet;
import java.util.Set;

import com.java4rohit.inherit.Person;

public class SetClient {
	public static void main(String[] args) {
		 Set<Person> a2= new HashSet<Person>();
		 
			
		   
		 	Person p1=new Person("111", "Rahul", 20, "26/5");
	        Person p2=new Person("113","Rohit", 10, "26/5");
	        Person p3=new Person("1120","Ram", 30, "26/5");
	        Person p4=new Person("115","Shyam", 50, "26/5");
	        Person p5=new Person("116","Shyam", 44, "26/5");
	        Person p6=new Person("117","Shyam", 50, "26/5");
	        Person p7=new Person("118","Shyam", 22, "26/5");
	        Person p8=new Person("119","Shyam", 55, "26/5");
	        Person p9=new Person("120","Shyam", 11, "26/5");
	        
	        p1.equals(p2);
	        
	        a2.add(p1);
	        a2.add(p2);
	        a2.add(p3);
	        a2.add(p4);
	        a2.add(p5);
	        a2.add(p6);
	        a2.add(p7);
	        a2.add(p8);
	        a2.add(p9);
	        a2.size();
	        
	       
	        
	        
	        for(Person p :a2)
	        {
	      
	        System.out.println(p);
	        }
	}

}
