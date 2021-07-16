package com.java4rohit.SrtringTimeStringBilder;

import java.util.Scanner;

public class permutationString {

	private static void solution(String s) {

		int n = s.length();
		int f = fact(n);

		for (int i = 0; i < f; i++) {
			int temp = i;
			StringBuilder sb = new StringBuilder(s);

				 for(int div= n; div>=1; div-- ){
				int q = temp / div;
				int r = temp % div;
				System.out.print(sb.charAt(r));

				sb.deleteCharAt(r);
				temp = r;

			}
			System.out.println();
		}
		

	}

	public static int fact(int n) {
		int val = 1;
		for (int i = 2; i <= n; i++) {
			val *= i;
		}
		return val;
	}

	public static void main(String[] args) {
		String s = "ABC";
		solution(s);
	}
}
