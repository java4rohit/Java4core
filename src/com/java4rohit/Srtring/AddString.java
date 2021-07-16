package com.java4rohit.Srtring;

import java.math.BigInteger;

public class AddString {

	public static String addString(String num1, String num2) {

		int len1 = num1.length();
		int len2 = num2.length();
		BigInteger b1 = new BigInteger(num1);
		BigInteger b2 = new BigInteger(num2);

//		if (len1 != 0 && len2 != 0) {
//
//			int num4 = Integer.parseInt(num2);
//			int num3 = Integer.parseInt(num1);
//
//			int sum = num3 + num4;
//
//			String s = Integer.toString(sum);
//			return s;
//		}
//
//		else if (len2 == 0) 
//		{
//			return num1;
//		}
//		
//		else
//		{
//			return num2;
//		}
//		
//
		if (len1 > 0 && len2 > 0) {
			return b1.multiply(b2).toString();
		}

		else {
			if (len1 != 0) {
				return b1.toString();
			} else {
				return b2.toString();

			}
		}
		
		
//		 StringBuilder result = new StringBuilder();
//	        int i = num1.length() - 1;
//	        int j = num2.length() - 1;
//	        int carry = 0;
//	        while(i>=0 || j>=0){
//	            int sum = carry;
//	            if(i >= 0)
//	                sum += num1.charAt(i--) - '0';
//	            if(j >= 0)
//	                sum += num2.charAt(j--) - '0';
//	            result.append(sum%10);
//	            carry = sum/10;
//	        }
//	        if(carry != 0)
//	            result.append(carry);
//	        return result.reverse().toString();
//	    }

		// add two string

//		StringBuilder s= new StringBuilder();
//		
//		int len1 = num1.length();
//		
//		
//		System.out.println(len1);
//		int len2 = num2.length()-1;
//		int carry = 0;
//	
//
//		while (len1 >= 0 || len2 >= 0) {
//			int sum = carry;
//			if(len1>=0)
//				sum+=num1.charAt(len1--) - '0';
//			
//			if(len2>=0) 
//				sum+=num2.charAt(len2--)-  '0';
//			s.append(sum%10);
//			carry =sum/10;
//		}
//		if(carry !=0) 
//			s.append(carry);
//		return s.reverse().toString();

		// multiply

	}

	public static void main(String[] args) {
		String num1 = "2";
		String num2 = "";

		System.out.println(addString(num1, num2));
	}

}
