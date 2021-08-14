package com.java4rohit.collection;

public class HashCodeDemo {
	
	 public static void main(String[] args) {
		HashCodeDemo d= new HashCodeDemo();
		
		System.out.println(d);
		
		String s= Integer.toHexString(d.hashCode());
		
		Class c=d.getClass();
		
		System.out.println(c+"@"+s);
	}

}
