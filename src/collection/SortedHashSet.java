package com.java4rohit.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.java4rohit.collection.sorting.PersonNameCompartor;
import com.java4rohit.inherit.Person;

public class SortedHashSet {
	
	public static void main(String[] args) {
		Set<String> names = new TreeSet();
		
		names.add("Rohit");
		names.add("ABCX");
		names.add("RRYZ");
		names.add("DDCV");
		names.add("CCNM");
		names.add("KKLM");
		names.add("GGHB");
		
		System.out.println(names);
		System.out.println("=================Sorted person========================");
		
		Set<Person> personsSet= new TreeSet<Person>();

	 	Person p1=new Person("111", "Rahul", 20, "26/5");
        Person p2=new Person("113","Rohit", 20, "26/5");
        Person p3=new Person("1120","Ram", 30, "26/5");
        Person p4=new Person("115","Shyam", 30, "26/5");
        Person p5=new Person("116","Aaam", 10, "26/5");
        
        personsSet.add(p1);
        personsSet.add(p2);
        personsSet.add(p3);
        personsSet.add(p4);
        personsSet.add(p5);
        
		System.out.println(personsSet);
		System.out.println("Sorting by Name");
		 

	}

}
