package com.java4rohit.Srtring;

import java.util.Arrays;

public class CapitalFirstLetter {
	
	public static void main(String[] args) {
		 	String str= "my name is khan";
		 	String wrd[]=str.split(" ");
		 	String str1=""; 	
		 	for (String s : wrd) {
		 		String first=s.substring(0, 1);
		 		String afterfirst=s.substring(1);
		 		str1+=first.toUpperCase()+afterfirst+" ";
			}
		 	
		 	System.out.println(str1);
	}

}
