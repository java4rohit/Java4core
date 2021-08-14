package com.java4rohit.AutomaticPromotion;

public class Test {
	
	void show(int a) {
		System.out.println("int method");
	}
	
	void show(String a) {
		System.out.println("string method");
	}
	
	public static void main(String[] args) {
		
		Test t= new Test();
		t.show('a');
		

	}

}
