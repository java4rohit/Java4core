package com.java4rohit.inherit;

import java.io.Serializable;

import com.java4rohit.hasa.Address;
import com.java4rohit.hasa.Engine;

public class Person implements Comparable<Person>, Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String aadharNo;
	private String name;
	private int age;
	private String address;
	private  Address address1;
	
	private static String fatherName;
	
	public Person() {
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person(String aadharNo, String name, int age, String address) {
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	

	public Person(String aadharNo, String name, int age, String address, Address address1) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.address = address;
		this.address1 = address1;
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	protected String food(String foodName) {
		return "I am eating: " + foodName;
	}

	public static String getClassName() {
		return Person.class.getSimpleName();
	}
	 



	@Override
	public String toString() {
		return "Person [aadharNo=" + aadharNo + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", address1=" + address1 + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		 return o.getName().compareTo(o.getName());
	}


}
