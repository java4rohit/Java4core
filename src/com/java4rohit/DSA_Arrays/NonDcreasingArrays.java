package com.java4rohit.DSA_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import sun.security.util.Length;

public class NonDcreasingArrays {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 1 };

		System.out.println(nondecrese(arr));

	}

	private static boolean nondecrese(int[] arr) {

		int n = arr.length;
		System.out.println(n);

		int i = 0;
		int count = 1;
		arr[i] = 1;

		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));

		for (int j = 0; j < n - 1; j++) {
			if (arr[j] < arr[j + 1]) {
				count++;
			}

		}

		if (count == n) {
			return true;
		} else {
			return false;
		}
	}

}
