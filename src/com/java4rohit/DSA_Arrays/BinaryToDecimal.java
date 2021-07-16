package com.java4rohit.DSA_Arrays;

import java.util.Scanner;

import jdk.nashorn.internal.ir.BinaryNode;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t = num;
		int d = 0;
		int i = 0;

		while (t > 0) {
			int r = t % 10;
			t = t / 10;
			d = (int) (d + r * Math.pow(2, i++));
		}
		System.out.println(d);

	}

}
