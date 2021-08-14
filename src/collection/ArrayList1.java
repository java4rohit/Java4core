package com.java4rohit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javafx.print.Collation;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		  

		
		
		li.add("rohit");
		li.add("rahul");
		li.add("raj");
		li.add("anurag");
		li.add("vivek");
		li.ad
		//print the arrayList list
		
		System.out.println(li);
		System.out.println("========================");
		
		//traversing list through Iterator
		Iterator itr= li.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=======================");
		for( String ir: li)
			System.out.println(ir);
		
		System.out.println("=================");
		System.out.println(li.get(2));
		
		li.set(2, "yash");
		
		System.out.println("==========");
		
		for(String af:li)
			System.out.println(af);
		
		System.out.println("=====Sort==========");
		
		//Sorting the list
		Collections.sort(li);
		for(String i :li)
			System.out.println(i);
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ej");
		list.add("dshyam");
		list.add("fghyamsyam");
		list.add("asuraj");
		list.add("cjay");
		list.add("bjay");
		
		System.out.println("Traversing list through List Iterator");
		
		 ListIterator<String> list1=list.listIterator(list.size());
		 
		 while(list1 .hasPrevious()) {
			 String str =list1.previous();
			 System.out.println(str);
		 }
		 
		 System.out.println("Traversing list through forEach() method");
		 
		 list.forEach(a->{
			 System.out.println(a);
		 });
		 
		 
			
		

		
	}

}
