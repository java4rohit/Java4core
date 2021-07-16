package com.java4rohit.DSA_Arrays;

public class SubarraysProblem {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}

		}
	}

}
