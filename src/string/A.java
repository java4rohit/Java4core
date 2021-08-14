package com.java4rohit.string;

import com.java4rohit.accesModifier.main;

final class person {

	final private int age;
	final private String name;

	public person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "person [age=" + age + ", name=" + name + "]";
	}

}

class A {
	public static void main(String[] args) {

		person p = new person(22, "rohit");

		System.out.println(p);

		p = new person(20, "rohit");

		System.out.println(p);

		Employe e = new Employe();
		e.getAge();

	}

}
