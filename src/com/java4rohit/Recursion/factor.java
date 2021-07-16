package com.java4rohit.Recursion;

public class factor {

	public static int factorialusingloop(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;

	}



	public static void main(String[] args) {

		System.out.println(factorialusingloop(6));
		// factorialusingREcursion(5);

		System.out.println(factorialu(5));

	}



	private static int factorialu(int n) {
		
		if (n == 1) {
			return 1;
		}

		return( n * factorialu(n - 1))+ (n*factorialu(n - 1));

	}

}
