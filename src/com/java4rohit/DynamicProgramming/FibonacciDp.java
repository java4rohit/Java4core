package com.java4rohit.DynamicProgramming;

import java.util.Scanner;

public class FibonacciDp {

	public static int Fib(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fibnm1 = Fib(n - 1);
		int fibnm2 = Fib(n - 2);
		int fibn = fibnm1 + fibnm2;
		System.out.println(fibn);
		return fibn;
	} 

	public static int FibMinimize(int n, int qb[]) {

		if (n == 0 || n == 1) {
			return n;
		}

		if (qb[n] != 0) {
			return qb[n];
		}

		int Fibnm1 = FibMinimize(n - 1, qb);
		int Fibnm2 = FibMinimize(n - 2, qb);

		int Fibn = Fibnm1 + Fibnm2;
		System.out.println(Fibn);

		qb[n] = Fibn;
		return Fibn;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fibn = Fib(n);
		int fibn1 = FibMinimize(n, new int[n + 1]);
		System.out.println(fibn);
	}

}
