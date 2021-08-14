package com.java4rohit.callByValue;

public class Perssion  {

	private String name;
	private  int age;
	
	public Perssion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public void updateAge(Perssion p1) {
		p1.setAge(24);
		
		System.out.println(p1.getAge());
	}

	@Override
	public String toString() {
		return "Perssion [name=" + name + ", age=" + age + "]";
	}
	
	
}
