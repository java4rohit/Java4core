package com.java4rohit.Srtring;

public class ReverseString {

	public static String reverseString(String s) {
//
//		StringBuffer s1= new StringBuffer(s);
//		
//	        s1.reverse();
//		
//		return s1.toString();
		
		
		//this is javatpoint
		char []ch= s.toCharArray();
		String rev="";
		
		for(int i = ch.length-1; i >=0; i--) {
			rev= rev+ch[i];
		}
		
		return rev;
		

	}

	public static void main(String[] args) {

		String s = "this is javatpoint";
		System.out.println(reverseString(s));

	}

}
