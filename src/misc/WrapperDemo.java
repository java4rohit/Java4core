package com.java4rohit.misc;

public class WrapperDemo {
	
	
	static int i=5;

	static Integer it=10;
	
	public static void main(String[] args) {
		
		
		double d= 10.0;
		float f = 10.5f;
		
		
		Double db =10.0;
		
	 //Default value
		System.out.println(i);
		System.out.println(it);
		
		i =10;
		 
		i = it; //Unboxing
		it = i; //Autoboxing
		System.out.println("=====================================");
		System.out.println(i);
		System.out.println(it);
		
		
		String s = "10.0";
		Double c = Double.parseDouble(s);
		System.out.println(c);
		
		
	}
	

}
