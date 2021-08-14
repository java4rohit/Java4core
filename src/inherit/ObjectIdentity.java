package com.java4rohit.inherit;

public class ObjectIdentity {

	public static void main(String[] args) {
		
		Person p1 = new Person("xyz001", "Rahul", 22, "26/5 Joydev Avenue");
		Person p2 = new Person("xyz001", "Rohit", 22, "26/5 Joydev Avenue");
	
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		System.out.println(p1.equals(p2));
		
		ObjectIdentity oi = new ObjectIdentity();
		System.out.println("===============================");
		System.out.println(oi);
		System.out.println(oi.hashCode());
		
	}
	
}

//Rule1: If two object have same hasCode, they must be equal(true)
//Rule2: If two object are same by equal(true) then hasCode may not be the same
//Rule3, Both hasCode and equals must be overridden together
