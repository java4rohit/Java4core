package com.jaba4rohit.Interger;

import java.util.Scanner;

public class ReverseInteger {

	private static int reverseInt(int n) {

		int revn = 0;
		while (n != 0) {
			int r = n % 10;
			revn = revn * 10 + r;
			
			
			n = n / 10;System.out.println(revn);
		}
		return revn;
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(reverseInt(n));
	}

}
