package com.java4rohit.Polymorphism;

//overloading

public class Test {
	
	void show() {
		System.out.println("1");
	}
	void show( int a) {
		
		System.out.println("2");
		
	}
	
	public static void main(String[] args) {
		Test test= new  Test();
		test.show();
	}
	
	

}
