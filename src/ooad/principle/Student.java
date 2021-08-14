package com.java4rohit.ooad.principle;


public final  class Student {
	 final String name; 
	 final int age; 
	 final Address1 address;
	

	public Student(String name, int age, Address1 address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Address1 getAddress1() {
		 
		 
		 return address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
