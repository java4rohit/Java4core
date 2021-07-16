package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class IntegerToArrays {
	
	public static void main(String[] args) {
		int number= 1234561;
		String temp= Integer.toString(number);
		int []numbers= new int[temp.length()];
		
		for(int i = 0 ; i <temp.length() ; i++) {
			numbers[i]=temp.charAt(i)-'0';
			
		}
		
		System.out.println(Arrays.toString(number));
				
	}

}
