package com.java4rohit.inherit;

public class Student extends Person {

	private  int rollno;
	private String stream; 
	public Student() {
		
	}
	 
	public Student(String name, int age,String address,int rollno, String stream){
		super(name,age,address);
		this .rollno=rollno;
		this.stream=stream;
	}
	
	public String study() {
		return "I study: " + stream;
	}

	public int getRollno() {
		return rollno;
	} 
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
 
	public String getStream() {
		return stream;
	}
 
	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Stream=" + stream + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

	 
	
}
