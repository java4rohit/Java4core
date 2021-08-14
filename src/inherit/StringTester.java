package com.java4rohit.inherit;

public class StringTester {

	public static void main(String[] args) {
		
		String s1 = "Rohit";
		String s2 = "Rohit";
		String s3 = new String("Rohit");
		String s4 = new String("Rohit");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //False
		System.out.println(s2==s3); //False
		System.out.println(s3==s4); //
		
	}
}

//Q1. Why string prints as it is, but not Person pbject
//Q2. Difference of creating string object 1. String s = new String("Rohit"); 2 String s = "Rohit";
