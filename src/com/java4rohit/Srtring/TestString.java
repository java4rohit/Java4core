package com.java4rohit.Srtring;

public class TestString {
	public static void main(String[] args) {
		
		// equal method of object class they compared b/t two reference 
		//object
		TestString s= new TestString();
		TestString s1= new TestString();
		
		System.out.println("object class");
		System.out.println(s.equals(s1));
		// it is same of object clss == method
		System.out.println(s==s1);
		
	    System.out.println("String");
	    
		// in String class override the equal method of object class  they comapre 
		// b/t  content compareion
	    
		String s2= ("rohit");
		String s3= ("rohit");
		
		System.out.println(s2.equals(s3));// true
		System.out.println(s2==s3);//true
		
		String s4= new String("hello");
		String s5= new String("hello");
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);
		
		
	}

}
