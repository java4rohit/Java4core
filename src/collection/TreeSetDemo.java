package com.java4rohit.collection;

import java.util.TreeSet;

class Students implements Comparable {

	String name, address;
	int age;

	Students(String name, String address, int age) {
		this.address = address;
		this.age = age;
		this.name = name;

	}

	@Override
	public int compareTo(Object o) 
	{
		Students s=(Students)o;
		
		if(this.age>s.age)
			return 1;
		else if(this.age<s.age)
			return -1;
		else
			return 0;
		

		
	}

	public String toString() {
		return name + " " + address + " " + age;

	}
}

public class TreeSetDemo {

	public static void main(String[] args) {

		Students c = new Students("rohit", "dgp", 55);
		Students c1 = new Students("rahul", "kolkata", 45);
		Students c2 = new Students("akash", "assam", 65);
		Students c3 = new Students("akash", "assam", 65);

		TreeSet t = new TreeSet();

		t.add(c);
		t.add(c1);
		t.add(c2);
		t.add(c3);

		// there is a problem when you add both interager and String Value
		// expection will throws "ClassCastExpection"

		System.out.println(t);

	}

}
