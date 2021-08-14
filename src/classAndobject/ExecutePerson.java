package com.java4rohit.classAndobject;

public class ExecutePerson {

	public static void main(String[] args) {
		// Object p1
		Person p1 = new Person();
		/*
		 * p1.name="rohit"; p1.age = 20; p1.gender="male";
		 */
		p1.setvalues("rohit", 20, "male");
		System.out.println("p1 object===: " + p1);

		// OBJ ECT P2
		Person p2 = new Person();
		p2.setvalues("Rahul", 24, "male");
		System.out.println("p2 object===: " + p2);

		System.out.println("================Swap inside this class==============================");
		Person p3;
		p3 = p1;
		p1 = p2;
		p2 = p3;

		System.out.println("p1 object===:" + p1);
		System.out.println("p2 object===:" + p2);

		System.out.println("========Swap inside Person class and also display inside person====");
		Person.swap(p1, p2);  

		System.out.println("========Swap inside Person class and display here: unde conct====");
		System.out.println("p1 object===:"+p1);
		System.out.println("p2 object===:"+p2);

		System.out.println("================Update p1=============");
		
		p1.updated(p1);

		System.out.println("p1 object===:" + p1);
		System.out.println("p2 object===:" + p2);
		

	}
}
