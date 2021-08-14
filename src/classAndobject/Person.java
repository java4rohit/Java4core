package com.java4rohit.classAndobject;

//===================================Person classified==============
public class Person {
	// Attributes
	private String name;
	private int age;
	private String gender;

	public void setvalues(String name, int age, String gender) {
		if (!name.equals("raju")) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
	}

	//Swapping object method
	static void swap(Person p1, Person p2) {
		Person p3;
		p3=p1;
		p1=p2;
		p2=p3;
		
		System.out.println("p1 object  person class===:"+p1);
		System.out.println("p2 object person class===:"+p2);
	}
	
	
	void updated(Person p1) {		 
	p1.age=22;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "PERSON [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}

// =====================================================================

// 1. Do not allow direct access
// 2. allow indirect access ---> Security
