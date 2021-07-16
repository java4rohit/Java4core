package com.java4rohit.SrtringTimeStringBilder;

public class StringBuliderDemo {
	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("rohit");
		System.out.println(builder);
		char ch = builder.charAt(0);  //get char
		System.out.println(ch);

		builder.setCharAt(0, 'h');   
		System.out.println(builder);

		builder.insert(2, 'e'); //insert char
		System.out.println(builder);
		builder.deleteCharAt(2);  // delete char
		System.out.println(builder);
		builder.setCharAt(0, 'r'); // set char
		System.out.println(builder);
		
	builder.append('f'); //at last 
	System.out.println(builder);
		
  
	}

}
