package com.java4rohit.Recursion;

public class FactorialUsingRecursion {

//	private static int fact(int n) {
//		if(n==0) {
//			return 1;
//		}
//			int f= n* fact(n-1);
//			return f;
//		
//	}
//
//	public static void main(String[] args) {
//		int n = 5;
//		System.out.println(fact(n));
//	}
	
	
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for( int i =n;i>=1; i--) {
			
			fact=fact*i;
		}
		System.out.println(fact);
			
	}
}

			

