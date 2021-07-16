package com.java4rohit.Recursion;

import java.util.Scanner;

public class printOnetoN {

	public static void main(String[] args) {

		int n = 5;
		printnumber(5);

	}

	private static void printnumber(int n) {

		if (n == 0) {

			return;
		}  
		printnumber(n - 1);

		System.out.println(n );

	}

}
