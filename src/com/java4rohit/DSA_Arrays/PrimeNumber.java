package com.java4rohit.DSA_Arrays;

public class PrimeNumber {
	private static int Countprime(int n) {

		int count = 0;
		for (int num = 2; num < n; num++) {
			int temp = 0;
			for (int j = 2; j <= num - 1; j++) {

				if (num % j == 0) {
					temp++;
				}

			}
			if (temp == 0) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int n= 2;

		System.out.println(Countprime(n));

	}
}
