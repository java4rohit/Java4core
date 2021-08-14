package com.java4rohit.collection;

import java.util.Arrays;

import com.java4rohit.inherit.Person;

public class Client {
	  public static void main(String[] args) {


	        DynamicArray arr=new DynamicArray();
	        Person p1=new Person("", 20, "26/1");
	        Person p2=new Person("", 10, "26/5");
	        Person p3=new Person("", 30, "26/5");
	        Person p4=new Person("", 50, "26/5");
	        Person p5=new Person("", 70, "26/5");

	        arr.add(p1);
	        arr.add(p2);
	        arr.add(p3);
	        arr.add(p4);
	        arr.add(p5);
	        

	        Person p6=new Person("", 70, "26/5");
	        arr.add(p6);
	      
	        System.out.print(Arrays.toString(arr.getArray()));
	        
	    }
	} 
