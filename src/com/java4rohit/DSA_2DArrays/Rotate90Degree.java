package com.java4rohit.DSA_2DArrays;

import java.util.Scanner;

public class Rotate90Degree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int j = 0;

		while (j < arr[0].length) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
			j++;
		}

	}

}
