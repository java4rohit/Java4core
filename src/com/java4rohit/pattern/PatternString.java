package com.java4rohit.pattern;

public class PatternString {
	public static void main(String[] args) {
		String str="ICSE"; 
				for(int i = 0 ; i < str.length(); i++) {
					System.out.println(str.substring(0, i+1));
				}
	}

}
