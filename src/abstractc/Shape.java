package com.java4rohit.abstractc;

public abstract class Shape {

	public Shape() {

	}

	public abstract double area(int length);

	public void display(String shapeName, double area) {
		System.out.println(shapeName + " area :" + area);
	}

}


//rule1. abstract class, let declare the method with abstract keyword
//Rule2. A class never let declare a method 
//rule3, A interface only let declare the method
//rule4, Object cannot be created of a abstract class
//rule5, Abstract class have constructor
//rule6, A abstract class, may not have any abstract method

//Most important purpose of abstract class is that its object cant be created