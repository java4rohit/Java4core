package com.java4rohit.Recursion;

public class PowerUsingRecursion {

	public static int SlowPow(int a, int b) {

		if (b == 0) {
			return 1;
		}
		return a * SlowPow(a, b - 1);
	}

	public static void main(String[] args) {

		System.out.println(SlowPow(3, 4));
		
		System.out.println(FastPow(3,4));

	}

	private static int FastPow(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			//its even power
			return FastPow(a*a,b/2);
		}
		//IF ODD
		return a*FastPow(a, b-1);
	}

}
