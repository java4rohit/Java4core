package com.java4rohit.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistTest {
	
	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		System.out.println(l);
		
		System.out.println("=======Traversal by Iterator======");
		
		Iterator <String>itr= l.iterator();
		System.out.println(itr);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("=============travels forwrd by ListIterator=========");
		
		ListIterator<String> itrr=l.listIterator();
		while(itrr.hasNext()) {
			System.out.println(itrr.next());
			
		}
		
		System.out.println("============backwrd using list iterator==========");
		
             while(itrr.hasPrevious()) {
            	 System.out.println(itrr.previous());
             }
		
		
	}
	
	

}
