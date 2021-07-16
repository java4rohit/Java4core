package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class MinTheMaxHeight {

	public static int mintheHeight(int[] arr, int k) {

		Arrays.sort(arr);
		int min, max, r = 0;
		int n = arr.length;
		r = arr[n - 1] - arr[0];

		for (int i = 1; i < n; i++) {

			if (arr[i] >= k) {
				max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
				min = Math.min(arr[i] - k, arr[0] + k);
				r = Math.min(r, max - min);
			} 
			else {
				continue;
			}

		}
		return r;

	}

	public static void main(String[] args) {

		int arr[] = { 3, 9, 12, 16, 20 };
		int k = 2;

		System.out.println(mintheHeight(arr, k));
	}
}
